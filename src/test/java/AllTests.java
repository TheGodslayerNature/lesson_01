import chess.TestBoard;
import chess.pieces.TestPiece;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({TestPiece.class, TestBoard.class,TestCharacter.class})
public class AllTests {
}
