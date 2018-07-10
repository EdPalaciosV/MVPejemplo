package com.example.usuario.mvpejemplo1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.usuario.mvpejemplo1.Callbacks.Operaciones;

public class OperacionesVista extends AppCompatActivity implements Operaciones.Vista{

    Operaciones.Presentador presentador;
    EditText ETnum1;
    EditText ETnum2;
    TextView tvResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ETnum1=findViewById(R.id.campoNumero1);
        ETnum2=findViewById(R.id.campoNumero2);
        tvResultado=findViewById(R.id.resultado);
        presentador = new OperacionesPresentador(this);
    }

    public void btnSuma(View view)
    {
        presentador.suma(ETnum1.getText().toString(),ETnum2.getText().toString());
    }

    public void btnResta(View view)
    {
        presentador.resta(ETnum1.getText().toString(),ETnum2.getText().toString());

    }

    public void btnMultiplicacion(View view)
    {

        presentador.multiplicacion(ETnum1.getText().toString(),ETnum2.getText().toString());
    }

    public void btnDivision(View view)
    {
        //ssasssdcsdd
        presentador.division(ETnum1.getText().toString(),ETnum2.getText().toString());

    }


    @Override
    public void showResult(String resultado) {
        tvResultado.setText("El resulado es:"+resultado);
    }
}
