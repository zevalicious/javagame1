import java.util.ArrayList;

public class Dave {
    int health;
    public int die(){ //method, thing that the class can do
    System.out.println("");
     return 0;
    }
    public int heal(){ //method, thing that the class can do
        health ++;
       return health;
    }
    public int fight(){ //method, thing that the class can do
        double y = Math.random();
        if (y >= 0.5)
        {
        health --;
        System.out.println("");
        }
        else {
        System.out.println("");

        }
        return health;
        
    }

    public static void main(String[] args) {
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