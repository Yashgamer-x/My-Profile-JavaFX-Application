module org.yashgamer.myprofile {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.yashgamer.myprofile to javafx.fxml;
    exports org.yashgamer.myprofile;
    exports org.yashgamer.myprofile.controller;
    opens org.yashgamer.myprofile.controller to javafx.fxml;
}