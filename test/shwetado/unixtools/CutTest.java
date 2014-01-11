package shwetado.unixtools;

import org.junit.Assert;
import org.junit.Test;

public class CutTest {
    @Test
    public void testCutLinesWithDelimiter() throws Exception {
        Cut cut = new Cut();
        String result ;
        String expected = "\n\nis\nis\nare\nare\n\n\nyou\n";
        String data = "one\ntwo\nthis,is,good\nthis,is,good\n" +
                "how,are\nhow,are,you\nfine\nfine\n" +
                "thank,you";
        result = cut.cutLines(data,2,",");
        Assert.assertEquals(result,expected);

    }

    @Test
    public void testCutLinesWithoutGivingDelimiter() throws Exception {
        Cut cut = new Cut();
        String result;
        String expected = "\n\nis\nis\nare\nare\n\n\nyou\n";
        String data = "one\ntwo\nthis is good\nthis is good\n" +
                "how are\nhow are you\nfine\nfine\n" +
                "thank you";
        result = cut.cutLines(data,2);
        Assert.assertEquals(expected,result);
    }
}
