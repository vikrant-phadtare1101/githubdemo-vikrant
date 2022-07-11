package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int k = 8;
        if(k == 9) {
            System.out.println( "Hello World!" );
        } else if(k == 18 && k == 17)  {
            System.out.println( "Hello World!" );
        }

        equal(true, false);
    }

    public static boolean equal(boolean one, boolean two) {
        return one == two;
    }
}
