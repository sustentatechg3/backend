package com.generation.sustentatech.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.sustentatech.model.Produto;
import com.generation.sustentatech.model.Usuario;

public interface UsuarioRepository  extends JpaRepository<Usuario, Long>{

	public Optional<Usuario> findByUsuario(String usuario);
}
