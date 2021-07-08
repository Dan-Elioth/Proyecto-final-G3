package pe.edu.upeu.modelo;

import lombok.Data;

@Data

public class VentaTO {

    public String idVenta, dniCliente, fechaventa;
    public Double netoTotal, igv, precioTotal;
    
}
