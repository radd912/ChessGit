package chess;

public class Rook extends Piece {
    public Rook(PieceColour colour) {
        super();
        if (colour == PieceColour.WHITE){
            setSymbol("♖");
            this.colour = PieceColour.WHITE;
        }
        if (colour == PieceColour.BLACK){
            this.colour = PieceColour.BLACK;
            setSymbol("♜");
        }
    }

    @Override
    public boolean isLegitMove(int x1, int x2, int y1, int y2) {
        boolean canMove = false;
        
        if (x1 == x2 || y1 == y2)  canMove = true;

        if (pieceOnBoard.hasPiece(x2,y2)) {
            canMove = pieceOnBoard.getPiece(x2, y2).getColour() != colour;
        }
        return canMove;
    }
}

