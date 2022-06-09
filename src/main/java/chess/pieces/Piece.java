package chess.pieces;

public class Piece {
    private final String color;
    private final String name;
    public static String WHITE = "white";
    public static String BLACK = "black";
    public static String PIECE_PAWN = "Pawn";
    public static String PIECE_ROOK = "Rook";
    public static String PIECE_KNIGHT = "Knight";
    public static String PIECE_BISHOP = "Bishop";
    public static String PIECE_QUEEN = "Queen";
    public static String PIECE_KING = "King";
    private final char representation;
    private static int countWhite;
    private static int countBlack;
    private Piece(String color,String name, char representation) {
        this.color = color;
        this.name = name;
        this.representation = representation;
    }
    public static Piece createWhitePawn(){
        return  Piece.createWhitePiece( PIECE_PAWN, 'p');
    }
    public static Piece createBlackPawn(){
        return  Piece.createBlackPiece( PIECE_PAWN, 'p');
    }
    public static Piece createWhiteRook(){
        return  Piece.createWhitePiece( PIECE_ROOK, 'r');
    }
    public static Piece createBlackRook(){
        return  Piece.createBlackPiece( PIECE_ROOK, 'r');
    }
    public static Piece createWhiteKnight(){
        return  Piece.createWhitePiece( PIECE_KNIGHT, 'n');
    }
    public static Piece createBlackKnight(){
        return  Piece.createBlackPiece( PIECE_KNIGHT, 'n');
    }
    public static Piece createWhiteBishop(){
        return  Piece.createWhitePiece( PIECE_BISHOP, 'b');
    }
    public static Piece createBlackBishop(){
        return Piece.createBlackPiece( PIECE_BISHOP, 'b');
    }
    public static Piece createWhiteQueen(){
        return  Piece.createWhitePiece( PIECE_QUEEN, 'q');
    }
    public static Piece createBlackQueen(){
        return  Piece.createBlackPiece( PIECE_QUEEN, 'q');
    }
    public static Piece createWhiteKing(){
        return  Piece.createWhitePiece(PIECE_KING, 'k');
    }
    public static Piece createBlackKing(){
        return  Piece.createBlackPiece( PIECE_KING, 'K');
    }
    public char getRepresentation() {
        if (color.equals(BLACK)) {
            return Character.toUpperCase(representation);
        }
        return representation;
    }
    private static Piece createWhitePiece(String name, char representation){
        incrementWhitePiece();
        return new Piece(WHITE, name, representation);
    }
    private static Piece createBlackPiece(String name, char representation){
        incrementBlackPiece();
        return new Piece(BLACK, name, representation);
    }
    private static int incrementWhitePiece(){
        return ++countWhite;
    }
    private static int incrementBlackPiece(){
        return ++countBlack;
    }
    public static int getBlackCounter(){
        return countWhite;
    }
    public static int getWhiteCounter(){
        return countBlack;
    }
    public static void resetCounter(){
        countWhite = 0;
        countBlack = 0;
    }
    public boolean isWhite(){
        if (color == WHITE){
            return true;
        }
        else return false;
    }
    public boolean isBlack(){
        if (color == BLACK){
            return true;
        }
        else return false;
    }

}