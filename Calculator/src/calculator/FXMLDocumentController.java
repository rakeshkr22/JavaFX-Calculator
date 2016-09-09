package calculator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;

/**
 *
 * @author rakesh
 * @since september 2k16
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Button button0;
    @FXML
    private Button button1;
    @FXML
    private Button button2;
    @FXML
    private Button button3;
    @FXML
    private Button button4;
    @FXML
    private Button button5;
    @FXML
    private Button button6;
    @FXML
    private Button button7;
    @FXML
    private Button button8;
    @FXML
    private Button button9;
    @FXML
    private Button button_plus;
    @FXML
    private Button button_minus;
    @FXML
    private Button button_multiply;
    @FXML
    private Button button_divide;
    @FXML
    private Button button_equals;
    @FXML
    private Button button_clear;
    @FXML
    private TextField textField;
    
    private String textValue = "";
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        if(event.getSource()==button0)
            textField.setText(textValue+="0");
        else if(event.getSource()==button1)
            textField.setText(textValue+="1");
        else if(event.getSource()==button2)
            textField.setText(textValue+="2");
        else if(event.getSource()==button3)
            textField.setText(textValue+="3");
        else if(event.getSource()==button4)
            textField.setText(textValue+="4");
        else if(event.getSource()==button5)
            textField.setText(textValue+="5");
        else if(event.getSource()==button6)
            textField.setText(textValue+="6");
        else if(event.getSource()==button7)
            textField.setText(textValue+="7");
        else if(event.getSource()==button8)
            textField.setText(textValue+="8");
        else if(event.getSource()==button9)
            textField.setText(textValue+="9");
        else if(event.getSource()==button_plus)
            textField.setText(textValue+=" + ");
        else if(event.getSource()==button_divide)
            textField.setText(textValue+=" / ");
        else if(event.getSource()==button_minus)
            textField.setText(textValue+=" - ");
        else if(event.getSource()==button_multiply)
            textField.setText(textValue+=" * ");
        else if(event.getSource()==button_clear){
            textValue = "";
            textField.setText(textValue);
        }else if(event.getSource()==button_equals){
            textValue = Calculate.calculate(textValue);
            textField.setText(textValue);
        }
    }
    
    @FXML
    private void closeAction(ActionEvent event){
     System.exit(0);
    }
    
    @FXML
    private void aboutAction(ActionEvent event){
        
        
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Calculator");
        
        alert.setResizable(true);
        alert.getDialogPane().setPrefSize(250, 100);
        
        alert.setHeaderText("Calculator 1.0");
              
        TextFlow flow = new TextFlow(new Text(" For more "),
                new Hyperlink("https://rakeshkr22.github.io/"));
        
        alert.getDialogPane().setContent(flow);

        alert.showAndWait();
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
