import java.util.List;

public class FP01Functional {

    public static void main(String[] args) {

        List<Integer> integers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
        printOddNumbers(integers);
////        printAllNumbersInListFunctional(integers);
//        printEvenNumbersInListFunctional(integers);

        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
//        printAllCoursesIndividually(courses);
//        printCoursesContainSpring(courses);
        printCoursesNameHasAtleast4Letters(courses);
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

    private static void printOddNumbers(List<Integer> numbers){
        numbers.stream().filter(num -> num % 2 != 0).forEach(System.out::println);
    }

    private static  void printAllCoursesIndividually(List<String> courses){
        courses.forEach(System.out::println);
    }

    private static  void printCoursesContainSpring(List<String> courses){
        courses.stream().filter(word -> word.contains("Spring")).forEach(System.out::println);
    }

    private static  void printCoursesNameHasAtleast4Letters(List<String> courses){
        courses.stream().filter(word -> word.length() >= 4).forEach(System.out::println);
    }

}
