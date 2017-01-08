package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Animal25 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal25);
    }
    public void onClicksq (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton502);
        Intent intent = new Intent(Animal25.this, Animal26.class);
        startActivity(intent);
    }
    public void onClicksr (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton503);
        Intent intent = new Intent(Animal25.this, Animal26.class);
        startActivity(intent);
    }
    public void onClickss (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton504);
        Intent intent = new Intent(Animal25.this, Animal26.class);
        startActivity(intent);
    }
    public void onClickst (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton505);
        Intent intent = new Intent(Animal25.this,Animal26.class);
        startActivity(intent);
    }
}
