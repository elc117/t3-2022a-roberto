package ClassSeparatedExamples;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class OnlyBetween60And80 implements ListExercise<Integer> {

    private Collection<Integer> collection;

    public OnlyBetween60And80(Collection<Integer> collection) {
        this.collection = collection;
    }

    @Override
    public List<Integer> apply() {
        return this.collection.stream().filter(this::between60And80).collect(Collectors.toList());
    }

    private Boolean between60And80(final int age) {
        return age >= 60 && age <= 80;
    }

    public void setCollection(Collection<Integer> collection) {
        this.collection = collection;
    }
}
