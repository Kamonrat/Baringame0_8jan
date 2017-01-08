package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Animal40 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal40);
    }
    public void onClickuy (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton562);
        Intent intent = new Intent(Animal40.this, Animal41.class);
        startActivity(intent);
    }
    public void onClickuz (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton563);
        Intent intent = new Intent(Animal40.this, Animal41.class);
        startActivity(intent);
    }
    public void onClickva (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton564);
        Intent intent = new Intent(Animal40.this, Animal41.class);
        startActivity(intent);
    }
    public void onClickvb (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton565);
        Intent intent = new Intent(Animal40.this,Animal41.class);
        startActivity(intent);
    }
}
