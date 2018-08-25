package com.epam.iostreams.iostream;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StreamTokenizer;

public class StreamTokenizerExample {

    public static int words = 0;
    public static int lines = 0;
    public static int chars = 0;

    public static void wc(Reader r) throws IOException {
        StreamTokenizer tok = new StreamTokenizer(r);
        tok.resetSyntax();
        tok.wordChars(33, 255);
        tok.whitespaceChars(0, ' ');
        tok.eolIsSignificant(true);

        while (tok.nextToken() != tok.TT_EOF) {

            switch (tok.ttype) {

                case StreamTokenizer.TT_EOL:
                    lines++;
                    chars++;
                    break;

                case StreamTokenizer.TT_WORD:
                    words++;

                default:
                    chars += tok.sval.length();
                    break;
            }
        }
    }

    public static void main(String args[]) {
        try {
            wc(new InputStreamReader(System.in));
            System.out.println(lines + " " + words + " " + chars);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
