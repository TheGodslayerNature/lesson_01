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
    private Piece(String color,String name, char representation) {
        this.color = color;
        this.name = name;
        this.representation = representation;
    }
    public static Piece createWhitePawn(){
        return new Piece(WHITE, PIECE_PAWN, 'p');
    }
    public static Piece createBlackPawn(){
        return new Piece(BLACK, PIECE_PAWN, 'p');
    }
    public static Piece createWhiteRook(){
        return new Piece(WHITE, PIECE_ROOK, 'r');
    }
    public static Piece createBlackRook(){
        return new Piece(BLACK, PIECE_ROOK, 'r');
    }
    public static Piece createWhiteKnight(){
        return new Piece(WHITE, PIECE_KNIGHT, 'n');
    }
    public static Piece createBlackKnight(){
        return new Piece(BLACK, PIECE_KNIGHT, 'n');
    }
    public static Piece createWhiteBishop(){
        return new Piece(WHITE, PIECE_BISHOP, 'b');
    }
    public static Piece createBlackBishop(){
        return new Piece(BLACK, Piece.PIECE_BISHOP, 'b');
    }
    public static Piece createWhiteQueen(){
        return new Piece(WHITE, PIECE_QUEEN, 'q');
    }
    public static Piece createBlackQueen(){
        return new Piece(BLACK, PIECE_QUEEN, 'q');
    }
    public static Piece createWhiteKing(){
        return new Piece(WHITE, PIECE_KING, 'k');
    }
    public static Piece createBlackKing(){
        return new Piece(BLACK, PIECE_KING, 'k');
    }
    public char getRepresentation() {
        if (color.equals(BLACK)) {
            return Character.toUpperCase(representation);
        }
        return representation;
    }
}