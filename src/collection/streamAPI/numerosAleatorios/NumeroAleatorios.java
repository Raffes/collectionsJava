package collection.streamAPI.numerosAleatorios;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class NumeroAleatorios {
    public static void  main(String[] args) {

        // Inicia a lista
        List<String> numerosAleatorios =
                Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        System.out.println("\n -- Imprima todos os elementos dessa lista de String");

        // sem reference method
        /*numerosAleatorios.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });*/

        // com reference method
        numerosAleatorios.forEach(System.out::println);

        System.out.println("\n -- Pegue as 5 primeiros números e coloque dentro de um Set: ");

        numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet()) // set não aceita número repetidos
                .forEach(System.out::println);

        System.out.println("\n -- Transforme esta lista de String em uma lista de números inteiros: ");

        List<Integer> collectListInt = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        System.out.println(collectListInt);

        System.out.println("\n -- Pegue os números pares e maiores que 2 e coloque em uma lista: ");

        List<Integer> ListParesMaioresQue2 = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(i -> i % 2 == 0 && i > 2).collect(Collectors.toList());

        System.out.println(ListParesMaioresQue2);

        System.out.println("\n -- Mostre a média dos números: ");

        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);

        System.out.println("\n -- Remova os valores impares: ");

        List<Integer> numerosAleatoriosInteger = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        numerosAleatoriosInteger.removeIf(integer -> integer % 2 != 0);
        System.out.println(numerosAleatoriosInteger);



    }
}
