package med.voll.api.domain.medico;

import jakarta.validation.constraints.NotNull;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDateTime;


public interface MedicoRepository extends JpaRepository<Medico, Long> {


    Page<Medico> findAllByActivoTrue(Pageable paginacion);

    @Query("""
            select m from Medico m
            where
            m.activo = 1
            and
            m.especialidad = :especialidad
            and m.id not in(
               select c.medico.id from Consulta c
               where
               c.fecha = :fecha
            )
            order by rand()
            limit 1
            """)
    Medico elegirMedicoAleatorioDisponibleEnLaFecha(Especialidad especialidad, LocalDateTime fecha);

    @Query("""
            select m.activo
            from Medico m
            where
            m.id = :idMedico
            """)
    boolean findActivoById(Long idMedico);
}


// javier chavez cordova

//El sistema debe tener una funcionalidad que permita el cancelamento de consultas, en la cual deberán llenarse las siguientes informaciones:
//●     Consulta
//●     Motivo del cancelamiento
//Las siguientes reglas de negocio deben ser validadas por el sistema:
//●     Es obligatorio informar el motivo del cancelamiento de la consulta, dentro de las siguientes opciones: paciente desistió, médico canceló u otros;
//●     Una consulta solamente podrá ser cancelada con antecipación mínima de 24 horas.
