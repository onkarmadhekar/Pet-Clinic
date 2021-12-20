package onkar.springframework.petclinic.services.map;

import onkar.springframework.petclinic.model.Pet;
import onkar.springframework.petclinic.services.CrudServiceCommon;
import onkar.springframework.petclinic.services.PetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PetMapServices extends AbstractMapService<Pet,Long> implements PetService {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public Pet save(Pet object) {
        super.save(object);
        return object;
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
