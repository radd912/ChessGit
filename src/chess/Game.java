package chess;

public class Game {
    private static boolean gameEnd = false;

    public Game() {
        Board b = new Board();
        b.initialisePieces();
        System.out.println(b.movePiece(1,1,6,6,b.getPiece(1,1)));
        b.printBoard();
//        while (!gameEnd) {
//            //write the game logic
//        }
    }
    public static void main(String[] args) {
        Game g = new Game();

    }
}