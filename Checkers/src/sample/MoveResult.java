package sample;

public class MoveResult {
    private Move move;
    private Piece piece;

    public MoveResult(Move move, Piece piece) {
        this.move = move;
        this.piece = piece;
    }

    public MoveResult(Move move) {
        this(move,null);
    }

    public Move getMove() {
        return move;
    }

    public Piece getPiece() {
        return piece;
    }
}
