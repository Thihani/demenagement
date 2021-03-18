package src.main.java.demenagement;

public class Main {

    public static void main(String[] args) {
	    deplacer();
    }

    public static void deplacer(){
        int numberOfCarton = 34;
        int capacity = 9;
        int numberOfFullVoyage = numberOfCarton/capacity;
        int lastVoyage = numberOfCarton % capacity;

        for (int i = 0; i < numberOfFullVoyage; i++) {
            System.out.println("Un voyage de " + capacity + "cartons");
        }

        System.out.println("Un voyage de " + lastVoyage + "cartons");

    }
}
