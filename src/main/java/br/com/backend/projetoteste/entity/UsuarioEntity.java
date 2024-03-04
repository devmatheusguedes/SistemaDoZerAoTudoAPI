package br.com.backend.projetoteste.entity;

import br.com.backend.projetoteste.dto.UsuarioDTO;
import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.beans.BeanUtils;

import java.util.Objects;

@Entity
@Table(name = "NPL_USUARIO")
public class UsuarioEntity {
    @Id // identifica o id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // incrementa o id automaticamente
    @Column(nullable = false)
    private Long id;
    @Column(nullable = false) // o campo não pode ser nulo
    private String nome;
    @Column(nullable = false, unique = true)// o campo não pode ser nulo e tem que ser unico
    private String login;
    @Column(nullable = false)
    private String senha;
    @Column(nullable = false)
    private String email;

    public UsuarioEntity(UsuarioDTO usuarioDTO){
        BeanUtils.copyProperties(usuarioDTO, this);
    }
    public UsuarioEntity(){

    }

    public void setSenha(String senha){
        this.senha = senha;
    }
    public void setId(Long id){
        this.id = id;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setLogin(String login){
        this.login = login;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public Long getId(){
        return this.id;
    }

    public String getSenha(){
        return this.senha;
    }

    public String getNome(){
       return this.nome;
    }

    public String getLogin(){
        return this.login;
    }

    public String getEmail(){
        return this.email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsuarioEntity that = (UsuarioEntity) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
