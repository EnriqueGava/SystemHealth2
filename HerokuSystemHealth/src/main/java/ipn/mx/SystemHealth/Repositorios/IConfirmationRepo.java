package ipn.mx.SystemHealth.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import ipn.mx.SystemHealth.Model.confirmation;

public interface IConfirmationRepo extends JpaRepository<confirmation, Integer>
{

}
