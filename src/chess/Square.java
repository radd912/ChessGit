package chess;

public class Square {
    private int i;
    private int j;
    private boolean hasPiece;
    Piece p;
    private PieceColour colour;

    public Square(int i, int j){
        this.i = i;
        this.j = j;
    }

    public void setPiece(Piece p){
        this.p = p;
    }

    public Piece getPiece(){
        return this.p;
    }

    public void removePiece(){
        this.p = null;
    }


    public boolean hasPiece(){
        if (p != null) this.hasPiece = true;
        else this.hasPiece = false;
        return this.hasPiece;
    }

    public int getI(){
        return i;
    }

    public int getJ(){
        return j;
    }


}
