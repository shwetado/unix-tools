package shwetado.unixtools;

public class Uniq {
    String text = null;

    public Uniq(String text) {
        this.text = text;
    }

    public String getUniq(){
        String data[];
        StringBuilder sb = new StringBuilder();
        data = text.split("\n");
        for(int current_line=0;current_line<data.length-1;current_line++)
            if(!data[current_line].equalsIgnoreCase(data[current_line + 1]))
                sb.append(data[current_line]).append("\n");
        return sb.toString();
    }
}
