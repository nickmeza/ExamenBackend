package pe.edu.upeu.academico.services;

import java.util.List;

import pe.edu.upeu.academico.entity.Usuario;

public interface IUsuarioService {
	public Usuario findByUsername(String username);
}
