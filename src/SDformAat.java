import java.text.SimpleDateFormat;
import java.util.Date;

public class SDformAat {
public static void main(String[]args) {

   Date date = new Date();


    SimpleDateFormat formatter = new SimpleDateFormat( "MM/dd/yyyy" );

    String strDate = formatter.format( date );

    System.out.println( strDate );


    formatter = new SimpleDateFormat( "mm  *  DD * YYYY " );

    strDate = formatter.format( date );

    System.out.println( "date Format with mm: " + strDate );


    formatter = new SimpleDateFormat( "dd-M-yyyy zzzz" );

    strDate = formatter.format( date );

    System.out.println( " * Date Format with dd MMMM yyyy: " + strDate );


    formatter = new SimpleDateFormat( "dd MMMM yyyy zzzz" );

    String strDate3 = formatter.format( date );

    System.out.println( " & Date Format with ddMMMMyyyy zz: " + strDate3 );


    formatter = new SimpleDateFormat( "dd * m * yyyy" );

    String strDate7 = formatter.format( date );

    System.out.println( "Last chance: " + strDate7 );


}


}
