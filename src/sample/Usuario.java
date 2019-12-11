package sample;



import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

public class Usuario{
    public String nome;
    public String Id;
    public String sen;//senha
    public  ArrayList<Musica> like = new ArrayList<>();
    public  ArrayList<Filme> movie = new ArrayList<>();
    public static ArrayList<Usuario> usu = new ArrayList<>();
public void curtidas(Musica n) {
    like.add(n);
}

    public static void adicionarUsuario(Usuario usario){

    usu.add(usario);
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
