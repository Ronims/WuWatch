package sample;

import java.util.Objects;

public class Perfil {
    private String nome;
    private int Id;
    private String senha;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Perfil perfil = (Perfil) o;
        return Id == perfil.Id &&
                nome.equals(perfil.nome) &&
                senha.equals(perfil.senha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, Id, senha);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return Id;
    }

    public String getSenha() {
        return senha;
    }

    public Perfil(String nome, int id, String senha) {
        this.nome = nome;
        Id = id;
        this.senha = senha;
    }
}
