package com.softek.Persistencia;

import com.softek.Modelo.Producto;

public class ivaGeneral implements IImpuesto {

    public double calcularImpuesto(Producto p1){
        double impuestoGeneral = p1.getPrecio() * 0.21;
        return impuestoGeneral;
    }


}
