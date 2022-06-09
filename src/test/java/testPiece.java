import chess.pieces.Piece;
import org.junit.Test;

import static org.junit.Assert.*;

public class testPiece {
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
    }
}
