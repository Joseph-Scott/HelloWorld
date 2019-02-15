public class Hello {

    public static void main(String[] args) {

        System.out.println("Hello, Joe!");

        int myFirstNumber = (10 + 5) + (2 * 10);
        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber * 2;
        int myFourthNumber = mySecondNumber * 3;

        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber + myFourthNumber;

        int myLastOne = 1000 - myTotal;

        System.out.println(myLastOne);
    }
}
