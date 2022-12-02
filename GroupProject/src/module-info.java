module GroupProject {
	requires javafx.controls;
	requires javafx.fxml;
	requires java.sql;
	requires javafx.graphics;
	
	opens application to javafx.graphics, javafx.fxml;
	
	exports GUI;
	
}


