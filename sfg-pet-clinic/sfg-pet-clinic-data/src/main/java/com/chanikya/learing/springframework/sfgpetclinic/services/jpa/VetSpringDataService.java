package com.chanikya.learing.springframework.sfgpetclinic.services.jpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.chanikya.learing.springframework.sfgpetclinic.model.Vet;
import com.chanikya.learing.springframework.sfgpetclinic.repositories.VetRepository;
import com.chanikya.learing.springframework.sfgpetclinic.services.VetService;

import lombok.AllArgsConstructor;

@Service
@Profile(value = "springData")
@AllArgsConstructor
public class VetSpringDataService implements VetService {

	VetRepository vetRepository;

	@Override
	public Set<Vet> findAll() {
		// TODO Auto-generated method stub
		Set<Vet> vets = new HashSet<Vet>();
		vetRepository.findAll().forEach(vets::add);
		return vets;
	}

	@Override
	public Vet save(Vet object) {
		// TODO Auto-generated method stub
		return vetRepository.save(object);
	}

	@Override
	public Vet findById(Long id) {
		// TODO Auto-generated method stub
		return vetRepository.findById(id).orElse(null);
	}

	@Override
	public void delete(Vet object) {
		// TODO Auto-generated method stub
		vetRepository.delete(object);

	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		vetRepository.deleteById(id);

	}

}
