package chess;
import chess.pieces.Piece;
import java.util.ArrayList;
import util.StringUtil;
public class Board {
    private final ArrayList<ArrayList<Piece>> allRanks;
    public Board (){
        this.allRanks = new ArrayList<>();
    }
    public int getNumberOfAllPieces(){
        int count = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (allRanks.get(i).get(j).getName() != Piece.Pieces.NO_PIECE)
                    count++;
            }
        }
        return count;
    }
    public void initialize(){
        for (int i = 0; i < 8; i++) {
            allRanks.add(new ArrayList<>());
        }
        allRanks.get(0).add(Piece.createWhiteRook());
        allRanks.get(0).add(Piece.createWhiteKnight());
        allRanks.get(0).add(Piece.createWhiteBishop());
        allRanks.get(0).add(Piece.createWhiteQueen());
        allRanks.get(0).add(Piece.createWhiteKing());
        allRanks.get(0).add(Piece.createWhiteBishop());
        allRanks.get(0).add(Piece.createWhiteKnight());
        allRanks.get(0).add(Piece.createWhiteRook());

        for (int rank = 0; rank < 8 ; rank++) {
            allRanks.get(1).add(Piece.createWhitePawn());
            allRanks.get(2).add(Piece.noPiece());
            allRanks.get(3).add(Piece.noPiece());
            allRanks.get(4).add(Piece.noPiece());
            allRanks.get(5).add(Piece.noPiece());
            allRanks.get(6).add(Piece.createBlackPawn());
        }

        allRanks.get(7).add(Piece.createBlackRook());
        allRanks.get(7).add(Piece.createBlackKnight());
        allRanks.get(7).add(Piece.createBlackBishop());
        allRanks.get(7).add(Piece.createBlackQueen());
        allRanks.get(7).add(Piece.createBlackKing());
        allRanks.get(7).add(Piece.createBlackBishop());
        allRanks.get(7).add(Piece.createBlackKnight());
        allRanks.get(7).add(Piece.createBlackRook());
    }
    public String ranksRepresentation(){
        StringBuilder buffer = new StringBuilder();
        String jump = "";
        for (int i = 7; i > 0 ; i--) {
            buffer.append(allRanks.get(i).get(i).getRepresentation() + jump);
            for (int j = 0; j < allRanks.size(); j++) {
                buffer.append(allRanks.get(i).get(j).getRepresentation());
                if (allRanks.get(i) == allRanks.get(7)){
                    jump = StringUtil.appendNewLine("");
                }
            }
        }
        return buffer.toString();
    }

    public void emptyBoard(){
        for (int rank = 0; rank < 8; rank++) {
            for (int i = 0; i < allRanks.size(); i++) {
                allRanks.get(i).set(rank, Piece.noPiece());
            }
        }
    }
    public String anotherPrintBoardSolution(){
        StringBuilder buffer = new StringBuilder();
        buffer.append(StringUtil.appendNewLine(ranksRepresentation()));
        return buffer.toString();
    }
    public String printBoardWithoutPieces(){
        StringBuilder buffer = new StringBuilder();

        return buffer.toString();
    }

    public int pieceCount(char representation) {
        int count = 0;
        for (Piece knight: allRanks.get(0)){
            if (knight.getRepresentation() == representation){
                count++;
            }
        }
        for (Piece piece: allRanks.get(1)){
            if (piece.getRepresentation() == representation){
                count++;
            }
        }
        for (Piece piece: allRanks.get(2)){
            if (piece.getRepresentation() == representation){
                count++;
            }
        }
        for (Piece piece: allRanks.get(3)){
            if (piece.getRepresentation() == representation){
                count++;
            }
        }
        for (Piece piece: allRanks.get(4)){
            if (piece.getRepresentation() == representation){
                count++;
            }
        }
        for (Piece piece: allRanks.get(5)){
            if (piece.getRepresentation() == representation){
                count++;
            }
        }
        for (Piece piece: allRanks.get(6)){
            if (piece.getRepresentation() == representation){
                count++;
            }
        }
        for (Piece piece: allRanks.get(7)){
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
            return allRanks.get(0).get(file);
        }
        else if (rank == '2'){
            return allRanks.get(1).get(file);
        }
        else if (rank == '3'){
            return allRanks.get(2).get(file);
        }
        else if (rank == '4'){
            return allRanks.get(3).get(file);
        }
        else if (rank == '5') {
            return allRanks.get(4).get(file);
        }
        else if (rank == '6'){
            return allRanks.get(5).get(file);
        }
        else if (rank == '7'){
            return allRanks.get(6).get(file);
        }
        else
            return allRanks.get(7).get(file);
    }

    public void placePiece(String position,Piece create){
        char file = position.charAt(0);
        char rank = position.charAt(1);

        file -= 'a';

        if (rank == '1'){
             allRanks.get(0).set(file, create);
        }
        else if (rank == '2') {
            allRanks.get(1).set(file, create);
        }
        else if (rank == '3') {
            allRanks.get(2).set(file, create);
        }
        else if (rank == '4') {
            allRanks.get(3).set(file, create);
        }
        else if (rank == '5') {
            allRanks.get(4).set(file, create);
        }
        else if (rank == '6') {
            allRanks.get(5).set(file, create);
        }
        else if (rank == '7') {
            allRanks.get(6).set(file, create);
        }
        allRanks.get(7).set(file, create);
    }

    public double pawnStrength(){
        return 0.5;
    }
    public int rookStrength(){
        return 5;
    }
    public double knightStrength(){
        return 2.5;
    }
    public int bishopStrength(){
        return 3;
    }
    public int queenStrength(){
        return 9;
    }
//    public int kingStrength(){
//
//    }
    public double getPawnStrength(){
        return pawnStrength();
    }
    public int getRookStrength(){
        return rookStrength();
    }
    public int getBishopStrength(){
        return bishopStrength();
    }

//    public int PieceStrength(int strength){
//
//    }
}
