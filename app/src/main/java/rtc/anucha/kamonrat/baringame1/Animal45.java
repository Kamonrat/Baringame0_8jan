package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Animal45 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal45);
    }
    public void onClickvs (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton582);
        Intent intent = new Intent(Animal45.this, Animal46.class);
        startActivity(intent);
    }
    public void onClickvt (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton583);
        Intent intent = new Intent(Animal45.this, Animal46.class);
        startActivity(intent);
    }
    public void onClickvu (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton584);
        Intent intent = new Intent(Animal45.this, Animal46.class);
        startActivity(intent);
    }
    public void onClickvv (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton585);
        Intent intent = new Intent(Animal45.this,Animal46.class);
        startActivity(intent);
        finish();
    }
}
