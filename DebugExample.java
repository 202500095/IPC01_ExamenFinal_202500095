public class DebugExample {
    public static void main (String [] args){
        int [] numeros = {5, 8, 12, 20,7};
        int suma = 0;

        // Acción 1
        for (int i = 0; i < numeros.length; i++){
            suma += numeros [i];
            // Acción 2
            System.out.println("Iteración " + i +": suma parcial = " + suma);
        }

        double promedio = calcularPromedio(suma, numeros.length);
        // Acción 3
        System.out.println("Promedio = " + promedio);

        int mayor = encontrarMayor(numeros);
        //Acción 4
        System.out.println("Número mayor = " + mayor);

        //Acción 5
        System.out.println("Resultados finales -> Suma: " + suma + ", Promedio: " + promedio);
    }

    public static double calcularPromedio(int suma, int cantidad){
        return (double) suma/ cantidad;
    }

    public static int encontrarMayor(int[] arreglo){
        int mayor = arreglo [0];
        for(int num : arreglo){
            if (num > mayor){
                mayor = num;
            }
        }
        return mayor;
    }
}