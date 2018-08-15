package com.carmona.conversor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.carmona.domain.Cargo;
import com.carmona.service.CargoService;

@Component
public class StringToCargoConverter implements Converter<String, Cargo>{

	@Autowired
	private CargoService cargoService;
	
	@Override
	public Cargo convert(String text) {
		if(text.isEmpty()) {
			return null;
		}
		return cargoService.buscaPorId(Long.valueOf(text));
	}

}
