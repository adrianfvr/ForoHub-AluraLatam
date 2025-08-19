package forohub.api.controller;

import forohub.api.topico.DatosRegistroTopico;
import forohub.api.topico.Topico;
import forohub.api.topico.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/topicos1")
public class TopicoController {
    @Autowired
    private TopicoRepository repository;
    @Transactional
    @PostMapping
    public void registrar(@RequestBody DatosRegistroTopico datos) {
        repository.save(new Topico(datos));
    }
}
