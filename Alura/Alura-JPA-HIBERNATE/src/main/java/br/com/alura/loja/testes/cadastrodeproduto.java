package br.com.alura.loja.testes;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.alura.loja.modelo.Produto;

public class cadastrodeproduto {
	
	public static void main(String[] args) {
		Produto celular = new Produto();
		
		celular.setNome("Xiaomi Red-mi");
		celular.setDescricao("Muito legal");
		celular.setPreco(new BigDecimal("800"));
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("loja");
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(celular); //Insere no Banco de dados
		em.getTransaction().commit();
		em.close();
	}

}
