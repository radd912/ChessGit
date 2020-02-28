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
        b.movePiece(2, 0, 4, 3,b.getPiece(2,0));
        b.printBoard();

    }
}