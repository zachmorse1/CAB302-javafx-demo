module org.payroll.hr.javafxreadingdemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.payroll.hr.javafxreadingdemo to javafx.fxml;
    exports org.payroll.hr.javafxreadingdemo;
}