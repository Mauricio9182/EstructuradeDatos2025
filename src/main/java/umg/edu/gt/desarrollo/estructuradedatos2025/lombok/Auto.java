package umg.edu.gt.desarrollo.estructuradedatos2025.lombok;
import lombok.Data;
import lombok.Builder;
@Data
@Builder

public class Auto {
    private String marca;
    private String modelo;
    private int año;

}

