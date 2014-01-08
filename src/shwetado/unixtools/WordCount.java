package shwetado.unixtools;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCount {
    public static void main(String[] args) {
        int numOfLines = 0, numOfWords = 0, numOfChars = 0;
        String filename = args[0];
        try {
            String currentLine;
            BufferedReader br;
            br = new BufferedReader(new FileReader(filename));
            while ((currentLine = br.readLine()) != null) {
                numOfChars += currentLine.length();
                numOfWords = currentLine.split(" ").length;
                numOfLines++;
            }
        } catch (IOException e) {
            System.out.println("unable to process");
        }
        System.out.println(numOfLines + "\t" + numOfWords + "\t" + numOfChars + " " + filename);
    }
}
