package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import sample.CadastroPerfil;
import javafx.stage.Stage;





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
        Main.NavSc("4");
    }
    public void Gente(){

        Main.NavSc("2");
    }
}
