
import java.util.*;

public class Demo {
    public static void main(String[] args) {
       StringTokenizer str = new StringTokenizer("Hello everyone! how are you?");
       //System.out.println("This is the use of hasmoretokens : "+str.hasMoreTokens()); //checks if there  is any tokens

       //System.out.println("This is the use of hasMoreElements : "+str.hasMoreElements()); //checks if there  is any tokens

       System.out.println("First element : "+str.nextElement());

      // System.out.println("First token: "+str.nextToken());
       
       System.out.println("number of tokens : "+str.countTokens());
      while(str.hasMoreTokens())
      {
        System.out.println("next token is : "+str.nextToken());
      }
       
        
    }
}
