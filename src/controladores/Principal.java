package controladores;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import sample.*;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;

public class Principal {

    @FXML
    private TableView<Usuario> Tamigos;
    @FXML
    private TableView<Musica> Tmusicas;
    @FXML
    private TableView<Filmes> Tfilmes;
    @FXML
    private TableColumn<Usuario, String> tcam;
    @FXML
    private TableColumn<Musica, String> tcmu;
    @FXML
    private TableColumn<Usuario, String> tcfi;

    private ObservableList<Musica> observableListMus;
    private ObservableList<Filmes> observableListFim;
    private ObservableList<Usuario> observableListAmg;
    public ArrayList<Filmes> mo = new ArrayList<>();
    public ArrayList<Musica> musi = new ArrayList<>();
    public ArrayList<Usuario> rio = new ArrayList<>();
    Musica music = new Musica( );
    Filmes mov = new Filmes( );
    Usuario usa = new Usuario();
    private List<Usuario> listUsuario = new ArrayList<>( );
    private List<Musica> listMusic = new ArrayList<>( );
    private List<Filmes> listMovie = new ArrayList<>( );

    //tela pra exibir musicas pra o usuario curtir e exibir os outros usuarios, fazer de um modo q a listview exiba do mais conexo pro menos conexo


    public void initialize(URL url, ResourceBundle rb) {
        iniciar( );
        Tmusicas.setOnMouseClicked((MouseEvent event) -> {
            if (event.getButton( ).equals(MouseButton.PRIMARY) && event.getClickCount( ) == 2) {//comando para receber os clicks duplos na tableView e pegar o Row que foi clickado
                music = Tmusicas.getSelectionModel( ).getSelectedItem( );
                musi.add(music);
                selecionaTableMusica(music);
            }
        });
        Tfilmes.setOnMouseClicked((MouseEvent event) -> {
            if (event.getButton( ).equals(MouseButton.PRIMARY) && event.getClickCount( ) == 2) {//comando para receber os clicks duplos na tableView e pegar o Row que foi clickado
                mov = Tfilmes.getSelectionModel( ).getSelectedItem( );
                mo.add(mov);
                selecionaTableFilme(mov);
            }
        });
        Tamigos.setOnMouseClicked((MouseEvent event) -> {
            if (event.getButton( ).equals(MouseButton.PRIMARY) && event.getClickCount( ) == 2) {//comando para receber os clicks duplos na tableView e pegar o Row que foi clickado
                usa = Tamigos.getSelectionModel( ).getSelectedItem( );
                rio.add(usa);
                selecionaTableAmigo(usa);
            }
        });
    }
    public void selecionaTableAmigo(Usuario ui){
        Alert alerta = new Alert(Alert.AlertType.CONFIRMATION);
        alerta.setTitle("Confirmação de adição");
        alerta.setHeaderText(ui.nome + " foi selecionada!");
        alerta.setContentText("deseja prosseguir com a adição de"+ ui.nome + "?");
        Optional<ButtonType> action = alerta.showAndWait();
        if (action.get( ) == ButtonType.OK) {
        }
        rio.add(ui);
    }
    public void selecionaTableMusica(Musica mus){
        Alert alerta = new Alert(Alert.AlertType.CONFIRMATION);
        alerta.setTitle("Confirmação de adição");
        alerta.setHeaderText(mus.nomeM + " foi selecionada!");
        alerta.setContentText("deseja prosseguir com a adição de"+ mus.nomeM + "?");
        Optional<ButtonType> action = alerta.showAndWait();
        if (action.get( ) == ButtonType.OK) {
        }
        musi.add(mus);
    }
    public void selecionaTableFilme(Filmes fi){
        Alert alerta = new Alert(Alert.AlertType.CONFIRMATION);
        alerta.setTitle("Confirmação de adição");
        alerta.setHeaderText(fi.nome + " foi selecionada!");
        alerta.setContentText("deseja prosseguir com a adição de"+ fi.nome + "?");
        Optional<ButtonType> action = alerta.showAndWait();
        if (action.get( ) == ButtonType.OK) {
        }
        mo.add(fi);
    }
    public void carregarUsuario (ArrayList <Usuario> us) {//população das tabelas internas da table list
        listUsuario.clear();
        Tamigos.setEditable(false);
        listUsuario.addAll(us);
        tcam.setCellValueFactory(new PropertyValueFactory<>("nome"));
        observableListAmg = FXCollections.observableArrayList(listUsuario);
        Tamigos.setItems(observableListAmg);
    }
    public void carregarMusica (ArrayList <Musica> mu) {//população das tabelas internas da table list
        listMusic.clear();
        Tmusicas.setEditable(false);
        listMusic.addAll(mu);
        tcmu.setCellValueFactory(new PropertyValueFactory<>("nomeM"));
        observableListMus = FXCollections.observableArrayList(listMusic);
        Tmusicas.setItems(observableListMus);
    }
    public void carregarFilme (ArrayList <Filmes> filmes) {//população das tabelas internas da table list
        listMovie.clear();
        Tfilmes.setEditable(false);
        listMovie.addAll(filmes);
        tcfi.setCellValueFactory(new PropertyValueFactory<>("nome"));
        observableListFim = FXCollections.observableArrayList(listMovie);
        Tfilmes.setItems(observableListFim);
    }
    public void iniciar(){
        Filmes fir = new Filmes();
        Musica mr = new Musica();
        Usuario us = new Usuario();
        compara com = new compara();
        carregarFilme(fir.pegarFilmes());
        carregarMusica(mr.pegarMusicas());
        com.comparando(us);
        carregarUsuario(com.comparando(us));
    }
    public void sair(){
        Main.NavSc("1");
    }
}

