package checkers;

public enum KindOfPiece {
    WHITE(1),
    BLUE(-1);

    final int moveDir;

    KindOfPiece(int moveDir) {
        this.moveDir = moveDir;
    }
}
