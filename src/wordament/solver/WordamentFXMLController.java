package wordament.solver;

import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;
import java.util.function.UnaryOperator;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.scene.control.TextFormatter.Change;
import javafx.scene.layout.GridPane;
import solver.Busqueda;

/**
 * FXML Controller class
 *
 * @author ronny12301
 */
public class WordamentFXMLController implements Initializable {

    /**
     * Initializes the controller class.
     */
  
    @FXML
    private TextField p11;
    @FXML
    private TextField p12;
    @FXML
    private TextField p13;
    @FXML
    private TextField p14;
    @FXML
    private TextField p21;
    @FXML
    private TextField p22;
    @FXML
    private TextField p23;
    @FXML
    private TextField p24;
    @FXML
    private TextField p31;
    @FXML
    private TextField p32;
    @FXML
    private TextField p33;
    @FXML
    private TextField p34;
    @FXML
    private TextField p41;
    @FXML
    private TextField p42;
    @FXML
    private TextField p43;
    @FXML
    private TextField p44;
    
    public void resolver(ActionEvent e) {
        Busqueda busqueda = new Busqueda();
        
        boolean resultado = busqueda.validarPalabra(getTableroTxt(),"abajo");
        
        System.out.println(resultado);
    }

    public char[][] getTableroTxt() {
        char[][] values = new char[4][4];
        values[0][0] = p11.getText().charAt(0);
        values[0][1] = p12.getText().charAt(0);
        values[0][2] = p13.getText().charAt(0);
        values[0][3] = p14.getText().charAt(0);
        values[1][0] = p21.getText().charAt(0);
        values[1][1] = p22.getText().charAt(0);
        values[1][2] = p23.getText().charAt(0);
        values[1][3] = p24.getText().charAt(0);
        values[2][0] = p31.getText().charAt(0);
        values[2][1] = p32.getText().charAt(0);
        values[2][2] = p33.getText().charAt(0);
        values[2][3] = p34.getText().charAt(0);
        values[3][0] = p41.getText().charAt(0);
        values[3][1] = p42.getText().charAt(0);
        values[3][2] = p43.getText().charAt(0);
        values[3][3] = p44.getText().charAt(0);
        return values;
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        TextField[] textFields = {p11, p12, p13, p14, p21, p22, p23, p24, p31, p32, p33, p34, p41, p42, p43, p44};

        UnaryOperator<Change> filter = change -> {
            String newText = change.getControlNewText();
            if (newText.length() > 1) {
                return null;
            }
            return change;
        };

        for (TextField textField : textFields) {
            textField.setTextFormatter(new TextFormatter<>(filter));
        }
      
    }
    

}
