module com.uiejemplos.pruebaproyecto4_1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.uiejemplos.pruebaproyecto4_1 to javafx.fxml;
    exports com.uiejemplos.pruebaproyecto4_1;
}