package ej4;

public class Ejercicio4 {

    public static void main(String[] args) {
        double edjuan = 9;
        double edalber = Calculos4.calcular_edalber(edjuan);
        double edana = Calculos4.calcular_edana(edjuan);
        double edmama = Calculos4.calcular_edmama(edjuan, edalber, edana);

        System.out.println("Juan: " + edjuan);
        System.out.println("Ana: " + edana);
        System.out.println("Alberto: " + edalber);
        System.out.println("Mama: " + edmama);
    }
}
