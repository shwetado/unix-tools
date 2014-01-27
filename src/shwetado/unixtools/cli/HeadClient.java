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
        try{
            if(args.length == 1){
                HeadClient headClient = new HeadClient(args[0]);
                Head head1 = headClient.getHeadCount();
                System.out.println(head1.giveHeadLines());
            }
            HeadClient hc = new HeadClient(args[0],args[1]);
            Head head2 = hc.getHeadCount();
            System.out.println(head2.giveHeadLines());
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Array Out Of Bounds Exception");
        }
    }
}