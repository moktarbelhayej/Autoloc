package tn.esprit.autolocapi.service;

import java.util.List;
import tn.esprit.autolocapi.domain.Contrat;

public interface IContratService {
    Contrat ajouterContrat(Contrat contrat);
    Contrat modifierContrat(Contrat contrat);
    Contrat getContratById(Long idContrat);
    List<Contrat> getAllContrats();
    void supprimerContrat(Long idContrat);
}
