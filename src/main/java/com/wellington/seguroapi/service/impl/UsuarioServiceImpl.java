package com.wellington.seguroapi.service.impl;

import com.wellington.seguroapi.domain.Usuario;
import com.wellington.seguroapi.dto.UsuarioDTO;
import com.wellington.seguroapi.mapper.UsuarioMapper;
import com.wellington.seguroapi.repository.UsuarioRepository;
import com.wellington.seguroapi.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioRepository repository;

    @Override
    public UsuarioDTO salvar(UsuarioDTO dto) {

        Usuario usuario = UsuarioMapper.toEntity(dto);

        usuario = repository.save(usuario);

        return UsuarioMapper.toDTO(usuario);
    }
}
