import chess.Board;
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
        board.initialize();
        assertEquals(32, board.getNumberOfPieces());
        String blankRank = StringUtil.appendNewLine("........");
        assertEquals(
                StringUtil.appendNewLine("RNBQKBNR") +
                        StringUtil.appendNewLine("PPPPPPPP") +
                        blankRank + blankRank + blankRank + blankRank +
                        StringUtil.appendNewLine("pppppppp") +
                        StringUtil.appendNewLine("rnbqkbnr"),
                board.anotherPrintBoardSolution());
        System.out.println(board.anotherPrintBoardSolution());
    }
    //    @Test
//    public void testCreateInitialBoard(){
//        board.initialize();
//        assertEquals("......." + Board.NEWLINE +
//                "PPPPPPPP"+ Board.NEWLINE +
//                "......." + Board.NEWLINE +
//                "......." + Board.NEWLINE +
//                "......." + Board.NEWLINE +
//                "......." + Board.NEWLINE +
//                "pppppppp"+ Board.NEWLINE +
//                "......." , board.printBoard());
//        System.out.println(board.printBoard());
//    }
    @Test
    public void testCreateBoard(){
        assertEquals(0,board.getNumberOfPieces());
//        board.initialize();
//        assertEquals("pppppppp", board.secondRankRepresentation());
//        assertEquals(".......", board.emptyRepresentation());
//        assertEquals("PPPPPPPP", board.seventhRankRepresentation());
    }

//    @Test
//    public void testCountPieces() {
//        board.incrementCount();
//        assertEquals(0,board.getNumberOfPieces());
//    }
}
