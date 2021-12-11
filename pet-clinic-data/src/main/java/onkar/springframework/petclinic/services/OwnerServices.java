package onkar.springframework.petclinic.services;

import onkar.springframework.petclinic.model.Owner;

import java.util.Set;

public interface OwnerServices extends CrudServiceCommon<Owner,Long> {
    Owner findByLastName(String lastName);

}
