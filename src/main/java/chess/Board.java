package chess;
import chess.pieces.Piece;
import java.util.ArrayList;
import util.StringUtil;
public class Board {
    private final ArrayList<ArrayList<Piece>> allRanks;
    public Board (){
        this.allRanks = new ArrayList<>();

        for (int i = 0; i < 8; i++) {
            allRanks.add(new ArrayList<>());
        }
        for (int i = 0; i < 8 ; i++) {
            for (int j = 0; j < 8; j++) {
                allRanks.get(i).add(Piece.noPiece());
            }
        }

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
        allRanks.get(0).set(0,Piece.createWhiteRook());
        allRanks.get(0).set(1,Piece.createWhiteKnight());
        allRanks.get(0).set(2,Piece.createWhiteBishop());
        allRanks.get(0).set(3,Piece.createWhiteQueen());
        allRanks.get(0).set(4,Piece.createWhiteKing());
        allRanks.get(0).set(5,Piece.createWhiteBishop());
        allRanks.get(0).set(6,Piece.createWhiteKnight());
        allRanks.get(0).set(7,Piece.createWhiteRook());

        for (int file = 0; file < 8 ; file++) {
            allRanks.get(1).set(file,Piece.createWhitePawn());
            allRanks.get(2).set(file,Piece.noPiece());
            allRanks.get(3).set(file,Piece.noPiece());
            allRanks.get(4).set(file,Piece.noPiece());
            allRanks.get(5).set(file,Piece.noPiece());
            allRanks.get(6).set(file,Piece.createBlackPawn());
        }

        allRanks.get(7).set(0,Piece.createBlackRook());
        allRanks.get(7).set(1,Piece.createBlackKnight());
        allRanks.get(7).set(2,Piece.createBlackBishop());
        allRanks.get(7).set(3,Piece.createBlackQueen());
        allRanks.get(7).set(4,Piece.createBlackKing());
        allRanks.get(7).set(5,Piece.createBlackBishop());
        allRanks.get(7).set(6,Piece.createBlackKnight());
        allRanks.get(7).set(7,Piece.createBlackRook());
    }
    public String ranksRepresentation(){
        StringBuilder buffer = new StringBuilder();
        String jump = "";
        for (int i = 7; i >= 0 ; i--) {
            buffer.append(jump + allRanks.get(i).get(i).getRepresentation());
            for (int j = 1; j < allRanks.size(); j++) {
                buffer.append(allRanks.get(i).get(j).getRepresentation());
                if (allRanks.get(i) == allRanks.get(7)){
                    jump = StringUtil.appendNewLine("");
                }
            }
        }
        return buffer.toString();
    }

    public String printBoard(){
        StringBuilder buffer = new StringBuilder();
        buffer.append(StringUtil.appendNewLine(ranksRepresentation()));
        return buffer.toString();
    }

    public int pieceCountTurboVersion(char representation){
        int count = 0;
        for (int i = 0; i < 8; i++) {
            allRanks.get(i).get(i);
            for (Piece piece: allRanks.get(i))
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

        rank -= '1';

        return allRanks.get(rank).get(file);

    }

    public void placePieceRemastered(String position, Piece allocate){
        char file = position.charAt(0);
        char rank = position.charAt(1);

        file -= 'a';

        rank -= ' ';

        allRanks.get(rank).set(file, allocate);
    }

    public double basicStrength(){
        double someStrength = 0;
        double queenStrength = 9 + someStrength;
        double rookStrength = 5 + someStrength;
        double bishopStrength = 3 + someStrength;
        double knightStrength = 2.5 + someStrength;
        double pawnStrength = 1 + someStrength;
        return someStrength;
    }
}
