package chess;

public class Rook extends Piece {
    public Rook(PieceColour colour){
        super();
        if(colour == PieceColour.WHITE) setSymbol("♖");
        if(colour == PieceColour.BLACK) setSymbol("♜");

    }
}
