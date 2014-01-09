package shwetado.unixtools.cli;

import shwetado.fs.MyFileReader;
import shwetado.unixtools.Head;

public class HeadClient {
    Head head;

    public HeadClient(String fileName) {
        String text = new MyFileReader().readFile(fileName);
        this.head = new Head(text);
    }
    public HeadClient(String noOfLines, String fileName) {
        String text = new MyFileReader().readFile(fileName);
        this.head = new Head(noOfLines,text);
    }

    public Head getHeadCount() {
        return head;
    }
    public static void main(String[] args) {
        HeadClient headClient = new HeadClient(args[0]);
        HeadClient hc = new HeadClient("-5",args[0]);
        Head tail1 = headClient.getHeadCount();
        Head tail2 = hc.getHeadCount();
        System.out.println(tail1.giveHeadLines());
        System.out.println(tail2.giveHeadLines());
    }
}
