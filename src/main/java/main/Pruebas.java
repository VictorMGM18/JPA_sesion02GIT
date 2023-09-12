package main;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.TbUsuario;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===JPA CRUD===");
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("JPA_clase01");
		EntityManager em = fabrica.createEntityManager();

		List<TbUsuario> lstUsuario = em.createQuery("Select a From TbUsuario a", TbUsuario.class).getResultList();
		
		//Mostrar cantidad de usuarios
		System.out.println("El numero de Usuarios es: "+ lstUsuario.size());
		System.out.println("-----------------");
		
		
	}

}
