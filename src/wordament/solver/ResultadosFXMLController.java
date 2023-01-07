package wordament.solver;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

/**
 *
 * @author ronny12301
 */
public class ResultadosFXMLController implements Initializable {
    
    @FXML
    private Button btnRegresar;
    @FXML
    private Label lblResultados;
    
    @FXML
    private TextArea texto;
        
    public void regresar(ActionEvent e) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("WordamentFXML.fxml"));
        Stage stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        if (WordamentFXMLController.getIdioma().equals("esp")) {
            btnRegresar.setText("Regresar");
            lblResultados.setText("Resultados");
            
        } else {
            btnRegresar.setText("Back");
            lblResultados.setText("Results");
        }
        
        texto.setText(WordamentFXMLController.listaResultados);
    }
    
    
}
