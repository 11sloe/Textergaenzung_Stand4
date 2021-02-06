
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.KeyCode;

public class Controller {
    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="text"
    private TextArea text; // Value injected by FXMLLoader

    @FXML // fx:id="vorschlag1"
    private Button vorschlag1; // Value injected by FXMLLoader

    @FXML // fx:id="vorschlag2"
    private Button vorschlag2; // Value injected by FXMLLoader

    @FXML // fx:id="vorschlag3"
    private Button vorschlag3; // Value injected by FXMLLoader

    @FXML // fx:id="eingabe"
    private TextField eingabe; // Value injected by FXMLLoader

    @FXML
    void eingabeGeaendert(KeyEvent event) {      
        String s = eingabe.getText();
        //System.out.println(s);
        vorschlag1.setText(s);
    }
    @FXML
    void vorschlag1Geklickt(ActionEvent event) {
        String s = eingabe.getText();
        text.appendText(s);
        eingabe.setText("");
        vorschlag1.setText("");

    }

    @FXML
    void vorschlag2Geklickt(ActionEvent event) {

    }

    @FXML
    void vorschlag3Geklickt(ActionEvent event) {

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert text != null : "fx:id=\"text\" was not injected: check your FXML file 'view.fxml'.";
        assert vorschlag1 != null : "fx:id=\"vorschlag1\" was not injected: check your FXML file 'view.fxml'.";
        assert vorschlag2 != null : "fx:id=\"vorschlag2\" was not injected: check your FXML file 'view.fxml'.";
        assert vorschlag3 != null : "fx:id=\"vorschlag3\" was not injected: check your FXML file 'view.fxml'.";
        assert eingabe != null : "fx:id=\"eingabe\" was not injected: check your FXML file 'view.fxml'.";

        // TextFeld und Nachricht am Anfang leeren
        eingabe.setText("");
        text.setText("");
    }
}
