package chess.pieces;

import chess.Board;
import chess.pieces.Piece;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestPiece {
    @Test
    public void pieceTest(){
        Piece pawn = Piece.createWhitePawn();
        assertEquals('p', pawn.getRepresentation());
        assertTrue("white", pawn.isWhite());

        Piece blackPawn = Piece.createBlackPawn();
        assertEquals('P',blackPawn.getRepresentation());
        assertTrue("black", blackPawn.isBlack());

        Piece rook = Piece.createWhiteRook();
        assertEquals('r', rook.getRepresentation());

        Piece bishop = Piece.createBlackBishop();
        assertEquals('B', bishop.getRepresentation());
        Piece bishop2 = Piece.createBlackBishop();

    }

    @Test
    public void testCreate() {
        verifyCreation(
                Piece.createWhitePawn(), Piece.createBlackPawn(),
                Piece.Pieces.PAWN, Piece.PAWN_REPRESENTATION);
        verifyCreation(
                Piece.createWhiteRook(), Piece.createBlackRook(),
                Piece.Pieces.ROOK, Piece.ROOK_REPRESENTATION);
        verifyCreation(
                Piece.createWhiteKnight(), Piece.createBlackKnight(),
                Piece.Pieces.KNIGHT, Piece.KNIGHT_REPRESENTATION);
        verifyCreation(
                Piece.createWhiteBishop(), Piece.createBlackBishop(),
                Piece.Pieces.BISHOP, Piece.BISHOP_REPRESENTATION);
        verifyCreation(Piece.createWhiteQueen(), Piece.createBlackQueen(),
                Piece.Pieces.QUEEN, Piece.QUEEN_REPRESENTATION);
        verifyCreation(Piece.createWhiteKing(), Piece.createBlackKing(),
                Piece.Pieces.KING, Piece.KING_REPRESENTATION);
        Piece blank = Piece.noPiece();
        assertEquals('.', blank.getRepresentation());
        assertEquals(Piece.Pieces.NO_PIECE, blank.getType());
    }
    private void verifyCreation(Piece whitePiece, Piece blackPiece,
                                Piece.Pieces type, char representation) {
        assertTrue(whitePiece.isWhite());
        assertFalse(whitePiece.isBlack());
        assertEquals(type, whitePiece.getType());
        assertEquals(representation, whitePiece.getRepresentation());
        assertTrue(blackPiece.isBlack());
        assertFalse(blackPiece.isWhite());
        assertEquals(type, blackPiece.getType());
        assertEquals(Character.toUpperCase(representation),
                blackPiece.getRepresentation());
    }
}


