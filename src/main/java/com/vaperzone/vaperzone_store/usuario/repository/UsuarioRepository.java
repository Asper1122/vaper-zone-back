package com.vaperzone.vaperzone_store.usuario.repository;

import com.vaperzone.vaperzone_store.usuario.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UsuarioRepository extends JpaRepository<Usuario, UUID> {
}
