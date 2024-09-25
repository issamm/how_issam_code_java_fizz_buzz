package dev.issam.fizzbuzz;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class FizzBuzzValidParametersTest {

    @Test
    void shouldAnswerWithTrue() {
        assertTrue(true);
        Assertions.assertThat(new FizzBuzz()).isNotNull();
    }

    @Test
    void givenFrom1_whenGenerateTo1_thenPrint1() {
        check(1, 1, "1");
    }

    @Test
    void givenFrom1_whenGenerateTo2_thenPrint12() {
        check(1, 2, "12");
    }

    @Test
    void givenFrom1_whenGenerateTo3_thenPrint12Fizz() {
        check(1, 3, "12Fizz");
    }

    @Test
    void givenFrom1_whenGenerateTo4_thenPrint12Fizz4() {
        check(1, 4, "12Fizz4");
    }

    @Test
    void givenNumber5_whenFizzBuzz_thenPrintBuzz() {
        check(1, 5, "12Fizz4Buzz");
    }

    @Test
    void givenNumber6_whenFizzBuzz_thenPrintFizz() {
        check(1, 6, "12Fizz4BuzzFizz");
    }

    @Test
    void givenNumber10_whenFizzBuzz_thenPrintBuzz78FizzBuzz() {
        check(7, 10, "78FizzBuzz");
    }

    @Test
    void givenFrom10_whenGenerateTo15_thenPrintBuzz11Fizz1315FizzBuzz() {
        check(10, 15, "Buzz11Fizz1314FizzBuzz");
    }

    private void check(int fromInclusive, int toInclusive, String expectedResultString) {
        Assertions.assertThat(new FizzBuzz().generate(fromInclusive, toInclusive))
                .isNotNull().isNotEmpty()
                .isEqualTo(expectedResultString);
    }

}
