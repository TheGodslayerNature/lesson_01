import chess.pieces.Piece;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

public class testPiece {
    @Before
    public void setUp(){
//        Pawn = new Piece("","",'');
//        Knight = new Piece("", "P",'');
//        Rook = new Piece("", "P",'');
//        Bishop = new Piece("", "P",'');
//        Queen = new Piece("", "", '');
//        King = new Piece("", "", '');
    }
    @Test
    public void pawnTest(){
        assertEquals("White", whitePawn.getColor());
        assertEquals('p', whitePawn.getRepresentation());

        assertEquals("Black", blackPawn.getColor());
        assertEquals('P', blackPawn.getRepresentation());
    }
}
