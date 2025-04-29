
import java.util.Stack;

public class PuzzleChoice {
    //needs 
    
    public String puzzleText;
    public String directionResult;
    public String rightAnswer;
    public int healthChange;
    public int miseryChange;
    public void setRightAnswer(String rightAnswerImput){

        rightAnswer = rightAnswerImput;
    }
    public String getRightAnswer(){

        
            return rightAnswer;
        }
    public String getText(){

        return puzzleText;

    }
    
    
    public void setChoiceResult(String directionString, int healthChange1, int miseryChange1, Dave playerDave){
       //in main do if statements after choice to change dave.health value.
       //remember to set all 
        //same thing as health just used for whichEnding
            directionResult = directionString;
        
        //playerDave.move(directionString);
        healthChange = healthChange1;
        miseryChange = miseryChange1;


       
    }
    public void getChoiceResult(Dave playerDave){
        //getDave initialized in mainGame.heal(healthChange);
        playerDave.misery(miseryChange);
        //remember to get all
        playerDave.heal(healthChange);

    }

    public String getDirectionResult() {
        return directionResult;
    }
    
    public void setPuzzleText(String puzzleText3){
        puzzleText = puzzleText3;
    }

    

}