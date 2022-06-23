package chess;

import chess.Board;
import chess.pieces.Piece;
import org.junit.Before;
import org.junit.Test;
import util.StringUtil;

import static org.junit.Assert.assertEquals;
public class TestBoard {
    private Board board;
    @Before
    public void setUp() {
        board = new Board();
    }
    @Test
    public void testCreate() {
        Piece.resetCounter();
        board.initialize();
        assertEquals(32, board.getNumberOfAllPieces());
        String blankRank = StringUtil.appendNewLine("........");
        assertEquals(
                StringUtil.appendNewLine("RNBQKBNR") +
                        StringUtil.appendNewLine("PPPPPPPP") +
                        blankRank + blankRank + blankRank + blankRank +
                        StringUtil.appendNewLine("pppppppp") +
                        StringUtil.appendNewLine("rnbqkbnr"),
                board.printBoard());
        System.out.println(board.printBoard());
        System.out.println();

        Piece.resetCounter();
    }
    @Test
    public void testNumberOfPiecesByRepresentation(){
        board.initialize();
        assertEquals(2, board.pieceCountTurboVersion('r'));
        assertEquals(2, board.pieceCountTurboVersion('n'));
        assertEquals(2 ,board.pieceCountTurboVersion(('b')));
        assertEquals(1, board.pieceCountTurboVersion(('q')));
        assertEquals(1, board.pieceCountTurboVersion(('k')));

        assertEquals(8, board.pieceCountTurboVersion(('p')));

        assertEquals(8, board.pieceCountTurboVersion(('P')));

        assertEquals(2, board.pieceCountTurboVersion(('R')));
        assertEquals(2, board.pieceCountTurboVersion(('N')));
        assertEquals(2, board.pieceCountTurboVersion(('B')));
        assertEquals(1, board.pieceCountTurboVersion(('Q')));
        assertEquals(1, board.pieceCountTurboVersion(('K')));
        Piece.resetCounter();
    }
    @Test
    public void testRetrievePieceByLocation(){
        board.initialize();
        assertEquals('R', board.getPiece("a8").getRepresentation());
        assertEquals('N', board.getPiece("b8").getRepresentation());
        assertEquals('B', board.getPiece("c8").getRepresentation());
        assertEquals('n', board.getPiece("b1").getRepresentation());

    }
    @Test
    public void testEmptyBoard(){
        assertEquals(
                StringUtil.appendNewLine("........") +
                        StringUtil.appendNewLine("........") +
                        StringUtil.appendNewLine("........") +
                        StringUtil.appendNewLine("........") +
                        StringUtil.appendNewLine("........") +
                        StringUtil.appendNewLine("........") +
                        StringUtil.appendNewLine("........") +
                        StringUtil.appendNewLine("........"),
                board.printBoard());
    }
    @Test
    public void testPieceByLocation(){
        board.initialize();
        board.placePieceRemastered("b6",Piece.createBlackKing());
        assertEquals('K', board.getPiece("b6").getRepresentation());
        board.placePieceRemastered("b7",Piece.createBlackKing());
        assertEquals('K', board.getPiece("b7").getRepresentation());
    }
    @Test
    public void testPieceStrength(){
        board.initialize();

        board.placePieceRemastered("c8",Piece.createBlackRook());
        assertEquals('R', board.getPiece("c8").getRepresentation());
        assertEquals(5, board.basicStrength(), 0.05);

    }
}
