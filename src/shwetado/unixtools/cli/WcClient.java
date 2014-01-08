package shwetado.unixtools.cli;

import shwetado.fs.MyFileReader;
import shwetado.unixtools.WordCount;

public class WcClient {

    WordCount wordCount;

    public WcClient(String fileName) {
        String text = new MyFileReader().readFile(fileName);
        this.wordCount = new WordCount(text);
    }

    public WordCount getWordCount() {


        return wordCount;
    }

    public static void main(String[] args) {
        WcClient wcClient = new WcClient(args[0]);

        WordCount wc = wcClient.getWordCount();

        System.out.println("\t"+wc.countLines()+"\t"+wc.countWords()+"\t"+wc.countChars()+"\t"+args[0]);
    }
}
