module com.fiikbr.olamundoswing {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires java.logging;

    opens com.fiikbr.olamundoswing to javafx.fxml;
    exports com.fiikbr.olamundoswing;
}
