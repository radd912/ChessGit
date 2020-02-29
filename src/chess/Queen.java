package chess;

public class Queen extends Piece {

    public Queen(PieceColour colour){
        super();
        if(colour == PieceColour.WHITE){
            setSymbol("♕");
            this.colour = PieceColour.WHITE;
        }
        if(colour == PieceColour.BLACK){
            this.colour = PieceColour.BLACK;
            setSymbol("♛");
        }

    }


    @Override
    public boolean isLegitMove(int x1, int x2, int y1, int y2) {
        boolean canMove = false;

        if (Math.abs( x1 - x2) == Math.abs( y1 - y2))  canMove = true;
        if(x1==x2 || y1 == y2) canMove = true;

        return canMove;
    }
}
