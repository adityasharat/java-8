import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * Playground for {@link java.util.Collection}
 *
 * @author adityasharat
 */
public class Collections {

    public static void main(String[] args) {

        List<Integer> list = create();

        // lambdas
        StringBuilder builder = new StringBuilder();
        list.forEach(new IndexedConsumer<Integer, List<Integer>>(list) {
            @Override
            public void accept(Integer item, int index, List<Integer> collection) {

                // append opening bracket if we at the beginning.
                if (index == 0) {
                    builder.append("[");
                }

                // append the item
                builder.append(item);

                // append the delimiter if we are not at the end.
                if (index < collection.size() - 1) {
                    builder.append(", ");
                }

                // append the closing bracket if we are at the end.
                if (index == collection.size() - 1) {
                    builder.append("]");
                }
            }
        });

        System.out.println(builder.toString());
    }

    private static List<Integer> create() {
        int max = 50;
        List<Integer> list = new ArrayList<>(max);

        for (int i = 1; i <= max; i++) {
            list.add(i);
        }

        return list;
    }

    public static abstract class IndexedConsumer<T, S extends List<T>> implements Consumer<T> {

        private final S collection;

        private int currentIndex = 0;

        public IndexedConsumer(S collection) {
            this.collection = collection;
        }

        @Override
        public void accept(T item) {
            accept(item, currentIndex, collection);
            currentIndex = currentIndex + 1;
        }

        public abstract void accept(T item, int index, S collection);
    }

}
