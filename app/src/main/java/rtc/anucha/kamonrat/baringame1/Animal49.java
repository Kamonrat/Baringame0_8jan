package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Animal49 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal49);
    }
    public void onClickwi (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton598);
        Intent intent = new Intent(Animal49.this, Animal50.class);
        startActivity(intent);
    }
    public void onClickwj (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton599);
        Intent intent = new Intent(Animal49.this, Animal50.class);
        startActivity(intent);
    }
    public void onClickwk (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton600);
        Intent intent = new Intent(Animal49.this, Animal50.class);
        startActivity(intent);
    }
    public void onClickwl (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton601);
        Intent intent = new Intent(Animal49.this,Animal50.class);
        startActivity(intent);
    }
}
