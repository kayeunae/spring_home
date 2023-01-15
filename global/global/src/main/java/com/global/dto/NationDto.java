package com.global.dto;

import com.global.constant.Continent;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NationDto {
	private String nation;
	
	private int nationNumber;
	
	private Continent continent;
	
	private String capital;
}
