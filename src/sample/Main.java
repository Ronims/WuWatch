package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    private static Stage stage;
    private static Scene Navegar;
    private static Scene Cadas;
    private static Scene Fil;
    private static Scene Mu;
    private static Scene pl;
    private static Scene log;

   // @Override
   // public void start(Stage primaryStage) throws Exception{
     //   Parent root = FXMLLoader.load(getClass().getResource("Nave.fxml"));
     //   primaryStage.setScene(new Scene(root, 300, 275));
     //   primaryStage.show();
    //}
   @Override
    public void start(Stage primaryStage) throws Exception{
        stage = primaryStage;
        primaryStage.setTitle("WuWatch");
        Parent fxNavegar = FXMLLoader.load(getClass().getResource("Nave.fxml"));
        Navegar=new Scene(fxNavegar, 900, 500);
        Parent fxmlCad = FXMLLoader.load(getClass().getResource("Cadastro.fxml"));
        Cadas=new Scene(fxmlCad, 800, 400);
        Parent fxmlFil = FXMLLoader.load(getClass().getResource("Adicionarfilme.fxml"));
        Fil=new Scene(fxmlFil, 800, 400);
        Parent fxmlMu = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Mu=new Scene(fxmlMu, 800, 400);
       Parent fxmlPl = FXMLLoader.load(getClass().getResource("Principal.fxml"));
       pl=new Scene(fxmlPl, 800, 400);
       Parent fxmlLog = FXMLLoader.load(getClass().getResource("Login.fxml"));
       log=new Scene(fxmlLog, 800, 400);




        primaryStage.setScene(Navegar);
        primaryStage.show();
    }
        CadastroPerfil cad = new CadastroPerfil();
    public static void NavSc(String scr){
        switch (scr) {
            case("1"):
                stage.setScene(Navegar);
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
