package com.commerce;

import com.commerce.Models.Produit;
import com.commerce.Repository.ProduitRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class CommerceApplicationTests {

	@Autowired
	private ProduitRepository repository;
	@Test
	void contextLoads() {
		repository.save( new Produit(1,"nom",12D,new Date())
		);
	}

}
