package forohub.api.domain.topico;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record DatosRegistroTopico(
        String idUsuario,
        @NotBlank String mensaje,
        String nombreCurso,
        @NotNull @NotBlank String titulo,
        String autor,
        LocalDate fechaDeCreacion
        ) {
}
