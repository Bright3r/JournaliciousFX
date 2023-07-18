package application.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

/**
 * Controller for the "Reset Password" screen.
 * 
 * @author Vince Eguico
 */
public class ResetPasswordController extends SceneController {
	
	@FXML private Label securityQuestion;
	
	/**
	 * Handles clicks on "Reset Password" screen.
	 * 
	 * @param e An event given by some user action on the application.
	 */
	public void handleBackToLoginClick(ActionEvent e) {
		super.switchToView(e, View.LOGIN);
	}
	
}