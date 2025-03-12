import java.util.ArrayList;
//there is a room number associated with each room which is also its number in an arrayList
public class MainGame {
public boolean canGo;
public boolean right;
public int[] roomNumArray = { 1, 100, 2, 200, 3, 300, 4, 400, 5 , 500 };   
public static void main(String[] args) {
Room room1 = new Room();
PuzzleChoice puzzle1 = new PuzzleChoice();

room1.setRoomMoves(true,true,true,true);
Room room2 = new Room(); 
room2.setRoomMoves(true,true,true,true);
Room room3 = new Room(); 
room3.setRoomMoves(true,true,true,true);
Room room4 = new Room(); 
room4.setRoomMoves(true,true,true,true);
Room room5 = new Room(); 
room5.setRoomMoves(true,true,true,true);
Room room100 = new Room();
room100.setRoomMoves(true,true,true,true);
Room room200 = new Room(); 
room200.setRoomMoves(true,true,true,true);
Room room300 = new Room(); 
room300.setRoomMoves(true,true,true,true);
Room room400 = new Room(); 
room400.setRoomMoves(true,true,true,true);
Room room500 = new Room(); 
room500.setRoomMoves(true,true,true,true);
}

    //initialize all the rooms
    //initialize all the puzzles
    //MAKE SURE THE PUZZLE HAS SAME INDEX AS ROOM


    //the game
    //int turnsLeft. 
    //While (!gameOver){
    // text saying how many turns you have left
    //turnsLeftInt --
    //get puzzletext/print
    //while player ==wrong
    //ask player for answer
    //puzzle.getChoiceResult
    //while player == cantGo
    //ask where player wants to go
    //check room.canMove
    //dave.move()
    //check if room.end is true to end loop once game ends
    //loops back around
    //
//}
}
