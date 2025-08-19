package forohub.api.topico;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@Table(name = "topicos")
@Entity(name = "Topico")
public class Topico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Boolean activo;
    private String titulo;
    private String mensaje;
    private LocalDate fechaDeCreacion;
    private String autor;
    private String curso;

    public Topico(DatosRegistroTopico datos) {
        this.id = null;
        this.activo = true;
        this.titulo = datos.titulo();
        this.mensaje = datos.mensaje();
        this.fechaDeCreacion = datos.fechaDeCreacion();
        this.autor = null;
        this.curso = datos.nombreCurso();
    }

    public void actualizarInformaciones(@Valid DatosActualizacionTopico datos) {
        if (datos.titulo() != null) {
            this.titulo = datos.titulo();
        }
        if (datos.mensaje() != null) {
            this.mensaje = datos.mensaje();
        }
        if (datos.curso() != null) {
            this.curso = datos.curso();
        }
    }

    public void eliminar() {
        this.activo = false;
    }
}
