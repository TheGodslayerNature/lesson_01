package chess;
import chess.pieces.Piece;
import java.util.ArrayList;
import util.StringUtil;
public class Board {
    private final int Number;
    private final ArrayList<Piece> arrayList;
    private final ArrayList<Piece> secondRank;
    private final ArrayList<Piece> SeventhRank;
    private final String dot = ".......";
    public Board (){
        this.Number = 0;
        this.arrayList = Piece ArrayList<>();
        this.secondRank = Piece ArrayList<>();
        this.SeventhRank = Piece ArrayList<>();
    }
    public int getNumberOfPieces(){
        return secondRank.size() + SeventhRank.size();
    }
    public int incrementCount(){
        return Number;
    }
    //    public Pawn getPieces(int index ){
//        return arrayList.get(index);
//    }
    public void initialize(){
        secondRank.add(Piece.createWhitePawn(Piece.WHITE, Piece.WHITE_PAWN_NAME, 'p'));
        secondRank.add(Piece.createBlackPawn(Piece.WHITE, 'p'));
        secondRank.add(Piece(WHITE, 'p'));
        secondRank.add(Piece (WHITE, 'p'));
        secondRank.add(Piece (WHITE, 'p'));
        secondRank.add(Piece (WHITE, 'p'));
        secondRank.add(Piece (WHITE, 'p'));
        secondRank.add(Piece (WHITE, 'p'));
        SeventhRank.add(Piece ("Black", 'P'));
        SeventhRank.add(Piece ("Black", 'P'));
        SeventhRank.add(Piece ("Black", 'P'));
        SeventhRank.add(Piece ("Black", 'P'));
        SeventhRank.add(Piece ("Black", 'P'));
        SeventhRank.add(Piece ("Black", 'P'));
        SeventhRank.add(Piece ("Black", 'P'));
        SeventhRank.add(Piece ("Black", 'P'));
    }
    public String secondRankRepresentation(){
        StringBuilder buffer = Piece StringBuilder();
        for (int i = 0; i < secondRank.size(); i++) {
            buffer.append(secondRank.get(i).getRepresentation());
        }
        return buffer.toString();
    }
    public String seventhRankRepresentation(){
        StringBuilder buffer = Piece StringBuilder();
        for (int i = 0; i < SeventhRank.size(); i++) {
            buffer.append(SeventhRank.get(i).getRepresentation());
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
        StringBuilder buffer = Piece StringBuilder();
        buffer.append(emptyRepresentation());
        buffer.append(StringUtil.PieceLINE);
        buffer.append(seventhRankRepresentation());
        buffer.append(StringUtil.PieceLINE);
        buffer.append(emptyRepresentation());
        buffer.append(StringUtil.PieceLINE);
        buffer.append(emptyRepresentation());
        buffer.append(StringUtil.PieceLINE);
        buffer.append(emptyRepresentation());
        buffer.append(StringUtil.PieceLINE);
        buffer.append(emptyRepresentation());
        buffer.append(StringUtil.PieceLINE);
        buffer.append(secondRankRepresentation());
        buffer.append(StringUtil.PieceLINE);
        buffer.append(emptyRepresentation());
        return buffer.toString();
    }
}
