package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

public class RomanPrinterTest {
    //Testo anche il costruttore cosi si aumenta il coverage
    @Test
    public void testConstructor() {
        RomanPrinter romanPrinter = new RomanPrinter();
        assertNotNull(romanPrinter);
    }

    @Test
    public void testPrint_underRange() {
        try (MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)) {
            utilities.when(() -> IntegerToRoman.convert(-1)).thenReturn("errore: numeri solo tra 1 e 1000");

            assertEquals(RomanPrinter.print(-1), "errore: numeri solo tra 1 e 1000");
        }
    }

    @Test
    public void testPrint_overRange() {
        try (MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)) {
            utilities.when(() -> IntegerToRoman.convert(1070)).thenReturn("errore: numeri solo tra 1 e 1000");

            assertEquals(RomanPrinter.print(1070), "errore: numeri solo tra 1 e 1000");
        }
    }

    @Test
    public void testPrint_II() {
        try (MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)) {
            utilities.when(() -> IntegerToRoman.convert(2)).thenReturn("II");

            assertEquals(RomanPrinter.print(2),
                    " _____    _____   \n" +
                    "|_   _|  |_   _|  \n" +
                    "  | |      | |    \n" +
                    "  | |      | |    \n" +
                    " _| |_    _| |_   \n" +
                    "|_____|  |_____|  \n");
        }
    }

    @Test
    public void testPrint_VI() {
        try (MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)) {
            utilities.when(() -> IntegerToRoman.convert(6)).thenReturn("VI");

            String expected = "__      __   _____   \n" +
                    "\\ \\    / /  |_   _|  \n" +
                    " \\ \\  / /     | |    \n" +
                    "  \\ \\/ /      | |    \n" +
                    "   \\  /      _| |_   \n" +
                    "    \\/      |_____|  \n";

            assertEquals(expected, RomanPrinter.print(6));
        }
    }

    @Test
    public void testPrint_VIII() {
        try (MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)) {
            utilities.when(() -> IntegerToRoman.convert(8)).thenReturn("VIII");

            String expected = "__      __   _____    _____    _____   \n" +
                    "\\ \\    / /  |_   _|  |_   _|  |_   _|  \n" +
                    " \\ \\  / /     | |      | |      | |    \n" +
                    "  \\ \\/ /      | |      | |      | |    \n" +
                    "   \\  /      _| |_    _| |_    _| |_   \n" +
                    "    \\/      |_____|  |_____|  |_____|  \n";

            assertEquals(expected, RomanPrinter.print(8));
        }
    }

    @Test
    public void testPrint_XVII() {
        try (MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)) {
            utilities.when(() -> IntegerToRoman.convert(17)).thenReturn("XVII");

            String expected = "__   __  __      __   _____    _____   \n" +
                    "\\ \\ / /  \\ \\    / /  |_   _|  |_   _|  \n" +
                    " \\ V /    \\ \\  / /     | |      | |    \n" +
                    "  > <      \\ \\/ /      | |      | |    \n" +
                    " / . \\      \\  /      _| |_    _| |_   \n" +
                    "/_/ \\_\\      \\/      |_____|  |_____|  \n";

            assertEquals(expected, RomanPrinter.print(17));
        }
    }

    @Test
    public void testPrint_XLVIII() {
        try (MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)) {
            utilities.when(() -> IntegerToRoman.convert(48)).thenReturn("XLVIII");

            String expected = "__   __   _        __      __   _____    _____    _____   \n" +
                    "\\ \\ / /  | |       \\ \\    / /  |_   _|  |_   _|  |_   _|  \n" +
                    " \\ V /   | |        \\ \\  / /     | |      | |      | |    \n" +
                    "  > <    | |         \\ \\/ /      | |      | |      | |    \n" +
                    " / . \\   | |____      \\  /      _| |_    _| |_    _| |_   \n" +
                    "/_/ \\_\\  |______|      \\/      |_____|  |_____|  |_____|  \n";

            assertEquals(expected, RomanPrinter.print(48));
        }
    }

    @Test
    public void testPrint_XC() {
        try (MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)) {
            utilities.when(() -> IntegerToRoman.convert(90)).thenReturn("XC");

            String expected = "__   __    _____   \n" +
                    "\\ \\ / /   / ____|  \n" +
                    " \\ V /   | |       \n" +
                    "  > <    | |       \n" +
                    " / . \\   | |____   \n" +
                    "/_/ \\_\\   \\_____|  \n";

            assertEquals(expected, RomanPrinter.print(90));
        }
    }

    @Test
    public void testPrint_CD() {
        try (MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)) {
            utilities.when(() -> IntegerToRoman.convert(400)).thenReturn("CD");

            String expected = "  _____    _____    \n" +
                    " / ____|  |  __ \\   \n" +
                    "| |       | |  | |  \n" +
                    "| |       | |  | |  \n" +
                    "| |____   | |__| |  \n" +
                    " \\_____|  |_____/   \n";

            assertEquals(expected, RomanPrinter.print(400));
        }
    }

    @Test
    public void testPrint_M() {
        try (MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)) {
            utilities.when(() -> IntegerToRoman.convert(1000)).thenReturn("M");

            assertEquals(RomanPrinter.print(1000), " __  __   \n" +
                    "|  \\/  |  \n" +
                    "| \\  / |  \n" +
                    "| |\\/| |  \n" +
                    "| |  | |  \n" +
                    "|_|  |_|  \n");
        }
    }
}