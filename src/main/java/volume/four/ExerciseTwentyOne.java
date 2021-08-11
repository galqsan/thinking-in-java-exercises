package volume.four;
//Exercise 21:Create an enum of the least-valuable six types of paper currency.
// Loop through the values( ) and print each value and its ordinal( ).
//Exercise 22:Write a switch statement for the enum in the previous example.
// For each case, output a description of that particular currency.
enum PaperCurrency {
    ONE, TWO, FIVE, TEN, TWENTY, FIFTY
}

public class ExerciseTwentyOne {
    public static void main(String[] args) {
        for (PaperCurrency paperCurrency : PaperCurrency.values()) {
            System.out.println(paperCurrency + " is " + paperCurrency.ordinal() + " in the order");
        }
        PaperCurrency paperCurrency = PaperCurrency.ONE;
        switch (paperCurrency) {
            case ONE:
                System.out.println(paperCurrency.name() + " is the lowest paper currency");
                break;
            case TWO:

            case FIVE:
            case TEN:
            case TWENTY:
                System.out.println(paperCurrency.name() + " is the middle paper currency  ");
                break;
            case FIFTY:
                System.out.println(paperCurrency.name() + " is the  highest paper  currency in the list");
                break;
        }

    }
}