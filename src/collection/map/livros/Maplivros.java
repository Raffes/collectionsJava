package collection.map.livros;

import java.util.*;

public class Maplivros {
    public static void  main(String[] args) {

        // Inicialiazar Map
        Map<String, Livro> meusLivros = new HashMap<>() {{
            put("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 200));
            put("Dohigg, Charles", new Livro("O Poder do Hábito", 408));
            put("Harari, Yuval Noah", new Livro("21 Lições Para o Século 21", 432));
        }};
        System.out.println(meusLivros.toString());

        System.out.println("\n--\t Ordem aleátoria | HashMap \t--");
        for(Map.Entry<String, Livro> livro: meusLivros.entrySet()) {
            System.out.println(livro.getKey() + ": " + livro.getValue().getNome());
        }

        System.out.println("\n--\t Ordem Inserção | LinkedHashMap \t--");
        Map<String, Livro> meusLivrosLinked = new LinkedHashMap<>() {{
            put("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 200));
            put("Dohigg, Charles", new Livro("O Poder do Hábito", 408));
            put("Harari, Yuval Noah", new Livro("21 Lições Para o Século 21", 432));
        }};
        for(Map.Entry<String, Livro> livro: meusLivrosLinked.entrySet()) {
            System.out.println(livro.getKey() + ": " + livro.getValue().getNome());
        }

        System.out.println("\n--\t Ordem alfabética dos autores | TreeMap \t--");
        Map<String, Livro> meusLivrosTreeMap = new TreeMap<>(meusLivrosLinked);
        for(Map.Entry<String, Livro> livro: meusLivrosTreeMap.entrySet()) {

        }

        System.out.println("\n--\t Ordem alfabética dos livros | TreeMap \t--");
        Set<Map.Entry<String, Livro>> meusLivrosTreeMap2 = new TreeSet<>(new ComparatorNome()); // Precisa criar um comparator na classe Livro para trabalhar com comparações
        meusLivrosTreeMap2.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livro> livro: meusLivrosTreeMap2) {
            System.out.println(livro.getKey() + ": " + livro.getValue().getNome());
        }

        System.out.println("\n--\t Ordem das páginas dos livros | TreeMap \t--");
        Set<Map.Entry<String, Livro>> meusLivrosTreeMap3 = new TreeSet<>(new ComparatorPaginas()); // Precisa criar um comparator na classe Livro para trabalhar com comparações
        meusLivrosTreeMap3.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livro> livro: meusLivrosTreeMap3) {
            System.out.println(livro.getKey() + ": " + livro.getValue().getPaginas());
        }

    }
}
