package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;


public class adicionaFilme {
    @FXML
    private TextField nom;
    @FXML
    private CheckBox av;
    @FXML
    private CheckBox cien;
    @FXML
    private CheckBox rom;
    @FXML
    private CheckBox com;
    @FXML
    private CheckBox doc;
    @FXML
    private CheckBox ac;
    @FXML
    private CheckBox dra;
    @FXML
    private CheckBox his;
    @FXML
    private CheckBox pret;

    @FXML
    private Button s;

    public void Sair(){
        Main.NavSc("1");
    }
    public void Adiciona(){
        Filme fim = new Filme();
        fim.nome=nom.getText();
        fim.aventura = av.isSelected();
        fim.acao = ac.isSelected();
        fim.drama = dra.isSelected();
        fim.documentario = doc.isSelected();
        fim.comedia = com.isSelected();
        fim.cientifico = cien.isSelected();
        fim.romance = rom.isSelected();
        fim.historico = his.isSelected();
        fim.pretobranco = pret.isSelected();
        fim.adicionaFilme(fim);

    }
}