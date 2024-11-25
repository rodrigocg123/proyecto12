package es.santander.ascender.proyecto09.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import es.santander.ascender.proyecto09.Solicitud;

@RestController
@RequestMapping("/solicitud")
public class SolicitudController {

    @PostMapping
    public long crear(Solicitud solicitud) {
        throw new UnsupportedOperationException("Pdte");
    }

    @GetMapping("/{id}")
    public Solicitud leer(@PathVariable("id") long id) {
        throw new UnsupportedOperationException("Pdte");
    }

    @GetMapping
    public List<Solicitud> listar() {
        throw new UnsupportedOperationException("Pdte");
    }

    @PutMapping
    public void modificar(Solicitud solicitud) {
        throw new UnsupportedOperationException("Pdte");
    }

    @DeleteMapping("/{id}")
    public void borrar(@PathVariable("id") long id) {
        throw new UnsupportedOperationException("Pdte");
    }
}
