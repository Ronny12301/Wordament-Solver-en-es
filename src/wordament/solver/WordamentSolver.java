package wordament.solver;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 *
 * @author ronny12301
 */
public class WordamentSolver extends Application{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("MenuFXML.fxml"));
        stage.setTitle("Wordament Solver");
        Scene scene = new Scene(root);
        Image icon = new  Image("img/Wordament_Board.png");
        
        stage.getIcons().add(icon);
        
        stage.setScene(scene);
        stage.show();
    }
    
    
    
}
