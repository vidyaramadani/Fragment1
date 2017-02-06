package id.sch.smktelkom_mlg.learn.fragmen1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etNama;
    EditText etUmur;
    TextView tvHasil;
    TextView apa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNama = (EditText) findViewById(R.id.editTextNama);
        etUmur = (EditText) findViewById(R.id.editTextUmur);
        tvHasil = (TextView) findViewById(R.id.textViewHasil);

        findViewById(R.id.buttonProses)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        doProses();

                    }
                });
    }

    private void doProses() {
        tvHasil.setText(etNama.getText().toString()
                + "(" + etUmur.getText().toString() + " tahun)");

    }
}
