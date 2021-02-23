import org.junit.Assert;
import org.junit.Test;
import java.lang.Exception;
public class MoodAnalyserTest
{
    @Test
    public void givenMessageWhenSad_ShouldReturnSad()
    {
        try {
            MoodAnalyser moodAnalyser = new MoodAnalyser("This is a Sad Message");
            String mood = moodAnalyser.analyseMood();
            Assert.assertEquals("SAD", mood);
        }
        catch(MoodAnalyserException e)
        {
            System.out.println("Wrong Input Type");
        }
    }
    @Test
    public void givenMessageWhenNotSad_ShouldReturnHappy() {
        try {
            MoodAnalyser moodAnalyser = new MoodAnalyser("This is a Happy Message");
            String mood = moodAnalyser.analyseMood();
            Assert.assertEquals("HAPPY", mood);
        } catch (MoodAnalyserException e) {
            System.out.println("Wrong Input Type");
        }
    }
    @Test
    public void givenNullMood_ShouldReturnHappy()
    {
        try{
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("HAPPY",mood);
        } catch (MoodAnalyserException e) {
            System.out.println("Wrong Input Type");
        }
    }
}

