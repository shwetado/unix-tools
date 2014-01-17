package shwetado.unixtools;

public class Cut {
    StringBuilder result = new StringBuilder("");

    public String cutLines(String data, int field_no, String delimiter) {
        String[] lines;
        lines = data.split("\n");
        field_no = field_no - 1;
        if (!data.contains(delimiter))
            return data;
        for (String line : lines) {
            String[] words = line.split(delimiter);
            if (field_no < words.length)
                result.append(words[field_no]).append("\n");
            else result.append("").append("\n");
        }
        return result.toString();
    }
    public String cutLines(String data, int field_no) {
        return cutLines(data,field_no," ");
    }
}
