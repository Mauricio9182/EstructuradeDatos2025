package umg.edu.gt.desarrollo.estructuradedatos2025.umg.edu.gt.test.ClaseArrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ClaseArrays {
    private static final Logger logger = LogManager.getLogger(ClaseArrays.class);

    // Ejercicio 1: Cliente más rico
    public int clienteMasRico(int[][] cuentas) {
        int maxRiqueza = 0;
        for (int[] cuenta : cuentas) {
            int suma = 0;
            for (int dinero : cuenta) {
                suma += dinero;
            }
            maxRiqueza = Math.max(maxRiqueza, suma);
        }
        return maxRiqueza;
    }

    // Ejercicio 2: Ordenar diagonales
    public int[][] ordenarDiagonales(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        // Ordenar diagonales inferiores y principales
        for (int i = 0; i < filas; i++) {
            ordenarYReemplazarDiagonal(matriz, i, 0);
        }

        // Ordenar diagonales superiores
        for (int j = 1; j < columnas; j++) {
            ordenarYReemplazarDiagonal(matriz, 0, j);
        }

        return matriz;
    }

    private void ordenarYReemplazarDiagonal(int[][] matriz, int fila, int columna) {
        List<Integer> diagonal = new ArrayList<>();
        int i = fila, j = columna;

        // Obtener los elementos de la diagonal
        while (i < matriz.length && j < matriz[0].length) {
            diagonal.add(matriz[i][j]);
            i++;
            j++;
        }

        // Ordenar la diagonal
        Collections.sort(diagonal);

        // Reemplazar los elementos en la matriz
        i = fila;
        j = columna;
        int index = 0;
        while (i < matriz.length && j < matriz[0].length) {
            matriz[i][j] = diagonal.get(index++);
            i++;
            j++;
        }
    }

    // Ejercicio 3: Suma de la matriz
    public int sumaMatriz(int[][] matriz) {
        int suma = 0;
        for (int[] fila : matriz) {
            for (int num : fila) {
                suma += num;
            }
        }
        return suma;
    }

    public static void main(String[] args) {
        ClaseArrays claseArrays = new ClaseArrays();

        int[][] cuentas = {{1, 2, 3}, {3, 2, 1}};
        logger.info("Cliente más rico: " + claseArrays.clienteMasRico(cuentas));

        int[][] matriz = {{3, 3, 1}, {2, 2, 1}, {1, 1, 1}};
        int[][] ordenada = claseArrays.ordenarDiagonales(matriz);
        logger.info("Matriz ordenada: ");
        for (int[] fila : ordenada) {
            logger.info(Arrays.toString(fila));
        }

        int[][] sumaMatriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        logger.info("Suma de la matriz: " + claseArrays.sumaMatriz(sumaMatriz));
    }
}
