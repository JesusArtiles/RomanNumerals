public class RomanNumerals {

    private String romanNumber = "";

    public RomanNumerals(int number){
        romanNumber = numberToRomanNumber(number);
    }

    private static String numberToRomanNumber(int number){
        return TupleMapper.toMap(new NumberBreaker(number).breakdown());
    }

    public String getRomanNumber(){
        return romanNumber;
    }

}
