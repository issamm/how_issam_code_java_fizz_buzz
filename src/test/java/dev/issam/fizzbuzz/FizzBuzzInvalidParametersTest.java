package dev.issam.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class FizzBuzzInvalidParametersTest {

    @Test
    void givenNumber0_whenUntil0_thenIllegalArgException() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThrows(IllegalArgumentException.class,
                () -> fizzBuzz.generate(0, 0),
                CheckParameters.ERROR_MESSAGE_FIZZ_BUZZ_PARAMETERS_MUST_BE_POSITIVE
        );
    }

    @Test
    void givenNumber0_whenUntil1_thenIllegalArgException() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThrows(IllegalArgumentException.class,
                () -> fizzBuzz.generate(0, 1),
                CheckParameters.ERROR_MESSAGE_FIZZ_BUZZ_PARAMETERS_MUST_BE_POSITIVE
        );
    }

    @Test
    void givenNumber5_whenUntil2_thenIllegalArgException() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThrows(IllegalArgumentException.class,
                () -> fizzBuzz.generate(5, 2),
                CheckParameters.ERROR_MESSAGE_FIRST_PARAMETER_MUST_BE_INFERIOR_TO_THE_SECOND_ONE);
    }

}
