package shwetado.unixtools.cli;

import shwetado.fs.MyFileReader;
import shwetado.unixtools.Head;

public class HeadClient{
    Head head;

    public HeadClient(String fileName) {
        String text = new MyFileReader().readFile(fileName);
        this.head = new Head(text);
    }
    public HeadClient(int noOfLines, String fileName) {
        String text = new MyFileReader().readFile(fileName);
        this.head = new Head(noOfLines,text);
    }

    public Head getHeadCount() {
        return head;
    }
    public static void main(String[] args) {
        HeadClient headClient = new HeadClient(args[0]);
        HeadClient hc = new HeadClient(-5,args[0]);
        Head head1 = headClient.getHeadCount();
        Head head2 = hc.getHeadCount();
        System.out.println(head1.giveHeadLines());
        System.out.println(head2.giveHeadLines());
    }
}
