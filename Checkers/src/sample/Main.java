package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class Main extends Application {

    public static final int TILE = 100;
    public static final int WIDTH = 8;
    public static final int HEIGHT = 8;
    private Tile[][] board = new Tile[WIDTH][HEIGHT];

    private Group tileGroup = new Group();
    private Group pieceGroup = new Group();

    private Parent createContent() {
        Pane root = new Pane();
        root.setPrefSize(WIDTH * TILE, HEIGHT * TILE);
        root.getChildren().addAll(tileGroup, pieceGroup);

        for (int y = 0; y < HEIGHT; y++) {
            for (int x = 0; x < WIDTH; x++) {
                Tile tile = new Tile((x + y) % 2 == 0, x, y);
                board[x][y]=tile;
                tileGroup.getChildren().add(tile);

                Piece piece = null;

                if (y <= 2 && (x + y) % 2 != 0) {
                    piece = makePiece(KindOfPiece.WHITE, x, y);
                }
                if (y >= 5 && (x + y) % 2 != 0) {
                    piece = makePiece(KindOfPiece.BLUE, x, y);
                }
                if (piece != null) {
                    tile.setPiece(piece);
                    pieceGroup.getChildren().add(piece);
                }
            }
        }
        return root;


    }

    private MoveResult movement(Piece piece, int newX, int newY) {

        if (board[newX][newY].hasPiece() || (newX + newY) % 2 == 0) {
            return new MoveResult(Move.NONE);
        }

        return new MoveResult(Move.NONE);
    }

    private int toBoard(double some) {
        return (int)(some);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Checkers");
        Scene scene = new Scene(createContent());
        primaryStage.setScene(scene);
        primaryStage.show();

        }

    private Piece makePiece(KindOfPiece kind, int x, int y) {
        Piece piece = new Piece(kind, x, y);


            piece.setOnMouseReleased(event ->{

                int newX = toBoard(piece.getLayoutX());
                int newY = toBoard(piece.getLayoutY());


            MoveResult move;

            if (newX < 0 || newY < 0 || newX >= WIDTH || newY >= HEIGHT) {
                move = new MoveResult(Move.NONE);
            } else {
                move = movement(piece, newX, newY);
            }

              switch(move.getMove()) {

                  case NONE:
                      piece.notMove();
                      break;
                  case NORMAL:
                      break;
                  case HIT:
                      break;

              }
        });
            return piece;
    }

    public static void main(String[] args) {
        launch(args);

    }
}
