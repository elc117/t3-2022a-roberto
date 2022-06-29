import ClassSeparatedExamples.CalcAreas;
import ClassSeparatedExamples.Itemize;
import ClassSeparatedExamples.ListExercise;
import ClassSeparatedExamples.OnlyBetween60And80;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> stringList = List.of("ufsm", "ufrgs", "furg");
        List<Double> doubleList = List.of(0.0, 1.0, 2.5);
        List<Integer> integerList = List.of(4, 40, 60, 70, 100);

        List<ListExercise> exercises = List.of(new Itemize(stringList), new CalcAreas(doubleList), new OnlyBetween60And80(integerList));
        exercises.forEach(listExercise -> listExercise.print(listExercise.apply()));

        Exercises ex = new Exercises();
        System.out.println("\nEncontrado: " + ex.charFound('P', "Paradigma"));
        System.out.println("\nSoma dos pares: " + ex.sumOdds(integerList));
        System.out.println("\nElementos adequados: " + ex.calcExpr(doubleList));
        System.out.println("\nProduto interno: " + ex.dotProd(integerList, integerList));
    }
}
