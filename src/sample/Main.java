package sample;

import controladores.CadastroPerfil;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    private static Stage stage;
    private static Scene navegar;
    private static Scene Cadas;
    private static Scene Fil;
    private static Scene Mu;
    private static Scene pl;
    private static Scene log;

   // @Override
   // public void start(Stage primaryStage) throws Exception{
     //   Parent root = FXMLLoader.load(getClass().getResource("Navegation.fxml"));
     //   primaryStage.setScene(new Scene(root, 300, 275));
     //   primaryStage.show();
    //}
   @Override
    public void start(Stage primaryStage) throws Exception{
        stage = primaryStage;
        primaryStage.setTitle("WuWatch");
        Parent fxNa = FXMLLoader.load(getClass().getResource("../cenas/Navegation.fxml"));
        navegar = new Scene(fxNa, 900, 500);
        Parent fxmlCad = FXMLLoader.load(getClass().getResource("../cenas/Cadastro.fxml"));
        Cadas=new Scene(fxmlCad, 800, 400);
        Parent fxmlFil = FXMLLoader.load(getClass().getResource("../cenas/Adicionarfilme.fxml"));
        Fil=new Scene(fxmlFil, 800, 400);
        Parent fxmlMu = FXMLLoader.load(getClass().getResource("../cenas/sample.fxml"));
        Mu=new Scene(fxmlMu, 800, 400);
        Parent fxPrincipal = FXMLLoader.load(getClass().getResource("../cenas/Principal.fxml"));
        pl=new Scene(fxPrincipal, 800, 400);
        Parent fxLog = FXMLLoader.load(getClass().getResource("../cenas/Login.fxml"));
        log=new Scene(fxLog, 800, 400);




        primaryStage.setScene(navegar);
        primaryStage.show();
    }
        CadastroPerfil cad = new CadastroPerfil();
    public static void NavSc(String scr){
        switch (scr) {
            case("1"):
                stage.setScene(navegar);
                break;
            case("2"):
                stage.setScene(Cadas);
                break;
            case("3"):
                stage.setScene(Mu);
                break;
            case("4"):
                stage.setScene(Fil);
                break;
            case("5"):
                stage.setScene(pl);
                break;
            case("6"):
                stage.setScene(log);
                break;
            }


    }


    public static void main(String[] args) {
        launch(args);
    }
}
