package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Animal28 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal28);
    }
    public void onClicktc (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton514);
        Intent intent = new Intent(Animal28.this, Animal29.class);
        startActivity(intent);
    }
    public void onClicktd (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton515);
        Intent intent = new Intent(Animal28.this, Animal29.class);
        startActivity(intent);
    }
    public void onClickte (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton516);
        Intent intent = new Intent(Animal28.this, Animal29.class);
        startActivity(intent);
    }
    public void onClicktf (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton517);
        Intent intent = new Intent(Animal28.this,Animal29.class);
        startActivity(intent);
    }
}
