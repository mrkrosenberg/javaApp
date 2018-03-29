
import java.util.Scanner;

class test
{
    public static void main(String[] args)
        {
            String word = "We";
            System.out.print(word);
            
            char word2 = 'A';
            char word3 = 'R';
            char word4 = 'E';
            System.out.print(" " + word2);
            System.out.print(word3);
            System.out.print(word4);
            
            int num = 138;
            System.out.println(" " + num);
            
            float decimal = 3.14159f;
            System.out.println("Mmmmmmm pi: " + decimal);
            
            boolean result = true;
            System.out.println("This is a " + result + " statement. That is pi.");
            
            byte g = 127;
            System.out.println(g);
            
            short lilNumb = 30000;
            System.out.println(lilNumb);
            
            long bigNumb = 834597235;
            System.out.println(bigNumb);
            
            double decimalLong = 5.11111111111111111111111111;
            System.out.println(decimalLong);
            
            System.out.println("This one will print out with a line break");
            
              // initializes scanner
            Scanner input = new Scanner(System.in);

            System.out.println("What's Yo' Name? ");
            String name = input.nextLine();
            
            System.out.println("My name is " + name);
    }
}