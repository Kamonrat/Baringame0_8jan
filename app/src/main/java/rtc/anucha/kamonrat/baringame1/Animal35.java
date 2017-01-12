package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Animal35 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal35);
    }
    public void onClickue (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton542);
        Intent intent = new Intent(Animal35.this, Animal36.class);
        startActivity(intent);
    }
    public void onClickuf (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton543);
        Intent intent = new Intent(Animal35.this, Animal36.class);
        startActivity(intent);
    }
    public void onClickug (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton544);
        Intent intent = new Intent(Animal35.this, Animal36.class);
        startActivity(intent);
    }
    public void onClickuh (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton545);
        Intent intent = new Intent(Animal35.this,Animal36.class);
        startActivity(intent);
        finish();
    }
}
