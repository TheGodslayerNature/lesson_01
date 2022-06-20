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
    public String thirdRankRepresentation(){
        StringBuilder buffer = new StringBuilder();
        for (int i = 0; i < thirdRank.size(); i++) {
            buffer.append(thirdRank.get(i).getRepresentation());
        }
        return buffer.toString();
    }
    public String fourthRankRepresentation(){
        StringBuilder buffer = new StringBuilder();
        for (int i = 0; i < fourthRank.size(); i++) {
            buffer.append(fourthRank.get(i).getRepresentation());
        }
        return buffer.toString();
    }
    public String fiveRankRepresentation(){
        StringBuilder buffer = new StringBuilder();
        for (int i = 0; i < fiveRank.size(); i++) {
            buffer.append(fiveRank.get(i).getRepresentation());
        }
        return buffer.toString();
    }
    public String sixRankRepresentation(){
        StringBuilder buffer = new StringBuilder();
        for (int i = 0; i < sixRank.size(); i++) {
            buffer.append(sixRank.get(i).getRepresentation());
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
    public String printBoardWithoutPieces(){
        StringBuilder buffer = new StringBuilder();
        buffer.append(StringUtil.appendNewLine(rank8Representation()));
        buffer.append(StringUtil.appendNewLine(seventhRankRepresentation()));
        buffer.append(StringUtil.appendNewLine(sixRankRepresentation()));
        buffer.append(StringUtil.appendNewLine(fiveRankRepresentation()));
        buffer.append(StringUtil.appendNewLine(fourthRankRepresentation()));
        buffer.append(StringUtil.appendNewLine(thirdRankRepresentation()));
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
        char rank = position.charAt(1);

        file -= 'a';

        if (rank == '1'){
            return firstRank.get(file);
        }
        else if (rank == '2'){
            return secondRank.get(file);
        }
        else if (rank == '3'){
            return thirdRank.get(file);
        }
        else if (rank == '4'){
            return fourthRank.get(file);
        }
        else if (rank == '5') {
            return fiveRank.get(file);
        }
        else if (rank == '6'){
            return sixRank.get(file);
        }
        else if (rank == '7'){
            return seventhRank.get(file);
        }
        else
            return eightRank.get(file);
    }

    public void placePiece(){

    }

    public void checkBoard(){
        firstRank.set(0, Piece.noPiece());
        firstRank.set(1, Piece.noPiece());
        firstRank.set(2, Piece.noPiece());
        firstRank.set(3, Piece.noPiece());
        firstRank.set(4, Piece.noPiece());
        firstRank.set(5, Piece.noPiece());
        firstRank.set(6, Piece.noPiece());
        firstRank.set(7, Piece.noPiece());

        secondRank.set(0, Piece.noPiece());
        secondRank.set(1, Piece.noPiece());
        secondRank.set(2, Piece.noPiece());
        secondRank.set(3, Piece.noPiece());
        secondRank.set(4, Piece.noPiece());
        secondRank.set(5, Piece.noPiece());
        secondRank.set(6, Piece.noPiece());
        secondRank.set(7, Piece.noPiece());

        thirdRank.set(0, Piece.noPiece());
        thirdRank.set(1, Piece.noPiece());
        thirdRank.set(2, Piece.noPiece());
        thirdRank.set(3, Piece.noPiece());
        thirdRank.set(4, Piece.noPiece());
        thirdRank.set(5, Piece.noPiece());
        thirdRank.set(6, Piece.noPiece());
        thirdRank.set(7, Piece.noPiece());

        fourthRank.set(0, Piece.noPiece());
        fourthRank.set(1, Piece.noPiece());
        fourthRank.set(2, Piece.createWhiteKing());
        fourthRank.set(3, Piece.noPiece());
        fourthRank.set(4, Piece.noPiece());
        fourthRank.set(5, Piece.noPiece());
        fourthRank.set(6, Piece.noPiece());
        fourthRank.set(7, Piece.noPiece());

        fiveRank.set(0, Piece.noPiece());
        fiveRank.set(1, Piece.createWhiteRook());
        fiveRank.set(2, Piece.noPiece());
        fiveRank.set(3, Piece.noPiece());
        fiveRank.set(4, Piece.noPiece());
        fiveRank.set(5, Piece.noPiece());
        fiveRank.set(6, Piece.noPiece());
        fiveRank.set(7, Piece.noPiece());

        sixRank.set(0, Piece.noPiece());
        sixRank.set(1, Piece.createBlackKing());
        sixRank.set(2, Piece.noPiece());
        sixRank.set(3, Piece.noPiece());
        sixRank.set(4, Piece.noPiece());
        sixRank.set(5, Piece.noPiece());
        sixRank.set(6, Piece.noPiece());
        sixRank.set(7, Piece.noPiece());

        seventhRank.set(0, Piece.noPiece());
        seventhRank.set(1, Piece.noPiece());
        seventhRank.set(2, Piece.noPiece());
        seventhRank.set(3, Piece.noPiece());
        seventhRank.set(4, Piece.noPiece());
        seventhRank.set(5, Piece.noPiece());
        seventhRank.set(6, Piece.noPiece());
        seventhRank.set(7, Piece.noPiece());

        eightRank.set(0, Piece.noPiece());
        eightRank.set(1, Piece.noPiece());
        eightRank.set(2, Piece.noPiece());
        eightRank.set(3, Piece.noPiece());
        eightRank.set(4, Piece.noPiece());
        eightRank.set(5, Piece.noPiece());
        eightRank.set(6, Piece.noPiece());
        eightRank.set(7, Piece.noPiece());
    }

//    public int PieceStrength(int strength){
//
//    }
}
