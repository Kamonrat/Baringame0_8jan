package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Animal4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal4);
    }
    public void onClickpk (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton33);
        Intent intent = new Intent(Animal4.this, Animal5.class);
        startActivity(intent);
    }
    public void onClickpl (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton34);
        Intent intent = new Intent(Animal4.this, Animal5.class);
        startActivity(intent);
    }
    public void onClickpm (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton35);
        Intent intent = new Intent(Animal4.this, Animal5.class);
        startActivity(intent);
    }
    public void onClickpn (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton36);
        Intent intent = new Intent(Animal4.this,Animal5.class);
        startActivity(intent);
        finish();
    }
}

