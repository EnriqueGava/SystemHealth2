package ipn.mx.SystemHealth.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ipn.mx.SystemHealth.Model.cantidades;
import ipn.mx.SystemHealth.Model.municipio;
import ipn.mx.SystemHealth.Model.paciente;
import ipn.mx.SystemHealth.Repositorios.ICantidadesRepo;
import ipn.mx.SystemHealth.Repositorios.IMunicipioRepo;
@Service
public class MunicipioDAO 
{
	@Autowired
	private IMunicipioRepo repo;
	public List<municipio> listarMunicipios()
	{
		return repo.findAll();
	}
	
	public List<municipio> listarMunicipiosByCveEnt(String cve)
	{
		List<municipio> mun = repo.findAllByCveEnt(cve);
		return mun;
	}
	
	public municipio getMunicpio(int id)
	{
		return repo.getOne(id);
	}
	
	public void addMunicipio(municipio pac)
	{
		repo.save(pac);
	}
	
	public void deleteMunicipio(int id)
	{
		repo.deleteById(id);
	}

}
