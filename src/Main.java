import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double salary = 0;
        String name = "";
        int age = 0;
        String trash = "";
        int favNum = 0;

        System.out.print("Enter your name: ");
        name = in.nextLine();

        System.out.println("You said your name is " + name);

        // This is an unprotected read of a number value which will fail if it is not a valid number
 /*       System.out.print("\nEnter your age: ");
        age = in.nextInt();

        System.out.println("You said your age is " + age);
*/

        System.out.print("\nEnter your age: ");
        if(in.hasNextInt())
        {
            age = in.nextInt();
            in.nextLine(); // Have to clear the buffer after reading a number
            System.out.println("You said your age is " + age);
        }
        else
        {
            trash = in.nextLine();
            System.out.println( trash + " is not a valid number");
        }

        System.out.print("Enter your salary: ");
        if(in.hasNextDouble())
        {
            salary = in.nextDouble();
            in.nextLine(); // Have to clear the buffer after reading a number
            System.out.println("\nYou said your salary is " + salary);
        }
        else
        {
            trash = in.nextLine();
            System.out.println( trash + " is not a valid salary");
        }

        // Favorite Number 1 - 10
        System.out.print("Enter your fav num [1 - 10]: ");
        if(in.hasNextLine())
        {
            favNum = in.nextInt();
            in.nextLine();
            if(favNum >= 1 && favNum <= 10)
            {
                System.out.println("\nYou said your favorite number was " + favNum);
            }
            else
            {
                System.out.println("You said your fav num is " + favNum + " but that is out of range");
            }
        }





    }
}