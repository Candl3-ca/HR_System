module com.fp.fp {
    requires javafx.controls;
    requires javafx.fxml;
    requires junit;


    opens com.fp.fp to javafx.fxml;
    exports com.fp.fp;
}