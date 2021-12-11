package onkar.springframework.petclinic.services;

import onkar.springframework.petclinic.model.Pet;


import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
