package shwetado.unixtools.cli;

import shwetado.fs.MyFileReader;
import shwetado.unixtools.Head;

public class HeadClient{
    Head head;

    public HeadClient(String fileName) {
        String text = new MyFileReader().readFile(fileName);
        this.head = new Head(text);
    }

    public Head getHeadCount() {
        return head;
    }
    public static void main(String[] args) {
        HeadClient headClient = new HeadClient(args[0]);

        Head head = headClient.getHeadCount();

        System.out.println(head.giveHeadLines());
    }
}
