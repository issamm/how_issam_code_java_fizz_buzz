package dev.issam.fizzbuzz;

final class Multiple {
    private Multiple() {}

    static boolean of15(int number) {
        return of(15, number);
    }

    static boolean of3(int number) {
        return of(3, number);
    }

    static boolean of5(int number) {
        return of(5, number);
    }

    private static boolean of(int of, int number) {
        return number % of == 0;
    }
}
