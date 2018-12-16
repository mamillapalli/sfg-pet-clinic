package com.chanikya.learing.springframework.sfgpetclinic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "pet_types")
@Data
public class PetType extends BaseEntity {
	@Column(name = "name")
	private String name;

}
