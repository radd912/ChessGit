package chess;
import java.util.Arrays;
import java.util.Scanner;

public class Game {
    private static boolean gameEnd = false;

    public Game() {

        Board b = new Board();
        b.initialisePieces();
        Scanner in = new Scanner(System.in);
        CheckInput check = new CheckInput();
        convertToCoordinates c = new convertToCoordinates();
        b.printBoard();

        while (!gameEnd) {
            System.out.println("Enter move:");
            String input = in.nextLine();
            if (!check.checkCoordinateValidity(input)){
                System.out.println("Invalid Input!");
            }
            else{
                int[] coords = convertToCoordinates.convert(input);
                b.movePiece(coords[1], coords[0], coords[3], coords[2], b.getPiece(coords[1], coords[0]));
                b.printBoard();
            }



        }

    }

    public static void main(String[] args) {
        Game g = new Game();
    }
}