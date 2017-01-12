package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Animal47 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal47);
    }
    public void onClickwa (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton590);
        Intent intent = new Intent(Animal47.this, Animal48.class);
        startActivity(intent);
    }
    public void onClickwb (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton591);
        Intent intent = new Intent(Animal47.this, Animal48.class);
        startActivity(intent);
    }
    public void onClickwc (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton592);
        Intent intent = new Intent(Animal47.this, Animal48.class);
        startActivity(intent);
    }
    public void onClickwd (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton593);
        Intent intent = new Intent(Animal47.this,Animal48.class);
        startActivity(intent);
        finish();
    }
}
