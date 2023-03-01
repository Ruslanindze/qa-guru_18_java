package guru.qa;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TestMathAndLogicOperators {

    @AfterEach
    void outputTestSeparator() {
        System.out.println("==========================================================================================");
    }

    @Test
    void testArithmeticOperators() {

        // Сложение
        System.out.println("------------- Test additional.");

        int addIntA = 19000, addIntB = -7000;
        Assertions.assertEquals(12000, addIntA + addIntB); // Проверка int, int
        System.out.println(String.format("Test int+int => %d + %d = %s", addIntA, addIntB, (addIntA + addIntB)));

        float addFloatA = -32.2f, addFloatB = -23.3f;
        Assertions.assertEquals(-55.5f, addFloatA + addFloatB, 0.01f); // Проверка float, float
        System.out.println(String.format("Test float+float => %f + %f = %s", addFloatA, addFloatB, (addFloatA + addFloatB)));

        System.out.println("------------------------------------------------------------------------------------------");


        // Вычитание
        System.out.println("------------- Test subtraction.");

        int subIntA = 19000, subIntB = -7000;
        Assertions.assertEquals(26000, subIntA - subIntB); // Проверка int, int
        System.out.println(String.format("Test int-int => %d - %d = %s", subIntA, subIntB, (subIntA - subIntB)));

        float subFloatA = -32.2f, subFloatB = -23.3f;
        Assertions.assertEquals(-8.9f, subFloatA - subFloatB, 0.01f); // Проверка float, float
        System.out.println(String.format("Test float-float => %f - %f = %s", subFloatA, subFloatB, (subFloatA - subFloatB)));

        System.out.println("------------------------------------------------------------------------------------------");


        // Умножение
        System.out.println("------------- Test multiplication.");

        int multIntA = 50, multIntB = 27;
        Assertions.assertEquals(1350, multIntA * multIntB); // int, int
        System.out.println(String.format("Test int*int => %d * %d = %s", multIntA, multIntB, (multIntA * multIntB)));

        float multFloatA = 13.37f, multFloatB = -34.89f;
        Assertions.assertEquals(-466.48f, multFloatA * (multFloatB), 0.01f); // float, float
        System.out.println(String.format("Test float*float => %f * %f = %s", multFloatA, multFloatB, (multFloatA * multFloatB)));

        System.out.println("------------------------------------------------------------------------------------------");


        // Деление
        System.out.println("------------- Test division.");

        int divIntA = 71, divIntB = 2;
        Assertions.assertEquals(35, divIntA / divIntB); // int,int - отбрасывает дробную часть
        System.out.println(String.format("Test int/int => %d / %d = %s", divIntA, divIntB, (divIntA * divIntB)));

        float divFloatA = -24.35f, divFloatB = -13.67f;
        Assertions.assertEquals(1.78f, divFloatA /divFloatB, 0.01f); // float, float
        System.out.println(String.format("Test float/float => %f / %f = %s", divFloatA, divFloatB, (divFloatA * divFloatB)));

        System.out.println("------------------------------------------------------------------------------------------");


        // Остаток от деления
        System.out.println("------------- Test remainder of the division.");

        int remDivIntA = 71, remDivIntB = 2;
        Assertions.assertEquals(1, remDivIntA % remDivIntB); // int,int
        System.out.println(String.format("Test remainder of the division int-int => %d // %d = %s",
                remDivIntA, remDivIntB, (remDivIntA % remDivIntB)));

        float remDivFloatA = -24.35f, remDivFloatB = -13.67f;
        Assertions.assertEquals(-10.68f, remDivFloatA % remDivFloatB, 0.01f); // float, float
        System.out.println(String.format("Test remainder of the division float-float => %f // %f = %s",
                remDivFloatA, remDivFloatB, (remDivFloatA % remDivFloatB)));

        System.out.println("------------------------------------------------------------------------------------------");


        // Инкремент, декремент
        System.out.println("------------- Test increment/decrement.");

        int varIntInc = 777;
        Assertions.assertEquals(777, varIntInc++); // int, Post-инкремент
        Assertions.assertEquals(779, ++varIntInc); // int, Pre-инкремент и старый Post
        Assertions.assertEquals(778, --varIntInc); // Pre
        Assertions.assertEquals(778, varIntInc--); // Post

        System.out.println("------------------------------------------------------------------------------------------");


        // Проверка переполнений при вычислениях byte
        System.out.println("------------- Test overflow Byte.");

        byte forCheckOverFlowByteA = Byte.MIN_VALUE;
        forCheckOverFlowByteA -= 1;
        Assertions.assertEquals(127, forCheckOverFlowByteA);
        System.out.println(String.format("Test overflow byte => %d - %d = %s", Byte.MIN_VALUE, 1, (Byte.MIN_VALUE - 1)));

        byte forCheckOverflowByteB = Byte.MAX_VALUE;
        forCheckOverflowByteB += 1;
        Assertions.assertEquals(-128, forCheckOverflowByteB);
        System.out.println(String.format("Test overflow byte => %d + %d = %s", Byte.MAX_VALUE, 1, (Byte.MAX_VALUE + 1)));

        System.out.println("------------------------------------------------------------------------------------------");


        // Проверка переполнений при вычислениях short
        System.out.println("------------- Test overflow Short.");

        short forCheckOverFlowShortA = Short.MIN_VALUE;
        forCheckOverFlowShortA -= 1;
        Assertions.assertEquals(32767, forCheckOverFlowShortA);
        System.out.println(String.format("Test overflow short => %d - %d = %s", Short.MIN_VALUE, 1, (Short.MIN_VALUE - 1)));

        short forCheckOverFlowShortB = Short.MAX_VALUE;
        forCheckOverFlowShortB += 1;
        Assertions.assertEquals(-32768, forCheckOverFlowShortB);
        System.out.println(String.format("Test overflow short => %d + %d = %s", Short.MAX_VALUE, 1, (Short.MAX_VALUE + 1)));

        System.out.println("------------------------------------------------------------------------------------------");


        // Проверка переполнений при вычислениях int
        System.out.println("------------- Test overflow Int.");

        int forCheckOverFlowIntA = Integer.MIN_VALUE;
        forCheckOverFlowIntA -= 1;
        Assertions.assertEquals(2147483647, forCheckOverFlowIntA);
        System.out.println(String.format("Test overflow int => %d - %d = %s", Integer.MIN_VALUE, 1, (Integer.MIN_VALUE - 1)));

        int forCheckOverFlowIntB = Integer.MAX_VALUE;
        forCheckOverFlowIntB += 1;
        Assertions.assertEquals(-2147483648, forCheckOverFlowIntB);
        System.out.println(String.format("Test overflow int => %d + %d = %s", Integer.MAX_VALUE, 1, (Integer.MAX_VALUE + 1)));

        System.out.println("------------------------------------------------------------------------------------------");


        // Проверка переполнений при вычислениях float
        System.out.println("------------- Test overflow Float.");

        float forCheckOverFlowFloatA = -3.4E+38f;
        forCheckOverFlowFloatA -= 1.0E+38f;
        Assertions.assertEquals(Float.NEGATIVE_INFINITY, forCheckOverFlowFloatA);
        System.out.println(String.format("Test overflow float => %e - %e = %s", -3.4E+38f, 1.0E+38f, (-3.4E+38f - 1.0E+38f)));

        float forCheckOverFlowFloatB = 3.4E+38f;
        forCheckOverFlowFloatB += 1.0E+38f;
        Assertions.assertEquals(Float.POSITIVE_INFINITY, forCheckOverFlowFloatB);
        System.out.println(String.format("Test overflow float => %e + %e = %s", 3.4E+38f, 1.0E+38f, (3.4E+38f + 1.0E+38f)));

        System.out.println("------------------------------------------------------------------------------------------");
    }

    @Test
    void testComputingOfDataTypes() {
        System.out.println("------------- Test computing combinations of data types.");

        Integer intOne = 6081;
        Double doubleOne = -0.005;
        Float floatOne = 0.5628e+02f;

        Assertions.assertEquals(6080.995, intOne + doubleOne, 0.0001f);
        System.out.println(String.format("Test int+double => %d + %f = %f", intOne, doubleOne, intOne + doubleOne));

        Assertions.assertEquals(108.049, intOne / floatOne, 0.0001f);
        System.out.println(String.format("Test int/float => %d / %f = %f", intOne, floatOne, intOne / floatOne));

        Assertions.assertEquals(-0.2814, floatOne * doubleOne, 0.00001f);
        System.out.println(String.format("Test float*double => %f * %f = %f", floatOne, doubleOne, floatOne * doubleOne));
    }
}
