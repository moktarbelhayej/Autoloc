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
import tn.esprit.autolocapi.domain.Client;
import tn.esprit.autolocapi.service.IClientService;

@AllArgsConstructor
@RestController
@RequestMapping("/clients")
public class ClientController {
    private final IClientService clientService;

    @PostMapping("/ajouter")
    public Client ajouterClient(@RequestBody Client client) {
        return clientService.ajouterClient(client);
    }

    @PostMapping("/modifier")
    public Client modifierClient(@RequestBody Client client) {
        return clientService.modifierClient(client);
    }

    @GetMapping("/all")
    public List<Client> getAllClients() {
        return clientService.getAllClients();
    }

    @GetMapping("/id/{idClient}")
    public Client getClientById(@PathVariable Long idClient) {
        return clientService.getClientById(idClient);
    }

    @DeleteMapping("/id/{idClient}")
    public void supprimerClient(@PathVariable Long idClient) {
        clientService.supprimerClient(idClient);
    }
}
