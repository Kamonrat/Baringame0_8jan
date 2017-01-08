package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Animal18 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal18);
    }
    public void onClickro (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton474);
        Intent intent = new Intent(Animal18.this, Animal19.class);
        startActivity(intent);
    }
    public void onClickrp (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton475);
        Intent intent = new Intent(Animal18.this, Animal19.class);
        startActivity(intent);
    }
    public void onClickrq (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton476);
        Intent intent = new Intent(Animal18.this, Animal19.class);
        startActivity(intent);
    }
    public void onClickrr (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton477);
        Intent intent = new Intent(Animal18.this,Animal19.class);
        startActivity(intent);
    }
}
