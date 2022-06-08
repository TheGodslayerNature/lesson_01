package chess;
import chess.pieces.Piece;
import java.util.ArrayList;
import util.StringUtil;
public class Board {
    private final int Number;
    private final ArrayList<Piece> arrayList;
    private final ArrayList<Piece> secondRank;
    private final ArrayList<Piece> SeventhRank;
    private final ArrayList<Piece> firstRank;
    private final ArrayList<Piece> rank8;
    private final String dot = "........";
    public Board (){
        this.Number = 0;
        this.arrayList = new  ArrayList<>();
        this.secondRank = new  ArrayList<>();
        this.SeventhRank = new   ArrayList<>();
        this.firstRank = new ArrayList<>();
        this.rank8 = new ArrayList<>();
    }
    public int getNumberOfPieces(){
        return secondRank.size() + SeventhRank.size() + rank8.size() + firstRank.size();
    }
//    public int incrementCount(){
//        return Number;
//    }
    //    public Pawn getPieces(int index ){
//        return arrayList.get(index);
//    }
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

        SeventhRank.add(Piece.createBlackPawn());
        SeventhRank.add(Piece.createBlackPawn());
        SeventhRank.add(Piece.createBlackPawn());
        SeventhRank.add(Piece.createBlackPawn());
        SeventhRank.add(Piece.createBlackPawn());
        SeventhRank.add(Piece.createBlackPawn());
        SeventhRank.add(Piece.createBlackPawn());
        SeventhRank.add(Piece.createBlackPawn());

        rank8.add(Piece.createBlackRook());
        rank8.add(Piece.createBlackKnight());
        rank8.add(Piece.createBlackBishop());
        rank8.add(Piece.createBlackQueen());
        rank8.add(Piece.createBlackKing());
        rank8.add(Piece.createBlackBishop());
        rank8.add(Piece.createBlackKnight());
        rank8.add(Piece.createBlackRook());
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
        for (int i = 0; i < SeventhRank.size(); i++) {
            buffer.append(SeventhRank.get(i).getRepresentation());
        }
        return buffer.toString();
    }
    public String rank8Representation(){
        StringBuilder buffer = new StringBuilder();
        for (int i = 0; i < rank8.size() ; i++) {
            buffer.append(rank8.get(i).getRepresentation());
        }
        return buffer.toString();
    }
    public String emptyRepresentation(){
        return dot;
    }
//    public String printBoard(){
//        return
//                emptyRepresentation() + PieceLINE +
//                        seventhRankRepresentation() + PieceLINE +
//                        emptyRepresentation() + PieceLINE +
//                        emptyRepresentation() + PieceLINE +
//                        emptyRepresentation() + PieceLINE +
//                        emptyRepresentation() + PieceLINE +
//                        secondRankRepresentation() + PieceLINE +
//                        emptyRepresentation();
//    }
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
//    public int pieceCount(){
//
//    }
}
