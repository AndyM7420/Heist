
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
            random(choice);
        }
        if ("robber".equals(this.outcome)) {
            choice = 1;
            return robber();
        } else if ("planner".equals(outcome)) {
            choice = 2;
            return planner();
        } else if ("muscle".equals(outcome)) {
            choice = 3;
        }
        return hello;
    }
    private void random(int random){
        int four;
        if(random==4){
            four=(int)(Math.random()*3)+1;
            if(four==1){
                outcome="robber";
            } else if (four==2) {
                outcome="planner";
            } else if (four==3) {
                outcome="muscle";
            }
        }
    }
    public String planner(){
        String second="planner";
        String task="";
        if(second.equals(outcome)){
            task= "You picked the hardest task. You will plan the task. Where do you want to rob?\nbank, gas station, rich person";
        }
        return task;
    }
    public String planPlace(String which){
        String decide="";
        if(Objects.equals(which, "bank")){
            decide="Bet. We will rob a bank. Now you have to decide how much money from the bank you want?";
        }
        if(Objects.equals(which,"gas station")){
            decide="Bet. We will rob a gas station. Now you have to decide what you want from the gas station";
        }
        if(Objects.equals(which,"rich person")){
            decide="Bet. We will rob a gas Station\nNow you must decide how to sneak into the place";
        }
        return decide;
    }
    private String robber(){
        String first = "robber";
        if(Objects.equals(first, outcome)){
            return "You and your friends are in the car. As you are ready to leave, you can choose between a machete or a gun. Which one do you pick?";

        }
        return "Hello";
    }
    public String MoG(String which){
        String MoG="";
        if(which.equals("gun")){
            MoG= "Gun it is! Now you enter the bank and yell \"Everybody Down!\"\nYou can use the gun to hold a hostage. Do you want to hold a hostage";
            return MoG+choiceGun(outcome);
        } else if(which.equals("machete")){
            MoG= "machete is it! Now you enter the bank and yell Freeze! Suddenly someone grabs the machete and you DIE! ";
        }
        return choiceGun("gun")+MoG;
    }
    public String choiceGun(String choice){
        String noOrYes="";
            if(choice.equals("yes")){
                noOrYes="Alright. You have now taken a hostage captive. The banker has negotiated with you get the key to the vault";
            } else if(choice.equals("no")){
                noOrYes="Alright. You will not take a hostage. The banker thinks you're not intimidating enough\nHe calls the police and you go to prison";
            }
        return noOrYes;
    }
}
