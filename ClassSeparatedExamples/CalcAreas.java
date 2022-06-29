package ClassSeparatedExamples;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class CalcAreas implements ListExercise<Double> {

    private Collection<Double> collection;

    public CalcAreas(Collection<Double> collection) {
        this.collection = collection;
    }

    /**
     * Equivale a uma função de alta ordem.
     * A implementação aqui foi feita com Method Reference, que é um tipo mais simples de
     * lambda expression que referencia métodos existentes da classe atual ou de outra.
     * Os métodos referenciados podem ser estáticos, instanciados ou construtores.
     * Method Reference pode ser usado quando os parâmetros não precisam ser modificados
     * antes da chamada do método.
     *
     * @return
     */
    @Override
    public List<Double> apply() {
        return this.collection.stream().map(this::circleArea).collect(Collectors.toList());
    }

    private double circleArea(final Double raio) {
        return Math.PI * raio * raio;
    }

    public void setCollection(Collection<Double> collection) {
        this.collection = collection;
    }
}
