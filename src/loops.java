public class loops {
    public static void main(String[] args) {
        int i =0;
        while (i <=10) {
            System.out.println("While-Durchlauf Nummer " + i);
            i= i+1;
        }
        i = 10;
        do{
            System.out.println("Durchlauf Nummer " +i);
            i--;
        } while (i>=0);
    }
}