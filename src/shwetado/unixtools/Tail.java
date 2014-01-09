package shwetado.unixtools;

public class Tail {
    String text = null;
    String defaultNoOfLines="10";

    public Tail(String text) {
        this.text = text;
    }
    public Tail(String noOfLines,String text) {
        this.defaultNoOfLines = noOfLines;
        this.text = text;
    }
    public String giveTailLines(){
        String[] split = text.split("\n");
        String value = "";
        if(!defaultNoOfLines.equals("10")) {
            defaultNoOfLines = defaultNoOfLines.split("-")[1];
        }
        int lines = Integer.parseInt(defaultNoOfLines);
        for (int i = (split.length)-lines; i < split.length; i++)
            value += (split[i]+"\n");
        return value;
    }
}
