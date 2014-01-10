package shwetado.unixtools.cli;

import shwetado.fs.MyFileReader;
import shwetado.unixtools.ReduceBlank;

public class ReduceBlankClient{
    ReduceBlank reduceBlank;
    public ReduceBlankClient(String fileName) {
        String text = new MyFileReader().readFile(fileName);
        this.reduceBlank = new ReduceBlank(text);
    }
    public ReduceBlank getWordCount() {
        return reduceBlank;
    }
    public static void main(String[] args) {
        ReduceBlankClient reduceBlankClient = new ReduceBlankClient(args[0]);

        ReduceBlank rb = reduceBlankClient.getWordCount();

        System.out.println(rb.removeSpaces());
    }
}
