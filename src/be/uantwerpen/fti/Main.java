package be.uantwerpen.fti;

public class Main {

    public static void main(String[] args)
    {
	// write your code here
        System.out.printf( "hello changed message..." );
        aClass m = new aClass();
        m.setMessage( "newMessage...from branch01 edited" );
        System.out.printf( "and now from the Class : " + m.getMessage() );
    }
}
