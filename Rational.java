public class Rational 
{
    private int numerator;
    private int denominator;
    
    //constructors
    public Rational()
    {
        setNumerator(0);
        setDenominator(1);
    }
    public Rational(int numerator, int denominator)
    {
        setNumerator(numerator);
        setDenominator(denominator);
    }
    public Rational(int numerator)
    {
        setNumerator(numerator);
        setDenominator(1);
    }


    //mutators
    public void setNumerator(int numerator)
    {
        this.numerator = numerator;
    }
    public void setDenominator(int denominator)
    {
        this.denominator = denominator;
    }

    //accessors
    public int getNumerator()
    {
        return this.numerator;
    }
    public int getDenominator()
    {
        return this.denominator;
    }
}