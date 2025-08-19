package forohub.api.topico;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosRegistroTopico(
        String idUsuario,
        @NotBlank String mensaje,
        String nombreCurso,
        @NotNull @NotBlank String titulo
) {
}
