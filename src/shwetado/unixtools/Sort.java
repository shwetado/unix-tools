package shwetado.unixtools;

import java.util.Arrays;
import java.util.Collections;

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

    public String reverseLines (String data,String reverse) {
        String string = "";
        try{
            String[] text = data.split("\n");
            Arrays.sort(text);
            Collections.reverse(Arrays.asList(text));
            string =  getString(text);
        }
        catch (ArrayIndexOutOfBoundsException ex){
            System.out.println(reverse + "is not a valid option");
        }
        return string;
    }
}
