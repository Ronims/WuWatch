package sample;

import org.jetbrains.annotations.Contract;

import java.io.Serializable;
import java.util.ArrayList;

public class Filmes implements Serializable {
    public String nome;
    public boolean acao;
    public boolean aventura;
    public boolean drama;
    public boolean historico;
    public boolean romance;
    public boolean cientifico;
    public boolean documentario;
    public boolean comedia;
    public boolean pretobranco;
    public static ArrayList<Filmes> Movie = new ArrayList<>();
    public void adicionaFilme(Filmes movi){
        System.out.print("\n"+ movi.nome +"\n");
        Movie.add(movi);
    }

    @Contract(pure = true)
    public ArrayList<Filmes> pegarFilmes(){
        return(Movie);
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Contract(pure = true)
    public static ArrayList<Filmes> getMovie() {
        return Movie;
    }

    public static void setMovie(ArrayList<Filmes> movie) {
        Movie = movie;
    }

    public boolean isAcao() {
        return acao;
    }

    public void setAcao(boolean acao) {
        this.acao = acao;
    }

    public boolean isAventura() {
        return aventura;
    }

    public void setAventura(boolean aventura) {
        this.aventura = aventura;
    }

    public boolean isDrama() {
        return drama;
    }

    public void setDrama(boolean drama) {
        this.drama = drama;
    }

    public boolean isHistorico() {
        return historico;
    }

    public void setHistorico(boolean historico) {
        this.historico = historico;
    }

    public boolean isRomance() {
        return romance;
    }

    public void setRomance(boolean romance) {
        this.romance = romance;
    }

    public boolean isCientifico() {
        return cientifico;
    }

    public void setCientifico(boolean cientifico) {
        this.cientifico = cientifico;
    }

    public boolean isDocumentario() {
        return documentario;
    }

    public void setDocumentario(boolean documentario) {
        this.documentario = documentario;
    }

    public boolean isComedia() {
        return comedia;
    }

    public void setComedia(boolean comedia) {
        this.comedia = comedia;
    }

    public boolean isPretobranco() {
        return pretobranco;
    }

    public void setPretobranco(boolean pretobranco) {
        this.pretobranco = pretobranco;
    }

}
