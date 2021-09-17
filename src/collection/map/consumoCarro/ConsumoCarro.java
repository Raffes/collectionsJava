package collection.map.consumoCarro;

import java.util.*;

public class ConsumoCarro {
    public static void  main(String[] args) {

        // Incializar um Map
        System.out.println("\n -- Crie um dicionário que relacione os modelos e seus respectivos");
        Map<String, Double> carrosPopupares = new HashMap<>(){{
            put("gol", 14.4);
            put("uno", 14.5);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);

        }};

        System.out.println(carrosPopupares.toString());

        System.out.println("\n -- Sustitua o consumo do gol por 15.2 km/l: ");
        carrosPopupares.put("gol", 15.2);
        System.out.println(carrosPopupares);

        System.out.println("\n -- Confira se o modelo tucson está no dicionário: " + carrosPopupares.containsKey("tucson"));

        System.out.println("\n -- Exiba o consumo do uno: " + carrosPopupares.get("uno"));

        // System.out.println("Exiba o terceiro modelo adicionado");
        // não tem como fazer isso

        System.out.println("\n -- Exiba os modelos: ");
        Set<String> modelos =  carrosPopupares.keySet();
        System.out.println(modelos);

        System.out.println("\n -- Exiba os consumos dos carros: ");
        Collection<Double> consumos = carrosPopupares.values();
        System.out.println(consumos);

        System.out.println("\n -- Exiba o modelo com consumo alto: ");
        Double consumoAlto = Collections.max(carrosPopupares.values());
        Set<Map.Entry<String, Double>> chaveValores = carrosPopupares.entrySet();
        String modeloConsumoAlto = "";

        for ( Map.Entry<String, Double> entry: chaveValores) {
            if(entry.getValue().equals(consumoAlto) ) {
                modeloConsumoAlto = entry.getKey();
                System.out.println(modeloConsumoAlto + ": " + consumoAlto);
            }
        }

        System.out.println("\n -- Exiba o modelo com consumo baixo: ");
        Double consumoBaixo = Collections.min(carrosPopupares.values());
        Set<Map.Entry<String, Double>> chaveValores2 = carrosPopupares.entrySet();
        String modeloConsumoBaixo = "";

        for ( Map.Entry<String, Double> entry: chaveValores2) {
            if(entry.getValue().equals(consumoBaixo) ) {
                modeloConsumoBaixo = entry.getKey();
                System.out.println(modeloConsumoBaixo + ": " + consumoBaixo);
            }
        }

        System.out.println("\n -- Exiba a soma dos consumos: ");
        Iterator<Double> iterator  = carrosPopupares.values().iterator();
        Double soma = 0d;
        while(iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println(soma);

        System.out.println("\n -- Exiba a média dos consumos deste dicionários de carros: " + (soma/carrosPopupares.size()));

        System.out.println("\n -- Remova os modeos com o sonsumo igual a 15.6 km/l: ");
        System.out.println(carrosPopupares);
        Iterator<Double> iterator2  = carrosPopupares.values().iterator();
        while(iterator2.hasNext()) {
            if (iterator2.next().equals(15.6)){
                iterator2.remove();
            }
        }
        System.out.println(carrosPopupares);

        System.out.println("\n -- Exiba todos os carros na ordem em que oram informados: ");
        Map<String, Double> carrosPopuparesLinked = new LinkedHashMap<>(){{
            put("gol", 14.4);
            put("uno", 14.5);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);

        }};
        System.out.println(carrosPopuparesLinked.toString());

        System.out.println("\n -- Exiba o dicionário ordenado pelo modelo: ");
        Map<String, Double> carrosPopularesTreeMap = new TreeMap<>(carrosPopuparesLinked);
        System.out.println(carrosPopularesTreeMap.toString());

        System.out.println("\n -- Apague o dicionário de carros: ");
        carrosPopupares.clear();

        System.out.println("\n -- Confira se o dicionário está vazio: " + carrosPopupares.isEmpty());

    }
}
