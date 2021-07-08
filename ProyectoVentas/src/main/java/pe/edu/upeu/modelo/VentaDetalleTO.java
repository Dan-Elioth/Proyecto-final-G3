package pe.edu.upeu.modelo;

import java.util.Comparator;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter

public class VentaDetalleTO {
    public String idVentaDetalle, idVenta, idProducto;
    public Double precioUnit, porcentUtil, cantidad, precioTotal;
    
    public VentaDetalleTO(){ }

    public VentaDetalleTO(String idVentaDetalle, String idVenta, String idProducto, Double precioUnit,
            Double porcentUtil, Double cantidad, Double precioTotal) {
        this.idVentaDetalle = idVentaDetalle;
        this.idVenta = idVenta;
        this.idProducto = idProducto;
        this.precioUnit = precioUnit;
        this.porcentUtil = porcentUtil;
        this.cantidad = cantidad;
        this.precioTotal = precioTotal;
    }

    public VentaDetalleTO(double cantidad, String idProducto, String idVenta, 
    double precioTotal){
        this.idProducto=idProducto;        
        this.idVenta=idVenta;        
        this.cantidad=cantidad;
        this.precioTotal=precioTotal;
    } 

    public static Comparator<VentaDetalleTO> idProductoComparator = new Comparator<VentaDetalleTO>() {
        public int compare(VentaDetalleTO s1, VentaDetalleTO s2) {
           String StudentName1 = s1.getIdProducto().toUpperCase();
           String StudentName2 = s2.getIdProducto().toUpperCase();    
           //ascending order
           return StudentName1.compareTo(StudentName2);    
           //descending order
           //return StudentName2.compareTo(StudentName1);
        }
    };  
}
