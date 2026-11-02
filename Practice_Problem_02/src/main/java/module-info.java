module com.example.practice_problem_02 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.practice_problem_02 to javafx.fxml;
    exports com.example.practice_problem_02;
}