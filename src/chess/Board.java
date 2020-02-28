package chess;

public class Board {
    private static Square [][] board = new Square[8][8];

    public Board(){
        for (int i=0; i<board[0].length; i++){
            for (int j=0; j<board[1].length; j++)
                board[i][j]=new Square(i,j);
        }
    }

    public static Square[][] getBoard(){
        return board;
    }

    public void initialisePieces(){

        //PAWNS
        for(int i = 0; i < 8; i++){
            setPiece(1,i,new Pawn(PieceColour.BLACK));
            setPiece(6,i,new Pawn(PieceColour.WHITE));
        }
        //QUEENS
        setPiece(0, 3, new Queen(PieceColour.BLACK));
        setPiece(7, 3, new Queen(PieceColour.BLACK));
        //KINGS
        setPiece(0, 4, new King(PieceColour.BLACK));
        setPiece(7, 4, new King(PieceColour.WHITE));
        //BISHOPS
        setPiece(0, 2, new Bishop(PieceColour.BLACK));
        setPiece(0, 5, new Bishop(PieceColour.BLACK));
        setPiece(7, 2, new Bishop(PieceColour.WHITE));
        setPiece(7, 5, new Bishop(PieceColour.WHITE));
        //ROOKS
        setPiece(0, 0, new Rook(PieceColour.BLACK));
        setPiece(0, 7, new Rook(PieceColour.BLACK));
        setPiece(7, 0, new Rook(PieceColour.WHITE));
        setPiece(7, 7, new Rook(PieceColour.WHITE));
        //KNIGHTS
        setPiece(0, 1, new Knight(PieceColour.BLACK));
        setPiece(0, 6, new Knight(PieceColour.BLACK));
        setPiece(7, 1, new Knight(PieceColour.WHITE));
        setPiece(7, 6, new Knight(PieceColour.WHITE));
    }

    public void printBoard(){
        System.out.print("\n  a b c d e f g h \n");
        System.out.print("  -----------------\n");
        for (int i = 0; i < 8; i++) {
            int row = i + 1;
            System.out.print(row + " |");
            for (int j = 0; j < 8; j++) {
                if (board[i][j].hasPiece()) {
                    System.out.print(board[i][j].getPiece().getSymbol() + "|");
                } else {
                    System.out.print(" |");
                }
            }
            System.out.println("  " + row);
        }
        System.out.print("  -----------------");
        System.out.print("\n  a b c d e f g h \n");
    }


    public void movePiece(int i0, int j0, int i1, int j1, Piece p){
        if(p.isLegitMove(i0,j0,i1,j1)) {
            board[i1][j1].setPiece(getPiece(i0,j0));
            board[i0][j0].removePiece();
        }
        else ;
    }

    public void setPiece(int iIn, int jIn, Piece p){
        board[iIn][jIn].setPiece(p);

    }

    public Piece getPiece(int iIn, int jIn){
        return board[iIn][jIn].getPiece();
    }


    public boolean hasPiece(int i, int j){
        return board[i][j].hasPiece();
    }

//    public Square getBoard(){
//        return board[][];
//    }


}