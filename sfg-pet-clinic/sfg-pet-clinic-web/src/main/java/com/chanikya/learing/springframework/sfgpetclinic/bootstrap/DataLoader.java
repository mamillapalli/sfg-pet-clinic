package com.chanikya.learing.springframework.sfgpetclinic.bootstrap;

import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.chanikya.learing.springframework.sfgpetclinic.model.Owner;
import com.chanikya.learing.springframework.sfgpetclinic.model.Pet;
import com.chanikya.learing.springframework.sfgpetclinic.model.PetType;
import com.chanikya.learing.springframework.sfgpetclinic.model.Specialty;
import com.chanikya.learing.springframework.sfgpetclinic.model.Vet;
import com.chanikya.learing.springframework.sfgpetclinic.services.OwnerService;
import com.chanikya.learing.springframework.sfgpetclinic.services.PetTypeService;
import com.chanikya.learing.springframework.sfgpetclinic.services.SpecialtiesService;
import com.chanikya.learing.springframework.sfgpetclinic.services.VetService;

@Component
public class DataLoader implements CommandLineRunner {

	private final OwnerService ownerService;
	private final VetService vetService;
	private final PetTypeService petTypeService;
	private final SpecialtiesService specialtiesService;

	public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService,
			SpecialtiesService specialtiesService) {
		super();
		this.ownerService = ownerService;
		this.vetService = vetService;
		this.petTypeService = petTypeService;
		this.specialtiesService = specialtiesService;
	}

	@Override
	public void run(String... args) throws Exception {

		// TODO Auto-generated method stub
		if (petTypeService.findAll().size() == 0) {
			loadData();
		}

	}

	private void loadData() {
		PetType dog = new PetType();
		dog.setName("Dog");
		PetType savedDogType = petTypeService.save(dog);
		PetType cat = new PetType();
		cat.setName("Cat");
		PetType savedCatType = petTypeService.save(cat);

		Owner owner1 = new Owner();
		owner1.setFirstName("Ravikanth");
		owner1.setLastName("Mamillapalli");
		owner1.setAddress("Bit Sabt Building");
		owner1.setCity("Dubai");
		owner1.setTelephone("00971501591375");

		Pet raviPet = new Pet();
		raviPet.setBirthDate(LocalDate.now());
		raviPet.setPetType(savedDogType);
		raviPet.setOwner(owner1);

		owner1.getPets().add(raviPet);
		ownerService.save(owner1);

		Owner owner2 = new Owner();
		owner2.setFirstName("Srinivas");
		owner2.setLastName("Guda");
		owner2.setAddress("Pulomi estates");
		owner2.setCity("Hyderabad");
		owner2.setTelephone("00919440632011");

		Pet srinivasPet = new Pet();
		srinivasPet.setBirthDate(LocalDate.now());
		srinivasPet.setOwner(owner2);
		srinivasPet.setPetType(savedCatType);

		owner2.getPets().add(srinivasPet);
		ownerService.save(owner2);

		System.out.println("Loaded Owners......................");

		Vet vet1 = new Vet();
		vet1.setFirstName("Ajay");
		vet1.setLastName("Marella");

		Specialty radiology = new Specialty();
		radiology.setDescription("Radiology");
		Specialty savedRadiology = specialtiesService.save(radiology);
		vet1.getSpecialties().add(savedRadiology);

		vetService.save(vet1);

		Vet vet2 = new Vet();
		vet2.setFirstName("Divya");
		vet2.setLastName("Krishna");

		Specialty surgery = new Specialty();
		surgery.setDescription("Surgery");
		Specialty savedSurgery = specialtiesService.save(surgery);
		vet2.getSpecialties().add(savedSurgery);

		vetService.save(vet2);

		System.out.println("Loaded Vets......................");
	}

}
