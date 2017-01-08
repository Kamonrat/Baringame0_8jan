package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Animal38 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal38);
    }
    public void onClickuq (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton554);
        Intent intent = new Intent(Animal38.this, Animal39.class);
        startActivity(intent);
    }
    public void onClickur (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton555);
        Intent intent = new Intent(Animal38.this, Animal39.class);
        startActivity(intent);
    }
    public void onClickus (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton556);
        Intent intent = new Intent(Animal38.this, Animal39.class);
        startActivity(intent);
    }
    public void onClickut (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton557);
        Intent intent = new Intent(Animal38.this,Animal39.class);
        startActivity(intent);
    }
}
