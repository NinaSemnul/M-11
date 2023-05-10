//Завдання 5
//        Напишіть метод public static <T> Stream<T> zip(Stream<T> first, Stream<T> second)
//        який "перемішує" елементи зі стрімів first та second,
//        зупиняючись тоді, коли у одного зі стрімів закінчаться елементи.

import java.util.List;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.stream.IntStream;

public class StreamZip {

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second){

        Object[] firstList = first.toArray();
        Object[] secondList = second.toArray();

        List<T> result = new ArrayList<>();

        int size = Math.min(firstList.length, secondList.length);

        IntStream.range(0, size)
                .forEachOrdered(i -> {
                    result.add((T) firstList[i]);
                    result.add((T) secondList[i]);
                });

        return result.stream();

    }

    public static void main(String[] args) {
        Stream<Integer> first = Stream.of(0, 1, 2, 3, 4);
        Stream<Integer> second = Stream.of( 3, 9, 11, 13);

        Stream<Integer> result = StreamZip.zip(first, second);

        result.forEach(System.out::println);
    }

}

