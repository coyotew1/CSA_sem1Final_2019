public class Main 
{

    public static void main(String[] args) 
    {
        Rational r = new Rational(2,4);
        //r.printRational(); outdated, use System.out.println(OBJECT)
        System.out.println(r);
        r.negate();
        System.out.println(r);
        r.negate();
        
    }
}