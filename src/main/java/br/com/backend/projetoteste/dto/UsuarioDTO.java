package br.com.backend.projetoteste.dto;

import br.com.backend.projetoteste.entity.UsuarioEntity;
import org.springframework.beans.BeanUtils;

public class UsuarioDTO {
    private Long id;
    private String nome;
    private String login;
    private String senha;
    private String email;

    public UsuarioDTO(UsuarioEntity usuario){
        BeanUtils.copyProperties(usuario, this);
    }

    public UsuarioDTO(){

    }


    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }


}
