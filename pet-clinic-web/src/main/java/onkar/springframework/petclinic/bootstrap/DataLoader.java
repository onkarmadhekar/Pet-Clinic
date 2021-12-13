package onkar.springframework.petclinic.bootstrap;

import onkar.springframework.petclinic.model.Owner;
import onkar.springframework.petclinic.model.Vet;
import onkar.springframework.petclinic.services.OwnerServices;
import onkar.springframework.petclinic.services.VetServices;
import onkar.springframework.petclinic.services.map.OwnerMapServices;
import onkar.springframework.petclinic.services.map.VetMapServices;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerServices ownerServices;
    private final VetServices vetServices;


    public DataLoader(){
        ownerServices = new OwnerMapServices();
        vetServices = new VetMapServices();
    }
    @Override
    public void run(String... args) throws Exception {

        Owner o1 = new Owner();
        o1.setId(1L);
        o1.setFirstName("Virat");
        o1.setLastName("Kohli");

        ownerServices.save(o1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("M.S.");
        owner2.setFirstName("Dhoni");

        ownerServices.save(owner2);

        System.out.println("Loaded Owner..");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Dr.");
        vet1.setLastName("Smith");

        vetServices.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Dr.");
        vet2.setLastName("John");

        vetServices.save(vet2);
        System.out.println("Loaded Vet");


    }
}
