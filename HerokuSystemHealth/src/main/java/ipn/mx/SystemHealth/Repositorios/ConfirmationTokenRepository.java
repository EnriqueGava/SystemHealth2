package ipn.mx.SystemHealth.Repositorios;

import org.springframework.data.repository.CrudRepository;

import ipn.mx.SystemHealth.Model.confirmation;

public interface ConfirmationTokenRepository extends CrudRepository<confirmation, String> {
	confirmation findByConfirmation(String confirmation);
}
