package ipn.mx.SystemHealth.Repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ipn.mx.SystemHealth.Model.municipio;

public interface IMunicipioRepo extends JpaRepository<municipio, Integer>
{
List<municipio> findAllByCveEnt(String cve);
}
