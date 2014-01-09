package shwetado.unixtools;

public class Head {
    String text = null;
    public Head(String text) {
        this.text = text;
    }
    public String giveHeadLines(){
        String[] split = text.split("\n");
        String value = "";
        int defaultNoOfLines=10;
        for (int i = 0; i < defaultNoOfLines; i++) {
            value += (split[i]+"\n");
        }
        return value;
    }
}
