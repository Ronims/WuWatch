package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Login {
    @FXML
    private TextField logN;
    @FXML
    private TextField senN;

    public void logar(){
        boolean bate;
        Usuario ua = new Usuario();
        ua.nome = logN.getText();
        ua.sen = senN.getText();
        bate = ua.comparaLogin(ua.nome,ua.sen);
        if(bate==true){
            //chama a cena de Principal
        }



    }
}
