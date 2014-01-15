package shwetado.unixtools.cli;

import shwetado.fs.MyFileReader;
import shwetado.unixtools.Tail;

public class TailClient {
    Tail tail;

    public TailClient(String fileName) {
        String text = new MyFileReader().readFile(fileName);
        this.tail = new Tail(text);
    }
    public TailClient(String noOfLines, String fileName) {
        String text = new MyFileReader().readFile(fileName);
        this.tail = new Tail(noOfLines,text);
    }

    public Tail getTailCount() {
        return tail;
    }
    public static void main(String[] args) {
        if(args.length == 1){
            TailClient tailClient = new TailClient(args[0]);
            Tail tail1 = tailClient.getTailCount();
            System.out.println(tail1.giveTailLines());
        }
        TailClient tc = new TailClient(args[0],args[1]);
        Tail tail2 = tc.getTailCount();
        System.out.println(tail2.giveTailLines());
    }
}
