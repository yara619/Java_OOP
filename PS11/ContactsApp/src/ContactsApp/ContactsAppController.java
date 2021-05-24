package ContactsApp;


import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class ContactsAppController{
    private ObservableList<ContactDetails> contacts = FXCollections.observableArrayList();
    private ContactDetails contactSelected;

    @FXML
    private ListView<ContactDetails> ContactsListView;

    @FXML
    private TextField firstNameTextField;

    @FXML
    private TextField lastNameTextField;

    @FXML
    private TextField emailTextField;

    @FXML
    private TextField phoneNumberTextField;

    public void initialize(){
        contacts.add(new ContactDetails("Nurlan","Shahi","sh.nurlan@gmail.com","+996133454334"));
        contacts.add(new ContactDetails("Carl","Marx","marx@hotmail.com","+553454544354"));
        contacts.add(new ContactDetails("Mona","Lisa","lisa@wordpress.com","34545466635345"));
        ContactsListView.setItems(contacts);
        ContactsListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<ContactDetails>() {
            @Override
            public void changed(ObservableValue<? extends ContactDetails> arg0, ContactDetails oldValue, ContactDetails newValue) {
                contactSelected = newValue;
                firstNameTextField.setText(newValue.getFirstName());
                lastNameTextField.setText(newValue.getLastName());
                emailTextField.setText(newValue.getEmail());
                phoneNumberTextField.setText(newValue.getPhoneNumber());
            }
        });
    }

    public boolean validationFailed() {
        return (firstNameTextField.getText().trim().equals("") ||
                lastNameTextField.getText().trim().equals("") ||
                emailTextField.getText().trim().equals("") ||
                phoneNumberTextField.getText().trim().equals(""));
    }
    @FXML
    void addButtonPressed(ActionEvent event) {
        try{
            if (validationFailed()){
                throw new NumberFormatException();
            }
            else{
                ContactDetails obj1 = new ContactDetails();
                obj1.setFirstName(firstNameTextField.getText());
                obj1.setLastName(lastNameTextField.getText());
                obj1.setEmail(emailTextField.getText());
                obj1.setPhoneNumber(phoneNumberTextField.getText());
                contacts.add(obj1);
            }
        } catch (Exception ex){
            firstNameTextField.setText("");
            lastNameTextField.setText("");
            emailTextField.setText("");
            phoneNumberTextField.setText("");
            firstNameTextField.requestFocus();
        }

    }

    @FXML
    void deleteButtonPressed(ActionEvent event) {
        try {
            contacts.remove(contactSelected);
        }
        catch (Exception ex){
            firstNameTextField.setText("");
            lastNameTextField.setText("");
            emailTextField.setText("");
            phoneNumberTextField.setText("");
            firstNameTextField.requestFocus();
        }
    }

    @FXML
    void updateButtonPressed(ActionEvent event) {
        try{
            if (validationFailed()){
                throw new NumberFormatException();
            }
            else{
                ContactDetails obj1 = new ContactDetails();
                contactSelected.setFirstName(firstNameTextField.getText());
                contactSelected.setLastName(lastNameTextField.getText());
                contactSelected.setEmail(emailTextField.getText());
                contactSelected.setPhoneNumber(phoneNumberTextField.getText());

            }
        } catch (Exception ex){
            firstNameTextField.setText("");
            lastNameTextField.setText("");
            emailTextField.setText("");
            phoneNumberTextField.setText("");
            firstNameTextField.requestFocus();
        }
    }

}