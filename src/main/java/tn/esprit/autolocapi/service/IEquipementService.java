package tn.esprit.autolocapi.service;

import java.util.List;
import tn.esprit.autolocapi.domain.Equipement;

public interface IEquipementService {
    Equipement ajouterEquipement(Equipement equipement);
    Equipement modifierEquipement(Equipement equipement);
    Equipement getEquipementById(Long idEquipement);
    List<Equipement> getAllEquipements();
    void supprimerEquipement(Long idEquipement);
}
