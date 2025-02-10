import java.util.ArrayList;

public class Dave {
    int health = 10;
    public boolean aliveCheck(){ //method, thing that the class can do
        if (health == 0){
            return false;

        }
     return true;
    }
    public int heal(){ //method, thing that the class can do
        health ++;
       return health;
    }
    public int fight(){ //fight method
        double y = Math.random();
        if (y >= 0.5)
        {
        health --;
        System.out.println("lose");
        }
        else {
        System.out.println("");

        }
        return health;
        
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