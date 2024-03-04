package br.com.backend.projetoteste.controller;

import br.com.backend.projetoteste.dto.UsuarioDTO;
import br.com.backend.projetoteste.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;
    @GetMapping
    public List<UsuarioDTO> listarTodos(){
        return usuarioService.ListarTodos();
    }

    @PostMapping
    public void inserir(@RequestBody UsuarioDTO usuarioDTO){
        usuarioService.inserir(usuarioDTO);
    }

    @PutMapping
    public UsuarioDTO alterar(@RequestBody UsuarioDTO usuarioDTO){
        return usuarioService.alterar(usuarioDTO);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable("id") Long id){
        usuarioService.excluir(id);
    }

}
