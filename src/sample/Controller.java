package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import javafx.application.Application;

public class Controller {
    public void admin_signIn(ActionEvent e){
        System.out.println("Admin");
    }

    public void lib_signIn(ActionEvent e){
        System.out.println("Lib");
    }

    public void student_signIn(ActionEvent e){
        System.out.println("Student");
    }

}
