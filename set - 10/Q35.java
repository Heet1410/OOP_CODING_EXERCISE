import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.geometry.Pos;

public class Q35 extends Application {

    public void start(Stage stage) {

        HBox root = new HBox(20);
        root.setAlignment(Pos.BOTTOM_CENTER);

        String[] subjects = {"Proj", "Quiz", "Mid", "Final"};
        int[] marks = {20, 10, 30, 40};

        for (int i = 0; i < marks.length; i++) {

            VBox box = new VBox(5);
            box.setAlignment(Pos.BOTTOM_CENTER);

            Rectangle bar = new Rectangle(40, marks[i] * 3);

            // simple color variation
            bar.setFill(Color.rgb(50 * i, 80, 150));

            Label lbl = new Label(subjects[i] + " " + marks[i] + "%");

            box.getChildren().addAll(bar, lbl);
            root.getChildren().add(box);
        }

        Scene sc = new Scene(root, 400, 300);
        stage.setTitle("Q35 - Bar Chart");
        stage.setScene(sc);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}