package org.example.br.newtonpaiva.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "tbl_Customer")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "cliente_id")
    private Integer id;
    @Column(name = "nom_customer")
    private String name;
    @Column(name = "end_customer")
    private String endereco;
    @Column(name = "tel_customer")
    private String telefone;
    @Column(name = "cep_customer")
    private String cep;
    @Column(name = "eml_customer")
    private String email;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "animais")

    private List<Animal> animais = new ArrayList<>();


    public Cliente() {

    }

    public Cliente(Integer id, String name, String endereco, String telefone, String cep, String email) {
        this.id = id;
        this.name = name;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cep = cep;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Animal> getAnimais() {
        return animais;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(id, cliente.id) && Objects.equals(name, cliente.name) && Objects.equals(endereco, cliente.endereco) && Objects.equals(telefone, cliente.telefone) && Objects.equals(cep, cliente.cep) && Objects.equals(email, cliente.email) && Objects.equals(animais, cliente.animais);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, endereco, telefone, cep, email, animais);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefone='" + telefone + '\'' +
                ", cep='" + cep + '\'' +
                ", email='" + email + '\'' +
                ", animais=" + animais +
                '}';
    }
}
