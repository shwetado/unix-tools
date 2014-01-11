package shwetado.unixtools;

import junit.framework.Assert;
import org.junit.Test;

public class SortTest {
    @Test
    public void testSortLines() throws Exception {
        Sort sort = new Sort();
        String text = "one\ntwo\nthis is good\nhow are\n" +
                "fine\nthank you";
        String actual = sort.sortLines(text);
        String expected = "fine\nhow are\n" +
                "one\nthank you\n" +
                "this is good\ntwo\n";
        Assert.assertEquals(expected,actual);
    }
}
