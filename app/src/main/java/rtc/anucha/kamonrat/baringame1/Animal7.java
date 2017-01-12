package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Animal7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal7);
    }
    public void onClickpw (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton41);
        Intent intent = new Intent(Animal7.this, Animal8.class);
        startActivity(intent);
    }
    public void onClickpx (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton427);
        Intent intent = new Intent(Animal7.this, Animal8.class);
        startActivity(intent);
    }
    public void onClickpy (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton428);
        Intent intent = new Intent(Animal7.this, Animal8.class);
        startActivity(intent);
    }
    public void onClickpz (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton429);
        Intent intent = new Intent(Animal7.this,Animal8.class);
        startActivity(intent);
        finish();
    }
}
