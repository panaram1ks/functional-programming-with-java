import java.util.List;

public class FP01Functional {

    public static void main(String[] args) {

        List<Integer> integers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
//        printAllNumbersInListFunctional(integers);
        printEvenNumbersInListFunctional(integers);
    }

    private static void printAllNumbersInListFunctional(List<Integer> numbers) {
        //What to do?
        numbers.stream().forEach(System.out::println);//Method reference
    }

//    private static boolean isEven(int number) {
//        return number % 2 == 0;
//    }

    private static void printEvenNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream()
                //.filter(FP01Functional::isEven)
                .filter(number -> number % 2 == 0)//Lambda expression
                .forEach(System.out::println);//Method reference
    }
}
