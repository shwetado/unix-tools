package shwetado.unixtools.cli;

import shwetado.fs.MyFileReader;
import shwetado.unixtools.Uniq;

public class UniqClient{
    Uniq uniq;
    public UniqClient(String fileName) {
        String text = new MyFileReader().readFile(fileName);
        this.uniq = new Uniq(text);
    }
    public Uniq getUniq() {
        return uniq;
    }
    public static void main(String[] args) {
        UniqClient uniqClient = new UniqClient(args[0]);

        Uniq uniq = uniqClient.getUniq();

        System.out.println(uniq.getUniq());
    }
}
