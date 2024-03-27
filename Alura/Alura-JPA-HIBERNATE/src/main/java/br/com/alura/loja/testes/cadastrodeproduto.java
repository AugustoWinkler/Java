package br.com.alura.loja.testes;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.alura.loja.dao.CategoriaDAO;
import br.com.alura.loja.dao.ProdutoDao;
import br.com.alura.loja.modelo.Categoria;
import br.com.alura.loja.modelo.Produto;
import br.com.alura.loja.util.JPAUtil;

public class cadastrodeproduto {
	
	public static void main(String[] args) {
		
		Categoria celulares = new Categoria("CELULARES");
		
		
		
		Produto celular = new Produto( "Xiaomi Red-mi" , "Muito legal" 
				, new BigDecimal ("800") , celulares);
		
		
		
		
		EntityManager em = JPAUtil.getEntityManager();
		ProdutoDao produtoDao = new ProdutoDao(em);
		CategoriaDAO categoriaDao = new CategoriaDAO(em);
		
		em.getTransaction().begin();
		categoriaDao.cadastrar(celulares);
		produtoDao.cadastrar(celular); //Insere no Banco de dados
		em.getTransaction().commit();
		em.close();
	}

}
