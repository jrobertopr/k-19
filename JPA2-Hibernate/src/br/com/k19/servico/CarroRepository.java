package br.com.k19.servico;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.k19.entidade.Carro;

public class CarroRepository {
	private EntityManager manager;
	
	public CarroRepository(EntityManager manager) {
		this.manager = manager;
	}
	
	public void adiciona(Carro carro) {
		this.manager.persist(carro);
	}

	@SuppressWarnings("unchecked")
	public List<Carro> buscaTodos() {
		Query query = this.manager.createQuery("select x from Carro x");
		return query.getResultList();
	}

}
