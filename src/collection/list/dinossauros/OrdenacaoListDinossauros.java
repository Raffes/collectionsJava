package collection.list.dinossauros;

/* Dados para criar uma lista
 * objetivo: Criar e Ordenar usando collection List
 */


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoListDinossauros {

    public static void  main(String[] args) {

        // Iniciar uma lista
        List<Dinossauro> dinos = new ArrayList<>(){{


            add(new Dinossauro(3,"Velociraptor", "Animalia", "Chordata", "Saurischia", "Dromaeosauridae"));
            add(new Dinossauro(5,"Tiranossauro", "Animalia", "Chordata", "Saurischia", "Tyrannosauridae"));
            add(new Dinossauro(2,"Triceratops", "Animalia", "Chordata", "Ornithischia", "Ceratopsidae"));
            add(new Dinossauro(1,"Tiranossauro", "Animalia", "Chordata", "Saurischia", "Tyrannosauridae"));
            add(new Dinossauro(4,"Braquiossauro", "Animalia", "Chordata", "Saurischia", "Brachiosauridae"));
        }};

        /* System.out.println("--\t Ordem de Inserção\t--");
        System.out.println(dinos);
        */

        /*
        System.out.println("--\t Ordem de Aleátoria\t--");
        Collections.shuffle(dinos);
        System.out.println(dinos);
         */

        /*
        System.out.println("--\t Ordem Natural (Nome)\t--");
        Collections.sort(dinos); // implementa Comparable na classe Dinossauro
        System.out.println(dinos);
         */

        /*
        System.out.println("--\t Ordem Id\t--");
        Collections.sort(dinos, new ComparatorId()); // implementa Comparator na classe Dinossauro
        System.out.println(dinos);

        // outro jeito
        // dinos.sort(dinos, new ComparatorId());

         */

        /*
        System.out.println("--\t Ordem Família\t--");
        Collections.sort(dinos, new ComparatorFamilia()); // implementa Comparator na classe Dinossauro
        System.out.println(dinos);

        // outro jeito
        // dinos.sort(dinos, new ComparatorFamilia());
         */

        System.out.println("--\t Ordem Id, Nome, Reino, Filo, Ordem, Família\t--");
        Collections.sort(dinos, new ComparatorTodos()); // implementa Comparator na classe Dinossauro
        System.out.println(dinos);
    }
}
