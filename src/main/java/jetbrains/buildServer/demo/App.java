package jetbrains.buildServer.demo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public boolean alwaysTrue() {
        return true;
    }

    public boolean alwaysFalse() {
        return false;
    }

    public boolean tenPercentTrue() {
        return Math.random() < 0.1;
    }

    public boolean ninetyPercentTrue() {
        return Math.random() < 0.9;
    }

    public void nonTested() {
        System.out.println("This method is not covered by tests");
    }
}
