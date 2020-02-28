package chess;

public abstract class Piece {
    protected int row;
    protected int column;
    protected  String symbol;
    protected PieceColour colour;



    public String getSymbol(){
        return symbol;
    }

    public void setSymbol(String symbol){
        this.symbol = symbol;
    }

    public PieceColour getColour(){
        return colour;
    }

    public void updateCoordinates(int row, int column){
        this.row = row;
        this.column = column;
    }

    public   boolean isLegitMove(int x1, int x2, int y1, int y2){return true;};

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }
}
