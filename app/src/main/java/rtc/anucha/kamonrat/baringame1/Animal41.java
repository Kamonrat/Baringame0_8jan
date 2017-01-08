package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Animal41 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal41);
    }
    public void onClickvc (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton566);
        Intent intent = new Intent(Animal41.this, Animal42.class);
        startActivity(intent);
    }
    public void onClickvd (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton567);
        Intent intent = new Intent(Animal41.this, Animal42.class);
        startActivity(intent);
    }
    public void onClickve (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton568);
        Intent intent = new Intent(Animal41.this, Animal42.class);
        startActivity(intent);
    }
    public void onClickvf (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton569);
        Intent intent = new Intent(Animal41.this,Animal42.class);
        startActivity(intent);
    }
}
