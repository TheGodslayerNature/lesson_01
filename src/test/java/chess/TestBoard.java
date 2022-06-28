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
    public void testBlackPieceStrength(){
        board.initialize();
        board.cleanBoard();
        board.placePieceRemastered("b8",Piece.createBlackRook());
        assertEquals('R', board.getPiece("b8").getRepresentation());
        assertEquals(5, board.rookStrength(), 0.05);

        board.placePieceRemastered("e6", Piece.createBlackQueen());
        assertEquals('Q', board.getPiece("e6").getRepresentation());
        assertEquals(9, board.queenStrength(), 0.90);

        board.placePieceRemastered("a7", Piece.createBlackPawn());
        assertEquals('P', board.getPiece("a7").getRepresentation());
        assertEquals(1, board.pawnStrength(), 0.05);

        board.placePieceRemastered("b6", Piece.createBlackPawn());
        assertEquals('P', board.getPiece("b6").getRepresentation());
        assertEquals(1, board.pawnStrength(), 0.05);

        board.placePieceRemastered("c7", Piece.createBlackPawn());
        assertEquals('P', board.getPiece("c7").getRepresentation());
        assertEquals(1, board.pawnStrength(), 0.05);

        board.placePieceRemastered("d7", Piece.createBlackBishop());
        assertEquals('B', board.getPiece("d7").getRepresentation());
        assertEquals(3, board.bishopStrength(), 0.30);

        board.countBlackStrength();
        System.out.println(board.countBlackStrength());
    }
    @Test
    public void testWhitePieceStrength(){
        board.initialize();
        board.cleanBoard();
        board.placePieceRemastered("f4", Piece.createWhiteKnight());
        assertEquals('n', board.getPiece("f4").getRepresentation());
        assertEquals(2.5, board.knightStrength(), 0.25);

        board.placePieceRemastered("g4", Piece.createWhiteQueen());
        assertEquals('q', board.getPiece("g4").getRepresentation());
        assertEquals(9, board.queenStrength(), 0.90);

        board.placePieceRemastered("f3", Piece.createWhitePawn());
        assertEquals('p', board.getPiece("f3").getRepresentation());
        assertEquals(1, board.pawnStrength(), 0.05);

        board.placePieceRemastered("h3", Piece.createWhitePawn());
        assertEquals('p', board.getPiece("h3").getRepresentation());
        assertEquals(1, board.pawnStrength(), 0.05);

        board.placePieceRemastered("f2", Piece.createWhitePawn());
        assertEquals('p', board.getPiece("f2").getRepresentation());
        assertEquals(1, board.pawnStrength(), 0.05);

        board.placePieceRemastered("g2", Piece.createWhitePawn());
        assertEquals('p', board.getPiece("g2").getRepresentation());
        assertEquals(1, board.pawnStrength(), 0.05);

        board.placePieceRemastered("e1", Piece.createWhiteRook());
        assertEquals('r', board.getPiece("e1").getRepresentation());
        assertEquals(5, board.rookStrength(), 0.5);


        board.countWhiteStrength();
        System.out.println(board.countWhiteStrength());
        System.out.println(board.printBoard());
    }
    @Test
    public void testFileStrength(){

        board.placePieceRemastered("f3", Piece.createWhitePawn());
        assertEquals('p', board.getPiece("f3").getRepresentation());

        board.placePieceRemastered("f2", Piece.createWhitePawn());
        assertEquals('p', board.getPiece("f2").getRepresentation());

        board.placePieceRemastered("g2", Piece.createWhitePawn());
        assertEquals('p', board.getPiece("g2").getRepresentation());
        assertEquals(2, board.countWhiteStrength(), 0.05);

        board.countWhiteStrength();
        System.out.println(board.countWhiteStrength());
    }
}
