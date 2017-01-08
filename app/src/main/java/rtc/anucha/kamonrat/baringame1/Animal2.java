package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Animal2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal2);
    }
    public void onClicke (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton25);
        Intent intent = new Intent(Animal2.this, Animal3.class);
        startActivity(intent);
    }
    public void onClickx (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton26);
        Intent intent = new Intent(Animal2.this, Animal3.class);
        startActivity(intent);
    }
    public void onClickl (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton27);
        Intent intent = new Intent(Animal2.this, Animal3.class);
        startActivity(intent);
    }
    public void onClickm (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton28);
        Intent intent = new Intent(Animal2.this,Animal3.class);
        startActivity(intent);
    }
}
