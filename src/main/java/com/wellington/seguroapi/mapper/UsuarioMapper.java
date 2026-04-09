package com.wellington.seguroapi.mapper;

import com.wellington.seguroapi.domain.Usuario;
import com.wellington.seguroapi.dto.UsuarioDTO;

public class UsuarioMapper {

    public static Usuario toEntity(UsuarioDTO dto) {
        Usuario usuario = new Usuario();
        usuario.setId(dto.getId());
        usuario.setNome(dto.getNome());
        usuario.setEmail(dto.getEmail());
        usuario.setDataCadastro(dto.getDataCadastro());
        return usuario;
    }

    public static UsuarioDTO toDTO(Usuario usuario) {
        UsuarioDTO dto = new UsuarioDTO();
        dto.setId(usuario.getId());
        dto.setNome(usuario.getNome());
        dto.setEmail(usuario.getEmail());
        dto.setDataCadastro(usuario.getDataCadastro());
        return dto;
    }
}
