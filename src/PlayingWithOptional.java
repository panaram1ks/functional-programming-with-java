import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class PlayingWithOptional {

    public static void main(String[] args) {
        List<String> fruits = List.of("apple", "banana", "mango");
        Predicate<? super String> predicate = fruit  -> fruit.startsWith("c");
        Optional<String> firstFruit = fruits.stream().filter(predicate).findFirst();

        System.out.println(firstFruit);
        System.out.println(firstFruit.isEmpty());
        System.out.println(firstFruit.isPresent());
        System.out.println(firstFruit.get());

        Optional<String> fruit = Optional.of("banana");
        Optional<String> empty = Optional.empty();
    }
}
