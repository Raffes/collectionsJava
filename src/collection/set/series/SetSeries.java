package collection.set.series;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetSeries {

    public static void  main(String[] args) {

        System.out.println("\n--\t Ordem aleátoria \t--");
        Set<Serie> series = new HashSet<>(){{
            add(new Serie("New Girl", "Comédia", 25));
            add(new Serie("Modern Family", "Comédia", 25));
            add(new Serie("Super mães", "Comédia", 45));
        }};
        for(Serie serie: series) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());

        System.out.println("\n--\t Ordem Inserção \t--");
        Set<Serie> series2 = new LinkedHashSet<>(){{
            add(new Serie("New Girl", "Fantasia", 25));
            add(new Serie("Modern Family", "Drama", 25));
            add(new Serie("Super mães", "Comédia", 45));
        }};
        for(Serie serie: series2) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());

        System.out.println("\n--\t Ordem natural (TempoEpisodio) \t--");
        Set<Serie> series3 = new TreeSet<>(series2); // Precisa implementar o comparable para funcionar
        for(Serie serie: series3) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());

        System.out.println("\n--\t Ordem Nome/Genero/TempoEpisodio \t--");
        Set<Serie> series4 = new TreeSet<>(new ComparatorNomeGeneroTempoEp()); // Precisa implementar o comparable para funcionar
        series4.addAll(series);
        for(Serie serie: series4) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
    }
}
