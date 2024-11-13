/**
 * Search an element in an array
 */

public class SearchElement {
    public static void main(String[] args) {
        String[] array = {"Manish","Bibek","Bipin","Sanjay","Ronaldo","Messi"};

        //find where is sanjay
        for(int i=0;i<array.length;i++){
            if(array[i].equals("Sanjay")){
                System.out.println("Sanjay is at index "+i);
            }
        }
    }
}
