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

    //instance methods

    public void printRational()
    {
        /**
         * I tried to get them to print out vertically (the so called natural format) but it
         * didn't end up working.
         */
        System.out.println(toString());
    }

    public void negate()
    {
        int a = getNumerator();
        int b = -1;
        a = a*b;
        setNumerator(a);
    }

    public void invert()
    {
        int a= getNumerator();
        int b= getDenominator();

        setNumerator(b);
        setDenominator(a);
    }

    public Rational add(Rational rational)
    {
        

        Rational result = new Rational(rational.getNumerator()+this.numerator, rational.getDenominator()+this.denominator);
        return reduce(result.getNumerator(), result.getDenominator());
    }
    
    
    

    //pures
    public static double toDouble(int numerator, int denominator)
    {
        return (double)numerator/denominator;
        
    }
    public static Rational reduce (int numerator, int denominator) 
    {
        int lcd;
        int gcd = 0;
        if (numerator < 0) 
        {
            numerator = -numerator;
        }
        if (numerator > denominator) 
        {
            lcd = numerator;
        }
        else 
        {
            lcd = denominator;
        }
    
        for (int i = lcd; i >= 2; i--) 
        {
            if (numerator % i == 0 && denominator % i == 0) 
            {
                gcd = i;
                break;
            }
        }
    
        if (gcd != 0) 
        {
            numerator /= gcd;
            denominator /= gcd;
        }
        Rational reduced = new Rational(numerator, denominator);
        return reduced;
    }

    //overides default toString method
    @Override
    public String toString()
    {
        return Integer.toString(getNumerator()) + "/" + Integer.toString(getDenominator());
    }
}

