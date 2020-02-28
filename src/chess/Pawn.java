package chess;

public class Pawn extends Piece {

    public Pawn(PieceColour colour){
        super();
        if(colour == PieceColour.WHITE) setSymbol("♙");
        if(colour == PieceColour.BLACK) setSymbol("♟");
    }
}
