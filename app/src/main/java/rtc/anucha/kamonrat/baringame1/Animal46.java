package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Animal46 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal46);
    }
    public void onClickvw (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton586);
        Intent intent = new Intent(Animal46.this, Animal47.class);
        startActivity(intent);
    }
    public void onClickvx (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton587);
        Intent intent = new Intent(Animal46.this, Animal47.class);
        startActivity(intent);
    }
    public void onClickvy (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton588);
        Intent intent = new Intent(Animal46.this, Animal47.class);
        startActivity(intent);
    }
    public void onClickvz (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton589);
        Intent intent = new Intent(Animal46.this,Animal47.class);
        startActivity(intent);
        finish();
    }
}
