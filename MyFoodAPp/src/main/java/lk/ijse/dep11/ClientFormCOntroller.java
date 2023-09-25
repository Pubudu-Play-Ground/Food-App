package lk.ijse.dep11;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class ClientFormCOntroller {
    public TableView tblClient;
    public TextField txtCustomerId;
    public TextField txtCustomerName;
    public TextField txtCustomerContact;
    public Button btnSubmit;
    public AnchorPane root;


    public void btnSubmitOnAction(ActionEvent event) {


    }
    public boolean isValid(){
        if (!txtCustomerName.getText().matches("[A-Za-z ]")){
            new Alert(Alert.AlertType.ERROR,"Invalid customer name").show();
            txtCustomerName.selectAll();
            txtCustomerName.requestFocus();
            return false;
        }
        if (!txtCustomerContact.getText().matches("0[1-9]\\d-\\d{7}")){
            new Alert(Alert.AlertType.ERROR,"Invalid contact").show();
            txtCustomerContact.selectAll();
            txtCustomerContact.requestFocus();
            return false;
        }
        return true;
    }
    public  String generateCustomerId(){
        // Todo
        return "C-00001";
    }
}
