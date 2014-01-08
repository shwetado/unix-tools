package shwetado.unixtools;

import shwetado.fs.MyFileReader;

public class WordCount {
    public int countWords(String text){
        return text.split("\\w+").length;
    }
    public int countLines(String text){
        return text.split("\\n+").length;
    }
    public int countChars(String text){
        return text.length();
    }
    public static void main(String[] args) {
        MyFileReader wfr;
        wfr = new MyFileReader();
        String text = wfr.readFile(args[0]);
        WordCount wc = new WordCount();
        System.out.println("\t"+wc.countLines(text)+"\t"+wc.countWords(text)+"\t"+wc.countChars(text)+"\t"+args[0]);
    }
}