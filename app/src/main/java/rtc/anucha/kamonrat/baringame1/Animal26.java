package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Animal26 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal26);
    }
    public void onClicksu (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton506);
        Intent intent = new Intent(Animal26.this, Animal27.class);
        startActivity(intent);
    }
    public void onClicksv (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton507);
        Intent intent = new Intent(Animal26.this, Animal27.class);
        startActivity(intent);
    }
    public void onClicksw (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton508);
        Intent intent = new Intent(Animal26.this, Animal27.class);
        startActivity(intent);
    }
    public void onClicksx (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton509);
        Intent intent = new Intent(Animal26.this,Animal27.class);
        startActivity(intent);
        finish();
    }
}
