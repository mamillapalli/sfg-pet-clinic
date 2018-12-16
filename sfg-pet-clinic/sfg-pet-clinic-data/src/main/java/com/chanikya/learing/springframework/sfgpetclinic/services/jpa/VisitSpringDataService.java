package com.chanikya.learing.springframework.sfgpetclinic.services.jpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.chanikya.learing.springframework.sfgpetclinic.model.Visit;
import com.chanikya.learing.springframework.sfgpetclinic.repositories.VisitRepository;
import com.chanikya.learing.springframework.sfgpetclinic.services.VisitService;

import lombok.AllArgsConstructor;

@Service
@Profile(value = "springData")
@AllArgsConstructor
public class VisitSpringDataService implements VisitService {

	VisitRepository visitRepository;

	@Override
	public Set<Visit> findAll() {
		// TODO Auto-generated method stub
		Set<Visit> visits = new HashSet<Visit>();
		visitRepository.findAll().forEach(visits::add);
		return visits;
	}

	@Override
	public Visit save(Visit object) {
		// TODO Auto-generated method stub
		return visitRepository.save(object);
	}

	@Override
	public Visit findById(Long id) {
		// TODO Auto-generated method stub
		return visitRepository.findById(id).orElse(null);
	}

	@Override
	public void delete(Visit object) {
		// TODO Auto-generated method stub
		visitRepository.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		visitRepository.deleteById(id);
	}

}
