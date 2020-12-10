// import java.util.Date;
import java.util.Scanner;

// import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;
public class StringMethods {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Scanner mystr =  new Scanner(System.in);
        System.out.println("Enter new String :");
        String msg = mystr.nextLine();
        String uppercase = msg.toUpperCase();
       // System.out.println(msg);
        System.out.println(uppercase);
        
    }
}
