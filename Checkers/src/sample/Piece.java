package sample;

import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Piece extends StackPane {

    public double clickY, clickX, oldX, oldY;


    private KindOfPiece kind;


    public double getClickX() {
        return clickX;
    }

    public double getClickY() {
        return clickY;
    }

    public double getOldX() {
        return oldX;
    }

    public double getOldY() {
        return oldY;
    }



    public KindOfPiece getKind() {
        return kind;
    }

    public Piece(KindOfPiece kind, double x, double y) {
        this.kind = kind;

        relocate(x * Main.TILE, y * Main.TILE);

        Circle circle = new Circle(Main.TILE * 0.3);

        circle.setStroke(Color.BLACK);
        circle.setStrokeWidth(Main.TILE * 0.03);
        circle.setFill(kind == KindOfPiece.WHITE ? Color.valueOf("#ffffff") : Color.valueOf("#0000FF"));

        circle.setTranslateX((Main.TILE - Main.TILE * 0.3 * 2.73));
        circle.setTranslateY((Main.TILE - Main.TILE * 0.3 * 2.73));


        getChildren().addAll(circle);

        setOnMousePressed(event -> {
            clickX = event.getSceneX();
            clickY = event.getSceneY();
            System.out.println(clickX + " " + clickY);
        });
        setOnMouseDragged(event -> {
            relocate(event.getSceneX() - Main.TILE/2 , event.getSceneY() - Main.TILE/2);
//            relocate(event.getSceneX() - clickX + oldX ,  event.getSceneY() - clickY + oldY);
        });
    }

//        setOnMouseDragReleased(event ->) {
//
//            double moveX = oldX + newX;
//            double moveY = oldY + newY;
//
//            moveX = moveX * Main.TILE;
//            moveY = moveY * Main.TILE;
//            relocate(moveX, moveY);
//        });

            public void move(int x, int y) {
                oldX = x * Main.TILE ;
                oldY = y * Main.TILE ;
                 relocate(oldX, oldY);

    }
//
            public void notMove() {
                relocate(oldX , oldY );
                System.out.println(clickX + " " + clickY);
            }

}







