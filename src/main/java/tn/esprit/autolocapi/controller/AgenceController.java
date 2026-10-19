package tn.esprit.autolocapi.controller;

import java.util.List;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.autolocapi.domain.Agence;
import tn.esprit.autolocapi.service.IAgenceService;

@AllArgsConstructor
@RestController
@RequestMapping("/agences")
public class AgenceController {
    private final IAgenceService agenceService;

    @PostMapping("/ajouter")
    public Agence ajouterAgence(@RequestBody Agence agence) {
        return agenceService.ajouterAgence(agence);
    }

    @PostMapping("/modifier")
    public Agence modifierAgence(@RequestBody Agence agence) {
        return agenceService.modifierAgence(agence);
    }

    @GetMapping("/all")
    public List<Agence> getAllAgences() {
        return agenceService.getAllAgences();
    }

    @GetMapping("/id/{idAgence}")
    public Agence getAgenceById(@PathVariable Long idAgence) {
        return agenceService.getAgenceById(idAgence);
    }

    @DeleteMapping("/id/{idAgence}")
    public void supprimerAgence(@PathVariable Long idAgence) {
        agenceService.supprimerAgence(idAgence);
    }
}
