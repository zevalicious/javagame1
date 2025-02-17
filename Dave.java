import java.util.ArrayList;

public class Dave {
    //instantialize a room
    public int roomNum;
    ArrayList<Room> roomsList = new ArrayList<Room>();
    int[] roomNumArray = { 1, 100, 2, 200, 3, 300, 4, 400, 5 , 500 };    
    int roomCount = 0;
    int roomIndex = 0;

    int health = 10;
    public boolean aliveCheck(){ //method, thing that the class can do
        if (health <= 0){
            return false;

        }
     return true;
    }
    public int heal(int x){ //method, thing that the class can do
        health += x;
       return health;
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

    public Room move(Room eRoom, String choice){
        if ((eRoom.canMoveDown)&&(choice.equals("down"))){
            roomNum = (roomNum - 100);



        }   
        if ((eRoom.canMoveLeft)&&(choice.equals("left"))){
        roomNum--;}
        for (int e:roomNumArray){
            if (e == roomNum){
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