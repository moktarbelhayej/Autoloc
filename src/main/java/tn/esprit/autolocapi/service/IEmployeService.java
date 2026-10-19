package tn.esprit.autolocapi.service;

import java.util.List;
import tn.esprit.autolocapi.domain.Employe;

public interface IEmployeService {
    Employe ajouterEmploye(Employe employe);
    Employe modifierEmploye(Employe employe);
    Employe getEmployeById(Long idEmploye);
    List<Employe> getAllEmployes();
    void supprimerEmploye(Long idEmploye);
}
