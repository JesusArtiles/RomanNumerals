import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TupleMapper {

    private static final String[][] romanTable = {{"I","II","III","IV","V","VI","VII","VIII","IX"}
                                    ,{"X","XX","XXX","XL","L","LX","LXX","LXXX","XC"}
                                    ,{"C","CC","CCC","CD","D","DC","DCC","DCCC","CM"}
                                    ,{"M","MM","MMM"}};

    public static String toMap(int[][] number){
        if (number == null) {
            System.out.println("Wrong number");
            return null;
        }
        return Arrays.stream(number)
        .map(s -> romanTable[s[1]][s[0]-1])
        .reduce("",(x,y)->x+y);
    }



}
