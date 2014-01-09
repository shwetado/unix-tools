package shwetado.unixtools;

import junit.framework.Assert;
import org.junit.Test;

public class HeadTest {
    @Test
    public void testGiveHeadLines() throws Exception {
        String text = "a\nb\nc\nd\ne\nf\ng\nh\ni\nj\nk\nl\nm";
        Head head = new Head(text);
        String expected = "a\nb\nc\nd\ne\nf\ng\nh\ni\nj\n";
        String actual = head.giveHeadLines();
        Assert.assertEquals(expected, actual);
    }
}
