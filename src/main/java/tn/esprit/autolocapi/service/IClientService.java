package tn.esprit.autolocapi.service;

import java.util.List;
import tn.esprit.autolocapi.domain.Client;

public interface IClientService {
    Client ajouterClient(Client client);
    Client modifierClient(Client client);
    Client getClientById(Long idClient);
    List<Client> getAllClients();
    void supprimerClient(Long idClient);
}
