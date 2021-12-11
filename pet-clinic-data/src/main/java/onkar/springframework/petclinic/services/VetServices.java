package onkar.springframework.petclinic.services;
import onkar.springframework.petclinic.model.Vet;

import java.util.Set;

public interface VetServices {
    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
