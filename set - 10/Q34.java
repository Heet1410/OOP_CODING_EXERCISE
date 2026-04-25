import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Q34 extends Application {

    public void start(Stage stage) {

        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);

        TextField roll = new TextField();
        TextField name = new TextField();
        TextField age = new TextField();
        TextField email = new TextField();

        Button btn = new Button("Submit");

        grid.add(new Label("Roll No"), 0, 0);
        grid.add(roll, 1, 0);

        grid.add(new Label("Name"), 0, 1);
        grid.add(name, 1, 1);

        grid.add(new Label("Age"), 0, 2);
        grid.add(age, 1, 2);

        grid.add(new Label("Email"), 0, 3);
        grid.add(email, 1, 3);

        grid.add(btn, 1, 4);

        btn.setOnAction(e -> {
            try {
                int r = Integer.parseInt(roll.getText());
                int a = Integer.parseInt(age.getText());
                String em = email.getText();

                if (!em.contains("@") || !em.contains(".")) {
                    throw new Exception("Invalid Email");
                }

                Alert ok = new Alert(Alert.AlertType.INFORMATION);
                ok.setContentText("Data Saved Successfully");
                ok.show();

            } catch (Exception ex) {
                Alert err = new Alert(Alert.AlertType.ERROR);
                err.setContentText("Invalid Input");
                err.show();
            }
        });

        Scene sc = new Scene(grid, 350, 250);
        stage.setTitle("Q34 - Form");
        stage.setScene(sc);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}