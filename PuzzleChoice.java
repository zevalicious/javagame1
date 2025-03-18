public class PuzzleChoice {
    //needs 
    
    public String puzzleText;
    public String directionResult;
    public String rightAnswer;

    public void setRightAnswer(String rightAnswerImput){

        rightAnswer = rightAnswerImput;
    }
    public String getRightAnswer(){

        
            return rightAnswer;
        }
    
    public void setChoiceResult(String directionString, int healthChange, int miseryChange, Dave playerDave){
       //in main do if statements after choice to change dave.health value.
       //remember to set all 
        //same thing as health just used for whichEnding
            directionResult = directionString;
        playerDave.heal(healthChange);
        //playerDave.move(directionString);


       
    }
    public void getChoiceResult(){
        //getDave initialized in mainGame.heal(healthChange);
        //playerDave.misery(miseryChange);
        //remember to get all

    }
    public void setPuzzleText(String puzzleText3){
        puzzleText = puzzleText3;
    }

    

}