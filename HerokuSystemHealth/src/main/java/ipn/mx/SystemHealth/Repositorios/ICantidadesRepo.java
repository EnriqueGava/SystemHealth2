package ipn.mx.SystemHealth.Repositorios;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import ipn.mx.SystemHealth.Model.cantidades;

public interface ICantidadesRepo extends JpaRepository<cantidades, Integer>
{
	List<cantidades> findAllByIdCantidades(int id);
}
