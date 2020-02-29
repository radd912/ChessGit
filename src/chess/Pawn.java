package chess;

public class Pawn extends Piece {

    public Pawn(PieceColour colour){
        super();
        if(colour == PieceColour.WHITE){
            setSymbol("♙");
            this.colour = PieceColour.WHITE;
        }
        if(colour == PieceColour.BLACK){
            setSymbol("♟");
            this.colour = PieceColour.BLACK;
        }
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
