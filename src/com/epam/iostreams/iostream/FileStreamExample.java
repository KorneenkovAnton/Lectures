package com.epam.iostreams.iostream;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamExample {
    public static void main(String[] args) {
        byte[] bytesToWrite = { 1, 2, 3 };
        byte[] bytesReaded = new byte[10];
        String fileName = "src/com/epam/iostreams/iostream/test.txt";
        FileOutputStream outFile = null;
        FileInputStream inFile = null;
        try {

            outFile = new FileOutputStream(fileName);
            System.out.println("Файл открыт для записи");

            outFile.write(bytesToWrite);
            System.out.println("Записано: " + bytesToWrite.length + " байт");
            outFile.close();
            System.out.println("Выходной поток закрыт");

            inFile = new FileInputStream(fileName);
            System.out.println("Файл открыт для чтения");

            int bytesAvailable = inFile.available();
            System.out.println("Готово к считыванию: " + bytesAvailable
                    + " байт");

            int count = inFile.read(bytesReaded, 0, bytesAvailable);
            System.out.println("Считано: " + count + " байт");
            inFile.close();
            System.out.println("Входной поток закрыт");
        } catch (FileNotFoundException e) {
            System.out.println("Невозможно произвести запись в файл: "
                    + fileName);
        } catch (IOException e) {
            System.out.println("Ошибка ввода/вывода: " + e.toString());
        }

        finally {
            try {
                inFile.close();
            } catch (IOException e) {
            }
        }
    }
}

