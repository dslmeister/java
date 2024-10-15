import java.util.ArrayList;
import java.util.HashMap;

public class arrays {
    public static void main(String[] args) {
        //anlegen eine Arrays mit integern und der Array-Größe
        int[] nums={1,2,3,4,5,6};
        //Inhalt des Arrays ausgeben
        System.out.println("Array Durchlauf");
        for(int i=0;i<nums.length;i++){
            System.out.println("Indexnummer: " +i +", Nummer: " +nums[i]);
        }
        //zweidimensionales Array - Matrix
        int [][] matrix= {{1,2,3}, {4,5,6}, {7,8,9}};
        System.out.println("Matrix Durchlauf");
        for(int i =0;i< matrix.length;i++) // länge des äußeren Arrays
            for (int j=0; j < matrix[i].length;j++){
                System.out.println("Index vom Äußeren Array: " + i + ", Index vom inneren Index: "+j+"Zahl ist: " +matrix[i][j] );
    }
        //Arraylist
        System.out.println("Arraylist Beispiele");
        ArrayList<String> namen =new ArrayList<>();
        namen.add("Kyrill");
        namen.add("Daniela");
        System.out.println("Namen in der Liste: " +namen);
        System.out.println(namen.get(1));

        // HashMap erstellen
        HashMap<String, Integer> alterMap = new HashMap<>();

        // Werte in die HashMap einfügen
        alterMap.put("Kyrill", 22);
        alterMap.put("Daniela", 24);

        // Wert für "Daniela" abrufen
        int value = alterMap.get("Daniela");

        // Gesamte HashMap ausgeben
        System.out.println("AlterMap: " + alterMap);

        // Alter von "Daniela" ausgeben
        System.out.println("\nDanielas Alter ist: " + value);

}
}