package edu.mit.a_little_java.chapter0;

class NoFields
{
    public String toString()
    {
        return "new " + getClass().getName() + "()";
    }
}

class OneField
{
    private String x = "Foo";

    public String toString()
    {
        return "new " + getClass().getName() + "(" + x + ")";
    }
}

class TwoFields
{
    private String x = "Foo";
    private String y = "Bar";


    public String toString()
    {
        return "new " + getClass().getName() + "(" + x + ", " + y + ")";
    }
}

public class Main
{
    public static void main( String[] args )
    {
        NoFields noFields = new NoFields();
        System.out.println( noFields.toString() );

        OneField oneField = new OneField();
        System.out.println( oneField.toString() );

        TwoFields twoFields = new TwoFields();
        System.out.println( twoFields.toString() );
    }
}