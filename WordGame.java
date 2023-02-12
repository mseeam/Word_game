import java.util.Scanner;  // Import the Scanner class

public class WordGame {

    public static void main(String[] args) {
        
        System.out.println('\n');
        System.out.println("A program that plays a word game with the user.");
        System.out.println('\n');

        // Create a Scanner object
        Scanner myObj = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        String person_name = myObj.nextLine();
        
        System.out.println("Please enter your age: ");
        String age = myObj.nextLine();
        
        System.out.println("Please enter your name of city: ");
        String city = myObj.nextLine();

        System.out.println("Please enter your name of college: ");
        String college_name = myObj.nextLine();

        System.out.println("Please enter your name of profession: ");
        String profession = myObj.nextLine();

        System.out.println("Please enter your type of animal: ");
        String animal = myObj.nextLine();

        System.out.println("Please enter a pet’s name: ");
        String pet = myObj.nextLine();

        System.out.println('\n');
        System.out.println("There once was a person named " +person_name+ ", who lived in " +city+ ". At the age of " +age+ " , " +person_name+ " went to college at " +college_name+ ". " +person_name+ " graduated and went to work as a " +profession+ ". Then " +person_name+ " adopted a(n) " +animal+ " named "+ pet + ". They both lived happily ever after! ");
        System.out.println('\n');

	}

}