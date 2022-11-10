
import java.util.Objects;

public class heistStory {
    String outcome;
    int choice;
    public heistStory(String outcome) {
        this.outcome=outcome;
    }
    public String method(String hello){
        if ("random".equals(this.outcome)) {
            choice = 4;
        } else if ("robber".equals(this.outcome)) {
            choice = 1;
            return robber(outcome);
        } else if ("planner".equals(outcome)) {
            choice = 2;
        } else if ("muscle".equals(outcome)) {
            choice = 3;
        }
        return hello;
    }

    private String robber(String first){
        first="robber";
        if(Objects.equals(first, outcome)){
            return "You and your friends are in the car. As you are ready to leave, you can between a machete or a gun. Which one do you pick?";

        }
        return "Hello";
    }
    public String MoG(String which){
        String MoG="";
        if(which.equals("gun")){
            MoG= "Gun it is! Now you enter the bank and yell \"Everybody Down!\"";
        } else if(which.equals("machete")){
            MoG= "machete is it! Now you enter the bank and yell Freeze! Suddenly someone grabs the machete and you DIE! ";
        }
        return MoG;
    }
}
