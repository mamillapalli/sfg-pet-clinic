package com.chanikya.learing.springframework.sfgpetclinic.services;

import com.chanikya.learing.springframework.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

	Owner findByLastname(String lastName);

}
