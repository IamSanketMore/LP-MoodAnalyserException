class MoodAnalyserException extends Exception
{
    enum ExceptionType
    {
        nullEnter,emptyEnter
    }
    ExceptionType type;
    public MoodAnalyserException(ExceptionType type,String message)
    {
        super(message);
        this.type = type;
    }
}


