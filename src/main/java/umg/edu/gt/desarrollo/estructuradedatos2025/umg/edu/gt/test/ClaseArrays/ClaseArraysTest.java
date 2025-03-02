package umg.edu.gt.desarrollo.estructuradedatos2025.umg.edu.gt.test.ClaseArrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class ClaseArraysTest {
    private static final Logger logger = LogManager.getLogger(ClaseArraysTest.class);

    @Test
    public void testClienteMasRico() {
        ClaseArrays claseArrays = new ClaseArrays();

        int[][] cuentas1 = {{1, 2, 3}, {3, 2, 1}};
        int[][] cuentas2 = {{1, 5}, {7, 3}, {3, 5}};
        int[][] cuentas3 = {{2, 8, 7}, {7, 1, 3}, {1, 9, 5}};

        // Casos de prueba
        assertEquals(6, claseArrays.clienteMasRico(cuentas1));
        assertEquals(10, claseArrays.clienteMasRico(cuentas2));

        // Forzando un fallo
        //assertEquals(18, claseArrays.clienteMasRico(cuentas3)); // Esto fallará intencionalmente
    }

    @Test
    public void testOrdenarDiagonales() {
        ClaseArrays claseArrays = new ClaseArrays();

        int[][] matriz1 = {
                {8, 4, 1},
                {4, 4, 1},
                {4, 8, 9}
        };
        int[][] resultado1 = {
                {4, 4, 1},
                {4, 8, 1},
                {8, 9, 9}
        };

        // Obtener la matriz resultante y mostrarla
        int[][] resultadoReal1 = claseArrays.ordenarDiagonales(matriz1);

        logger.info("Matriz ordenada:");
        for (int[] fila : resultadoReal1) {
            logger.info(Arrays.toString(fila));
        }

        // Comparar con el resultado esperado
        //assertArrayEquals(resultado1, resultadoReal1);
    }

    @Test
    public void testSumaMatriz() {
        ClaseArrays claseArrays = new ClaseArrays();

        int[][] matriz1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matriz2 = {{10, 20}, {30, 40}};

        assertEquals(45, claseArrays.sumaMatriz(matriz1));
        assertEquals(100, claseArrays.sumaMatriz(matriz2));
    }
}
