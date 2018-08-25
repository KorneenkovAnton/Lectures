package com.epam.iostreams.iostream;


import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
/// не получился
public class InputStreamWriterExample {
    public static void main(String[] argv) throws Exception {
        Writer out = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream("src/com/epam/iostreams/iostream/outfile"), "UTF8"));
        out.write("asdf");
        out.close();
    }

}
