
import java.util.Scanner;
import javacode.WordToNumFinal;

public class FinalsTester {
    
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word:");
        String sample = sc.nextLine();
        WordToNumFinal s2 = new WordToNumFinal();
        s2.wordToNumber(sample);       
       
      

    }

}
