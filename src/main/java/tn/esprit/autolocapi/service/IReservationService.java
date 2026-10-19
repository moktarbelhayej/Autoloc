package tn.esprit.autolocapi.service;

import java.util.List;
import tn.esprit.autolocapi.domain.Reservation;

public interface IReservationService {
    Reservation ajouterReservation(Reservation reservation);
    Reservation modifierReservation(Reservation reservation);
    Reservation getReservationById(Long idReservation);
    List<Reservation> getAllReservations();
    void supprimerReservation(Long idReservation);
}
