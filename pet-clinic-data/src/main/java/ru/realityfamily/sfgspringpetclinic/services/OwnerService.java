package ru.realityfamily.sfgspringpetclinic.services;

import ru.realityfamily.sfgspringpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
