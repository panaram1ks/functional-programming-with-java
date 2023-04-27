import java.util.List;

public class FP01Structured {

    public static void main(String[] args) {

        List<Integer> integers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
        //printAllNumbersInListStructured(integers);
        printEvenNumbersInListStructured(integers);
    }


    private static void printAllNumbersInListStructured(List<Integer> numbers) {
        //How to loop the numbers?
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    private static void printEvenNumbersInListStructured(List<Integer> numbers) {
        //How to loop the numbers?
        for (int number : numbers) {
            //if(even)
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }


}
