package sample;



import java.util.ArrayList;
import java.util.Objects;

public class Usuario{
    public String nome;
    public String Id;
    public String sen;//senha
    public  ArrayList<Musica> like = new ArrayList<>();
    public  ArrayList<Filmes> movie = new ArrayList<>();
    public  ArrayList<Usuario> userFriends = new ArrayList<>();
    public static int rk,pp,rp,ie,mb,eo,hl,hp;
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
    gostos();
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
     for(Musica m : ar.like){
         if (m.rock){
             rk++;
         }
         if (m.pop){
             pp++;
         }
         if (m.rap){
             rp++;
         }
         if (m.indie){
             ie++;
         }
         if (m.mpb){
             mb++;
         }
         if (m.emo){
             eo++;
         }
         if (m.heavymetal){
             hl++;
         }
         if (m.hiphop){
             hp++;
         }
     }
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
