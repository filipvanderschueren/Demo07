package be.uantwerpen.fti;

public class Main {

    public static void main(String[] args)
    {
	// write your code here
        System.out.println( "hello changed message..." );
        aClass m = new aClass();
        m.setMessage( "newMessage...from branch01 edited" );
        System.out.println( "and now from the Class : " + m.getMessage() );

        bClass b = new bClass( 7 );
        System.out.println( "and now a value from bClass :" + b.getValue());

    }
}
