package shwetado.unixtools;

import org.junit.Assert;
import org.junit.Test;

public class CutTest {
    final String data = "one\ntwo\nthis is good\nthis is good\n" +
            "how are\nhow are you\nfine\nfine\n" +
            "thank you";
    @Test
    public void testCutLinesWithDelimiter() throws Exception {

        Cut cut = new Cut();
        String actual ;
        String text = data.replaceAll(" ",",");
        String expected = "\n\nis\nis\nare\nare\n\n\nyou\n";
        actual = cut.cutLines(text,2,",");
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void testCutLinesWithoutGivingDelimiter() throws Exception {
        Cut cut = new Cut();
        String actual;
        String expected = "\n\nis\nis\nare\nare\n\n\nyou\n";
        actual = cut.cutLines(data,2);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testCutLinesWithoutGivingDelimiterForEmptyString() throws Exception {
        Cut cut = new Cut();
        String actual;
        String data = "";
        String expected = "";
        actual = cut.cutLines(data,2);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testCutLinesWithGivingDelimiterForEmptyString() throws Exception {
        Cut cut = new Cut();
        String actual;
        String data = "";
        String expected = "";
        actual = cut.cutLines(data,2,":");
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testCutLinesForFieldWhenThatFieldIsAbsent() throws Exception {
        Cut cut = new Cut();
        String actual;
        String expected = "";
        actual = cut.cutLines(data,12);
        Assert.assertEquals(expected,actual);
    }

}