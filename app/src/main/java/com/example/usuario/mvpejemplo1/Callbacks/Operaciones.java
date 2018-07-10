package com.example.usuario.mvpejemplo1.Callbacks;

public interface Operaciones {

    interface Vista{

        void showResult(String resultado);
    }

    interface Presentador {
        void showResult(String resultado);

        void suma(String numero1,String numero2);
        void resta(String numero1, String numero2);
        void multiplicacion(String numero1,String numero2);
        void division(String numero1, String numero2);

    }

    interface Modelo{

        void suma(String numero1,String numero2);
        void resta(String numero1, String numero2);
        void multiplicacion(String numero1,String numero2);
        void division(String numero1, String numero2);
    }
}
