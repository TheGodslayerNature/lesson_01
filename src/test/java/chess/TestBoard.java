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
                board.anotherPrintBoardSolution());
        System.out.println(board.anotherPrintBoardSolution());
        System.out.println();

        Piece.resetCounter();
    }
    @Test
    public void testNumberOfPiecesByRepresentation(){
        board.initialize();
        assertEquals(2, board.pieceCount('r'));
        assertEquals(2, board.pieceCount('n'));
        assertEquals(2 , board.pieceCount('b'));
        assertEquals(1, board.pieceCount('q'));
        assertEquals(1, board.pieceCount('k'));

        assertEquals(8, board.pieceCount('p'));

        assertEquals(8, board.pieceCount('P'));

        assertEquals(2, board.pieceCount('R'));
        assertEquals(2, board.pieceCount('N'));
        assertEquals(2, board.pieceCount('B'));
        assertEquals(1, board.pieceCount('Q'));
        assertEquals(1, board.pieceCount('K'));
        Piece.resetCounter();
    }
    @Test
    public void testRetrievePieceByLocation(){
        board.initialize();
        System.out.println();
        assertEquals('R', board.getPiece("a8").getRepresentation());
        assertEquals('N', board.getPiece("b8").getRepresentation());
        assertEquals('B', board.getPiece("c8").getRepresentation());
        assertEquals('n', board.getPiece("b1").getRepresentation());
//        assertEquals('c', board.testPositionPiece("c"));
//        System.out.println(board.testPositionPiece("a"));
    }
    @Test
    public void testEmptyBoard(){
        board.initialize();
        board.checkBoard();
        assertEquals(
                StringUtil.appendNewLine("........") +
                        StringUtil.appendNewLine("........") +
                        StringUtil.appendNewLine(".K......") +
                        StringUtil.appendNewLine(".r......") +
                        StringUtil.appendNewLine("..k.....") +
                        StringUtil.appendNewLine("........") +
                        StringUtil.appendNewLine("........") +
                        StringUtil.appendNewLine("........"),
                board.printBoardWithoutPieces());
    }
}
