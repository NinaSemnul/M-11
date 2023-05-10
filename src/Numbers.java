//Завдання 3
//        Є масив:
//
//        ["1, 2, 0", "4, 5"]
//
//        Необхідно отримати з масиву всі числа, і вивести їх у відсортованому вигляді через кому ,, наприклад:
//
//        "0, 1, 2, 4, 5"

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Numbers {

    public static void main(String[] args) {

        sortedNumbers();     // task 3
    }

    private static void sortedNumbers() {
        String [] numbersList = {"1, 2, 0", "4, 5"};
        System.out.println("numbers: "  + Arrays.toString(numbersList) );

        List<String> numbers = Arrays.stream(numbersList)
                .flatMap(numb -> Arrays.stream(numb.split(", ")))
                .map(Integer::parseInt)
                .sorted()
                .map(String::valueOf)
                .collect(Collectors.toList());


        System.out.println("sortedNumbers:" + numbers);

    }




}
