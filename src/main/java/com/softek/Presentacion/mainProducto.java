package com.softek.Presentacion;

import com.softek.Modelo.Producto;
import com.softek.Persistencia.IImpuesto;
import com.softek.Persistencia.ivaGeneral;
import com.softek.Persistencia.ivaReducido;

public class mainProducto {
    public static void main(String[] args) {
        Producto producto = new Producto("Samsung A54 5G", 450.99);


        IImpuesto impuestoGeneral = new ivaGeneral();
        IImpuesto impuestoReducido = new ivaReducido();

        double GeneralCalcu = impuestoGeneral.calcularImpuesto(producto);
        double ReducidoCalcu = impuestoReducido.calcularImpuesto(producto);


        double precioFinal = producto.getPrecio() + GeneralCalcu + ReducidoCalcu;


        System.out.println("Producto: " + producto.getNombre());
        System.out.println("Precio sin IVA : " + producto.getPrecio());
        System.out.println("IVA General - 21%: " + GeneralCalcu);
        System.out.println("IVA Reducido - 3.8%: " + ReducidoCalcu);
        System.out.println("Precio final con IVA : " + precioFinal);
    }
}
