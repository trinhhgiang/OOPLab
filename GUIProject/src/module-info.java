/**
 * 
 */
/**
 * @author AD
 *
 */
module GUIProject {
	requires java.desktop;
	requires javafx.fxml;
	requires javafx.graphics;
	requires javafx.controls;

	requires javafx.media;

	opens hust.soict.dsai.javafx to javafx.graphics, javafx.fxml;
}

