package controladores;

import Data.Repo;
import Data.SalvaArquivo;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import sample.Filmes;
import sample.Main;
import sample.controladorRepo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


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

    public void Adiciona() throws IOException {
        Filmes fim = new Filmes();
        Repo rep = new Repo();
        controladorRepo cr = new controladorRepo();
        fim.nome =nom.getText();
        fim.aventura = av.isSelected();
        fim.acao = ac.isSelected();
        fim.drama = dra.isSelected();
        fim.documentario = doc.isSelected();
        fim.comedia = com.isSelected();
        fim.cientifico = cien.isSelected();
        fim.romance = rom.isSelected();
        fim.historico = his.isSelected();
        fim.pretobranco = pret.isSelected();
        cr.cadastrarFilme(fim);
        fim.adicionaFilme(fim);
        rep.adcionarFilme(fim);
    }

}
