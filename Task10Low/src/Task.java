import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task {
    private Task() {
        throw new IllegalStateException("Utility class");
    }

    public static List<String> task1(char c, List<String> stringList) {
        return stringList
                .stream()
                .filter(s -> s.startsWith(String.valueOf(c)) && s.endsWith(String.valueOf(c)))
                .collect(Collectors.toList());
    }

    public static List<Integer> task2(List<String> stringList) {
        return stringList
                .stream()
                .map(String::length)
                .sorted()
                .collect(Collectors.toList());
    }

    public static List<String> task3(List<String> stringList) {
        return stringList
                .stream()
                .map(s1 -> s1 = Character.toString(s1.charAt(0)) + s1.charAt(s1.length() - 1))
                .collect(Collectors.toList());
    }

    public static List<String> task4(int k, List<String> stringList) {
        return stringList
                .stream()
                .filter(s1 -> s1.length() == k && Character.isDigit(s1.charAt(s1.length() - 1)))
                .sorted(Comparator.comparingInt(s -> s.charAt(s.length() - 1)))
                .collect(Collectors.toList());
    }

    public static List<String> task5(List<Integer> integerList) {
        return integerList
                .stream()
                .filter(i -> i % 2 == 1)
                .map(Object::toString)
                .sorted(Comparator.comparingInt(Integer::parseInt))
                .collect(Collectors.toList());
    }
}
