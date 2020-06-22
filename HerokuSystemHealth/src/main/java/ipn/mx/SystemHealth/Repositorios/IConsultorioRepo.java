package ipn.mx.SystemHealth.Repositorios;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import ipn.mx.SystemHealth.Model.consultorio;

public interface IConsultorioRepo extends JpaRepository<consultorio, Integer>
{
	Optional<consultorio> findAllByIdDoctor(int id);
}
