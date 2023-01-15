package com.global.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.global.constant.Continent;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="global")
@Getter
@Setter
@ToString
public class Nation {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String nation;
	
	@Column(nullable = false)
	private int nationNumber;
	
	@Column(nullable = false)
	private Continent continent;
	
	@Column(nullable = false)
	private String capital;
		
}
