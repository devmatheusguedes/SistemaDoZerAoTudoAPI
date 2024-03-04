package br.com.backend.projetoteste.service;

import br.com.backend.projetoteste.dto.UsuarioDTO;
import br.com.backend.projetoteste.entity.UsuarioEntity;
import br.com.backend.projetoteste.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Locale;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<UsuarioDTO> ListarTodos(){
        List<UsuarioEntity> usuarios = usuarioRepository.findAll();
        System.out.println("Usuarios antes da conversao: " + usuarios);
        List<UsuarioDTO> usuariosDto = usuarios.stream().map(UsuarioDTO::new).toList();
        System.out.println("Usuarios depois da conversao: " + usuariosDto);
        return usuariosDto;}

    public void inserir(UsuarioDTO usuarioDTO){
        UsuarioEntity usuarioEntity = new UsuarioEntity(usuarioDTO); // inserindo na tabela
        usuarioRepository.save(usuarioEntity);
    }

    public UsuarioDTO alterar(UsuarioDTO usuarioDTO){
        UsuarioEntity usuarioEntity = new UsuarioEntity(usuarioDTO);
        return new UsuarioDTO(usuarioRepository.save(usuarioEntity));

    }

    public void excluir(Long id){

        UsuarioEntity usuarioEntity = usuarioRepository.findById(id).get();

    }

    public UsuarioDTO buscarPorId(Long id){

        return new UsuarioDTO(usuarioRepository.findById(id).get());
    }




}
