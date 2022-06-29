import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * As soluções presentes aqui estão também implementadas de uma maneira mais
 * orientada a objetos através das implementações da interface List1Exercise.
 */
public class Exercises {

    /**
     * Estou definindo os parâmetros dos métodos como final para que se aproxime um
     * pouco mais do Haskell e a imutabilidade esteja presente.
     * <p>
     * Neste método, uma classe anônima é criada e instanciada através de uma lambda
     * expression. Ela irá implementar a interface funcional Function, que possui apenas
     * um método abstrato (como deve para ser uma interface funcional). Function é a
     * interface funcional que deve ser implementada porque esse é o parâmetro que a função
     * map exige, tomando uma entrada e retornando uma saída.
     * <p>
     * Vale lembrar que o parâmetro de entrada (a coleção nomes) não será alterado e
     * permanecerá com o valor que tinha ao ser enviada. O resultado é retornado à parte da
     * entrada.
     * <p>
     * Uma versão um pouco diferente dessa implementação está na classe ClassSeparatedExamples.Itemize.java.
     *
     * @param nomes
     * @return
     */
    public List<String> itemize(final Collection<String> nomes) {
        return nomes.stream().map(nome -> "<li>".concat(nome).concat("</li>")).collect(Collectors.toList());
    }

    /**
     * A versão alternativa dessa implementação está em ClassSeparatedExamples.CalcAreas.java.
     *
     * @param raios
     * @return
     */
    public List<Double> calcAreas(final Collection<Double> raios) {
        return raios.stream().map(r -> Math.PI * r * r).collect(Collectors.toList());
    }

    /**
     * Essa abordagem foi feita para fins de teste, apenas. Em um caso de uso real, seria contraprodutivo tornar
     * a String em uma Stream como foi feito, já que a própria String possui métodos específicos que fazem o que
     * esse método objetiva.
     *
     * @param c
     * @param palavra
     * @return
     */
    public Boolean charFound(final Character c, final String palavra) {
        return palavra.chars().mapToObj(e -> (char) e).filter(e -> e.equals(c)).count() > 0;
//        return palavra.chars().mapToObj(e -> (char) e).anyMatch(e -> charEquals(e, c));
//        return palavra.contains(c.toString());
    }

    /**
     * O método filter, aplicado em uma Stream, consome uma implementação da inteface funcional
     * Predicate, que possui o método abstrato test, que recebe um parâmetro e retorna um boolean.
     * O resultado da execução do método filter é a lista de entrada limitada aos registros que
     * atendem ao Predicate, ou seja, os elementos que fazem que o método test retorne true.
     * <p>
     * Mais uma vez, uma outra versão desse código pode ser vista em ClassSeparatedExamples.OnlyBetween60And80.java.
     */
    public List<Integer> onlyBetween60And80(final Collection<Integer> idades) {
        return idades.stream().filter(age -> age >= 60 && age <= 80).collect(Collectors.toList());
    }

    /**
     * @param numbers
     * @return
     */
    public Integer sumOdds(final Collection<Integer> numbers) {
        return numbers.stream().filter(n -> n % 2 == 0).reduce(0, (a, b) -> a + b);
    }


}
