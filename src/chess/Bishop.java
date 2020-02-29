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

        if (Math.abs( x1 - x2) == Math.abs( y1 - y2))  canMove = true;

        directionX = x1 < x2 ? 1 : -1;
        directionY = y1 < y2 ? 1 : -1;

        if(directionX == 1 && directionY == 1) {
            for(int i = y1; i <= y2;i++ ) {
                for(int j = x1; j <= x2 ; ++i, ++j ) {
                    if(pieceOnBoard.getPiece(j,i) != null) {
                        if (pieceOnBoard.getPiece(j, i).getColour() == colour) canMove = false;
                        else canMove = true;
                    }
                }
            }
        }
        else if(directionX == -1 && directionY == -1) {
            for(int i = y1; i >= y2; i++ ) {
                for(int j = x1; j >= x2 ; --i, --j ) {
                    if(pieceOnBoard.getPiece(j,i) != null) {
                        if (pieceOnBoard.getPiece(j, i).getColour() == colour) canMove = false;
                        else canMove = true;
                    }
                }
            }
        }
        else if(directionX == 1 && directionY == -1) {
            for(int i = y1; i>= y2; i++) {
                for(int j = x1; j <= x2 ; ++i, --j ) {
                    if(pieceOnBoard.getPiece(j,i) != null) {
                        if (pieceOnBoard.getPiece(j, i).getColour() == colour) canMove = false;
                        else canMove = true;
                    }
                }
            }
        }
        else if(directionX == -1 && directionY == 1) {
            for(int i = y1; i <= y2;i++ ) {
                for(int j = x1; j >= x2 ; --i, ++j ) {
                    if(pieceOnBoard.getPiece(i,j) != null) {
                        if (pieceOnBoard.getPiece(i, j).getColour() == colour) canMove = false;
                        else canMove = true;
                    }
                }
            }
        }
        return canMove;
    }
}

