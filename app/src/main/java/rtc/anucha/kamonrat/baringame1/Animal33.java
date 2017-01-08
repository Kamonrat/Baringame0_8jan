package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Animal33 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal33);
    }
    public void onClicktw (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton534);
        Intent intent = new Intent(Animal33.this, Animal34.class);
        startActivity(intent);
    }
    public void onClicktx (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton535);
        Intent intent = new Intent(Animal33.this, Animal34.class);
        startActivity(intent);
    }
    public void onClickty (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton536);
        Intent intent = new Intent(Animal33.this, Animal34.class);
        startActivity(intent);
    }
    public void onClicktz (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton537);
        Intent intent = new Intent(Animal33.this,Animal34.class);
        startActivity(intent);
    }
}
