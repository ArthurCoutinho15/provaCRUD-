package org.example.br.newtonpaiva.ui;

import org.example.br.newtonpaiva.entities.Cliente;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Update {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EC-PU");
        EntityManager em = emf.createEntityManager();

        Cliente c = em.find(Cliente.class, 4);
        em.getTransaction().begin();
        c.setName("Arthur Teles Coutinho");
        em.getTransaction().commit();

        em.close();
        emf.close();


    }
}
