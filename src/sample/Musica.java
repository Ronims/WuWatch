package sample;

import org.jetbrains.annotations.Contract;

import java.io.Serializable;
import java.util.ArrayList;

public class Musica  implements Serializable {
    public static String nome;
    public boolean rock;
    public boolean pop;
    public boolean rap;
    public boolean kpop;
    public boolean mpb;
    public boolean indie;
    public boolean heavymetal;
    public boolean emo;
    public boolean hiphop;
    public static ArrayList<Musica> Mu = new ArrayList<>();

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public static void adicionarmusicas(Musica n){
        Mu.add(n);
    }
    @Contract(pure = true)
    public static ArrayList<Musica> pegarMusicas(){

        return(Mu);
    }

    public boolean getRock() {
        return rock;
    }

    public void setRock(boolean rock) {
        this.rock = rock;
    }

    public boolean getPop() {
        return pop;
    }

    public void setPop(boolean pop) {
        this.pop = pop;
    }

    public boolean getRap() {
        return rap;
    }

    public void setRap(boolean rap) {
        this.rap = rap;
    }

    public boolean getKpop() {
        return kpop;
    }

    public void setKpop(boolean kpop) {
        this.kpop = kpop;
    }

    public boolean getmpb() {
        return mpb;
    }

    public void setmpb(boolean mpb) {
        this.mpb = mpb;
    }

    public boolean getIndie() {
        return indie;
    }

    public void setIndie(boolean indie) {
        this.indie = indie;
    }

    public boolean getHeavymetal() {
        return heavymetal;
    }

    public void setHeavymetal(boolean heavymetal) {
        this.heavymetal = heavymetal;
    }

    public boolean getEmo() {
        return emo;
    }

    public void setEmo(boolean emo) {
        this.emo = emo;
    }

    public boolean getHiphop() {
        return hiphop;
    }

    public void setHiphop(boolean hiphop) {
        this.hiphop = hiphop;
    }

}
