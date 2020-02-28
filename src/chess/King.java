package chess;

public class King extends Piece {
    public King(PieceColour colour){
        super();
        if(colour == PieceColour.WHITE) setSymbol("♔");
        if(colour == PieceColour.BLACK) setSymbol("♚");

    }
}
