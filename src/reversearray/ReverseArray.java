package reversearray;

public class ReverseArray {
    public static void main(String[] args) {
        String[] array = {"Manish","Bibek","Bipin","Sanjay","Ronaldo","Messi"};

        int start = 0;
        int end = array.length-1;
        String temp= null;

        while (start < end) {
            temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }

        for (String element : array) {
            System.out.print(element + " ");
        }

    }



}

