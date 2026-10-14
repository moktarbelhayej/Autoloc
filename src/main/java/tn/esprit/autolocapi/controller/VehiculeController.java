package tn.esprit.autolocapi.controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import tn.esprit.autolocapi.service.IVehiculeService;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.autolocapi.domain.Vehicule;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.DeleteMapping;

@AllArgsConstructor 
@RestController
@RequestMapping("/vehicules")
public class VehiculeController {
    private final IVehiculeService vehiculeService;
    @PostMapping("/ajouter")
    public Vehicule ajouterVehicule(@RequestBody  Vehicule vehicule) {
        return vehiculeService.ajouterVehicule(vehicule);
    }
    @PostMapping("/modifier")
    public Vehicule modifierVehicule(@RequestBody  Vehicule vehicule) {
        return vehiculeService.modifierVehicule(vehicule);
    }
    @GetMapping("/all")
    public List<Vehicule> getAllVehicules() {
        return vehiculeService.getAllVehicules();
    }
    @GetMapping("/id/{idVehicule}")
    public Vehicule getvehiculeById(@PathVariable Long idVehicule) {
        return vehiculeService.getvehiculeById(idVehicule);
    }
    @DeleteMapping("/id/{idVehicule}")
    public void supprimerVehicule(@PathVariable Long idVehicule) {
        vehiculeService.supprimerVehicule(idVehicule);
    }
}
