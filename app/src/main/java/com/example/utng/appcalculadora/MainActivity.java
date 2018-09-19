package com.example.utng.appcalculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText  etUno;
    private EditText  etDos;
    private EditText  etRes;
    private Button btnSumar;
    private Button btnRestar;
    private Button btnDividir;
    private Button btnMultiplicar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUno = (EditText)findViewById(R.id.etUno);
        etDos = (EditText)findViewById(R.id.etDos);
        etRes = (EditText)findViewById(R.id.etResult);
        btnSumar = (Button)findViewById(R.id.btnSumar);
        btnDividir = (Button)findViewById(R.id.btnDividir);
        btnRestar = (Button)findViewById(R.id.btnRestar);
        btnMultiplicar = (Button)findViewById(R.id.btnMulti);

        btnSumar.setOnClickListener(this);
        btnDividir.setOnClickListener(this);
        btnRestar.setOnClickListener(this);
        btnMultiplicar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        double datoUno = Double.parseDouble(etUno.getText().toString());
        double datoDos = Double.parseDouble(etDos.getText().toString());
        double res = 0;
        switch (v.getId()){
            case R.id.btnSumar:
                res = datoUno + datoDos;
                break;
            case  R.id.btnRestar:
                res = datoUno - datoDos;
                break;
            case R.id.btnMulti:
                res = datoUno * datoDos;
                break;
            case R.id.btnDividir:
                res = datoUno / datoDos;
                break;
        }
        etRes.setText("Resultado:" + res);

    }
}
