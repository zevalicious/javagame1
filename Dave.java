
public class Dave {
    public int die(){ //method, thing that the class can do
    System.out.println("");
     return 0;
    }
    public int heal(int health){ //method, thing that the class can do
        health ++;
       return health;
    }
    public int fight(int health){ //method, thing that the class can do
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
}
}