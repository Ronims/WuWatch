package sample;

import Data.Repo;
import Data.SalvaArquivo;
import sample.Musica;
import sample.Filmes;
import java.io.IOException;

public class controladorRepo{

        public Repo rep = new Repo();
        public SalvaArquivo sa = new SalvaArquivo();
        public Musica m = new Musica();//buffer
        public Filmes f= new Filmes();//buffer

        public void cadastrarMusica(Musica m){
            rep.getDadosMusica().add(m);
        }
         public void cadastrarFilme(Filmes f){
            rep.getDadosFilme().add(f);
        }

       public void salvarTudo (Repo rep) throws IOException {
            sa.setBufferData(rep);
            sa.saveData("teste.txt");
        }

        public void carregarTudo(String file){
            sa.loadData("teste.txt");
        }





}
