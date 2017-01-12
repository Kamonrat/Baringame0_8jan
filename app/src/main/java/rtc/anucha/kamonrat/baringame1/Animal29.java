package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Animal29 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal29);
    }
    public void onClicktg (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton518);
        Intent intent = new Intent(Animal29.this, Animal30.class);
        startActivity(intent);
    }
    public void onClickth (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton519);
        Intent intent = new Intent(Animal29.this, Animal30.class);
        startActivity(intent);
    }
    public void onClickti (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton520);
        Intent intent = new Intent(Animal29.this, Animal30.class);
        startActivity(intent);
    }
    public void onClicktj (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton521);
        Intent intent = new Intent(Animal29.this,Animal30.class);
        startActivity(intent);
        finish();
    }
}
