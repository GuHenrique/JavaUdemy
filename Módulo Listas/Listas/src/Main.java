import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Gustavo");
        list.add("Ronaldo");
        list.add("Fenomeno");
        list.add("Ronaldinho");
        list.add("Gaucho");
        list.add("Marcelo");
        list.add(2, "Alex");

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'G').collect(Collectors.toList());
        //filtra uma lista pela primeira letra do nome. o comando stream transforma a lista para que aceite o metodo filter.
        //após criar o filtro com lambda é ncessário converter novamente para o tipo lista, usando o método collect.


        for (String name : result) {
            System.out.println(name);
        }

        //for each para correr a lista e trazer as informações de dentro dela. - mais facil que fazer apenas o for.

        System.out.println(list.size()); // traz a quantidade de index dentro da lista


        list.remove(1); //remove numero de index
        list.remove("Fenomeno"); //remove pelo valor que se encontra dentro da lista
        System.out.println(list.indexOf("Gustavo")); // traz o número do index do elemento
        System.out.println(list.indexOf("Joao")); //quando nao existe o elemento traz o número -1


        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("---------------------");

        list.removeIf(x -> x.charAt(0) == 'R'); //remove todos os objetos de dentro da lista que começa com a letra "R".
        //Usa o mesmo lambda que foi usado na parte de filtro.
        for (String x : list) {
            System.out.println(x);
        }

        String name = list.stream().filter(x -> x.charAt(0) == 'g').findFirst().orElse("Parece que não temos ninguém que começa com essa letra.");
        // código que traz o primeiro nome com a letra G, são usados os mesmo métodos como o stream e filtro, porém com mais 2 novos.
        //findFirst() traz o primeiro elemento que cumpre a regra do lambda, no caso, elementos que começam com letra G
        //orElse() basicamente a memsma função do else, nesse código caso não exista um elemente com a letra G de início ele traz a resposta como nullo.



        System.out.println("----------------");
        System.out.println(name);


    }
}