package com.wellington.seguroapi.service;

import com.wellington.seguroapi.dto.UsuarioDTO;
import java.util.List;

public interface UsuarioService {

    UsuarioDTO salvar(UsuarioDTO dto);

    UsuarioDTO buscarPorId(Long id);

    List<UsuarioDTO> listar();

    void deletar(Long id);
}
