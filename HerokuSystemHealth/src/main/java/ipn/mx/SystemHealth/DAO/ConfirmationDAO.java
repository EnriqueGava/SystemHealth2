package ipn.mx.SystemHealth.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import ipn.mx.SystemHealth.Model.cantidades;
import ipn.mx.SystemHealth.Model.confirmation;
import ipn.mx.SystemHealth.Model.paciente;
import ipn.mx.SystemHealth.Repositorios.IConfirmationRepo;

public class ConfirmationDAO 
{
	@Autowired
	private IConfirmationRepo repo;
	public List<confirmation> listarConfirmation()
	{
		return repo.findAll();
	}
	
	public confirmation getConfirmation(int id)
	{
		return repo.getOne(id);
	}
	
	public void addConfirmation(confirmation pac)
	{
		repo.save(pac);
	}
	
	public void deleteConfirmation(int id)
	{
		repo.deleteById(id);
	}

}
