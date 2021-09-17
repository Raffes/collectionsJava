package collection.list.dinossauros;

import java.util.Comparator;

public class Dinossauro implements Comparable<Dinossauro> {
    Integer id;
    private String nome, reino, filo, ordem, familia;

    public Dinossauro(Integer id, String nome, String reino, String filo, String ordem, String familia) {
        this.id = id;
        this.nome = nome;
        this.reino = reino;
        this.filo = filo;
        this.ordem = ordem;
        this.familia = familia;
    }

    // Sem isso vem o endereço de memória dos dados
    @Override
    public String toString() {
        return "Dinossauro{" +
                "id='" + id + '\'' +
                "nome='" + nome + '\'' +
                ", reino='" + reino + '\'' +
                ", filo='" + filo + '\'' +
                ", ordem='" + ordem + '\'' +
                ", familia='" + familia + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getReino() {
        return reino;
    }

    public void setReino(String reino) {
        this.reino = reino;
    }

    public String getFilo() {
        return filo;
    }

    public void setFilo(String filo) {
        this.filo = filo;
    }

    public String getOrdem() {
        return ordem;
    }

    public void setOrdem(String ordem) {
        this.ordem = ordem;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    @Override
    public int compareTo(Dinossauro dinossauro) {
        return this.getNome().compareToIgnoreCase(dinossauro.getNome());
    }
}

class ComparatorId implements Comparator<Dinossauro> {

    @Override
    public int compare(Dinossauro d1, Dinossauro d2) {

        return Integer.compare(d1.getId(), d2.getId());
    }
}

class ComparatorFamilia implements Comparator<Dinossauro> {

    @Override
    public int compare(Dinossauro d1, Dinossauro d2) {
        return d1.getFamilia().compareToIgnoreCase(d2.getFamilia());
    }
}

class ComparatorTodos implements Comparator<Dinossauro> {

    @Override
    public int compare(Dinossauro d1, Dinossauro d2) {

        int nome = d1.getNome().compareToIgnoreCase(d2.getNome());

        if (nome != 0) return 0;

        int reino = d1.getReino().compareToIgnoreCase(d2.getReino());

        if (reino != 0) return 0;

        int filo = d1.getFilo().compareToIgnoreCase(d2.getFilo());

        if (filo != 0) return 0;

        int ordem = d1.getOrdem().compareToIgnoreCase(d2.getOrdem());

        if (ordem != 0) return 0;

        int familia = d1.getFamilia().compareToIgnoreCase(d2.getFamilia());

        if (familia != 0) return 0;


        return Integer.compare(d1.getId(), d2.getId());
    }
}
