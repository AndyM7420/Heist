
import java.util.Objects;
import java.util.Scanner;
public class heistStoryRunner {


    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Option 1: robber- this person will be the one to enter a bank and steal the money\n"+"Option 2: planner- This person will plan the heist\n"+"Option 3: muscle- This person will intimidate the guards \n"+"Option 4: random- If you are unsure of what to do enter shuffle and the program will randomly pick for you ");
        System.out.println("Welcome to my heist story! Pick the role you want :). Have fun!");
        String outcomes= s.nextLine();
        heistStory user= new heistStory(outcomes);
        if(Objects.equals(outcomes, "robber")||Objects.equals(outcomes,"random")) {
            System.out.println(user.method(outcomes));
            String choice = s.nextLine();
            System.out.println(user.MoG(choice));
            String hos = s.nextLine();
            System.out.println(user.choiceGun(hos));
            String killed= s.nextLine();
            System.out.println(user.killOption(killed));
            String direct=s.nextLine();
            System.out.println(user.directions(direct));
        }
        if(Objects.equals(outcomes,"planner")||Objects.equals(outcomes,"random")){
            System.out.println(user.method(outcomes));
            String choice = s.nextLine();
            System.out.println(user.planPlace(choice));
            String allow=s.nextLine();
            System.out.println(user.sneak(allow));
        }
        if(Objects.equals(outcomes,"muscle")||Objects.equals(outcomes,"random")){
            System.out.println(user.method(outcomes));
            String choice = s.nextLine();

    }}
}






/*System.out.println(user.planPlace(choice));
        String allow=s.nextLine();
        System.out.println(user.sneak(allow));

 System.out.println(user.MoG(choice));
                String hos= s.nextLine();
                System.out.println(user.choiceGun(hos));
*/
