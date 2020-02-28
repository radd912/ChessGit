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
        b.movePiece(1,1,4,2,b.getPiece(1,1));
        b.movePiece(2,0,1,1,b.getPiece(2,0));
        b.printBoard();

    }
}