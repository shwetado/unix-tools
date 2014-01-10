package shwetado.unixtools;

public class ReduceBlank {
    String text = null;

    public ReduceBlank(String text) {
        this.text = text;
    }
    public String removeSpaces(){
        return text.replaceAll("\\s+", " ");
    }
}
