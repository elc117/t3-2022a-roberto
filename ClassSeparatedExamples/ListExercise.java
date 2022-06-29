package ClassSeparatedExamples;

import java.util.List;

/**
 * Essa anotação não implementa nenhuma nova funcionalidade no código em que está, mas serve
 * como indicativo de que a interface é funcional, ou seja, possui apenas um método abstrato,
 * e por isso pode ser implementada com lambdas. Além disso, ela impede que sejam feitas
 * modificações no código de modo que os requisitos de uma interterface funcional passem a
 * não ser mais atendidos. Se isso for feito, vai ocorrer erro na comcpilação.
 */
@FunctionalInterface
public interface ListExercise<R> {

    List<R> apply();

    /**
     * Como esse método é default, e não abstrato, ele pode possuir uma implementação e não
     * impede que a interface seja funcional.
     * <p>
     * Aqui, o método forEach consome uma implementação da inteface funcional Consumer, cujo
     * método abstrato é accept, que recebe um parâmetro e não possui retorno. Essa
     * implementação é feita a partir de um Method Reference, ou seja, a classe anônima pega
     * cada parâmetro, que é cada elemento da lista, e executa uma escrita no terminal dele,
     * visto que é essa a finalidade do System.out.println.
     */
    default void print(List<R> lista) {
        System.out.println("\n");
        lista.forEach(System.out::println);
    }
}
