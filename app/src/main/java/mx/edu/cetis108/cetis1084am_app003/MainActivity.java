package mx.edu.cetis108.cetis1084am_app003;

import android.graphics.ImageFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnCalcular_click(View v)
    {
        EditText num1,num2;
        num1=(EditText)findViewById(R.id.txtNumero1);
        num2=(EditText)findViewById(R.id.txtNumero2);
        final TextView lblResultado=(TextView)findViewById(R.id.lblResultado);

        double aux1=Double.valueOf(num1.getText().toString());
        double aux2=Double.valueOf(num2.getText().toString());
        if (aux1>aux2)
        {
            double resultado=aux1-aux2;
            lblResultado.setText("La resta es" +resultado);


        }
        else
        {

          double resultado=aux1+aux2;
            lblResultado.setText("La suma es" +resultado);
        }


    }
}
