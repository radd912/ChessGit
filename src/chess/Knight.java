package chess;

public class Knight extends Piece {
    public Knight(PieceColour colour){
        super();
        if(colour == PieceColour.WHITE){
            setSymbol("♘");
            this.colour = PieceColour.WHITE;
            }
        if(colour == PieceColour.BLACK){
            setSymbol("♞");
            this.colour = PieceColour.BLACK;
        }
    }

    @Override
    public boolean isLegitMove(int x1, int x2, int y1, int y2) {
        int xdiff = Math.abs(x1 - x2);
        int ydiff = Math.abs(y1 - y2);
        boolean canMove = false;

        if(xdiff ==1){
            if(ydiff == 2){
                canMove = true;
            }
        }
        else if ( xdiff == 2) {
            if ( ydiff == 1) {
                canMove = true;
            }
        }
        else {
            canMove = false;
        }


        return canMove;
    }
}
