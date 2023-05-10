//Завдання 4
//        Використовуючи Stream.iterate, створіть безкінечний стрім випадкових чисел, але не використовуючи Math.random().
//
//        Реалізуйте свій лінійний конгруентний генератор. Для цього почніть з x[0] = seed, і далі кожний наступний елемент рахуйте
//        за формулою на зразок
//        x[n + 1] = 1 (a x[n] + c) % m
//        для коректних значень a, c, та m.
//
//        Необхідно імплементувати метод, що приймає на вхід параметри a, c, та m, і повертає Stream<Long>.
//
//        Для тесту використовуйте такі дані:
//
//        a = 25214903917
//        c = 11
//        m = 2^48 (2в степені48`)


import java.util.Arrays;
import java.util.stream.Stream;

public class StreamIterate {

    public static void main(String[] args) {

        System.out.println("endlessStream: "   );
        Stream<Long> endlessStream = StreamIterate.endlessStream(0, 25214903917L, 11 , (long) Math.pow(2, 48) );
        endlessStream.limit(13).forEach(System.out::println);
    }

    public static Stream<Long> endlessStream(long seed, long a, long c, long m) {

        return Stream.iterate(seed, n -> (a * n + c) % m);

    }

}

