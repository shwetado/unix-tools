package shwetado.unixtools;

public class Head {
    String text = null;
    String defaultNoOfLines="10";

    public Head(String text) {
        this.text = text;
    }
    public Head(String noOfLines,String text) {
        this.defaultNoOfLines = noOfLines;
        this.text = text;
    }
    public String giveHeadLines(){
        String[] split = text.split("\n");
        String value = "";
        if(!defaultNoOfLines.equals("10"))
            defaultNoOfLines = defaultNoOfLines.split("-")[1];
        int lines = Integer.parseInt(defaultNoOfLines);

        for (int i = 0; i < lines; i++)
            value += (split[i]+"\n");
        return value;
    }
}
