package sample;


import Data.Repo;
import Data.SalvaArquivo;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;


public class CadastroPerfil implements Initializable {

    @FXML
    private Button cad;
    @FXML
    private Button canc;
    @FXML
    private TextField name;
    @FXML
    private TextField senha;
    @FXML
    private TextField iden;
    @FXML
    private TableView<Musica> mus;
    @FXML
    private TableView<Filmes> fil;
    @FXML
    private TableColumn<Filmes, String> estfil;
    @FXML
    private TableColumn<Musica, String> estMus;

    private ObservableList<Musica> observableListMus;
    private ObservableList<Filmes> observableListMov;
    private Repo repository= new Repo();
    public  ArrayList<Filmes> mo = new ArrayList<>();
    public  ArrayList<Musica> ms = new ArrayList<>();
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Cadastro.fxml"));
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }
    @FXML
    private Button s;

    public void Sair(){
        Main.NavSc("1");
    }
    private List<Musica> listMusic = new ArrayList<>( );
    private List<Filmes> listMovie = new ArrayList<>( );





    Musica music = new Musica( );
    Filmes mov = new Filmes( );
    static int aberto;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        iniciar();
        mus.setOnMouseClicked((MouseEvent event) -> {
            if (event.getButton( ).equals(MouseButton.PRIMARY) && event.getClickCount( ) == 2) {//comando para receber os clicks duplos na tableView e pegar o Row que foi clickado
                music = mus.getSelectionModel( ).getSelectedItem( );
                ms.add(music);
                selecionaTableMusica(music);
                //aberto = Musica.pegaIndex(music.nomeM);
            }
        });
        fil.setOnMouseClicked((MouseEvent event) -> {
            if (event.getButton( ).equals(MouseButton.PRIMARY) && event.getClickCount( ) == 2) {//comando para receber os clicks duplos na tableView e pegar o Row que foi clickado
                mov = fil.getSelectionModel( ).getSelectedItem( );
                mo.add(mov);
                selecionaTableFilme(mov);
                //aberto = Musica.pegaIndex(music.nomeM);
            }
        });

    }
     public void selecionaTableMusica(Musica mus){
         Alert alerta = new Alert(Alert.AlertType.CONFIRMATION);
         alerta.setTitle("Confirmação de adição");
         alerta.setHeaderText(mus.nomeM + " foi selecionada!");
         alerta.setContentText("deseja prosseguir com a adição de"+ mus.nomeM + "?");
         Optional<ButtonType> action = alerta.showAndWait();
         if (action.get( ) == ButtonType.OK) {

             System.out.print("\nta bom\n");

         }
        ms.add(mus);
     }
    public void selecionaTableFilme(Filmes fil){
        mo.add(fil);
        Alert alerta = new Alert(Alert.AlertType.CONFIRMATION);
        alerta.setTitle("Confirmação de adição");
        alerta.setHeaderText(fil.nome + " foi selecionada!");
        alerta.setContentText("deseja prosseguir com a adição de" + fil.nome + "?");
        Optional<ButtonType> action = alerta.showAndWait();
        if (action.get( ) == ButtonType.OK) {

            System.out.print("\nta bom\n");

        }
    }

    public void adicionar(){
        Usuario usu = new Usuario();
        usu.nome=name.getText();
        usu.sen=senha.getText();
        usu.Id=iden.getText();
        usu.like=ms;
        usu.movie=mo;
        Usuario.adicionarUsuario(usu);
    }
    public void arquivar() throws IOException {
        Filmes mr = new Filmes();
        SalvaArquivo sa = new SalvaArquivo();
        List<Filmes> listF = new ArrayList<>( );
        listF.addAll(mr.pegarFilmes());
        sa.saveDataFilme(listF);

    }
    public void carregarMusica (ArrayList <Musica> som) {//população das tabelas internas da table list
        listMusic.clear();
        mus.setEditable(false);
        listMusic.addAll(som);
        estMus.setCellValueFactory(new PropertyValueFactory<>("nomeM"));
        observableListMus = FXCollections.observableArrayList(listMusic);
        mus.setItems(observableListMus);

    }
    public void carregarFilme (ArrayList <Filmes> filmes) {//população das tabelas internas da table list
        listMovie.clear();
        fil.setEditable(false);
        listMovie.addAll(filmes);
        estfil.setCellValueFactory(new PropertyValueFactory<>("nome"));
        observableListMov = FXCollections.observableArrayList(listMovie);
        fil.setItems(observableListMov);
    }
    public void iniciar(){
        Filmes fir = new Filmes();
        Musica mr = new Musica();
        carregarFilme(fir.pegarFilmes());
        carregarMusica(mr.pegarMusicas());

    }
}

