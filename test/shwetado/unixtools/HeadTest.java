package shwetado.unixtools;

import junit.framework.Assert;
import org.junit.Test;

public class HeadTest {
    @Test
    public void testGive10HeadLines() throws Exception {
        String text = "a\nb\nc\nd\ne\nf\ng\nh\ni\nj\nk\nl\nm";
        Head head = new Head(text);
        String expected = "a\nb\nc\nd\ne\nf\ng\nh\ni\nj\n";
        String actual = head.giveHeadLines();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testGive5HeadLines() throws Exception {
        String text = "a\nb\nc\nd\ne\nf\ng\nh\ni\nj\nk\nl\nm";
        Head head = new Head("-5",text);
        String expected = "a\nb\nc\nd\ne\n";
        String actual = head.giveHeadLines();
        Assert.assertEquals(expected, actual);
    }
}