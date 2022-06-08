import chess.pieces.Piece;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class testPiece {
    @Test
    public void pieceTest(){
        Piece pawn = Piece.createWhitePawn();
        assertEquals('p', pawn.getRepresentation());

        Piece blackPawn = Piece.createBlackPawn();
        assertEquals('P',blackPawn.getRepresentation());

        Piece rook = Piece.createWhiteRook();
        assertEquals('r', rook.getRepresentation());
    }
}
