import java.util.ArrayList;

public class Dave {
    //instantialize a room
    public int playerRoomNum;
    public int misery;
    ArrayList<Room> roomsList = new ArrayList<Room>();
    public int roomCount = 0;
    public int roomIndex = 0;
    public int[] roomNumArray = { 1, 100, 2, 200, 3, 300, 4, 400, 5 , 500 };    


    int health = 10;
    public int getRoomIndex(){

        return playerRoomNum;
    }
    public boolean aliveCheck(){ //method, thing that the class can do
        if (health <= 0){
            return false;

        }
     return true;
    }
    public void heal(int x){ //method, thing that the class can do
        health += x;
    }
    public void misery(int x){ //method, thing that the class can do
        misery += x;
    }
    public int getHealth(){

        return health;
    }
    public int getMisery(){
        return misery;
    }
    public int fight(){ //fight method
        double y = Math.random();
        if (y >= 0.5)
        {
        health --;
        }
        else {

        }
        return health;
        
    }
    public void currentRoom(){


    }
    //asks which way user wants to move, this moves. 
    //loop through array list until roomNum to get its index, index is the same as index of room in room arrayList
/**
 * 
 * @param eRoom -put the room based on current room index,getRoomIndex.
 * @param choice - string of players choice
 * @return - returns the room after running even if unchanged, will return the same room as before so remember to check if room has stayed the same. 
 */
    public Room move(Room eRoom, String choice){
        if ((eRoom.canMoveDown)&&(choice.equals("down"))){
            playerRoomNum = (playerRoomNum - 100);



        }   
        //ADD UP AND RIGHT
        if ((eRoom.canMoveLeft)&&(choice.equals("left"))){
        playerRoomNum--;}
        if ((eRoom.canMoveUp)&&(choice.equals("up"))){
            playerRoomNum = (playerRoomNum + 100);



        }   
        //ADD UP AND RIGHT
        if ((eRoom.canMoveRight)&&(choice.equals("right"))){
            playerRoomNum++;}


        for (int e:roomNumArray){
            if (e == playerRoomNum){
                roomIndex = roomCount;
            }
            roomCount++;
        }
        return roomsList.get(roomIndex);

    }
    //room move method. if room.canMove = true,
    //if right
    //roomNum++ 
    //or up roomNum += 100;
    //left/down are same but negative
    

    public static void main(String[] args) {
        //inverntory arrayList system. 
        //
                ArrayList<Integer> myList = new ArrayList<Integer>();
        myList.add(50);
        myList.add(30);
        myList.add(20);
        int total = 0;
        for (Integer value : myList)
        {
            total += value;
        }
        System.out.println("Sum of all elements: " + total);
}
}