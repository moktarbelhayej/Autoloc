package tn.esprit.autolocapi.service;
import tn.esprit.autolocapi.domain.Vehicule;
import java.util.List;

import org.springframework.stereotype.Service;
import tn.esprit.autolocapi.repository.VehiculeRepository;

import lombok.AllArgsConstructor;       

@Service
@AllArgsConstructor 
public class VehiculeService implements IVehiculeService {
   /* @Autowired 
    private IVehiculeRepository vehiculeRepository;
    */ 
   private final VehiculeRepository vehiculeRepository;
	@Override
	public Vehicule getvehiculeById(Long id) {
		return vehiculeRepository.findById(id).orElse(null);
	}

	@Override
	public List<Vehicule> getAllVehicules() {
		return vehiculeRepository.findAll();
	}

	@Override
	public Vehicule ajouterVehicule(Vehicule vehicule) {
		return vehiculeRepository.save(vehicule);
	}

	@Override
	public Vehicule modifierVehicule(Vehicule vehicule) {
		return vehiculeRepository.save(vehicule);
	}

	@Override
	public void supprimerVehicule(Long id) {
		vehiculeRepository.deleteById(id);
	}
}
