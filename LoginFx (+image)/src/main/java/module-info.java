module maven.jfx {
    requires javafx.controls;
	requires javafx.fxml;
	requires javafx.base;
	requires javafx.graphics;
    exports application;
    
    opens application to javafx.fxml;
}
