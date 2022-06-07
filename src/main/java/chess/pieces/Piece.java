package chess.pieces;

import java.security.PublicKey;

public class Piece {
    private final String color;
    private final String name;
    public static String WHITE = "white";
    public static String BLACK = "black";
    public static String WHITE_PAWN_NAME = "White_Pawn";
    public static String BLACK_PAWN_NAME = "Black_Pawn";
    public static String WHITE_ROOK_NAME = "White_Rook";
    public static String BLACK_ROOK_NAME = "Black_Rook";
    public static String WHITE_KNIGHT_NAME = "White_Knight";
    public static String BLACK_KNIGHT_NAME = "Black_Knight";
    public static String WHITE_BISHOP_NAME = "White_Bishop";
    public static String BLACK_BISHOP_NAME = "Black_Bishop";
    public static String WHITE_QUEEN_NAME = "White_Queen";
    public static String BLACK_QUEEN_NAME = "Black_Queen";
    public static String WHITE_KING_NAME = "White_King";
    public static String BLACK_KING_NAME = "Black_King";
    private final char representation;
    private Piece(String color,String name, char representation) {
        this.color = color;
        this.name = name;
        this.representation = representation;
    }
    public static Piece createWhitePawn(){
        return new Piece(WHITE, "White_Pawn", 'p');
    }
    public static Piece createBlackPawn(){
        return new Piece(BLACK, "Black_Pawn", 'P');
    }
    public static Piece createWhiteRook(){
        return new Piece(WHITE, "White_Rook", 'r');
    }
    public static Piece createBlackRook(){
        return new Piece(BLACK, "Black_Rook", 'R');
    }
    public static Piece createWhiteKnight(){
        return new Piece(WHITE, "White_Knight", 'n');
    }
    public static Piece createBlackKnight(){
        return new Piece(BLACK, "Black_Knight", 'N');
    }
    public static Piece createWhiteBishop(){
        return new Piece(WHITE, "White_Bishop", 'b');
    }
    public static Piece createBlackBishop(){
        return new Piece(BLACK, "Black_Bishop", 'B');
    }
    public static Piece createWhiteQueen(){
        return new Piece(WHITE, "White_Queen", 'q');
    }
    public static Piece createBlackQueen(){
        return new Piece(BLACK, "Black_Queen", 'Q');
    }
    public static Piece createWhiteKing(){
        return new Piece(WHITE, "White_King", 'k');
    }
    public static Piece createBlackKing(){
        return new Piece(BLACK, "Black_King", 'K');
    }
    public char getRepresentation() {
        return representation;
    }
}