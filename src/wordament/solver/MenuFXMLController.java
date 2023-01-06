package wordament.solver;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ronny12301
 */
public class MenuFXMLController {
    
    private Parent root;
    private Scene scene;
    private Stage stage;
    
    
    public void setEng(ActionEvent e) throws IOException {
        WordamentFXMLController.setIdioma("eng");
        root = FXMLLoader.load(getClass().getResource("WordamentFXML.fxml"));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    public void setEsp(ActionEvent e) throws IOException {
        WordamentFXMLController.setIdioma("esp");
        root = FXMLLoader.load(getClass().getResource("WordamentFXML.fxml"));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    } 
    
}
