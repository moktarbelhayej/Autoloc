package tn.esprit.autolocapi.service;

import java.util.List;
import tn.esprit.autolocapi.domain.Paiement;

public interface IPaiementService {
    Paiement ajouterPaiement(Paiement paiement);
    Paiement modifierPaiement(Paiement paiement);
    Paiement getPaiementById(Long idPaiement);
    List<Paiement> getAllPaiements();
    void supprimerPaiement(Long idPaiement);
}
