package Data;import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.ArrayList;

import Data.Repo;
import sample.Filmes;

import java.io.ObjectOutputStream;
import java.util.List;

public class SalvaArquivo implements Serializable {


        public Repo bufferData=new Repo();

    public Repo getBufferData() {
        return bufferData;
    }

    public void setBufferData(Repo bufferData) {
        this.bufferData = bufferData;
    }
    //para testar tu vai ter que chamar o metodo de salvar e colocar como parametro o nome do arquivo .txt
        // exemplo: "teste.txt"
        //obviamente para funcionar é bom preencher algum arraylist antes(usando a CRUD da classe Repo)
        //é bom refatorar depois a classe Repo e renomear para Repositorio

        public void saveData(String file) throws IOException {
            File archive = new File(file);
            FileOutputStream fos = new FileOutputStream(archive);
            ObjectOutputStream ous = new ObjectOutputStream(fos);
            ous.writeObject(file);
            ous.close();
        }
        //métodos de load de arquivos
        // ass. Darllan

        //aqui ele lê o arquivo e joga dentro de um buffer
        // o buffer é a própria classe
        //Então quando tu chamar o método, ele vai retornar ums instancia inteira do repositorio
        //contendo tanto as listas de filmes quanto de musicas etc.
        // provavelmente vai ser assim:
        //Repositorio r= new Repositorio(); --> esse é o que tá rodando em memória
        //SalvaArquivo s = new SalvaArquivo(); --> aqui vai ter o buffer que é responsavel por ler e salvar os arquivos
        //s.loadData("nome do arquivo.txt");
        //r = s; --> versão resumida kkkk
        public Repo loadData(String file){
            File arquivo = new File(file);
            FileInputStream fis;
            ObjectInputStream ois;
            try {
                fis = new FileInputStream(arquivo);

                try {
                    ois = new ObjectInputStream(fis);
                    this.bufferData = (Repo) ois.readObject();
                    return bufferData;
                } catch (IOException | ClassNotFoundException ex) {
                    this.bufferData = new Repo();
                    return bufferData;
                }
            } catch (FileNotFoundException ex) {
                this.bufferData = new Repo();
                return bufferData;
            }

        }







}
