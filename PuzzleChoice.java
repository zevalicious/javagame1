public class PuzzleChoice {
    //needs 
    
    public String puzzleText;
    public String directionResult;
    public String healthResult;
    public String miseryResult;



    public void setChoiceResult(String directionString, int healthChange, int miseryChange, Dave playerDave){
       //in main do if statements after choice to change dave.health value.
        playerDave.heal(healthChange);
        //playerDave.misery(miseryChange);

        //playerDave.move(directionString);


       
    }
     public String setPuzzleText(String puzzleText3){
        puzzleText = puzzleText3;
         return puzzleText;
    }

    

}