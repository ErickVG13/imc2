package lol.erickes.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btCalcular;
    private EditText eTPeso, eTAltura;
    private TextView tvResultado;
    private float fPeso, fAltura, fresultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btCalcular = (Button) findViewById(R.id.btCalcular);
        eTPeso = (EditText) findViewById(R.id.eTPeso);
        eTAltura = (EditText) findViewById(R.id.eTAltura);


        final Context Mycontext = getApplicationContext();

        btCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                fPeso= Float.parseFloat(String.valueOf(eTPeso.getText()));
                fAltura= Float.parseFloat(eTAltura.getText().toString());
                fresultado= fPeso/(fAltura*fAltura);
                tvResultado.setText(""+fresultado);

                Toast.makeText(Mycontext, "El boton esta OK", Toast.LENGTH_LONG);
            }
        });



    }
}