package controladores;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import sample.Main;


public class Navegar {
    @FXML
    private Button m;
    @FXML
    private Button f;
    @FXML
    private Button g;

    public void mi (){

    }
        public void Musica(){
            Main.NavSc("3");
        }

    public void Filme(){
        Main.NavSc("6");
    }
    public void Gente(){

        Main.NavSc("2");
    }
}
