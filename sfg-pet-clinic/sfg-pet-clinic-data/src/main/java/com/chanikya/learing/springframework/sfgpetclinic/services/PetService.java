package com.chanikya.learing.springframework.sfgpetclinic.services;

import java.util.Set;

public interface PetService {

	PetService findById(long id);

	Set<PetService> findAll();

	PetService save(PetService pet);
}
