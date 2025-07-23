package dungog;

import java.util.Scanner;

public class Dungog {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int byear;
        
          System.out.print("Enter your name: " );
          name = sc.nextLine();
  
          System.out.print("Enter Birth year:  ");
          byear = sc.nextInt();
        
          System.out.print("\nHello" +name+ "Your age is: "+(2025-byear));
           
             if((2025-byear) >= 18);
          
    }
    
}
