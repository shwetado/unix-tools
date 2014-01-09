package shwetado.unixtools;

import junit.framework.Assert;
import org.junit.Test;

public class TailTest {
    @Test
    public void testGive10TailLines() throws Exception {
        String text = "a\nb\nc\nd\ne\nf\ng\nh\ni\nj\nk\nl\nm";
        Tail tail = new Tail(text);
        String expected = "d\ne\nf\ng\nh\ni\nj\nk\nl\nm";
        String actual = tail.giveTailLines();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testGive5TailLines() throws Exception {
        String text = "a\nb\nc\nd\ne\nf\ng\nh\ni\nj\nk\nl\nm";
        Tail tail = new Tail("-5",text);
        String expected = "i\nj\nk\nl\nm\n";
        String actual = tail.giveTailLines();
        Assert.assertEquals(expected, actual);
    }
}