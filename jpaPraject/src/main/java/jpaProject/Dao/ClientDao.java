package jpaProject.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import jpaPraject.Client;


public class ClientDao {
	private EntityManager entityManager;

	public EntityManager getEntityManager() {
		if(entityManager == null) {
			entityManager=Persistence.createEntityManagerFactory("Tp2_Jpa").createEntityManager();
		}
		return entityManager;
	}
	
	
	public void  AjouterClient(Client Client) {
		getEntityManager().getTransaction().begin();
		getEntityManager().persist(Client);
		getEntityManager().getTransaction().commit();
		
	}
	public void  RemoveClient(Client Client) {
		getEntityManager().getTransaction().begin();
		getEntityManager().remove(Client);
		getEntityManager().getTransaction().commit();
		
	}
	public void  ModifierClient(Client Client) {
		getEntityManager().getTransaction().begin();
		getEntityManager().merge(Client);
		getEntityManager().getTransaction().commit();
		
	}
	public Client FindClient(int id) {
		return getEntityManager().find(Client.class, id);
	}
	
	public List<Client> findAll(){
		return getEntityManager().createQuery("select c from Client c",Client.class).getResultList();
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
}
