package com.example.usuario.mvpejemplo1;

import com.example.usuario.mvpejemplo1.Callbacks.Operaciones;

public class OperacionesPresentador implements Operaciones.Presentador {

private Operaciones.Vista vista;
private Operaciones.Modelo modelo;

public OperacionesPresentador(Operaciones.Vista vista)
{
    this.vista=vista;

    modelo = new OperacionesModelo(this);
}

    @Override
    public void showResult(String resultado) {

    if(vista!=null)
    {
        vista.showResult(resultado);
    }
    }

    @Override
    public void suma(String numero1, String numero2) {

    if (vista!=null)
    {
        modelo.suma(numero1,numero2);
    }
    }

    @Override
    public void resta(String numero1, String numero2) {
        if (vista!=null)
        {
            modelo.resta(numero1,numero2);
        }
    }

    @Override
    public void multiplicacion(String numero1, String numero2) {

        if (vista!=null)
        {
            modelo.multiplicacion(numero1,numero2);
        }
    }

    @Override
    public void division(String numero1, String numero2) {

        if (vista!=null)
        {
            modelo.division(numero1,numero2);
        }
    }
}
