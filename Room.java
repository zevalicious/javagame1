import java.util.ArrayList;

public class Room {
    public int roomNum;
    public boolean canMoveLeft;
    public boolean canMoveRight;
    public boolean canMoveUp;
    public boolean canMoveDown;
    
    public void setRoomMoves(boolean left, boolean right, boolean up, boolean down){
        if (left == true){
            canMoveLeft = true;
        }
        else{
            canMoveLeft = false;
        }
        if (right == true){
            canMoveRight = true;
        }
        else{
            canMoveRight = false;
        }
        if (up == true){
            canMoveUp = true;
        }
        else{
            canMoveUp = false;
        }
        if (down == true){
            canMoveDown = true;
        }
        else{
            canMoveDown = false;
        }

    }
   // public void setRoomResult(String directionString, int health, int misery){


//archived/moved to PuzzleChoice
   // }



    public boolean canMove(int direction){
       if ((direction == 1) && (canMoveLeft ==false)){ 
       //&& bropken

       return false;

        }
        else if ((direction == 2) && (canMoveRight ==false)){
            return false;

        }

        else if ((direction == 3) && (canMoveUp ==false)){
            return false;

        }

        else if ((direction == 4) && (canMoveDown ==false)){
            return false;

        }

        return true;
}
}

