package shwetado.unixtools.cli;

import shwetado.fs.MyFileReader;
import shwetado.unixtools.Cut;

public class CutClient {
    public static void main(String[] args) {
        MyFileReader file = new MyFileReader();
        String text = "";
        Cut cut = new Cut();
        String result = null;
        try {
            text = file.readFile(args[0]);
            result = cut.cutLines(text, Integer.parseInt(args[1]),args[2]);
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            result = cut.cutLines(text,Integer.parseInt(args[1]));
        }
        catch (Exception ex){
            System.err.println("Error while processing");
        }
        System.out.println(result);
    }
}
