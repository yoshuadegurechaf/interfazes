package xyz.yoandroide.interfaz1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText numero1;
    private EditText numero2;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numero1 = findViewById(R.id.numero1);
        numero2 = findViewById(R.id.numero2);
        resultado = findViewById(R.id.resultado);

    }

    public void sumar(View view) {
        int suma = Integer.parseInt(numero1.getText().toString()) + Integer.parseInt(numero2.getText().toString());
        resultado.setText(suma + "");
    }

    public void restar(View view) {
        int resta = Integer.parseInt(numero1.getText().toString()) - Integer.parseInt(numero2.getText().toString());
        resultado.setText(resta + "");
    }

    public void multiplicar(View view) {
        int multi = Integer.parseInt(numero1.getText().toString()) * Integer.parseInt(numero2.getText().toString());
        resultado.setText(multi + "");
    }

    public void dividir(View view) {
        int division = Integer.parseInt(numero1.getText().toString()) / Integer.parseInt(numero2.getText().toString());
        resultado.setText(division + "");
    }

    public void fibonacci(View view) {
        int num = Integer.parseInt(numero1.getText().toString());
        resultado.setText(fibonacciRecursive(num) + "");
    }

    private int fibonacciRecursive(int num) {
        if (num <= 1) {
            return num;
        }
        return fibonacciRecursive(num - 1) + fibonacciRecursive(num - 2);
    }

    public void potencias(View view) {
        double base = Double.parseDouble(numero1.getText().toString());
        int exponente = Integer.parseInt(numero2.getText().toString());
        resultado.setText(potenciasRecursive(base, exponente) + "");
    }

    private double potenciasRecursive(double base, int exponente) {
        if (exponente == 0) {
            return 1;
        }
        return base * potenciasRecursive(base, exponente - 1);
    }

    public void factorial(View view) {
        int num = Integer.parseInt(numero1.getText().toString());
        long fact = factorialRecursive(num);
        resultado.setText(fact + "");
    }

    private long factorialRecursive(int num) {
        if (num == 0) {
            return 1;
        }
        return num * factorialRecursive(num - 1);
    }
}