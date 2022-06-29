import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * As soluções presentes aqui estão também implementadas de uma maneira mais
 * orientada a objetos através das implementações da interface List1Exercise.
 */
public class Exercises {

    /**
     * Estou definindo os parâmetros dos métodos como final para que se aproxime um
     * pouco mais do Haskell e a imutabilidade esteja presente.
     * 
     * Neste método, uma classe anônima é criada e instanciada através de uma lambda
     * expression. Ela irá implementar a interface funcional Function, que possui apenas
     * um método abstrato (como deve para ser uma interface funcional). Function é a
     * interface funcional que deve ser implementada porque esse é o parâmetro que a função
     * map exige, tomando uma entrada e retornando uma saída.
     * 
     * Vale lembrar que o parâmetro de entrada (a coleção nomes) não será alterado e
     * permanecerá com o valor que tinha ao ser enviada. O resultado é retornado à parte da
     * entrada.
     * 
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
     * 
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

    /**
     * Retorna os elementos cujo resultado de x²/2 é maior que 10.
     *
     * Nesse método, ambos os métodos map e filter são chamados para a stream, em cadeia. Isso é
     * possível porque a execução de cada um deles retorna a stream de resultado, que é a entrada
     * da próxima chamada.
     *
     * @param numbers
     * @return
     */
    public List<Double> calcExpr(final Collection<Double> numbers) {
        return numbers.stream().map(n -> n * n / 2.0).filter(n -> n > 10).collect(Collectors.toList());
    }

    /**
     * A ausência de uma função zip dificulta bastante a execução dessa proposta, que é implementável
     * mais facilmente em Haskell. Para fins de comparação, o código em Haskell é mostrado a seguir:
     *
     * dotProd :: [Int] -> [Int] -> Int
     * dotProd l1 l2 = sum [fst x * snd x | x <- zip l1 l2]
     *
     * A alternativa encontrada acaba sendo menos elegante e legível, ainda mais se considerarmos que
     * através da busca de um elemento i da lista, a solução fica muito parecida com um tradicional
     * laço for. Assim, parece haver uma fuga do propósito desta implementação, que é a aproximação
     * ao paradigma funcional.
     *
     * @param l1
     * @param l2
     * @return
     */
    public Integer dotProd(final List<Integer> l1, final List<Integer> l2) {
        return IntStream.range(0, Math.min(l1.size(), l2.size())).map(i -> l1.get(i) * l2.get(i)).sum();
    }


}
