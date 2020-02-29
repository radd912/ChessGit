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
        boolean canMove = false;

        if(y1==y2 || Math.abs(x1-x2) == Math.abs(y1-y2)) canMove = true;
        if (Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1)) > 1) canMove = false;

        return canMove;
    }
}
