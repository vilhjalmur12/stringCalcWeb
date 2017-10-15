package is.ru.hugb.calc;

import java.util.stream.Stream;

public class StringCalculator {
    public int add(String input) {
        if (input.equals("")) {
            return 0;
        }
        else if (input.contains(",")) {
            Integer[] numbers = Stream.of(input.split(","))
                .map(Integer::valueOf).toArray(Integer[]::new);
            return numbers[0] + numbers[1];
        }
        return 1;
    }
}
