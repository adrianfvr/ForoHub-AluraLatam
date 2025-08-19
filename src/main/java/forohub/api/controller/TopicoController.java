package forohub.api.controller;

import forohub.api.topico.*;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/topicos")
public class TopicoController {
    @Autowired
    private TopicoRepository repository;
    @Transactional
    @PostMapping
    public void registrar(@RequestBody @Valid DatosRegistroTopico datos) {
        repository.save(new Topico(datos));
    }

    @GetMapping
    public Page<DatosListaTopico> listar(@PageableDefault(size = 10, sort = {"titulo"}) Pageable paginacion) {
        return repository.findAllByActivoTrue(paginacion).map(DatosListaTopico::new);
    }

    @Transactional
    @PutMapping
    public void actualizar(@RequestBody @Valid DatosActualizacionTopico datos) {
        var medico = repository.getReferenceById(datos.id());
        medico.actualizarInformaciones(datos);
    }

    @Transactional
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        var medico = repository.getReferenceById(id);
        medico.eliminar();
    }
}
