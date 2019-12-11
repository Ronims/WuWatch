package sample;

import javafx.fxml.FXML;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import sample.Main;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class adicionaMusica {
    @FXML
    private TextField nom;
    @FXML
    private CheckBox mp;
    @FXML
    private CheckBox roc;
    @FXML
    private CheckBox emo;
    @FXML
    private CheckBox pop;
    @FXML
    private CheckBox kpo;
    @FXML
    private CheckBox ind;
    @FXML
    private CheckBox rap;
    @FXML
    private Button s;

    public void Sair(){
        Main.NavSc("1");
    }


    public void Adiciona(){
        Musica mus = new Musica();
        mus.nome=nom.getText();
        mus.mpb = mp.isSelected();
        mus.indie = ind.isSelected();
        mus.rap = rap.isSelected();
        mus.kpop = kpo.isSelected();
        mus.pop = pop.isSelected();
        mus.rock = roc.isSelected();
        mus.emo = emo.isSelected();
        Musica.adicionarmusicas(mus);
        System.out.println(mus.nome);
        System.out.print(mus.mpb);
    }
}
