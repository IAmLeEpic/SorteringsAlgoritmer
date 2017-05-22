import javafx.util.converter.NumberStringConverter;

/**
 * Created by sjjo15 on 2017-04-03.
 */
public class sortAlgo {
    public static void main (String[] args){

        int numbers[] = {45, 32, 128, 42, 9, 83, 52, 96, 1, 75};
        double numbersDouble[] = {45.5, 32.2, 128.9, 42.7, 9.2, 83.1, 52.4, 96.7, 1.2, 75.8};
        String stringArray[] = {"hej", "dö", "leva", "bullar"};
        String alphabetArray[] = {"hej", "dö", "leva", "bullar"};

        selSort(numbers);
        selSort(numbersDouble);
        selStortLenght(stringArray);
        selStortAlpha(alphabetArray);

        //Printar ut den nya sorterade arrayen
        System.out.println("Sorterad Int Array: ");
        for(double i : numbers) {
            System.out.print(" " + i);
        }

        System.out.println("\n");

        System.out.println("Sorterad Double Array: ");
        for(double i : numbersDouble) {
            System.out.print(" " + i);
        }

        System.out.println("\n");

        System.out.println("Sorterad String Array: ");
        for(String i : stringArray) {
            System.out.print(" " + i);
        }

        System.out.println("\n");

        System.out.println("Sorterad String Array I Alfabetisk Ordning: ");
        for(String i : alphabetArray) {
            System.out.print(" " + i);
        }
    }

    public static void selSort(int[] numbers) {

        //Söker igenom arrayen och sätter första talet till minsta indexet
        for (int i = 0; i < numbers.length; i++) {
            int smallestIdx = i;
            //Jämför minsta indexet med indexet brevid och sätter den till mista index om den är mindre
            for (int j = i; j < numbers.length; j++) {
                if (numbers[smallestIdx] > numbers[j]) {
                    smallestIdx = j;
                }
            }
            //Byter plats på det den temporära indexet med det minsta
            numbers = swap(numbers, smallestIdx, i);
        }
    }

    public static void selSort(double[] numbers) {

        //Söker igenom arrayen och sätter första talet till minsta indexet
        for (int i = 0; i < numbers.length; i++) {
            int smallestIdx = i;
            //Jämför minsta indexet med indexet brevid och sätter den till mista index om den är mindre
            for (int j = i; j < numbers.length; j++) {
                if (numbers[smallestIdx] < numbers[j]) {
                    smallestIdx = j;
                }
            }
            //Byter plats på det den temporära indexet med det minsta
            numbers = swap(numbers, smallestIdx, i);
        }
    }

    public static void selStortLenght(String[] stringArray) {

        //Söker igenom arrayen och sätter första ordet till minsta indexet
        for (int i = 0; i < stringArray.length; i++) {
            int smallestIdx = i;
            //Jämför första ordets storlek med ordet brevid och sätter den till mista index om den är mindre
            for (int j = i; j < stringArray.length; j++) {
                if (stringArray[smallestIdx].length() > stringArray[j].length()) {
                    smallestIdx = j;
                }
            }
            //Byter plats på det den temporära indexet med det minsta
            stringArray = swap(stringArray, smallestIdx, i);
        }
    }

    public static void selStortAlpha(String[] alphabetArray) {

        //Söker igenom arrayen och sätter första ordet till minsta indexet
        for (int i = 0; i < alphabetArray.length; i++) {
            int smallestIdx = i;
            //Jämför första ordets storlek med ordet brevid och sätter den till mista index om den är mindre
            for (int j = i; j < alphabetArray.length; j++) {
                if (alphabetArray[smallestIdx].compareTo(alphabetArray[j]) > 0) {
                    smallestIdx = j;
                }
            }
            //Byter plats på det den temporära indexet med det minsta
            alphabetArray = swap(alphabetArray, smallestIdx, i);
        }
    }

    //Metod för sortering
    public static int[] swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
        return array;
    }

    //Metod för sortering
    public static double[] swap(double[] array, int a, int b) {
        double temp = array[a];
        array[a] = array[b];
        array[b] = temp;
        return array;
    }

    //Metod för sortering
    public static String[] swap(String[] array, int a, int b) {
        String temp = array[a];
        array[a] = array[b];
        array[b] = temp;
        return array;
    }
}
