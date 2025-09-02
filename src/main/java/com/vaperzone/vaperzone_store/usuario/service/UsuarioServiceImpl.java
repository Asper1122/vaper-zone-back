package com.vaperzone.vaperzone_store.usuario.service;

import com.vaperzone.vaperzone_store.usuario.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class UsuarioServiceImpl implements UsuarioService{

    private final UsuarioRepository usuarioRepository;
}
