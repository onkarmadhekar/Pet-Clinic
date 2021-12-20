package onkar.springframework.petclinic.bootstrap;

import onkar.springframework.petclinic.model.Owner;
import onkar.springframework.petclinic.model.Vet;
import onkar.springframework.petclinic.services.OwnerServices;
import onkar.springframework.petclinic.services.VetServices;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerServices ownerServices;
    private final VetServices vetServices;


    public DataLoader(OwnerServices ownerServices, VetServices vetServices){
        this.ownerServices = ownerServices;
        this.vetServices = vetServices;
    }
    @Override
    public void run(String... args) throws Exception {

        Owner o1 = new Owner();
        o1.setFirstName("Virat");
        o1.setLastName("Kohli");

        ownerServices.save(o1);

        Owner owner2 = new Owner();
        owner2.setFirstName("M.S.");
        owner2.setLastName("Dhoni");

        ownerServices.save(owner2);

        System.out.println("Loaded Owner..");

        Vet vet1 = new Vet();
        vet1.setFirstName("Dr.");
        vet1.setLastName("Smith");

        vetServices.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Dr.");
        vet2.setLastName("John");

        vetServices.save(vet2);
        System.out.println("Loaded Vet");


    }
}
