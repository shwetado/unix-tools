package shwetado.unixtools;

import org.junit.Assert;
import org.junit.Test;

public class ReduceBlankTest {
    @Test
    public void testReduceSpaces() throws Exception {
        String text = "hello                  world";
        ReduceBlank rb = new ReduceBlank(text);
        Assert.assertEquals(rb.removeSpaces(), "hello world");
    }
}