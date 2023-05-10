//  Завдання 1
//        Метод приймає на вхід список імен. Необхідно повернути рядок вигляду 1. Ivan, 3. Peter...
//        лише з тими іменами, що стоять під непарним індексом (1, 3 тощо)
//
//  Завдання 2
//        Метод приймає на вхід список рядків (можна взяти список із Завдання 1).
//        Повертає список цих рядків у верхньому регістрі, і відсортованих за спаданням (від Z до A).

import java.sql.Array;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;
import java.util.Comparator;

public class Names {

    public static void main(String[] args) {


        oddNames();     // task 1
        bigSortedNames();  // task 2

    }

    public static String oddNames() {


        String[] namesList = {"Milo", "Nicolette", "Fluffy", "Bessy", "Corneal", "Nightly"};
        System.out.println("namesList: "  + Arrays.toString(namesList) );

        String names = Arrays.stream(namesList)
                .filter(name -> Arrays.asList(namesList).indexOf(name) % 2 != 0)
                .map(name -> name.trim().split(" ")[0])
                .collect(Collectors.joining(", "));

        System.out.println("oddNames: "  + names);

        return names;
    }

    public static void bigSortedNames() {
        String[] namesList = oddNames().split(", ");

        Stream <String> names = (Stream<String>) Arrays.stream(namesList)
                .map(name -> name.toUpperCase())
                .sorted(Comparator.reverseOrder());

        System.out.println("bigSortedNames: " );
        names.forEach(System.out::println);

    }

}
