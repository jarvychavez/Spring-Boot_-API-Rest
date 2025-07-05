package med.voll.api.paciente;

public record DatosListaPaciente(Long id, String nombre, String email, String documentoIdentidad) {
    public DatosListaPaciente(med.voll.api.paciente.Paciente paciente) {
        this(paciente.getId(), paciente.getNombre(), paciente.getEmail(), paciente.getDocumento_identidad());
    }
}
