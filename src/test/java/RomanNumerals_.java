import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(org.junit.runners.Parameterized.class)
public class RomanNumerals_ {
    public static final int MIN = 0;
    public static final int MAX = 4000;
    public static final String[] ONES = {"I", "II", "III"};
    public static final String[] TENS = {"X", "XX", "XXX"};
    public static final String[] HUNDREDS = {"C", "CC", "CCC"};
    public static final String[] THOUSANDS = {"M", "MM", "MMM"};
    private final int number;
    private final String value;

    public RomanNumerals_(int number, String value) {
        this.number = number;
        this.value = value;
    }

    @Test
    public void execute() {
        assertThat(new RomanNumerals(number).getRomanNumber()).isEqualTo(this.value);

    }


    @Parameterized.Parameters
    public static Object[][] cases() {
        return new Object[][] {
                {-1, null},
                {0, null},
                {4000, null},
                {5000, null},
                {1, "I"},
                {2, "II"},
                {3, "III"},
                {10, "X"},
                {11, "XI"},
                {20, "XX"},
                {30, "XXX"},
                {100, "C"},
                {110, "CX"},
                {111, "CXI"},
                {200, "CC"},
                {300, "CCC"},
                {1000, "M"},
                {1100, "MC"},
                {2000, "MM"},
                {3000, "MMM"},
                {3593,"MMMDXCIII"}

        };
    }


    public class IllegalParameterException extends RuntimeException {
    }
}
