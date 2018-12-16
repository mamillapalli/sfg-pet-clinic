package com.chanikya.learing.springframework.sfgpetclinic.services.jpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.chanikya.learing.springframework.sfgpetclinic.model.Specialty;
import com.chanikya.learing.springframework.sfgpetclinic.repositories.SpecialtyRepository;
import com.chanikya.learing.springframework.sfgpetclinic.services.SpecialtiesService;

import lombok.AllArgsConstructor;

@Service
@Profile(value = "springData")
@AllArgsConstructor
public class SpecialtySpringDataService implements SpecialtiesService {

	SpecialtyRepository specialtyRepository;

	@Override
	public Set<Specialty> findAll() {
		// TODO Auto-generated method stub
		Set<Specialty> specialties = new HashSet<Specialty>();
		specialtyRepository.findAll().forEach(specialties::add);
		return specialties;
	}

	@Override
	public Specialty save(Specialty object) {
		// TODO Auto-generated method stub
		return specialtyRepository.save(object);
	}

	@Override
	public Specialty findById(Long id) {
		// TODO Auto-generated method stub
		return specialtyRepository.findById(id).orElse(null);
	}

	@Override
	public void delete(Specialty object) {
		// TODO Auto-generated method stub
		specialtyRepository.delete(object);

	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		specialtyRepository.deleteById(id);
	}

}
