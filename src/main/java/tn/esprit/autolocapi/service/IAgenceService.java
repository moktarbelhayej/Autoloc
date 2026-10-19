package tn.esprit.autolocapi.service;

import java.util.List;
import tn.esprit.autolocapi.domain.Agence;

public interface IAgenceService {
    Agence ajouterAgence(Agence agence);
    Agence modifierAgence(Agence agence);
    Agence getAgenceById(Long idAgence);
    List<Agence> getAllAgences();
    void supprimerAgence(Long idAgence);
}
