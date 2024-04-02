import java.util.Scanner;

public class StringEquals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the first line: ");
        String line1 = scanner.nextLine();

        System.out.print("Enter the second line: ");
        String line2 = scanner.nextLine();

      
        

        
        if (line1.equals(line2)) {
            System.out.println("Line are the same");
        } else {
            System.out.println("Line are the different");
        }

       
      
  
    }
}
