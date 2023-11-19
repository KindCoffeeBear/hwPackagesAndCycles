package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RestWorkServiceTest {

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/rest.csv")
    void testCalculateRestDay(int expected, int income, int expenses, int threshold) {
        RestWorkService service = new RestWorkService();

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}

