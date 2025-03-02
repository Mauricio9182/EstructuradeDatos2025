package umg.edu.gt.desarrollo.estructuradedatos2025;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import umg.edu.gt.desarrollo.estructuradedatos2025.ejercicios.EjercicioVectores;

import java.util.Arrays;

public class EstructuraDeDatos2025 {
    private static final Logger logger = LogManager.getLogger(EstructuraDeDatos2025.class);

    public static void main(String[] args) {
    }

    public static void testTribonacci() {
        EjercicioVectores ejercicio1 = new EjercicioVectores();
        int[] signature = {0, 0, 1};
        int n = 9;
        logger.info("Resultado Tribonacci: " + Arrays.toString(ejercicio1.tribonacci(signature, n)));
    }

    public static void testFindTotal() {
        EjercicioVectores ejercicio1 = new EjercicioVectores();
        int[] numbers1 = {1, 2, 3, 4, 5};
        int[] numbers2 = {17, 19, 21};
        int[] numbers3 = {5, 5, 5};

        logger.info("Puntuación: " + ejercicio1.findTotal(numbers1));
        logger.info("Puntuación: " + ejercicio1.findTotal(numbers2));
        logger.info("Puntuación: " + ejercicio1.findTotal(numbers3));
    }
}
