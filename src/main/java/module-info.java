module com.justasvaivada.calculatorjavafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens com.justasvaivada.calculatorjavafx to javafx.fxml;
    exports com.justasvaivada.calculatorjavafx;
}