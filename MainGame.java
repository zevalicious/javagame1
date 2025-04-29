import java.util.ArrayList;
import java.util.Scanner;

public class MainGame {
public boolean canGo;
public boolean right;
public int[] roomNumArray = { 1, 100, 2, 200, 3, 300, 4, 400, 5 , 500 };   

public static void main(String[] args) {
 ArrayList<Room> roomsList = new ArrayList<Room>();
 ArrayList<PuzzleChoice>  puzzlesList
 = new ArrayList<PuzzleChoice>();



Scanner scanner = new Scanner(System.in);

Dave playerDave = new Dave();


Room room1 = new Room();

PuzzleChoice puzzle1 = new PuzzleChoice();
puzzle1.setRightAnswer("2");
puzzle1.setPuzzleText("s");
puzzle1.setChoiceResult("n",2,2,playerDave);

room1.setRoomMoves(true,true,true,true);

roomsList.add(room1);
puzzlesList.add(puzzle1);


Room room2 = new Room(); 

PuzzleChoice puzzle2 = new PuzzleChoice();
puzzle2.setRightAnswer("2");
puzzle2.setPuzzleText("s");
puzzle2.setChoiceResult("n",2,2,playerDave);
room2.setRoomMoves(true,true,true,true);

roomsList.add(room2);
puzzlesList.add(puzzle2);


Room room3 = new Room(); 

PuzzleChoice puzzle3 = new PuzzleChoice();
puzzle3.setRightAnswer("2");
puzzle3.setPuzzleText("s");
puzzle3.setChoiceResult("n",2,2,playerDave);
room3.setRoomMoves(true,true,true,true);
puzzlesList.add(puzzle3);



Room room4 = new Room(); 

PuzzleChoice puzzle4 = new PuzzleChoice();
puzzle4.setRightAnswer("2");
puzzle4.setPuzzleText("s");
puzzle4.setChoiceResult("n",2,2,playerDave);
room4.setRoomMoves(true,true,true,true);



Room room5 = new Room(); 

PuzzleChoice puzzle5 = new PuzzleChoice();
puzzle5.setRightAnswer("2");
puzzle5.setPuzzleText("s");
puzzle5.setChoiceResult("n",2,2,playerDave);
room5.setRoomMoves(true,true,true,true);




Room room100 = new Room();

PuzzleChoice puzzle100 = new PuzzleChoice();
puzzle100.setRightAnswer("2");
puzzle100.setPuzzleText("s");
puzzle100.setChoiceResult("n",2,2,playerDave);
room100.setRoomMoves(true,true,true,true);

Room room200 = new Room(); 

PuzzleChoice puzzle200 = new PuzzleChoice();
puzzle200.setRightAnswer("2");
puzzle200.setPuzzleText("s");
puzzle200.setChoiceResult("n",2,2,playerDave);
room200.setRoomMoves(true,true,true,true);

Room room300 = new Room(); 

PuzzleChoice puzzle300 = new PuzzleChoice();
puzzle300.setRightAnswer("2");
puzzle300.setPuzzleText("s");
puzzle300.setChoiceResult("n",2,2,playerDave);
room300.setRoomMoves(true,true,true,true);

Room room400 = new Room(); 

PuzzleChoice puzzle400 = new PuzzleChoice();
puzzle400.setRightAnswer("2");
puzzle400.setPuzzleText("s");
puzzle400.setChoiceResult("n",2,2,playerDave);
room400.setRoomMoves(true,true,true,true);

Room room500 = new Room(); 

PuzzleChoice puzzle500 = new PuzzleChoice();
puzzle500.setRightAnswer("2");
puzzle500.setPuzzleText("s");
puzzle500.setChoiceResult("n",2,2,playerDave);
room500.setRoomMoves(true,true,true,true);



roomsList.add(room3);
puzzlesList.add(puzzle3);

roomsList.add(room4);
puzzlesList.add(puzzle4);

roomsList.add(room5);
puzzlesList.add(puzzle5);

roomsList.add(room100);
puzzlesList.add(puzzle100);

roomsList.add(room200);
puzzlesList.add(puzzle200);

roomsList.add(room300);
puzzlesList.add(puzzle300);

roomsList.add(room400);
puzzlesList.add(puzzle400);

roomsList.add(room500);
puzzlesList.add(puzzle500);





  
   




    boolean gameOver=false;
while (!gameOver) {
    int turns = 0;
    boolean playerAnswer = false;
    Room currentRoom = roomsList.get(playerDave.getRoomIndex());
    PuzzleChoice currentPuzzle =puzzlesList.get(playerDave.getRoomIndex());
    //add explanation of how to play
    
    while (!playerAnswer){
        System.out.println(currentPuzzle.getText());



        if ((scanner.nextLine().equals(currentPuzzle.getRightAnswer()))){
            playerAnswer = true;
        }
        else{
            System.err.println("falsefalsefalsefalsefalse! please eneter a new answer");
        }
    }
    currentPuzzle.getChoiceResult(playerDave);
    System.out.println("its time to move yo ! you know your choices alr... 'left, up, down, right'....   also if your choice is invalid you stay put!!");
  
        playerDave.move(currentRoom, scanner.nextLine());

    




    if (turns>20){
    gameOver =true;
    System.out.println("game is so over boron, 2 slow !");
    }
    turns++;

}


}

}
    //please close scanner

    //check if dave is alive before checking rounds over

    //check if room.end is true to end loop once game ends
    //loops back around
    //
//}

