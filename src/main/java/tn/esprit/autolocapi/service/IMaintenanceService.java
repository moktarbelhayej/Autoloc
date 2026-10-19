package tn.esprit.autolocapi.service;

import java.util.List;
import tn.esprit.autolocapi.domain.Maintenance;

public interface IMaintenanceService {
    Maintenance ajouterMaintenance(Maintenance maintenance);
    Maintenance modifierMaintenance(Maintenance maintenance);
    Maintenance getMaintenanceById(Long idMaintenance);
    List<Maintenance> getAllMaintenances();
    void supprimerMaintenance(Long idMaintenance);
}
