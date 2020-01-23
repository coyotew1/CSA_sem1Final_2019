public class Main 
{

    public static void main(String[] args) 
    {
        Rational r = new Rational(2,4);
        Rational anotherR = new Rational (10,10);
        //r.printRational(); outdated, use System.out.println(OBJECT)
        System.out.println("Starting number: " + r);
        r.negate();
        System.out.println("Negated: " + r);
        r.negate();
        r.invert();
        System.out.println("Inverted: " + r);
        r.invert();
        System.out.println("Reduced: "+Rational.reduce(2, 4));
        System.out.println("As a double: " + Rational.toDouble(r.getNumerator(), r.getDenominator()));
        System.out.println("DFDF"+r);
        System.out.println("dff"+anotherR);
        System.out.println("Added: " + r.add(anotherR));
    }
}