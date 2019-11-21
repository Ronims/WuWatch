package sample;



import java.util.ArrayList;
import java.util.Objects;

public class Usuario {
    private String nome;
    private int Id;
    private String sen;
    public  ArrayList<Musica> like = new ArrayList<>();
public void curtidas(Musica n) {
    like.add(n);
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

    public void setId(int id) {
        Id = id;
    }

    public void setSen(String sen) {
        this.sen = sen;
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return Id;
    }

    public String getSen() {
        return sen;
    }

    public Usuario(String nome, int id, String sen) {
        this.nome = nome;
        Id = id;
        this.sen = sen;
    }

}
