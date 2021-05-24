package ContactsAppMod;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ContactsAppModController {

    @FXML    private ListView<ContactDetails> booksListView;
    @FXML    private ImageView coverImageView;
    private ContactDetails contactCurrent;

    @FXML private Label firstNameLabel;
    @FXML private Label lastNameLabel;
    @FXML private Label emailLabel;
    @FXML private Label phoneNumberLabel;
    @FXML private TextField firstNameTextField;
    @FXML private TextField lastNameTextField;
    @FXML private TextField emailTextField;
    @FXML private TextField phoneNumberTextField;
    @FXML private Button addButton;
    @FXML private Button deleteButton;
    @FXML private Button updateButton;

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
                obj1.setImage("ContactsAppMod/Images/img4.jpg");
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
            contacts.remove(contactCurrent);
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
                ContactsAppMod.ContactDetails obj1 = new ContactsAppMod.ContactDetails();
                contactCurrent.setFirstName(firstNameTextField.getText());
                contactCurrent.setLastName(lastNameTextField.getText());
                contactCurrent.setEmail(emailTextField.getText());
                contactCurrent.setPhoneNumber(phoneNumberTextField.getText());

            }
        } catch (Exception ex){
            firstNameTextField.setText("");
            lastNameTextField.setText("");
            emailTextField.setText("");
            phoneNumberTextField.setText("");
            firstNameTextField.requestFocus();
        }
    }
    public boolean validationFailed() {
        return (firstNameTextField.getText().trim().equals("") ||
                lastNameTextField.getText().trim().equals("") ||
                emailTextField.getText().trim().equals("") ||
                phoneNumberTextField.getText().trim().equals(""));
    }

    private final ObservableList<ContactDetails> contacts = FXCollections.observableArrayList();

    public void initialize(){
        contacts.add(new ContactDetails("Bullah","Shekih","shekih@gmail.com","+923827748373", "ContactsAppMod/Images/img1.jpg"));
        contacts.add(new ContactDetails("Shoukat ","Shamil","shamil.sho@gmail.com","+92335575845", "ContactsAppMod/Images/img2.jpg"));
        contacts.add(new ContactDetails("Nomi","Naim","nomi.nami@outlook.com","+923475847584", "ContactsAppMod/Images/img3.jpg"));

        booksListView.setItems(contacts);

        booksListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<ContactDetails>() {
            @Override
            public void changed(ObservableValue<? extends ContactDetails> observableValue, ContactDetails oldValue, ContactDetails newValue) {
                contactCurrent =newValue;
                coverImageView.setImage(new Image(newValue.getImage()));
                firstNameTextField.setText(newValue.getFirstName());
                lastNameTextField.setText(newValue.getLastName());
                emailTextField.setText(newValue.getEmail());
                phoneNumberTextField.setText(newValue.getPhoneNumber());
            }
        });
    }


}