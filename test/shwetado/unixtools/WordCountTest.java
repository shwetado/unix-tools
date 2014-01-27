package shwetado.unixtools;

import org.junit.Assert;
import org.junit.Test;

public class WordCountTest {


    @Test
    public void testCountLines() throws Exception {
        String text = "hello world";
        WordCount wordCount = new WordCount(text);
        Assert.assertEquals(1,wordCount.countLines());
    }

    @Test
    public void testCountChars() throws Exception {
        String text = "hello world";
        WordCount wordCount = new WordCount(text);
        Assert.assertEquals(11,wordCount.countChars());
    }

    @Test
    public void testCountWords() throws Exception {
        String text = "hello world";
        WordCount wordCount = new WordCount(text);
        Assert.assertEquals(2,wordCount.countWords());
    }
}
