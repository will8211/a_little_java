/* Chapter 0 */

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

    public String toString
    {
        return "new " + getClass().getName() + "()" + "(" + x + ")";
    }
}

class TwoFields
{
    private String x = "Foo";
    private String y = "Bar"


    public String toString
    {
        return "new " + getClass().getName() + "()"  + "(" + x + ", " + y + ")";
    }
}

class Main
{
    public static void main( String[] args )
    {
        NoFields noFields = new NoFields();
        System.out.println( noFields.toString() );
    }
}