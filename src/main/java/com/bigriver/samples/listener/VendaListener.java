package com.bigriver.samples.listener;

import java.time.Instant;
import javax.persistence.PrePersist;
import com.bigriver.samples.model.Venda;
import java.util.Date;

public class VendaListener {
	
	@PrePersist
	public void salvandoVenda(Venda venda){
		venda.setTimestamps(Date.from(Instant.now()));
		
	}

}
