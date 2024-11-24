module com.nasri.shoppinglist {
    requires javafx.controls;
    requires javafx.fxml;

//    requires org.controlsfx.controls;
//    requires org.kordamp.bootstrapfx.core;

    opens com.nasri.shoppinglist to javafx.fxml;
    exports com.nasri.shoppinglist;
}