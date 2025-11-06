package br.com.senai.projeto.grupo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senai.projeto.grupo.models.Usuario;
import br.com.senai.projeto.grupo.repositories.UsuarioRepository;

@Service
public class UsuarioService {
    @Autowired
    public UsuarioRepository usuarioRepository;

    public Usuario salvar(Usuario usuario, String confSenha){
        if(usuario.getSenha().equals(confSenha)) {
            return usuarioRepository.save(usuario);
        }
        return null;

        
    }
    public Long count(){
        return usuarioRepository.count();
    }

    public boolean delete(Integer id) {
        Usuario usuario = usuarioRepository.findById(id).get();
        if(usuario != null){
            usuarioRepository.deleteById(id);
            return true;
        }
        return false; 
    }

    public String login(String email, String senha){
        Usuario usuario = usuarioRepository.findByEmail(email);
        if(usuario != null && senha.equals(usuario.getSenha())){
            return "Login efetuado com sucesso";
        }
        return "Falha ao realizar login";
    }
    
}
