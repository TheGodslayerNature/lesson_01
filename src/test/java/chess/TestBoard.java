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
//    @Test
//    public void testNumberOfPiecesByRepresentation(){
//        board.initialize();
//        assertEquals(2, board.pieceCount('r'));
//        assertEquals(2, board.pieceCount('n'));
//        assertEquals(2 ,board.pieceCount('b'));
//        assertEquals(1, board.pieceCount('q'));
//        assertEquals(1, board.pieceCount('k'));
//
//        assertEquals(8, board.pieceCount('p'));
//
//        assertEquals(8, board.pieceCount('P'));
//
//        assertEquals(2, board.pieceCount('R'));
//        assertEquals(2, board.pieceCount('N'));
//        assertEquals(2, board.pieceCount('B'));
//        assertEquals(1, board.pieceCount('Q'));
//        assertEquals(1, board.pieceCount('K'));
//        Piece.resetCounter();
//    }
//    @Test
//    public void testRetrievePieceByLocation(){
//        board.initialize();
//        System.out.println();
//        assertEquals('R', board.getPiece("a8").getRepresentation());
//        assertEquals('N', board.getPiece("b8").getRepresentation());
//        assertEquals('B', board.getPiece("c8").getRepresentation());
//        assertEquals('n', board.getPiece("b1").getRepresentation());
//
//    }
//    @Test
//    public void testEmptyBoard(){
//        board.initialize();
//        board.emptyBoard();
//        assertEquals(
//                StringUtil.appendNewLine("........") +
//                        StringUtil.appendNewLine("........") +
//                        StringUtil.appendNewLine("........") +
//                        StringUtil.appendNewLine("........") +
//                        StringUtil.appendNewLine("........") +
//                        StringUtil.appendNewLine("........") +
//                        StringUtil.appendNewLine("........") +
//                        StringUtil.appendNewLine("........"),
//                board.printBoardWithoutPieces());
//    }
//    @Test
//    public void testPieceByLocation(){
//        board.initialize();
//        board.emptyBoard();
//        board.placePiece("b6",Piece.createBlackKing());
//        assertEquals('K', board.getPiece("b6").getRepresentation());
//        board.placePiece("b7",Piece.createBlackKing());
//        assertEquals('K', board.getPiece("b7").getRepresentation());
//    }
//    @Test
//    public void testPieceStrength(){
//        board.initialize();
//        board.emptyBoard();
//
//        board.placePiece("b8",Piece.createBlackKing());
//        assertEquals('K', board.getPiece("b8").getRepresentation());
//
//        board.placePiece("c8",Piece.createBlackRook());
//        assertEquals('R', board.getPiece("c8").getRepresentation());
//        assertEquals(5, board.getRookStrength());
//
//        board.placePiece("a7", Piece.createBlackPawn());
//        assertEquals('P', board.getPiece("a7").getRepresentation());
//        assertEquals(0.5, board.getPawnStrength(), 0.05);
//
//        board.placePiece("c7", Piece.createBlackPawn());
//        assertEquals('P', board.getPiece("a7").getRepresentation());
//        assertEquals(0.5, board.getPawnStrength(), 0.05);
//
//        board.placePiece("d7", Piece.createBlackBishop());
//        assertEquals('B', board.getPiece("d7").getRepresentation());
//        assertEquals(2.5, board.getBishopStrength(), 2.05);
//
//    }
}
