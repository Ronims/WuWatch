package Data;

import sample.Filmes;
import sample.Musica;
import sample.Usuario;

import java.io.Serializable;
import java.util.ArrayList;


public  class Repo implements Serializable {
    private  ArrayList<Filmes> DadosFilme= new ArrayList<Filmes>();
    private  ArrayList<Musica> DadosMusica= new ArrayList<Musica>();
    private   ArrayList<Usuario> DadosUsuario= new ArrayList<Usuario>();

    public ArrayList<Filmes> getDadosFilme() {
        return DadosFilme;
    }

    public void setDadosFilme(ArrayList<Filmes> dadosFilme) {
        DadosFilme = dadosFilme;
    }

    public ArrayList<Musica> getDadosMusica() {
        return DadosMusica;
    }

    public void setDadosMusica(ArrayList<Musica> dadosMusica) {
        DadosMusica = dadosMusica;
    }

    public ArrayList<Usuario> getDadosUsuario() {
        return DadosUsuario;
    }

    public void setDadosUsuario(ArrayList<Usuario> dadosUsuario) {
        DadosUsuario = dadosUsuario;
    }



    public  void adcionarGente(Usuario g){
        this.DadosUsuario.add(g);
    }
    public  Usuario buscarGente(Usuario g){
        int i;

        try{
            for(i=0;i<DadosUsuario.size();i++) {
                if (g.getNome().equals(getDadosUsuario( ).get(i).getNome())) {
                    System.out.println("Usuario encontrada");
                } else {
                    System.out.println("Usuario não encontrada");
                    return null;
                }
            }
        }catch(Exception e){
            System.out.println("Erro: Um erro inesperado ocorreu. ");
            return null;
        }
        return g;
    }
    public void removerGente(Usuario g){
        int i;
        try{
            Usuario usuario = buscarGente(g);
            if(usuario!=null){
                this.DadosUsuario.remove(g);
            }
        }catch(Exception e){

        }
    }
    
    public  void adcionarMusica(Musica m){
        this.DadosMusica.add(m);
    }
    public  Musica buscarMusica(Musica m){
        int i;

        try{
            for(i=0;i<DadosMusica.size();i++) {
                if (m.getNomeM().equals(getDadosMusica( ).get(i).getNomeM())) {
                    System.out.println("Musica encontrada");
                } else {
                    System.out.println("Música não encontrada");
                    return null;
                }
            }
        }catch(Exception e){
            System.out.println("Erro: Um erro inesperado ocorreu. ");
            return null;
        }
        return m;
    }
    public void removerMusica(Musica m){
        int i;
        try{
            Musica musica = buscarMusica(m);
            if(musica!=null){
                this.DadosMusica.remove(m);
            }
        }catch(Exception e){

        }
    }


    public  void adcionarFilme(Filmes f){
        this.DadosFilme.add(f);
    }
    public Filmes buscarFilme(Filmes f){
        int i;

        try{
            for(i=0;i<DadosFilme.size();i++) {
                if (f.getNome().equals(getDadosFilme().get(i).getNome())) {
                    System.out.println("Filmes encontrada");
                } else {
                    System.out.println("Filmes não encontrada");
                    return null;
                }
            }
        }catch(Exception e){
            System.out.println("Erro: Um erro inesperado ocorreu. ");
            return null;
        }
        return f;
    }
    public void removerFilme(Filmes f){
        int i;
        try{
            Filmes filme = buscarFilme(f);
            if(filme!=null){
                this.DadosFilme.remove(f);
            }
        }catch(Exception e){

        }
    }


    public Repo(Repo repo) {
    }
    public Repo(){

    }



}

