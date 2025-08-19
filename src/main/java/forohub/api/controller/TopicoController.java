package forohub.api.controller;

import forohub.api.topico.DatosRegistroTopico;
import forohub.api.topico.Topico;
import forohub.api.topico.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/topicos")
public class TopicoController {
    @Autowired
    private TopicoRepository repository;
    @PostMapping
    public void registrar(@RequestBody DatosRegistroTopico datos) {
        repository.save(new Topico(datos));
    }
}
