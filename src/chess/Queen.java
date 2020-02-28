package chess;

public class Queen extends Piece {
    public Queen(PieceColour colour){
        super();
        if(colour == PieceColour.WHITE) setSymbol("♕");
        if(colour == PieceColour.BLACK) setSymbol("♛");

    }
}
