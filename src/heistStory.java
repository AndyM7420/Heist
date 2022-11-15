
import java.io.ObjectStreamException;
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
            return theMuscle();
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
    public String theMuscle(){
        String second="muscle";
        String tasks="";
        if(second.equals(outcome)){
            tasks= "You picked the muscle. you will go to the place with the robber. Will you take out the guards or the manager?";
        }
        return tasks;
    }
    public String GoM(){

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
            decide="Bet. We will rob a bank. Now you have to decide how much money from the bank you want?\n15,000 or 22,500 or 3,750";
        }
        if(Objects.equals(which,"gas station")){
            decide="Bet. We will rob a gas station. Now you have to decide what you want from the museum\npaintings, fossils, or artifacts";

        }
        if(Objects.equals(which,"rich person")){
            decide="Bet. We will rob a rich person\nNow you must decide what do you want  in the rich person's house\njewelry, shoes, or clothing ";

        }
        return decide;
    }
    public String sneak(String sneaky){
        outcome=sneaky;
        String now="";
        if(Objects.equals(sneaky, "jewelry")||Objects.equals(sneaky,"shoes")|| Objects.equals(sneaky,"clothing")){
            now="You've decided on "+sneaky+" Will you keep it among you're friends or sell it?";
        }
        if(Objects.equals(sneaky, "15,000")||Objects.equals(sneaky,"22,500")|| Objects.equals(sneaky,"3,750")){
            now="You've decided on "+sneaky+" Will you spread the money three ways or invest?";
        }
        if(Objects.equals(sneaky, "fossils")||Objects.equals(sneaky,"paintings")|| Objects.equals(sneaky,"artifacts")){
            now="You've decided on "+sneaky+" Will you thrift the item or sell it on the black market?";
        }
        return now;
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
