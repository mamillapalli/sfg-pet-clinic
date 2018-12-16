package com.chanikya.learing.springframework.sfgpetclinic.services.jpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.chanikya.learing.springframework.sfgpetclinic.model.Pet;
import com.chanikya.learing.springframework.sfgpetclinic.repositories.PetRepository;
import com.chanikya.learing.springframework.sfgpetclinic.services.PetService;

import lombok.AllArgsConstructor;

@Service
@Profile(value = "springData")
@AllArgsConstructor
public class PetSpringDataService implements PetService {

	PetRepository petRepository;

	@Override
	public Set<Pet> findAll() {
		// TODO Auto-generated method stub
		Set<Pet> pets = new HashSet<Pet>();
		petRepository.findAll().forEach(pets::add);
		return pets;
	}

	@Override
	public Pet save(Pet object) {
		// TODO Auto-generated method stub
		return petRepository.save(object);
	}

	@Override
	public Pet findById(Long id) {
		// TODO Auto-generated method stub
		return petRepository.findById(id).orElse(null);
	}

	@Override
	public void delete(Pet object) {
		// TODO Auto-generated method stub
		petRepository.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		petRepository.deleteById(id);
	}

}
