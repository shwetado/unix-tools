package shwetado.unixtools.cli;

import shwetado.fs.MyFileReader;
import shwetado.unixtools.Sort;

import java.io.IOException;

public class SortClient {
    public static void main(String[] args) throws IOException {
        MyFileReader file = new MyFileReader();
        String text;
        Sort sort = new Sort();
        String result;
        text = file.readFile(args[0]);
        result = sort.sortLines(text);
        System.out.println(result);
    }
}
