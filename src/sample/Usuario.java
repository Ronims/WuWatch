package sample;



import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

public class Usuario implements Serializable {
    public String nome;
    public String Id;
    public String sen;//senha
    public  ArrayList<Musica> like = new ArrayList<>();
    public  ArrayList<Filmes> movie = new ArrayList<>();
    public  ArrayList<Usuario> userFriends = new ArrayList<>();
    public static int rk,pp,rp,ie,mb,eo,hl,hp;//lista de generos q o usuario gosta, toda musica q chegar no like do usuario vai ser comparada, se for true vai encrementando e depois adicionando o usuario no arraylist de usuarios
    public  ArrayList<Usuario> getUser() {
        return userFriends;
    }

    public void setUser(ArrayList<Usuario> user) {
        this.userFriends = user;
    }

    public static ArrayList<Usuario> usu = new ArrayList<>();
public void curtidas(Musica n) {
    like.add(n);
}

    public static void adicionarUsuario(Usuario usario){

    ArrayList<Musica> ar =usario.like;
        for(Musica m : ar){
            if (m.rock){
                usario.rk++;
            }
            if (m.pop){
                usario.pp++;
            }
            if (m.rap){
                usario.rp++;
            }
            if (m.indie){
                usario.ie++;
            }
            if (m.mpb){
                usario.mb++;
            }
            if (m.emo){
                usario.eo++;
            }
            if (m.heavymetal){
                usario.hl++;
            }
            if (m.hiphop){
                usario.hp++;
            }
        }

    usu.add(usario);
}
    public boolean comparaLogin(String log, String pass){

    for(Usuario io : usu) {
        if (log.equalsIgnoreCase(io.nome)) {
            if(pass.equalsIgnoreCase(io.sen)){
                return true;
            }
            return false;
        }
    }
        return false;
}
    public static void gostos(){
    Usuario ar = new Usuario();

    }
 @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario perfil = (Usuario) o;
        return Id == perfil.Id &&
                nome.equals(perfil.nome) &&
                sen.equals(perfil.sen);
    }
    public int hashCode() {
        return Objects.hash(nome, Id, sen);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }



    public void setSen(String sen) {
        this.sen = sen;
    }

    public String getNome() {
        return nome;
    }



    public String getSen() {
        return sen;
    }
    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }
}
