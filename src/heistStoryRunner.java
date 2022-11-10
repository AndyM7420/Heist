
import java.util.Objects;
import java.util.Scanner;
public class heistStoryRunner {


    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Option 1: robber- this person will be the one to enter a bank and steal the money\n "+"Option 2: planner- This person will plan the heist\n"+"Option 3: The muscle- This person will intimidate the guards \n"+"Option 4: random- If you are unsure of what to do enter shuffle and the program will randomly pick for you ");
        System.out.println("Welcome to my heist story! Pick the role you want :). Have fun!");
        String outcomes= s.nextLine();
        heistStory user= new heistStory(outcomes);
                System.out.println(user.method(outcomes));
                String choice  = s.nextLine();
                System.out.println(user.MoG(choice));
    }
}


