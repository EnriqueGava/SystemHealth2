package ipn.mx.SystemHealth.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.Optional;
import ipn.mx.SystemHealth.Model.doctor;

public interface IDoctorRepo extends JpaRepository<doctor, Integer>
{
	Optional<doctor> findAllByIdUsuario(String id);
	
}
