
public class MoodAnalyser {
    private String message;

    //Default Constructor
    //public MoodAnalyser() {
    //}

    //Parametrised Constructor
    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analysemood(String message) throws MoodAnalyserException
    {
        this.message = message;
        return analyseMood();
    }

    public String analyseMood() throws MoodAnalyserException
    {
        try {
            if (message.contains("Sad"))
                return "SAD";
            else
                return "HAPPY";
        } catch (NullPointerException e) {
            throw new MoodAnalyserException("Value is Null::Enter Valid MEssage");

        }
    }
}