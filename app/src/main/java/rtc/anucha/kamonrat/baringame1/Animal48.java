package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Animal48 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal48);
    }
    public void onClickwe (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton594);
        Intent intent = new Intent(Animal48.this, Animal49.class);
        startActivity(intent);
    }
    public void onClickwf (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton595);
        Intent intent = new Intent(Animal48.this, Animal49.class);
        startActivity(intent);
    }
    public void onClickwg (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton596);
        Intent intent = new Intent(Animal48.this, Animal49.class);
        startActivity(intent);
    }
    public void onClickwh (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton597);
        Intent intent = new Intent(Animal48.this,Animal49.class);
        startActivity(intent);
    }
}
