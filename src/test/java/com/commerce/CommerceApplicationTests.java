package com.commerce;

import com.commerce.Models.Produit;
import com.commerce.Repository.ProduitRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

@SpringBootTest
class CommerceApplicationTests {

	@Autowired
	private ProduitRepository repository;
	@Test
	public void testFindByNomProduit()
	{
		List<Produit> prods = repository.findByNom("Iphone 15 pro");
		for (Produit p : prods)
		{
			System.out.println(p);
		}
	}

	@Test
	public void testFindByNomProduitContains ()
	{
		List<Produit> prods=repository.findByNomContains("Iphone");
		for (Produit p : prods)
		{
			System.out.println(p);
		} }

}
