package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Animal32 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal32);
    }
    public void onClickts (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton530);
        Intent intent = new Intent(Animal32.this, Animal33.class);
        startActivity(intent);
    }
    public void onClicktt (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton531);
        Intent intent = new Intent(Animal32.this, Animal33.class);
        startActivity(intent);
    }
    public void onClicktu (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton532);
        Intent intent = new Intent(Animal32.this, Animal33.class);
        startActivity(intent);
    }
    public void onClicktv (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton533);
        Intent intent = new Intent(Animal32.this,Animal33.class);
        startActivity(intent);
    }
}
