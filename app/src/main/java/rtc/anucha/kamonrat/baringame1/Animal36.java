package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Animal36 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal36);
    }
    public void onClickui (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton546);
        Intent intent = new Intent(Animal36.this, Animal37.class);
        startActivity(intent);
    }
    public void onClickuj (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton547);
        Intent intent = new Intent(Animal36.this, Animal37.class);
        startActivity(intent);
    }
    public void onClickuk (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton548);
        Intent intent = new Intent(Animal36.this, Animal37.class);
        startActivity(intent);
    }
    public void onClickul (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton549);
        Intent intent = new Intent(Animal36.this,Animal37.class);
        startActivity(intent);
    }
}
