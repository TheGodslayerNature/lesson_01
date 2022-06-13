package chess;
import chess.pieces.Piece;
import java.util.ArrayList;
import util.StringUtil;
public class Board {
    private final ArrayList<Piece> secondRank;
    private final ArrayList<Piece> seventhRank;
    private final ArrayList<Piece> firstRank;
    private final ArrayList<Piece> eightRank;
    private final String dot = "........";
    public Board (){
        this.secondRank = new  ArrayList<>();
        this.seventhRank = new ArrayList<>();
        this.firstRank = new ArrayList<>();
        this.eightRank = new ArrayList<>();
    }
    public int getNumberOfAllPieces(){
        return secondRank.size() + seventhRank.size() + eightRank.size() + firstRank.size();
    }
    public void initialize(){
        firstRank.add(Piece.createWhiteRook());
        firstRank.add(Piece.createWhiteKnight());
        firstRank.add(Piece.createWhiteBishop());
        firstRank.add(Piece.createWhiteQueen());
        firstRank.add(Piece.createWhiteKing());
        firstRank.add(Piece.createWhiteBishop());
        firstRank.add(Piece.createWhiteKnight());
        firstRank.add(Piece.createWhiteRook());

        secondRank.add(Piece.createWhitePawn());
        secondRank.add(Piece.createWhitePawn());
        secondRank.add(Piece.createWhitePawn());
        secondRank.add(Piece.createWhitePawn());
        secondRank.add(Piece.createWhitePawn());
        secondRank.add(Piece.createWhitePawn());
        secondRank.add(Piece.createWhitePawn());
        secondRank.add(Piece.createWhitePawn());

        seventhRank.add(Piece.createBlackPawn());
        seventhRank.add(Piece.createBlackPawn());
        seventhRank.add(Piece.createBlackPawn());
        seventhRank.add(Piece.createBlackPawn());
        seventhRank.add(Piece.createBlackPawn());
        seventhRank.add(Piece.createBlackPawn());
        seventhRank.add(Piece.createBlackPawn());
        seventhRank.add(Piece.createBlackPawn());

        eightRank.add(Piece.createBlackRook());
        eightRank.add(Piece.createBlackKnight());
        eightRank.add(Piece.createBlackBishop());
        eightRank.add(Piece.createBlackQueen());
        eightRank.add(Piece.createBlackKing());
        eightRank.add(Piece.createBlackBishop());
        eightRank.add(Piece.createBlackKnight());
        eightRank.add(Piece.createBlackRook());
    }
    public String firstRankRepresentation(){
        StringBuilder buffer = new StringBuilder();
        for (int i = 0; i < firstRank.size(); i++) {
            buffer.append(firstRank.get(i).getRepresentation());
        }
        return buffer.toString();
    }
    public String secondRankRepresentation(){
        StringBuilder buffer = new StringBuilder();
        for (int i = 0; i < secondRank.size(); i++) {
            buffer.append(secondRank.get(i).getRepresentation());
        }
        return buffer.toString();
    }
    public String seventhRankRepresentation(){
        StringBuilder buffer = new StringBuilder();
        for (int i = 0; i < seventhRank.size(); i++) {
            buffer.append(seventhRank.get(i).getRepresentation());
        }
        return buffer.toString();
    }
    public String rank8Representation(){
        StringBuilder buffer = new StringBuilder();
        for (int i = 0; i < eightRank.size() ; i++) {
            buffer.append(eightRank.get(i).getRepresentation());
        }
        return buffer.toString();
    }
    public String emptyRepresentation(){
        return dot;
    }
    public String anotherPrintBoardSolution(){
        StringBuilder buffer = new StringBuilder();
        buffer.append(StringUtil.appendNewLine(rank8Representation()));
        buffer.append(StringUtil.appendNewLine(seventhRankRepresentation()));
        buffer.append(StringUtil.appendNewLine(emptyRepresentation()));
        buffer.append(StringUtil.appendNewLine(emptyRepresentation()));
        buffer.append(StringUtil.appendNewLine(emptyRepresentation()));
        buffer.append(StringUtil.appendNewLine(emptyRepresentation()));
        buffer.append(StringUtil.appendNewLine(secondRankRepresentation()));
        buffer.append(StringUtil.appendNewLine(firstRankRepresentation()));
        return buffer.toString();
    }

//    public int getNumberOfPiecesByColorAndType(){
//
//    }
}
