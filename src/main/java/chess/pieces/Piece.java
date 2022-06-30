package chess.pieces;

import java.util.Collections;

public class Piece implements Comparable<Piece>{
    @Override
    public int compareTo(Piece anotherPiece){
        if (strength == anotherPiece.getStrength()){
            return 0;
        } else if (strength > anotherPiece.getStrength()) {
            return 1;
        } else return -1;
    }
    public static final char PAWN_REPRESENTATION = 'p';
    public static final char ROOK_REPRESENTATION = 'r';
    public static final char KNIGHT_REPRESENTATION = 'n';
    public static final char BISHOP_REPRESENTATION = 'b';
    public static final char QUEEN_REPRESENTATION = 'q';
    public static final char KING_REPRESENTATION = 'k';
    public static final char NO_PIECE_REPRESENTATION = '.';
    public static final double NO_PIECE_STRENGTH = 0;
    private final char representation;
    private static int countWhite;
    private static int countBlack;
    public enum Pieces{PAWN, ROOK, KNIGHT, BISHOP, QUEEN, KING, NO_PIECE}
    private final Pieces name;
    private enum Colors {WHITE, BLACK, NO_COLOR}
    private final Colors color;
    private double strength = 0;
    private Piece(Colors color, Pieces name, char representation, double strength) {
        this.color = color;
        this.name = name;
        this.representation = representation;
        this.strength = strength;
    }
    public Pieces getName(){
        return name;
    }
    public static Piece noPiece(){
        return new Piece(Colors.NO_COLOR, Pieces.NO_PIECE, NO_PIECE_REPRESENTATION, NO_PIECE_STRENGTH);
    }
    public double getStrength(){
        return strength;
    }
    public Pieces getType(){
        return name;
    }
    public static Piece createWhitePawn(){
        return  Piece.createWhitePiece( Pieces.PAWN, 'p', 1);
    }
    public static Piece createBlackPawn(){
        return  Piece.createBlackPiece( Pieces.PAWN, 'p', 1);
    }
    public static Piece createWhiteRook(){
        return  Piece.createWhitePiece( Pieces.ROOK, 'r', 3);
    }
    public static Piece createBlackRook(){
        return  Piece.createBlackPiece( Pieces.ROOK, 'r', 3);
    }
    public static Piece createWhiteKnight(){
        return  Piece.createWhitePiece( Pieces.KNIGHT, 'n', 2.5);
    }
    public static Piece createBlackKnight(){
        return  Piece.createBlackPiece( Pieces.KNIGHT, 'n', 2.5);
    }
    public static Piece createWhiteBishop(){
        return  Piece.createWhitePiece( Pieces.BISHOP, 'b', 3);
    }
    public static Piece createBlackBishop(){
        return Piece.createBlackPiece( Pieces.BISHOP, 'b', 3);
    }
    public static Piece createWhiteQueen(){
        return  Piece.createWhitePiece( Pieces.QUEEN, 'q', 9);
    }
    public static Piece createBlackQueen(){
        return  Piece.createBlackPiece( Pieces.QUEEN, 'q', 9);
    }
    public static Piece createWhiteKing(){
        return  Piece.createWhitePiece( Pieces.KING, 'k', 0);
    }
    public static Piece createBlackKing(){
        return  Piece.createBlackPiece( Pieces.KING, 'K', 0);
    }
    public char getRepresentation() {
        if (color.equals(Colors.BLACK)) {
            return Character.toUpperCase(representation);
        }
        return representation;
    }
    private static Piece createWhitePiece(Pieces name, char representation, double strength){
        incrementWhitePiece();
        return new Piece(Colors.WHITE, name, representation, strength);
    }
    private static Piece createBlackPiece(Pieces name, char representation, double strength){
        incrementBlackPiece();
        return new Piece(Colors.BLACK, name, representation, strength);
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