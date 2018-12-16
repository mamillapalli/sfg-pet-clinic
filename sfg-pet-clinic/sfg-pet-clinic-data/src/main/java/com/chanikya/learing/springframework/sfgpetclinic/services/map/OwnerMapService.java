package com.chanikya.learing.springframework.sfgpetclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.chanikya.learing.springframework.sfgpetclinic.model.Owner;
import com.chanikya.learing.springframework.sfgpetclinic.model.Pet;
import com.chanikya.learing.springframework.sfgpetclinic.services.OwnerService;
import com.chanikya.learing.springframework.sfgpetclinic.services.PetService;
import com.chanikya.learing.springframework.sfgpetclinic.services.PetTypeService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class OwnerMapService extends AbstractMapService<Owner, Long> implements OwnerService {

	private final PetTypeService petTypeService;
	private final PetService petService;

	@Override
	public Set<Owner> findAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}

	@Override
	public Owner findById(Long id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}

	@Override
	public Owner save(com.chanikya.learing.springframework.sfgpetclinic.model.Owner object) {
		// TODO Auto-generated method stub
		if (object != null) {
			if (object.getPets() != null) {
				object.getPets().forEach(pet -> {
					if (pet.getPetType() != null) {
						pet.setPetType(petTypeService.save(pet.getPetType()));
					} else {
						throw new RuntimeException("Pet Type Required");
					}
					if (pet.getId() != null) {
						Pet savedPet = petService.save(pet);
						pet.setId(savedPet.getId());
					}
				});

			}
			return super.save(object);
		} else {
			return null;
		}
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		super.deleteById(id);
	}

	@Override
	public void delete(Owner object) {
		// TODO Auto-generated method stub
		super.delete(object);
	}

	@Override
	public Owner findByLastname(String lastName) {
		// TODO Auto-generated method stub
		Set<Owner> owners = this.findAll();
		for (Owner owner2 : owners) {
			if (owner2.getLastName().equalsIgnoreCase(lastName))
				return owner2;

		}
		return null;
	}

}
