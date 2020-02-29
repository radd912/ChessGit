package chess;

public class Queen extends Piece {
    public Queen(PieceColour colour){
        super();
        if(colour == PieceColour.WHITE) setSymbol("♕");
        if(colour == PieceColour.BLACK) setSymbol("♛");

    }

    @Override
    public boolean isLegitMove(int x1, int x2, int y1, int y2) {

        x1 = Math.abs( x1 );
        x2 = Math.abs( x2 );
        y1 = Math.abs( y1 );
        y2 = Math.abs( y2 );

        return Math.abs( x1 - x2) == Math.abs( y1 - y2);
    }
}
