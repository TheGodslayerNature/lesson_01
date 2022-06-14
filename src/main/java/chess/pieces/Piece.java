package chess.pieces;

public class Piece {
    public static final char PAWN_REPRESENTATION = 'p';
    public static final char ROOK_REPRESENTATION = 'r';
    public static final char KNIGHT_REPRESENTATION = 'n';
    public static final char BISHOP_REPRESENTATION = 'b';
    public static final char QUEEN_REPRESENTATION = 'q';
    public static final char KING_REPRESENTATION = 'k';
    public static final char NO_PIECE_REPRESENTATION = '.';
    private final char representation;
    private static int countWhite;
    private static int countBlack;
    private static int countPawn;
    public enum Pieces{PAWN, ROOK, KNIGHT, BISHOP, QUEEN, KING, NO_PIECE}
    private Pieces name;
    private enum Colors {WHITE, BLACK, NO_COLOR}
    private final Colors color;
    private Piece(Colors color, Pieces name, char representation) {
        this.color = color;
        this.name = name;
        this.representation = representation;
    }
    public Pieces getName(){
        return name;
    }
    public static Piece noPiece(){
        return new Piece(Colors.NO_COLOR, Pieces.NO_PIECE, NO_PIECE_REPRESENTATION);
    }
    public Pieces getType(){
        return name;
    }
    public static Piece createWhitePawn(){
        return  Piece.createWhitePiece( Pieces.PAWN, 'p');
    }
    public static Piece createBlackPawn(){
        return  Piece.createBlackPiece( Pieces.PAWN, 'p');
    }
    public static Piece createWhiteRook(){
        return  Piece.createWhitePiece( Pieces.ROOK, 'r');
    }
    public static Piece createBlackRook(){
        return  Piece.createBlackPiece( Pieces.ROOK, 'r');
    }
    public static Piece createWhiteKnight(){
        return  Piece.createWhitePiece( Pieces.KNIGHT, 'n');
    }
    public static Piece createBlackKnight(){
        return  Piece.createBlackPiece( Pieces.KNIGHT, 'n');
    }
    public static Piece createWhiteBishop(){
        return  Piece.createWhitePiece( Pieces.BISHOP, 'b');
    }
    public static Piece createBlackBishop(){
        return Piece.createBlackPiece( Pieces.BISHOP, 'b');
    }
    public static Piece createWhiteQueen(){
        return  Piece.createWhitePiece( Pieces.QUEEN, 'q');
    }
    public static Piece createBlackQueen(){
        return  Piece.createBlackPiece( Pieces.QUEEN, 'q');
    }
    public static Piece createWhiteKing(){
        return  Piece.createWhitePiece( Pieces.KING, 'k');
    }
    public static Piece createBlackKing(){
        return  Piece.createBlackPiece( Pieces.KING, 'K');
    }
    public char getRepresentation() {
        if (color.equals(Colors.BLACK)) {
            return Character.toUpperCase(representation);
        }
        return representation;
    }
    private static Piece createWhitePiece(Pieces name, char representation){
        incrementWhitePiece();
        return new Piece(Colors.WHITE, name, representation);
    }
    private static Piece createBlackPiece(Pieces name, char representation){
        incrementBlackPiece();
        return new Piece(Colors.BLACK, name, representation);
    }
    private static int incrementWhitePiece(){
        return ++countWhite;
    }
    private static int incrementBlackPiece(){
        return ++countBlack;
    }
    public static int getBlackCounter(){
        return countBlack;
    }
    public static int getWhiteCounter(){
        return countWhite;
    }
    public static void resetCounter(){
        countWhite = 0;
        countBlack = 0;
    }
    public boolean isWhite(){
        if (color == Colors.WHITE){
            return true;
        }
        else return false;
    }
    public boolean isBlack(){
        if (color == Colors.BLACK){
            return true;
        }
        else return false;
    }

}