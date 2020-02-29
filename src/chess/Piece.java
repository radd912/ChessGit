package chess;

public abstract class Piece {
    protected int row;
    protected int column;
    protected  String symbol;
    protected PieceColour colour;
    static Board pieceOnBoard;



    public String getSymbol(){
        return symbol;
    }

    public void setSymbol(String symbol){
        this.symbol = symbol;
    }

    public PieceColour getColour(){
        return this.colour;
    }

    public void updateCoordinates(int row, int column){
        this.row = row;
        this.column = column;
    }

    public static void setPieceOnBoard(Board pieceOnBoard){
        Piece.pieceOnBoard = pieceOnBoard;
    }

    public abstract boolean isLegitMove(int x1, int x2, int y1, int y2);

}
