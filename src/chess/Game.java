package chess;

public class Game {
//    private static boolean gameEnd = false;
//
//    public Game() {
//
//        while (!gameEnd) {
//            //write the game logic
//        }
//    }
    public static void main(String[] args) {
        Board b = new Board();
        b.initialisePieces();
        b.printBoard();

    }
}