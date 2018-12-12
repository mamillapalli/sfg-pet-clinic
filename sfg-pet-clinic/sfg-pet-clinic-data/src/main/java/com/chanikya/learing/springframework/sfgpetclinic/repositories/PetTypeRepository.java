package com.chanikya.learing.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import com.chanikya.learing.springframework.sfgpetclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {

}
