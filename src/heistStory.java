
import java.util.Objects;

public class heistStory {
    String outcome;
    String directions;
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
    public String GoM(String person){
     String law="";
     if(Objects.equals(person,"manager")){
         law="The guards take you out. Guess you should've taken out the guards first.";
     }
     if(Objects.equals(person,"guards")){
         law="you have gotten rid of the guards. You see a hostage move. Do you punch him or stab him?(enter punch or stab)";
     }
     return "law";
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
            if(choice.equals("yes")) {
                noOrYes="Alright. You have now taken a hostage captive. The banker has negotiated with you get the code to the vault\nYou grab all the money\nYou can chose to kill all the people and escape. Yes or No?";
            } else if(choice.equals("no")){
                noOrYes="Alright. You will not take a hostage. The banker thinks you're not intimidating enough\nHe calls the police and you go to prison";
            }
        return noOrYes;
    }
    public String killOption(String kill){
        String toBeKilled="";
        if(kill.equals("yes")){
            toBeKilled="You have killed all the people and will now escape with everyone's money\nthe cops are approaching as you jump into the vehicle. Do you tell the driver to go left,right, or straight?";

        } else if(kill.equals("no")) {
            toBeKilled="You will leave without killing anyone and escape\nLittle do you know a bystander had a phone and was calling the police\nthe cops are approaching as you jump into the vehicle. Do you tell the driver to go left,right, or straight?";
        }
        return toBeKilled;
    }
    public String directions(String direct){
        directions=direct;
        String leftSRight = switch (direct) {
            case "left" ->
                    "Driver goes left which leads to the nearest police station. All of you are arrested but will later get to negotiate.\nYou are now being interrogated. Do you take full blame as the main accomplice?";
            case "straight" ->
                    "Driver goes straight but ends up killing a bunch of bystanders. This leads to more cops on your trail\nYou stumble upon a gas station. Do you hide out there or steal another car(input hide or steal)";
            case "right" -> "Driver goes right and starts to lose the cops\nYou find you're safe house and stay for three hours? Do you want to stay inside longer or go out and try to go another country.";
            default -> "";
        };
        return leftSRight;
    }
    public String choiceForFuture(String choice){
        String future="";
        if(directions.equals("left")){
            if(choice.equals("yes")){
                future="The cops now will take you to trial. You will be sentenced to 10 years in prison.\nHowever once out you're friends have left some money for you and plan to rob another place";
            }
            if(choice.equals("no")){
                future="The cops will take all of you to trial. All of you besides the driver are sentenced to 10+ years. Once out all of you have separated and become poor.";
            }
        }
        if(directions.equals("straight")){
            if(choice.equals("hide")){
                future="The cops found you and have sentenced all of you to 10+ years.";
            }
            if(choice.equals("steal")){
                future="You find another car and continue to be on the lamb for years.\nYou find a place to stay and all of you're friends go their separate ways.";
            }
        }
        if(directions.equals("right")){
            if(choice.equals("stay")){
                future="the cops have found you because you were a lazy pig.";
            }
            if(choice.equals("country")){
                future="the cops never find you but you and your friends plan another heist.\nThis country has better police and you are found.";
            }
        }
        return future;
    }
}
