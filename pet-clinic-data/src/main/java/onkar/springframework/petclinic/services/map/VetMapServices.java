package onkar.springframework.petclinic.services.map;

import onkar.springframework.petclinic.model.Vet;
import onkar.springframework.petclinic.services.CrudServiceCommon;
import onkar.springframework.petclinic.services.VetServices;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetMapServices extends AbstractMapService<Vet,Long> implements VetServices {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet save(Vet object) {
        super.save(object.getId(),object);
        return object;
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
