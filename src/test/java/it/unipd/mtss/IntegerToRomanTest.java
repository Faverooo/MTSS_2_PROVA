package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class IntegerToRomanTest {
    //Il costruttore va testato, altrimenti il code coverage diminuisce
    @Test
    public void testConstructor() {
        IntegerToRoman converter = new IntegerToRoman();
        assertNotNull(converter);
    }
    @Test
    public void testConvert_underRange() {
        // Arrange
        String ris;
        // Act
        ris = IntegerToRoman.convert(-2);
        // Assert
        assertEquals("errore: numeri solo tra 1 e 1000", ris);
    }

    @Test
    public void testConvert_overRange() {
        // Arrange
        String ris;
        // Act
        ris = IntegerToRoman.convert(1050);
        // Assert
        assertEquals("errore: numeri solo tra 1 e 1000", ris);
    }

    @Test
    public void testConvert_numberZero() {
        // Arrange
        String ris;
        // Act
        ris = IntegerToRoman.convert(0);
        // Assert
        assertEquals("errore: numeri solo tra 1 e 1000", ris);
    }

    @Test
    public void testConvert_range_1_3_sample() {
        // Arrange
        String[] ris = new String[3];
        // Act
        ris[0] = IntegerToRoman.convert(1);
        ris[1] = IntegerToRoman.convert(2);
        ris[2] = IntegerToRoman.convert(3);
        // Assert
        assertEquals("I", ris[0]);
        assertEquals("II", ris[1]);
        assertEquals("III", ris[2]);
    }

    @Test
    public void testConvert_range_4_6_sample() {
        // Arrange
        String[] ris = new String[3];
        // Act
        ris[0] = IntegerToRoman.convert(4);
        ris[1] = IntegerToRoman.convert(5);
        ris[2] = IntegerToRoman.convert(6);
        // Assert
        assertEquals("IV", ris[0]);
        assertEquals("V", ris[1]);
        assertEquals("VI", ris[2]);
    }

    @Test
    public void testConvert_range_7_10_sample() {
        // Arrange
        String[] ris = new String[4];
        // Act
        ris[0] = IntegerToRoman.convert(7);
        ris[1] = IntegerToRoman.convert(8);
        ris[2] = IntegerToRoman.convert(9);
        ris[3] = IntegerToRoman.convert(10);
        // Assert
        assertEquals("VII", ris[0]);
        assertEquals("VIII", ris[1]);
        assertEquals("IX", ris[2]);
        assertEquals("X", ris[3]);
    }

    @Test
    public void testConvert_range_11_20_sample() {
        // Arrange
        String[] ris = new String[5];
        // Act
        ris[0] = IntegerToRoman.convert(12);
        ris[1] = IntegerToRoman.convert(14);
        ris[2] = IntegerToRoman.convert(16);
        ris[3] = IntegerToRoman.convert(18);
        ris[4] = IntegerToRoman.convert(20);
        // Assert
        assertEquals("XII", ris[0]);
        assertEquals("XIV", ris[1]);
        assertEquals("XVI", ris[2]);
        assertEquals("XVIII", ris[3]);
        assertEquals("XX", ris[4]);
    }

    @Test
    public void testConvert_range_21_50_sample() {
        // Arrange
        String[] ris = new String[5];
        // Act
        ris[0] = IntegerToRoman.convert(22);
        ris[1] = IntegerToRoman.convert(27);
        ris[2] = IntegerToRoman.convert(35);
        ris[3] = IntegerToRoman.convert(44);
        ris[4] = IntegerToRoman.convert(50);
        // Assert
        assertEquals("XXII", ris[0]);
        assertEquals("XXVII", ris[1]);
        assertEquals("XXXV", ris[2]);
        assertEquals("XLIV", ris[3]);
        assertEquals("L", ris[4]);
    }

    @Test
    public void testConvert_range_51_100_sample() {
        // Arrange
        String[] ris = new String[5];
        // Act
        ris[0] = IntegerToRoman.convert(52);
        ris[1] = IntegerToRoman.convert(63);
        ris[2] = IntegerToRoman.convert(75);
        ris[3] = IntegerToRoman.convert(92);
        ris[4] = IntegerToRoman.convert(100);
        // Assert
        assertEquals("LII", ris[0]);
        assertEquals("LXIII", ris[1]);
        assertEquals("LXXV", ris[2]);
        assertEquals("XCII", ris[3]);
        assertEquals("C", ris[4]);
    }

    @Test
    public void testConvert_range_101_500_sample() {
        // Arrange
        String[] ris = new String[5];
        // Act
        ris[0] = IntegerToRoman.convert(123);
        ris[1] = IntegerToRoman.convert(200);
        ris[2] = IntegerToRoman.convert(275);
        ris[3] = IntegerToRoman.convert(400);
        ris[4] = IntegerToRoman.convert(500);
        // Assert
        assertEquals("CXXIII", ris[0]);
        assertEquals("CC", ris[1]);
        assertEquals("CCLXXV", ris[2]);
        assertEquals("CD", ris[3]);
        assertEquals("D", ris[4]);
    }

    @Test
    public void testConvert_range_501_1000_sample() {
        // Arrange
        String[] ris = new String[5];
        // Act
        ris[0] = IntegerToRoman.convert(600);
        ris[1] = IntegerToRoman.convert(750);
        ris[2] = IntegerToRoman.convert(888);
        ris[3] = IntegerToRoman.convert(999);
        ris[4] = IntegerToRoman.convert(1000);
        // Assert
        assertEquals("DC", ris[0]);
        assertEquals("DCCL", ris[1]);
        assertEquals("DCCCLXXXVIII", ris[2]);
        assertEquals("CMXCIX", ris[3]);
        assertEquals("M", ris[4]);
    }

}