package shwetado.unixtools;

import java.util.Arrays;
import java.util.Collections;

public class Sort {
    private String joinByNewLine(String[] text) {
        StringBuilder result = new StringBuilder("");
        for (String str : text)
            result.append(str).append("\n");
        return result.toString();
    }

    public String sortLines(String data) {
        String[] text = data.split("\n");
        Arrays.sort(text);
        return joinByNewLine(text);
    }

    public String reverseLines(String data) {
        String[] text = data.split("\n");
        Arrays.sort(text);
        Collections.reverse(Arrays.asList(text));
        return joinByNewLine(text);
    }
}
