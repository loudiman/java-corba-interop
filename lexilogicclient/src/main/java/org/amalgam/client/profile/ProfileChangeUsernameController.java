package org.amalgam.client.profile;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import org.amalgam.ControllerException.InvalidRequestException;
import org.amalgam.client.MainController;
import org.amalgam.client.UIPathResolver;
import org.amalgam.client.login.LoginController;

public class ProfileChangeUsernameController {
    // private variables
    @FXML
    private AnchorPane changeUsernamePane;
    @FXML
    private Button backButton;
    @FXML
    private TextField newUsernameField;
    @FXML
    private Button saveButton;
    @FXML
    private Label usernameLabel;
    public ProfileChangeUsernameModel profileChangeUsernameModel = new ProfileChangeUsernameModel(MainController.orbConnection
    , LoginController.playerCallback);

    /**
     * Adds hover effect to the given button.
     *
     * @param button The button to add hover effect to.
     */
    private void addHoverEffectImage(Button button) {
        ImageView imageView = (ImageView) button.getGraphic();
        ColorAdjust colorAdjust = new ColorAdjust();

        button.setOnMouseEntered(e -> {
            colorAdjust.setBrightness(-0.3); // Decrease brightness to make it darker
            imageView.setEffect(colorAdjust);
        });

        button.setOnMouseExited(e -> {
            colorAdjust.setBrightness(0); // Reset brightness
            imageView.setEffect(colorAdjust);
        });
    }

    private void addHoverEffect(Button button){
        String originalColor = button.getStyle(); // Store the original color

        button.setOnMouseEntered(e -> button.setStyle("-fx-background-color: derive(" + originalColor + ", -10%);"));
        button.setOnMouseExited(e -> button.setStyle(originalColor));
    }

    /**
     * Shows an alert to a user if there is an error.
     *
     * @param message
     */
    private void showAlert(String message){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    /**
     * Gets the objects used.
     * This method returns a string indicating the type of objects used by the controller.
     *
     * @return A string representing the objects used.
     */
    public void setObjectsUser(String objects) throws InvalidRequestException {

    }

    /**
     * Fetches and updates data remotely.
     * This method is called to update the data displayed in the UI.
     *
     */
    public void fetchAndUpdate(String jsonString, String dataType) throws InvalidRequestException {

    }

    @FXML
    public void handleSave(){
        // handles the save button when the username is changed
        profileChangeUsernameModel.changeUsername(newUsernameField.getText());
    }
    @FXML
    public void handleBack(){
        MainController.changeScreen(UIPathResolver.profile_path);
    }
    /**
     * Initializes the controller.
     * This method sets up the UI components and initializes the data model.
     */
    @FXML
    public void initialize() {
        usernameLabel.setText(LoginController.username);
        addHoverEffect(saveButton);
        addHoverEffectImage(backButton);
        saveButton.setOnAction(event -> handleSave());
        backButton.setOnAction(event -> handleBack());
    }
}
