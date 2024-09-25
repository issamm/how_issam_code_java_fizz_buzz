package dev.issam.fizzbuzz;

/**
 * Check the parameters given to FizzBuzz.
 */
final class CheckParameters {

    public static final String ERROR_MESSAGE_FIRST_PARAMETER_MUST_BE_INFERIOR_TO_THE_SECOND_ONE = "First parameter must be inferior to the second one.";
    public static final String ERROR_MESSAGE_FIZZ_BUZZ_PARAMETERS_MUST_BE_POSITIVE = "FizzBuzz parameters must be positive.";

    private CheckParameters() {}

    /**
     * @param fromInclusive Greater or equal to 0
     * @param toInclusive Greater or equal to 0 and fromInclusive parameter
     * @throws IllegalArgumentException In case of a condition violation
     */
    static void check(int fromInclusive, int toInclusive) {
        if (fromInclusive <= 0 || toInclusive <= 0) {
            throw new IllegalArgumentException(ERROR_MESSAGE_FIZZ_BUZZ_PARAMETERS_MUST_BE_POSITIVE);
        }
        if (fromInclusive > toInclusive) {
            throw new IllegalArgumentException(ERROR_MESSAGE_FIRST_PARAMETER_MUST_BE_INFERIOR_TO_THE_SECOND_ONE);
        }
    }
}
