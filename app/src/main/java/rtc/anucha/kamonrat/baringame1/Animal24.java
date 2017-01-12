package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Animal24 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal24);
    }
    public void onClicksm (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton498);
        Intent intent = new Intent(Animal24.this, Animal25.class);
        startActivity(intent);
    }
    public void onClicksn (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton499);
        Intent intent = new Intent(Animal24.this, Animal25.class);
        startActivity(intent);
    }
    public void onClickso (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton500);
        Intent intent = new Intent(Animal24.this, Animal25.class);
        startActivity(intent);
    }
    public void onClicksp (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton501);
        Intent intent = new Intent(Animal24.this,Animal25.class);
        startActivity(intent);
        finish();
    }
}
