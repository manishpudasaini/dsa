package reversearray;

public class ReverseArrayRecursion {
    public static void main(String[] args) {
        ReverseArrayRecursion reverseArrayRecursion = new ReverseArrayRecursion();
        String[] array = {"Manish", "Bibek", "Bipin", "Sanjay", "Ronaldo", "Messi" };
        String[] reversedArray = new String[array.length];
        reverseArrayRecursion.reverseAnArray(array, reversedArray,array.length - 1, 0);

        for (String element :reversedArray) {
            System.out.print(element + " ");
        }
    }

     void reverseAnArray(String[] array, String[] reversedArray,Integer end, Integer start) {
        if (end >= 0) {
            reversedArray[start] = array[end];
            reverseAnArray(array, reversedArray,end - 1, start + 1);
        }
    }

}
