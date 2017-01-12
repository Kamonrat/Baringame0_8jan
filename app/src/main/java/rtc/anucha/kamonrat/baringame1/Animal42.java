package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Animal42 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal42);
    }
    public void onClickvg (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton570);
        Intent intent = new Intent(Animal42.this, Animal43.class);
        startActivity(intent);
    }
    public void onClickvh (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton571);
        Intent intent = new Intent(Animal42.this, Animal43.class);
        startActivity(intent);
    }
    public void onClickvi (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton572);
        Intent intent = new Intent(Animal42.this, Animal43.class);
        startActivity(intent);
    }
    public void onClickvj (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton573);
        Intent intent = new Intent(Animal42.this,Animal43.class);
        startActivity(intent);
        finish();
    }
}
