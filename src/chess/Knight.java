package chess;

public class Knight extends Piece {
    public Knight(PieceColour colour){
        super();
        if(colour == PieceColour.WHITE) setSymbol("♘");
        if(colour == PieceColour.BLACK) setSymbol("♞");

    }
}
