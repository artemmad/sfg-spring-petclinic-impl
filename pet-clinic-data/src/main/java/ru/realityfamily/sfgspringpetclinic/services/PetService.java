package ru.realityfamily.sfgspringpetclinic.services;

import ru.realityfamily.sfgspringpetclinic.model.Owner;
import ru.realityfamily.sfgspringpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
