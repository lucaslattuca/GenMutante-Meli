package meli.dtos;

public class GenDTO {

    private int id;
    private String individuo;
    private String [] adn;
    private boolean esMutante;
    private int dimension;

    public GenDTO(String individuo, String[] adn, boolean esMutante, int dimension) {
        this.individuo = individuo;
        this.adn = adn;
        this.esMutante = esMutante;
        this.dimension=dimension;
    }

    public GenDTO() {
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

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }
}
