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
    public void cleanBoard(){
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                allRanks.get(i).set(j,Piece.noPiece());
            }
        }
    }
    public String ranksRepresentation(){
        StringBuilder buffer = new StringBuilder();
        for (int i = 7; i >= 0 ; i--) {
            for (int j = 0; j < allRanks.size(); j++) {
                buffer.append(allRanks.get(i).get(j).getRepresentation());
            }
            buffer.append(StringUtil.appendNewLine(""));
        }
        return buffer.toString();
    }

    public String printBoard(){
        StringBuilder buffer = new StringBuilder();
        buffer.append((ranksRepresentation()));
        return buffer.toString();
    }

    public int pieceCountTurboVersion(char representation){
        int count = 0;
        for (int i = 0; i < 8; i++) {
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

        rank -= '1';

        allRanks.get(rank).set(file, allocate);
    }
    public double queenStrength(){
        return 9;
    }
    public double rookStrength(){
        return 5;
    }
    public double bishopStrength(){
        return 3;
    }
    public double knightStrength(){
        return 2.5;
    }
    public double pawnStrength(){
        return 1;
    }
    public double countBlackStrength(){
        double count = 0;
            count += whitePawnStrength('P');
            count += pieceCountTurboVersion('R') * rookStrength();
            count += pieceCountTurboVersion('B') * bishopStrength();
            count += pieceCountTurboVersion('Q') * queenStrength();
            return count;
    }
    public double countWhiteStrength(){
        double count = 0;
        count += whitePawnStrength('p');
        count += pieceCountTurboVersion('r') * rookStrength();
        count += pieceCountTurboVersion('b') * bishopStrength();
        count += pieceCountTurboVersion('q') * queenStrength();
        count += pieceCountTurboVersion('n') * knightStrength();
        return count;
    }
    public double whitePawnStrength(char compare){
        int count = 0;
        double strength = 0;
        for (int i = 0; i <= 7 ; i++) {
            for (int j = 0; j <= 7 ; j++) {
                if (allRanks.get(j).get(i).getRepresentation() == compare)
                    count += 1;
            }
            if (count > 1)
                strength  += count  * 0.5;

            else strength += count;
            count = 0;
        }
        return strength;
    }

    public ArrayList<Piece> whitePieces = new ArrayList<>();
    public ArrayList<Piece> blackPieces = new ArrayList<>();
    public void allList(){
        for (int i = 0; i <= 7; i++) {
            for (int j = 0; j < allRanks.size(); j++) {
                if (allRanks.get(i).get(j).isWhite()){
                    whitePieces.add(allRanks.get(i).get(j));
                } else if (allRanks.get(i).get(j).isBlack()) {
                    blackPieces.add(allRanks.get(i).get(j));
                }
            }
        }
    }
}
