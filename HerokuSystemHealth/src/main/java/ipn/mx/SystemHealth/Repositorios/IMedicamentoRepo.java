package ipn.mx.SystemHealth.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import ipn.mx.SystemHealth.Model.medicamento;

public interface IMedicamentoRepo extends JpaRepository<medicamento, Integer>
{

}
