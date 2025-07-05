package med.voll.api.paciente;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<med.voll.api.paciente.Paciente, Long> {
    Page<med.voll.api.paciente.Paciente> findAllByActivoTrue(Pageable paginacion);
}
