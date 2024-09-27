import java.util.Scanner;

public class MyFirstProgram{
    static Scanner scan = new Scanner(System.in);
    public static String path(){
return "s";
    }
    public static int turn(String r, String x,String l, String xl, int healthloss, int lhealthloss, int health){
        
        String b = scan.nextLine();
        
    
        if (b.equals((r))) //make this the correct answer
        {
            health = health - healthloss;
            System.out.println(
    
        x
            
            
            
    );

    }
    else if (b.equals((l))){
   health = health - lhealthloss;
        System.out.println(

        xl
        );
    }
    else {
        System.out.println(
            """
                huge error
                    """
                    
                    
            );

    }

    return health;
    }
public static void main(String[] args){
    System.out.println("hello world");



    System.out.println(
    """
         you were a soldier on a wonderous journey down into a swamp of fear and dispair :3
    
    The swamp conusmed your sould and corrupted you. The only way to reach salvation is to come to peace 
    with your death. 


    Good luck soldier. 
    
    type e to continue. 
            """
            
            



    );
int health = 100;         
 health = turn("e",  """
        You have arrived at the swamp, 
        do you want to stay and explore(type stay) or attempt to escape(type escape)?
        """,
 "idc im going home", 
 "oh shut up ur dead",0,20, health);

 health = turn("stay", "you are still within the swamp." + 
 "A swamp monkey appears from beneath your feet and decides to attack!"+
 "type(stomp)to stomp on its skull, "+
 "type (run) to run away!", 
 "escape", "You try to escape. You run as fast as you can towards the light in front of you. \n"
 +
 "*squalch* \n"+
 "You stepped on a crunchy stick. type (take) to take the stick, \n "+
 "type (scream) to scream at the the scary stick", 10, 0, health);

if (health == (int) (90)){
health = turn("stomp","your health depleats by 10. \n"+
"The skull would have cut your foot in two! luckily you were wearing a boot :3. \n "+
""+
" type (continue) to continue on your heros journey!!!!",
"run",
"You run away from the gross ape that scared you.\n"+
" You arrive in a strange feild with a house. type (investigate) to investigate the house. "+
"type (continue) to continue on your hero's journey!!",0,1,health);

}
else {
    health = turn ("take","You take the stick off of the ground. This will be usefull later.\n"+
    " type(sticktinue) to continue on your hero's journey. ",
    "scream",
    "You scream and run away from the gross stick that scared you.\n"+
    " You arrive in a strange feild with a house. type (investigate) to investigate the house. "+
    "type (continue) to continue on your hero's journey!!",0,1,health);
    

}
if (health ==90 || health == 100 ){
    health = turn("continue", 
     " You arrive in a strange feild with a house with a hole in your boot."+ 
    "type (investigate) to investigate the house. "+
        "type (continue) to continue on your hero's journey!!",
      "sticktinue", 
        "You and the stick arrive in a strange feild with a house. type (investigate) to investigate the house.\n" + 
        " type (continue) to continue on your hero's journey!!",0,20, health);
}


        scan.close();

    }
    
}
//bleh xd bleh xd 
