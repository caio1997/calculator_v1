package gui;

import gui.util.Alerts;
import gui.util.Constraints;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ViewController implements Initializable{ 
    
    @FXML
    private Button btResult;
    @FXML
    private TextField txtN1;
    @FXML
    private TextField txtN2;
    @FXML
    private TextField txtResposta;
    @FXML
    private TextField txtOperacao;
    
    @FXML
    public void operacao(){
        double number1 = Double.parseDouble(txtN1.getText());
        double number2 = Double.parseDouble(txtN2.getText());
        char oper = txtOperacao.getText().charAt(0);
        if(oper == '+' | oper == '-' | oper == '*' | oper == '/' ){
            if(oper == '+'){
                double resp = number1 + number2;
                txtResposta.setText(String.format("%.2f", resp));
            }
             if(oper == '-'){
                double resp = number1 - number2;
                txtResposta.setText(String.format("%.2f", resp));
            }
              if(oper == '*'){
                double resp = number1 * number2;
                txtResposta.setText(String.format("%.2f", resp));
            }
               if(oper == '/'){
                double resp = number1 / number2;
                txtResposta.setText(String.format("%.2f", resp));
            }
        }else{
            Alerts.showAlert("Operação Incorreta",null, "Operação diferente de *, -, + ou /", Alert.AlertType.ERROR);
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Constraints.setTextFieldDouble(txtN1);
        Constraints.setTextFieldDouble(txtN2);
    }
}
