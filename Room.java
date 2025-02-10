public class Room {
    public int roomNum;
    public boolean canMoveLeft;
    public boolean canMoveRight;
    public boolean canMoveUp;
    public boolean canMoveDown;

    public void setRoomMoves(boolean left, boolean right, boolean up, boolean down){


    }
    public void setRoomResult(String directionString, int health, int misery){



    }
    public void setpuzzleText(String puzzleText){


    }


    public boolean canMove(int direction){
       if ((direction == 1) && (canMoveLeft ==false)){ 
       //&& bropken


        }
        else if ((direction == 2) && (canMoveRight ==false)){

        }

        else if ((direction == 3) && (canMoveUp ==false)){

        }

        else if ((direction == 4) && (canMoveDown ==false)){

        }

        return true;
}
}

