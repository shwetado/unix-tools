package shwetado.unixtools;

import java.util.Arrays;

public class Sort {
    private String getString(String[] text){
        StringBuilder result = new StringBuilder("");
        for (String str : text)
            result.append(str).append("\n");
        return result.toString();
    }

    public String sortLines (String data) {
        String[] text = data.split("\n");
        Arrays.sort(text);
        return getString(text);
    }
}
