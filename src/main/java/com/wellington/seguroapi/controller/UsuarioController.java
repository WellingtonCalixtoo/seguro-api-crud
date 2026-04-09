package com.wellington.seguroapi.controller;

import com.wellington.seguroapi.dto.UsuarioDTO;
import com.wellington.seguroapi.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioService service;

    @PostMapping
    public UsuarioDTO salvar(@RequestBody UsuarioDTO dto) {
        return service.salvar(dto);
    }
}
