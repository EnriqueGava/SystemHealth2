package ipn.mx.SystemHealth.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import ipn.mx.SystemHealth.Model.entidad;

public interface IEntidadRepo extends JpaRepository<entidad, String>
{

}
