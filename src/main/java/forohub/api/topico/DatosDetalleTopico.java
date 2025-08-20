package forohub.api.topico;

import java.time.LocalDate;

public record DatosDetalleTopico(
        Long id,
        String titulo,
        String mensaje,
        LocalDate fechaDeCreacion,
        String autor,
        String nombreCurso
) {
    public DatosDetalleTopico(Topico topico) {
        this(topico.getId(), topico.getTitulo(), topico.getMensaje(), topico.getFechaDeCreacion(), topico.getAutor(), topico.getCurso());
    }
}
