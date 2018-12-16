package com.chanikya.learing.springframework.sfgpetclinic.services.jpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.chanikya.learing.springframework.sfgpetclinic.model.PetType;
import com.chanikya.learing.springframework.sfgpetclinic.repositories.PetTypeRepository;
import com.chanikya.learing.springframework.sfgpetclinic.services.PetTypeService;

import lombok.AllArgsConstructor;

@Service
@Profile(value = "springData")
@AllArgsConstructor
public class PetTypeSpringDataService implements PetTypeService {

	PetTypeRepository petTypeRepository;

	@Override
	public Set<PetType> findAll() {
		// TODO Auto-generated method stub
		Set<PetType> petTypes = new HashSet<PetType>();
		petTypeRepository.findAll().forEach(petTypes::add);
		return petTypes;
	}

	@Override
	public PetType save(PetType object) {
		// TODO Auto-generated method stub
		return petTypeRepository.save(object);
	}

	@Override
	public PetType findById(Long id) {
		// TODO Auto-generated method stub
		return petTypeRepository.findById(id).orElse(null);
	}

	@Override
	public void delete(PetType object) {
		// TODO Auto-generated method stub
		petTypeRepository.delete(object);

	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		petTypeRepository.deleteById(id);

	}

}
