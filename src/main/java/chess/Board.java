package chess;
import chess.pieces.Piece;
import java.util.ArrayList;
import util.StringUtil;
public class Board {
    private final ArrayList<Piece> firstRank;
    private final ArrayList<Piece> secondRank;
    private final ArrayList<Piece> thirdRank;
    private final ArrayList<Piece> fourthRank;
    private final ArrayList<Piece> fiveRank;
    private final ArrayList<Piece> sixRank;
    private final ArrayList<Piece> seventhRank;
    private final ArrayList<Piece> eightRank;
    private final String dot = "........";

    public Board (){
        this.firstRank = new ArrayList<>();
        this.secondRank = new  ArrayList<>();
        this.thirdRank = new ArrayList<>();
        this.fourthRank = new ArrayList<>();
        this.fiveRank = new ArrayList<>();
        this.sixRank = new ArrayList<>();
        this.seventhRank = new ArrayList<>();
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

        thirdRank.add(Piece.noPiece());
        thirdRank.add(Piece.noPiece());
        thirdRank.add(Piece.noPiece());
        thirdRank.add(Piece.noPiece());
        thirdRank.add(Piece.noPiece());
        thirdRank.add(Piece.noPiece());
        thirdRank.add(Piece.noPiece());
        thirdRank.add(Piece.noPiece());

        fourthRank.add(Piece.noPiece());
        fourthRank.add(Piece.noPiece());
        fourthRank.add(Piece.noPiece());
        fourthRank.add(Piece.noPiece());
        fourthRank.add(Piece.noPiece());
        fourthRank.add(Piece.noPiece());
        fourthRank.add(Piece.noPiece());
        fourthRank.add(Piece.noPiece());

        fiveRank.add(Piece.noPiece());
        fiveRank.add(Piece.noPiece());
        fiveRank.add(Piece.noPiece());
        fiveRank.add(Piece.noPiece());
        fiveRank.add(Piece.noPiece());
        fiveRank.add(Piece.noPiece());
        fiveRank.add(Piece.noPiece());
        fiveRank.add(Piece.noPiece());

        sixRank.add(Piece.noPiece());
        sixRank.add(Piece.noPiece());
        sixRank.add(Piece.noPiece());
        sixRank.add(Piece.noPiece());
        sixRank.add(Piece.noPiece());
        sixRank.add(Piece.noPiece());
        sixRank.add(Piece.noPiece());
        sixRank.add(Piece.noPiece());

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

    public int pieceCount(char representation) {
        int count = 0;
        for (Piece knight: firstRank){
            if (knight.getRepresentation() == representation){
                count++;
            }
        }
        for (Piece piece: secondRank){
            if (piece.getRepresentation() == representation){
                count++;
            }
        }
        for (Piece piece: thirdRank){
            if (piece.getRepresentation() == representation){
                count++;
            }
        }
        for (Piece piece: fourthRank){
            if (piece.getRepresentation() == representation){
                count++;
            }
        }
        for (Piece piece: fiveRank){
            if (piece.getRepresentation() == representation){
                count++;
            }
        }
        for (Piece piece: sixRank){
            if (piece.getRepresentation() == representation){
                count++;
            }
        }
        for (Piece piece: seventhRank){
            if (piece.getRepresentation() == representation){
                count++;
            }
        }
        for (Piece piece: eightRank){
            if (piece.getRepresentation() == representation){
                count++;
            }
        }
        return count;
    }
    public Piece getPiece(String position){
        char file = position.charAt(0);
        char numeric = position.charAt(1);

        int charRepresentation = 'a';
        if (charRepresentation <= 'h'){
            charRepresentation++;
        }

        int numericRepresentation = 1;
        if (numericRepresentation <= 8){
            numericRepresentation++;
        }

        int sum = charRepresentation + numericRepresentation;
        

        return null;
    }
//    public String getPiece(String position) {
//        String files = "abcdefgh";
//        if (eightRank.get(8) = files.charAt(0)){
//            position = "a8";
//        } return position;
//    }
//    public String getNumericColum(){
//        String numeric = "12345678";
//        return numeric;
//    }
//    public String getLine(){
//        String line = "abcdefgh";
//        return line;
//    }
////    public char testPositionPiece(String position) {
//        position = "abcdefgh";
//        return position.charAt(2);
//    }
//    public void placePiece(){
//
//    }
}
