package chess;

public class Bishop extends Piece {
    public Bishop(PieceColour colour){
        super();
        if(colour == PieceColour.WHITE){
            setSymbol("♗");
            this.colour = PieceColour.WHITE;
        }
        if(colour == PieceColour.BLACK){
            setSymbol("♝");
            this.colour = PieceColour.BLACK;
        }
    }

    @Override
    public boolean isLegitMove(int x1, int x2, int y1, int y2) {
        boolean canMove = false;
        int directionX;
        int directionY;
        int x1abs = Math.abs( x1 );
        int x2abs = Math.abs( x2 );
        int y1abs = Math.abs( y1 );
        int y2abs = Math.abs( y2 );


        if (Math.abs( x1 - x2) == Math.abs( y1 - y2))  canMove = true;

        directionX = x1 < x2 ? 1 : -1;  //This section checks direction change of x and y
        directionY = y1 < y2 ? 1 : -1;

        if(directionX == 1 && directionY == 1) {   //both directions are positive check both < and adding
            for(int i = y1; i <= y2;i++ ) {
                for(int j = x1; j <= x2 ; ++i, ++j ) {
                    canMove = pieceOnBoard.getPiece(x2,y2).getColour() != colour;
                }
            }
        }
        else if(directionX == -1 && directionY == -1) {   //both directions are negative so we have to see why they are still > and subtract for indexes
            for(int i = y1; i >= y2; i++ ) {
                for(int j = x1; j >= x2 ; --i, --j ) {
                    canMove = pieceOnBoard.getPiece(x2,y2).getColour() != colour;
                }
            }
        }
        else if(directionX == 1 && directionY == -1) {
            for(int i = y1; i>= y2; i++) {
                for(int j = x1; j <= x2 ; ++i, --j ) {
                    canMove = pieceOnBoard.getPiece(x2,y2).getColour() != colour;
                }
            }
        }
        else if(directionX == -1 && directionY == 1) {
            for(int i = y1; i <= y2;i++ ) {
                for(int j = x1; j >= x2 ; --i, ++j ) {
                    canMove = pieceOnBoard.getPiece(x2, y2).getColour() != colour;
                }
            }
        }
        return canMove;
    }
}

