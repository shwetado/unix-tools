package shwetado.unixtools;

public class Head {
    String text = null;
    int defaultNoOfLines=10;

    public Head(String text) {
        this.text = text;
    }
    public Head(int noOfLines,String text) {
        this.defaultNoOfLines = noOfLines;
        this.text = text;
    }
    public String giveHeadLines(){
        String[] split = text.split("\n");
        String value = "";
        if(defaultNoOfLines == -5)
            defaultNoOfLines = 5;
        for (int i = 0; i < defaultNoOfLines; i++)
            value += (split[i]+"\n");
        return value;
    }
}
