package sample;

import Data.Repo;
import javafx.fxml.FXML;

import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;


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
        Repo rep = new Repo();
        Musica mus = new Musica();
        mus.nomeM =nom.getText();
        mus.mpb = mp.isSelected();
        mus.indie = ind.isSelected();
        mus.rap = rap.isSelected();
        mus.kpop = kpo.isSelected();
        mus.pop = pop.isSelected();
        mus.rock = roc.isSelected();
        mus.emo = emo.isSelected();
        rep.adcionarMusica(mus);
        mus.adicionarmusicas(mus);


    }
}
