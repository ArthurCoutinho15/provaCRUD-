package org.example.br.newtonpaiva.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "tbl_animal")
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "animal_id")
    private int id;
    @Column(name = "nom_animal")
    private String name;
    @Column(name = "dt_nascimento")
    private Integer datanascimento;
    @Column(name = "tp_sexo")

    private String sexo;
    @Column(name = "nom_especie")

    private String especie;

    public Animal() {

    }

    public Animal(int id, String name, Integer datanascimento, String sexo, String especie) {
        this.id = id;
        this.name = name;
        this.datanascimento = datanascimento;
        this.sexo = sexo;
        this.especie = especie;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(Integer datanascimento) {
        this.datanascimento = datanascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return id == animal.id && sexo == animal.sexo && Objects.equals(name, animal.name) && Objects.equals(datanascimento, animal.datanascimento) && Objects.equals(especie, animal.especie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, datanascimento, sexo, especie);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", datanascimento=" + datanascimento +
                ", sexo=" + sexo +
                ", especie='" + especie + '\'' +
                '}';
    }
}
