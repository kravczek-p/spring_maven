package mygroup;


import org.example.Shape;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Shape shape=new Shape() {
            @Override
            public String getName() {
                return "Org";
            }
        };
        System.out.println("external= "+shape.getName());
    }
}
