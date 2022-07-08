module testjena {
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires org.apache.jena.arq;
    requires org.apache.jena.core;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens vedulieu;
    exports vedulieu;
}