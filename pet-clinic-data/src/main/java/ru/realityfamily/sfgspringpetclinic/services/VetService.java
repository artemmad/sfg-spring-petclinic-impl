package ru.realityfamily.sfgspringpetclinic.services;

import ru.realityfamily.sfgspringpetclinic.model.Owner;
import ru.realityfamily.sfgspringpetclinic.model.Pet;
import ru.realityfamily.sfgspringpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
