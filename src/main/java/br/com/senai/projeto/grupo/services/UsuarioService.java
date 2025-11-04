package br.com.senai.projeto.grupo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senai.projeto.grupo.models.Usuario;
import br.com.senai.projeto.grupo.repositories.UsuarioRepository;

@Service
public class UsuarioService {
    @Autowired
    public UsuarioRepository usuarioRepository;

    public Long count(){
        return usuarioRepository.count();
    }

    public Usuario salvar(Usuario usuario, String confSenha){
        if(usuario.getSenha().equals(confSenha)) {
            return usuarioRepository.save(usuario);
        }
        return null;
    }
}
