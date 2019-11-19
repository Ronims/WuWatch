package sample;

import java.util.ArrayList;

public class Musica {
    public String nome;
    public boolean rock;
    public boolean pop;
    public boolean rap;
    public boolean kpop;
    public boolean jpop;
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

    private void adicionarmusicas(String nom, boolean r, boolean p, boolean j, boolean h, boolean i, boolean e, boolean o, boolean a, boolean k){
        Musica M = new Musica();
        M.nome = nom;
        M.heavymetal = h;
        M.emo = e;
        M.rap = r;
        M.kpop = k;
        M.jpop = j;
        M.indie = i;
        Mu.add(M);
    }
    private void adicionando(){


        adicionarmusicas("Eminem - Loseyourself",false,false,false,false,true,true,false,true,false);
        adicionarmusicas("Linkin Park - In the End",true,false,false,false,true,false,false,true,false);
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

    public boolean getJpop() {
        return jpop;
    }

    public void setJpop(boolean jpop) {
        this.jpop = jpop;
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
