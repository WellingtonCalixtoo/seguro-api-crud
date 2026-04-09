package com.wellington.seguroapi.controller;

import com.wellington.seguroapi.dto.UsuarioDTO;
import com.wellington.seguroapi.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioService service;

    @PostMapping
    public UsuarioDTO salvar(@RequestBody UsuarioDTO dto) {
        return service.salvar(dto);
    }

    @GetMapping
    public List<UsuarioDTO> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public UsuarioDTO buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}