package allen.com.labo2_linearlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonGuardar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonGuardar = findViewById(R.id.buttonguardar);
        buttonGuardar.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Log.d("Mensaje","Este es un mensaje de debug desde java");
                    }
                }

        );
    }

    public void cancelar(View v){
        Log.d("Mensaje","Este es un mensaje de debug desde xml");
    }
}
