package shwetado.unixtools;

public class WordCount {
    String text = null;
    public WordCount(String text) {
        this.text = text;
    }
    public int countWords(){
        return text.split("\\w+").length;
    }
    public int countLines(){
        return text.split("\\n+").length;
    }
    public int countChars(){
        return text.length();
    }
}
