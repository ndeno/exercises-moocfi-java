
import java.util.Scanner;

public class LengthOfName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name:");
        String givenName = reader.nextLine();
        System.out.println("Number of characters: "+calculateCharacters(givenName));
    }
    
    
    public static int calculateCharacters(String text){
        return text.length(); 
    }
    
}
