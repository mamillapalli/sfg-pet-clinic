package com.chanikya.learing.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import com.chanikya.learing.springframework.sfgpetclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {

}
