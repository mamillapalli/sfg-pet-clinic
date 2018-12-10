package com.chanikya.learing.springframework.sfgpetclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.chanikya.learing.springframework.sfgpetclinic.model.Vet;
import com.chanikya.learing.springframework.sfgpetclinic.services.VetService;

@Service
public class VetMapService extends AbstractMapService<Vet, Long> implements VetService {

	@Override
	public Set<Vet> findAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}

	@Override
	public Vet findById(Long id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		super.deleteById(id);
	}

	@Override
	public void delete(Vet object) {
		// TODO Auto-generated method stub
		super.delete(object);
	}

	@Override
	public Vet save(Vet object) {
		// TODO Auto-generated method stub
		return super.save(object);
	}

}
