package com.chanikya.learing.springframework.sfgpetclinic.services;

import java.util.Set;

public interface VetService {

	VetService findById(long id);

	Set<VetService> findAll();

	VetService save(VetService vet);
}
