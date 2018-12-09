package com.chanikya.learing.springframework.sfgpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.chanikya.learing.springframework.sfgpetclinic.model.Owner;
import com.chanikya.learing.springframework.sfgpetclinic.model.Vet;
import com.chanikya.learing.springframework.sfgpetclinic.services.OwnerService;
import com.chanikya.learing.springframework.sfgpetclinic.services.VetService;
import com.chanikya.learing.springframework.sfgpetclinic.services.map.OwnerMapService;
import com.chanikya.learing.springframework.sfgpetclinic.services.map.VetMapService;

@Component
public class DataLoader implements CommandLineRunner {

	private final OwnerService ownerService;
	private final VetService vetService;

	public DataLoader() {
		ownerService = new OwnerMapService();
		vetService = new VetMapService();
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Owner owner1 = new Owner();
		owner1.setId(1L);
		owner1.setFirstName("Ravikanth");
		owner1.setLastName("Mamillapalli");
		ownerService.save(owner1);
		Owner owner2 = new Owner();
		owner2.setId(2L);
		owner2.setFirstName("Srinivas");
		owner2.setLastName("Guda");
		ownerService.save(owner2);

		System.out.println("Loaded Owners......................");

		Vet vet1 = new Vet();
		vet1.setId(1L);
		vet1.setFirstName("Ajay");
		vet1.setLastName("Marella");
		vetService.save(vet1);
		Vet vet2 = new Vet();
		vet2.setId(2L);
		vet2.setFirstName("Divya");
		vet2.setLastName("Krishna");
		vetService.save(vet2);

		System.out.println("Loaded Vets......................");
	}

}
