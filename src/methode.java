public class methode {
    //Methode ohne Rückgabewert
    public static void printGreeting(){
        System.out.println("Hallo und Willkommen");
    }
    //Methode mit Rückgabewert
    public static int addNumbers(int a, int b){
        System.out.println("ich bin eine Add-Methode");
        int result= a+b;
        return result;
    }
    public static int quadrat(int a){
        System.out.println("Hallo ich bin die Quadtrad-Methode");
        int result=a*a;
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Greeting Methode");
        printGreeting();
        System.out.println("\n----------\n Add-Methode");
        // 4+5
        int sum=addNumbers(4,5);
        System.out.println("Die Summe von 4 +5 = " +sum);
        //8+12
        int sum1=addNumbers(8 ,12);
        System.out.println("Die Summe von  8 +12 = " +sum1);
        //50+100
        int sum2=addNumbers(50 ,100);
        System.out.println("Die Summe von 50 +100 = " +sum2);
        System.out.println("\n----------\n Quadrat-Methode");
        // 9^2
        int square= quadrat(9);
                System.out.println("Die Quadratzahl von 9 = " + square);
    }
}
