package shwetado.unixtools;

public class Cut {
    StringBuilder result = new StringBuilder("");

    public String cutLines(String data, int fieldNo, String delimiter) {
        String[] lines;
        lines = data.split("\n");
        fieldNo = fieldNo - 1;
        if (!data.contains(delimiter))
            return data;
        for (String line : lines) {
            String[] words = line.split(delimiter);
            if (fieldNo < words.length)
                result.append(words[fieldNo]).append("\n");
            else result.append("").append("\n");
        }
        return result.toString();
    }
    public String cutLines(String data, int fieldNo) {
        Cut cut = new Cut();
        return cut.cutLines(data,fieldNo," ");
    }
}
