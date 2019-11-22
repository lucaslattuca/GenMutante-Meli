package meli.entities;

import javax.persistence.*;
import java.io.Serializable;


@Entity
public class Gen implements Serializable {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    private String individuo;
    private String [] adn;
    private boolean esMutante;

    public Gen(String individuo, String[] adn, boolean esMutante) {
        this.individuo = individuo;
        this.adn = adn;
        this.esMutante = esMutante;
    }

    public Gen() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIndividuo() {
        return individuo;
    }

    public void setIndividuo(String individuo) {
        this.individuo = individuo;
    }

    public String[] getAdn() {
        return adn;
    }

    public void setAdn(String[] adn) {
        this.adn = adn;
    }

    public boolean isEsMutante() {
        return esMutante;
    }

    public void setEsMutante(boolean esMutante) {
        this.esMutante = esMutante;
    }

}
