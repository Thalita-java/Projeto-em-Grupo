package br.com.senai.projeto.grupo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.senai.projeto.grupo.models.Usuario;
import br.com.senai.projeto.grupo.services.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    public UsuarioService usuarioService;

    @PostMapping("/salvar")
    public Usuario salvar(@RequestBody Usuario usuario, @RequestParam String confSenha){
        return usuarioService.salvar(usuario, confSenha);

    }
}