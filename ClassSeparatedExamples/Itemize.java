package ClassSeparatedExamples;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Itemize implements ListExercise<String> {

    private Collection<String> collection;

    public Itemize(Collection<String> collection) {
        this.collection = collection;
    }

    @Override
    public List<String> apply() {
        return this.collection.stream().map(nome -> this.htmlItem(nome)).collect(Collectors.toList());
    }

    private String htmlItem(final String item) {
        return "<li>".concat(item).concat("</li>");
    }

    public void setCollection(Collection<String> collection) {
        this.collection = collection;
    }
}
