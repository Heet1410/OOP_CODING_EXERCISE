import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.geometry.Pos;

import java.util.Random;

public class Q33 extends Application {

    public void start(Stage stage) {

        VBox root = new VBox(15);
        root.setAlignment(Pos.CENTER);

        Random r = new Random();

        for (int i = 1; i <= 5; i++) {
            Text t = new Text("Sample Text " + i);

            t.setFont(Font.font(20));

            // random color
            t.setFill(Color.color(r.nextDouble(), r.nextDouble(), r.nextDouble()));

            // random opacity
            t.setOpacity(0.4 + (r.nextDouble() * 0.6));

            root.getChildren().add(t);
        }

        Scene sc = new Scene(root, 400, 300);
        stage.setTitle("Q33 - Text Display");
        stage.setScene(sc);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}