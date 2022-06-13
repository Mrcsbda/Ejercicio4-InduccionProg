package App;
public class App {
    public static int numeroIf;
    public static int numeroWhile;
    public static int numeroDoWhile;
    public static int numeroFor;
    public static String Estacion;
    public static void main(String[] args) throws Exception {
        //Punto 1

        numeroIf = 0;
        if (numeroIf > 0) {
            System.out.println("La Variable numeroIf es un numero positivo");
        } else if (numeroIf < 0) {
            System.out.println("La Variable numeroIf es un numero negativo");
        } else {
            System.out.println("La variable numeroIf es igual a 0");
        }

        //Punto 2

        numeroWhile = 0;
        while (numeroWhile < 3) {
            System.out.println("La variable numeroWhile es igual a "+numeroWhile);
            numeroWhile = numeroWhile + 1;
        }

        //Punto 3

        numeroDoWhile = 2;
        do {
            System.out.println("La variable numeroDoWhile es igual a "+numeroDoWhile);
            numeroDoWhile = numeroDoWhile + 1;
        } while (numeroDoWhile < 3);

        //Punto 4

        for (numeroFor = 0; numeroFor <= 3; numeroFor=numeroFor+1) {
            System.out.println("La variable numeroFor es igual a "+numeroFor);
        }
        
        //Punto 5 
        
        Estacion = "Otoño";
        switch (Estacion) {
            case "Verano":
            System.out.println("Estamos en la estacion Verano");
            break;
            case "Invierno":
            System.out.println("Estamos en la estacion Invierno");
            break;
            case "Otoño":
            System.out.println("Estamos en la estacion Otoño");
            break;
            case "Primavera":
            System.out.println("Estamos en la estacion Primavera");
            break;
            default:
            System.out.println("No se encuentra información sobre la estación actual");
            break;
        }
    }
}
