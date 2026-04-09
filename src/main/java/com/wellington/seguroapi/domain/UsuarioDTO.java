package com.wellington.seguroapi.dto;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Getter
@Setter
public class UsuarioDTO {

    private Long id;
    private String nome;
    private String email;
    private LocalDateTime dataCadastro;

}
