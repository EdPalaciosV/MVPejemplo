package com.example.usuario.mvpejemplo1;

import com.example.usuario.mvpejemplo1.Callbacks.Operaciones;

public class OperacionesModelo implements Operaciones.Modelo {


    int operacion;
    private  Operaciones.Presentador presentador;

    public OperacionesModelo(Operaciones.Presentador presentador)
    {
        this.presentador=presentador;
    }

    @Override
    public void suma(String numero1, String numero2) {

        operacion=Integer.parseInt(numero1)+Integer.parseInt(numero2);
        presentador.showResult(String.valueOf(operacion));

    }

    @Override
    public void resta(String numero1, String numero2) {
        operacion= Integer.parseInt(numero1)-Integer.parseInt(numero2);
        presentador.showResult(String.valueOf(operacion));
    }

    @Override
    public void multiplicacion(String numero1, String numero2) {
        operacion= Integer.parseInt(numero1)*Integer.parseInt(numero2);
        presentador.showResult(String.valueOf(operacion));
    }

    @Override
    public void division(String numero1, String numero2) {

        operacion= Integer.parseInt(numero1)/Integer.parseInt(numero2);
        presentador.showResult(String.valueOf(operacion));
    }
}
