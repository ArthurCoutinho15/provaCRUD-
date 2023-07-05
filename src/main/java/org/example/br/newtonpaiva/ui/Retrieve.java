package org.example.br.newtonpaiva.ui;

import org.example.br.newtonpaiva.entities.Cliente;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Retrieve {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EC-PU");
        EntityManager em = emf.createEntityManager();

        Cliente c = em.find(Cliente.class, 4);

        System.out.println(c);

        em.close();
        emf.close();
    }
}
