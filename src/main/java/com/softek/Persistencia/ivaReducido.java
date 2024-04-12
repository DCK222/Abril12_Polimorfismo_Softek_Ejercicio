package com.softek.Persistencia;

import com.softek.Modelo.Producto;

public class ivaReducido  implements IImpuesto  {


    public double calcularImpuesto(Producto p1){
        double impuestoIva = p1.getPrecio() * 0.038;
        return impuestoIva;

    }


}
