package umg.edu.gt.desarrollo.estructuradedatos2025.lombok;

public class Main {
    public static void main (String[] args) {
        Auto auto3 = Auto.builder()
                .marca("mazda")
                .modelo("rx7")
                .año(1997)
                .build();
        System.out.println(auto3);

    }
}
