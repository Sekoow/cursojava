package com.bigriver.samples.listener;

import java.time.Instant;
import java.util.Date;

import com.bigriver.samples.model.Apartamento;


public class ApartamentoListener {
	
	public void salvandoApartamento(Apartamento apartamento){
		apartamento.setTimestamps(Date.from(Instant.now()));
	}

}
