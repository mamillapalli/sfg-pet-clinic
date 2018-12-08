package com.chanikya.learing.springframework.sfgpetclinic.services;

import java.util.Set;

import com.chanikya.learing.springframework.sfgpetclinic.model.Owner;

public interface OwnerService {

	Owner findById(long id);

	Owner findByLastname(String lastName);

	Owner save(Owner owner);

	Set<Owner> findAll();

}
