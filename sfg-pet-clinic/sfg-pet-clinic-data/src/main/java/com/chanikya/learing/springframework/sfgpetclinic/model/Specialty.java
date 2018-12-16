package com.chanikya.learing.springframework.sfgpetclinic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "specialties")
@Data
public class Specialty extends BaseEntity {

	@Column(name = "description")
	private String description;

}
