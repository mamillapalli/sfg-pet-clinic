package com.chanikya.learing.springframework.sfgpetclinic.services.jpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.chanikya.learing.springframework.sfgpetclinic.model.Owner;
import com.chanikya.learing.springframework.sfgpetclinic.repositories.OwnerRespository;
import com.chanikya.learing.springframework.sfgpetclinic.services.OwnerService;

import lombok.AllArgsConstructor;

@Service
@Profile(value = "springData")
@AllArgsConstructor
public class OwnerSpringDataService implements OwnerService {

	private final OwnerRespository ownerRespository;

	@Override
	public Set<Owner> findAll() {
		// TODO Auto-generated method stub
		Set<Owner> owners = new HashSet<>();
		ownerRespository.findAll().forEach(owner -> {
			owners.add((Owner) owner);
		});
		return owners;
	}

	@Override
	public Owner save(Owner object) {
		// TODO Auto-generated method stub
		return (Owner) ownerRespository.save(object);
	}

	@Override
	public Owner findById(Long id) {
		// TODO Auto-generated method stub
		return ownerRespository.findById(id).orElse(null);
	}

	@Override
	public void delete(Owner object) {
		// TODO Auto-generated method stub
		ownerRespository.delete(object);

	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		ownerRespository.deleteById(id);
	}

	@Override
	public Owner findByLastname(String lastName) {
		// TODO Auto-generated method stub
		if (ownerRespository.findByLastName(lastName).isPresent())
			return ownerRespository.findByLastName(lastName).get();
		else
			return null;
	}

}
