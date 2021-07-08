package pe.edu.upeu;

import java.io.Console;

import pe.edu.upeu.dao.CategoriaDao;
import pe.edu.upeu.dao.ProductoDao;
import pe.edu.upeu.dao.UsuarioDao;
import pe.edu.upeu.dao.VentaDao;
import pe.edu.upeu.gui.*;
import pe.edu.upeu.modelo.CategoriaTO;
import pe.edu.upeu.modelo.ProductoTO;
import pe.edu.upeu.util.LeerTeclado;
import pe.edu.upeu.util.UtilsX;
/**
 * Hello world!
 *
 */
public class App {

    public static void registrarCategoria(CategoriaTO categ) {
        System.out.println("--------Registro Categoria----------");
        System.out.println("IdCategoria: "+categ.getIdCateg()+" \tnombre: "+categ.getNombre());
    }
    
    public static void registrarProducto(ProductoTO prod) {
        System.out.println("--------Registro Producto----------");
        System.out.println("IdCategoria: "+prod.getIdCateg()+" \tnombre: "+prod.getNombre());
    }    

    public static void menuMain() {
        int opcionAlg=0;
        String mensaje="Seleccione el algortimo que desea probar:"+
        "\n1=Registro Categoria"+
        "\n12=Reporte Categoria"+
        "\n2=Registro Producto"+
        "\n21=Reportar Producto"+
        "\n3=Registro Usuario"+
        "\n4=Registro de Ventas"+
        "\n5=Reporte de ventas entre rango y fechas"+
        "\n0=Salir del Programa"
        ;
        CategoriaDao daoCat;
        UtilsX ut=new UtilsX();
        UsuarioDao uDao;
        ProductoDao proDao;
        VentaDao venDao;
        System.out.println(mensaje);
        LeerTeclado lt=new LeerTeclado();
        opcionAlg=lt.leer(0, mensaje);
        do {                        
            switch (opcionAlg) {
                case 1: daoCat=new CategoriaDao(); daoCat.registrarCategoria(); break;
                case 12: daoCat=new CategoriaDao(); daoCat.reportarCategoria(); break;
                case 2: proDao=new ProductoDao(); proDao.crearProducto(); break;
                case 21: proDao=new ProductoDao(); proDao.reportarProducto(); break;
                case 3:uDao=new UsuarioDao(); uDao.registrarUsuario();break;
                case 4: venDao=new VentaDao(); venDao.registroVentaGeneral();break;
                case 5: venDao=new VentaDao(); venDao.reporteVentasPorFechas(); break;
                default: System.out.println("Opcion no existe!"); break;    
            } 
            if(opcionAlg!=0){
                String dato=lt.leer("", "Desea seguir probando algoritmos?: SI/NO");
                if(dato.toUpperCase().equals("SI")){
                    opcionAlg=lt.leer(0, mensaje);

                }else{
                    opcionAlg=0;
                }
            }

        } while (opcionAlg!=0);        
    } 
    
    public static void validarAccesoSistema() {
        LeerTeclado lt=new LeerTeclado();
        System.out.println("-------------------→Acceso al Sistema←----------------");
        String usuario=lt.leer("", "Ingrese usuario:");
        Console cons=System.console();
        System.out.println("Ingre clave");
        char[] clave=cons.readPassword();
        UsuarioDao uDao=new UsuarioDao();
        if(uDao.login(usuario, String.valueOf(clave))){
            menuMain();

        }else{
            System.out.println("Error!... Intente Nuevamente!!");
            validarAccesoSistema();
        }
    
        
    }
    public static void main( String[] args ){

        //menuMain();
        validarAccesoSistema();
    }
}