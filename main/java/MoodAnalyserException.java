class MoodAnalyserException extends Exception
{
    enum ExceptionType
    {
        NullType
    }
    public MoodAnalyserException(String message)
    {
        super(message);
    }
}


