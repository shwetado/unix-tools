package shwetado.unixtools;

import org.junit.Assert;
import org.junit.Test;

public class UniqTest {
    @Test
    public void testCountUniqs() throws Exception {
        String text = "hello world\n" +
                "abc\n" +
                "hello world\n" +
                "hello world\n" +
                "hello world\n" +
                "hello";
        Uniq uniq = new Uniq(text);
        Assert.assertEquals("hello world\n" +
                "abc\n" +
                "hello world\n",uniq.getUniq());
    }
}
