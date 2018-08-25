package com.epam.iostreams.serialization;


import java.io.*;

public class SerializationExample {
    public static void main(String[] args) {
        try {

            ByteArrayOutputStream os = new ByteArrayOutputStream();
            Object objSave = new Integer(1);
            ObjectOutputStream oos = new ObjectOutputStream(os);
            oos.writeObject(objSave);


            byte[] bArray = os.toByteArray();
            for (byte b : bArray) {
                System.out.print((char) b);
            }
            System.out.println();
            ByteArrayInputStream is = new ByteArrayInputStream(bArray);
            ObjectInputStream ois = new ObjectInputStream(is);
            Object objRead = ois.readObject();
            System.out.println("readed object is: " + objRead.toString());
            System.out.println("Object equality is: "
                    + (objSave.equals(objRead)));
            System.out
                    .println("Reference equality is: " + (objSave == objRead));
        } catch (NotSerializableException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
