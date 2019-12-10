package sample;

import java.io.Serializable;
import java.util.ArrayList;

public class Filme implements Serializable {
    private String nome;
    private boolean acao;
    private boolean aventura;
    private boolean drama;
    private boolean historico;
    private boolean romance;
    private boolean cientifico;
    private boolean documentario;
    private boolean comedia;
    private boolean pretobranco;
    public static ArrayList<Filme> Movie = new ArrayList<>();

    private void adicionaFilme(String nom, boolean ac, boolean av,boolean dr, boolean hi, boolean ro, boolean ci, boolean doc, boolean com, boolean pret){
        Filme fil = new Filme();
        fil.nome = nom;
        fil.acao = ac;
        fil.aventura = av;
        fil.cientifico = ci;
        fil.comedia = com;
        fil.documentario = doc;
        fil.drama = dr;
        fil.historico = hi;
        fil.romance = ro;
        fil.pretobranco = pret;
        Movie.add(fil);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static ArrayList<Filme> getMovie() {
        return Movie;
    }

    public static void setMovie(ArrayList<Filme> movie) {
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
