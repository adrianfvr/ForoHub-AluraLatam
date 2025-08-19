package forohub.api.topico;

public record DatosListaTopico(
        Long id,
        String titulo,
        String mensaje,
        String fechaDeCreacion
) {
    public DatosListaTopico(Topico topico) {
        this(topico.getId(), topico.getTitulo(), topico.getMensaje(), topico.getFechaDeCreacion());
    }
}
