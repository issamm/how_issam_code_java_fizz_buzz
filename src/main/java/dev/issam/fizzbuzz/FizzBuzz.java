package dev.issam.fizzbuzz;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * FizzBuzz core program.
 */
public class FizzBuzz {

    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String FIZZBUZZ = FIZZ + BUZZ;

    public String generate(int fromInclusive, int toInclusive) {
        CheckParameters.check(fromInclusive, toInclusive);
        return IntStream.rangeClosed(fromInclusive, toInclusive)
                .mapToObj(this::processSingleNumber)
                .collect(Collectors.joining());
    }

    private String processSingleNumber(int number) {
        if (Multiple.of15(number)) return FIZZBUZZ;
        if (Multiple.of3(number)) return FIZZ;
        if (Multiple.of5(number)) return BUZZ;
        return String.valueOf(number);
    }

}
