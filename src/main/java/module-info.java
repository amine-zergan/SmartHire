module com.example.smarthire {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;
    requires java.sql;
    requires java.management;
    requires fontawesomefx;

    opens com.example.smarthire to javafx.fxml;
    exports com.example.smarthire;
    exports com.example.smarthire.Auth;
    opens com.example.smarthire.Auth to javafx.fxml;
    exports com.example.smarthire.serviceDb;
    opens com.example.smarthire.serviceDb to javafx.fxml;
}