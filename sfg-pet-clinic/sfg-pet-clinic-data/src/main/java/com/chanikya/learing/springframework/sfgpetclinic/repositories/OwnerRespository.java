package com.chanikya.learing.springframework.sfgpetclinic.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.chanikya.learing.springframework.sfgpetclinic.model.Owner;

public interface OwnerRespository extends CrudRepository<Owner, Long> {

	Optional<Owner> findByLastName(String lastName);

}
