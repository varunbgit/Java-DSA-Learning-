
import java.util.*;
public class Alphabetcheck {
    public static void main(String[] args) {
        System.out.println("Enter a alphabet");
         Scanner in = new Scanner(System.in);
          char a = in.next().trim().charAt(0);

          if(a >='A' && a<='Z'){
              System.out.println("Uppercase");

          }else{
              System.out.println("lowercase");
          }
    }
}
