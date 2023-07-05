package org.example.br.newtonpaiva.ui;

import org.example.br.newtonpaiva.entities.Animal;
import org.example.br.newtonpaiva.entities.Cliente;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.text.html.parser.Entity;

public class Create {
    public static void main(String[] args) {
        Animal a = new Animal(2,"dog",02 , "M","Pinscher" );
        Cliente c = new Cliente(3, "Arthur Silva", "Carlos Prates", "000000", "5555", "arthur@");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EC-PU");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.merge(a);
        em.merge(c);
        em.getTransaction().commit();
        System.out.println("Pronto");


    }
}
