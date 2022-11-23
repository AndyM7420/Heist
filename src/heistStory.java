
import java.util.Objects;

public class heistStory {
    String outcome;
    String userInput;
    String directions;
    int choice;
    public heistStory(String outcome) {
        this.outcome=outcome;
        userInput=outcome;
    }
    public void newInput(String newOutcome){
        outcome=newOutcome;
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
    public String decisions(String decision){
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
        return decision;
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
         userInput="manager";
         law="The guards take you out. Guess you should've taken out the guards first.";
         person="die";
         outcome=person;
         return person;
     }
     if(Objects.equals(person,"guards")){
         userInput="guards";
         law="you have gotten rid of the guards. You see a hostage move. Do you punch him or stab him?(enter punch or stab)";
     }
     return law;
    }
    public String punchOrStab(String stab){
        String punchOStab="";

        if(Objects.equals(stab,"stab")){
            userInput="stab";
            punchOStab="You stab him and he bleeds to death. Their wife was present do you kill her swell?.\n(input yes or no)";
        }
        if(Objects.equals(stab,"punch")){
            userInput="punch";
            punchOStab="You punch him but it turns out he is a professional kick-boxer.\nHe f*cks you up till you are almost dead. Do you shoot him or fight him off?";

        }
        return punchOStab;
    }
    public String wifeOrBoxer(String wife){
        String wifeOrBoxer="";
        if(Objects.equals(wife,"yes")){
            userInput="yes";
            wifeOrBoxer="BOOM! Wife is also dead. Her sister was also present.\nDo you kill her too?";
        }
        if(Objects.equals(wife,"no")){
            userInput="no";
            wifeOrBoxer="Alr Wife is kept alive but the guys brother is here too.\nDo you kill him?";
        }
        if(Objects.equals(wife,"shoot")){
            userInput="shoot";
            wifeOrBoxer="LFG!He dies and you left bruised but fine\nAnother bystander calls you weak. Do you kill him?";
        }
        if(Objects.equals(wife,"fight")){
            userInput="fight";
            wifeOrBoxer="UH OH. The boxer overpowers. Thankfully the robber stabs him.Now you can choose to finish him off or save him?";
        }
        return wifeOrBoxer;
    }
//planner decisions
    public String planner(){
        String second="planner";
        String task="";
        if(second.equals(outcome)){
            task= "You picked the hardest task. You will plan the task. Where do you want to rob?\nbank, museum, rich person";
        }
        return task;
    }
    public String planPlace(String which){
        String decide="";
        if(Objects.equals(which, "bank")){
            userInput="bank";
            decide="Bet. We will rob a bank. Now you have to decide how much money from the bank you want?\n15,000 or 22,500 or 3,750";
        } else if(Objects.equals(which,"museum")){
            userInput="museum";
            decide="Bet. We will rob a gas station. Now you have to decide what you want from the museum\npaintings, fossils, or artifacts";

        } else if(Objects.equals(which,"rich person")){
            userInput="rich person";
            decide="Bet. We will rob a rich person\nNow you must decide what do you want  in the rich person's house\njewelry, shoes, or clothing ";

        } else {
            userInput="bozo";
            decide="Try Again";
        }
        return decide;
    }
    public String sneak(String sneaky){
        outcome=sneaky;
        String now="";
        if(Objects.equals(sneaky, "jewelry")||Objects.equals(sneaky,"shoes")|| Objects.equals(sneaky,"clothing")){
            userInput="jewelry";
            now="You've decided on "+sneaky+" Will you keep it among you're friends or sell it?";
        } else if(Objects.equals(sneaky, "15,000")||Objects.equals(sneaky,"22,500")|| Objects.equals(sneaky,"3,750")){
            userInput="15,000";
            now="You've decided on "+sneaky+" Will you spread the money three ways or invest?";
        } else if(Objects.equals(sneaky, "fossils")||Objects.equals(sneaky,"paintings")|| Objects.equals(sneaky,"artifacts")){
            userInput="fossils";
            now="You've decided on "+sneaky+" Will you thrift the item or sell it on the black market?";
        } else {
            userInput="bozo";
            now="Try Again";
        }
        return now;
    }
    public String spend(String affect){
        String decision="";
        if(Objects.equals(affect,"friends")){
            decision="You will keep the "+outcome+" with you're friends."+"\n"+"Where will we store the "+outcome+"?\nYou're house, a safe, or in a money laundry business";
        }
        if(Objects.equals(affect,"sell")){
            decision="Where will we sell the "+outcome+"  \nIn a pawn shop, to our friends, or d*mb*ss in the street?";
        }
        if(Objects.equals(affect,"spread")){
            decision="We will split the money evenly\nHowever, one of us needs to hold it for a bit. The robber, planner, or muscle?";
        }
        if(Objects.equals(affect,"invest")){
            decision="Will we use the "+outcome+" for dr*gs, weapons, or food?";
        }
        if(Objects.equals(affect,"thrift")){
            decision="We will thrift the "+outcome+" to another foreign museum or to a regular thrift store?";
        }
        if(Objects.equals(affect,"black market")){
            decision="Will we sell it for a specific amount of money or trade it for resources?";
        }
        return decision;
    }
    //ROBBER DECISIONS
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
        } else {
            MoG="Try Again";
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
        String leftSRight;
        leftSRight = switch (direct) {
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
        } else if(directions.equals("straight")){
            if(choice.equals("hide")){
                future="The cops found you and have sentenced all of you to 10+ years.";
            }
            if(choice.equals("steal")){
                future="You find another car and continue to be on the lamb for years.\nYou find a place to stay and all of you're friends go their separate ways.";
            }
        } else if(directions.equals("right")){
            if(choice.equals("stay")){
                future="the cops have found you because you were a lazy pig.";
            }
            if(choice.equals("country")){
                future="the cops never find you but you and your friends plan another heist.\nThis country has better police and you are found.";
            }
        } else {
            future="Try Again";
        }
        return future;
    }
    public  boolean checkWord(String word){
        return word.equals(userInput);
    }

    public String toString() {
        return "Hello";
    }
}
