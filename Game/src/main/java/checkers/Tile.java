package checkers;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Tile extends Rectangle {

        private Piece piece;
        public boolean hasPiece() {
            return piece != null;
        }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public Tile(boolean light, int x, int y) {
            setWidth( Main.TILE);
            setHeight(Main.TILE);

            relocate(x * Main.TILE, y * Main.TILE);

        setFill(light ? Color.valueOf("#fff1c8") : Color.valueOf("#332f25"));

        }
        }


