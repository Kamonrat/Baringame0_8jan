package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Animal37 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal37);
    }
    public void onClickum (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton550);
        Intent intent = new Intent(Animal37.this, Animal38.class);
        startActivity(intent);
    }
    public void onClickun (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton551);
        Intent intent = new Intent(Animal37.this, Animal38.class);
        startActivity(intent);
    }
    public void onClickuo (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton552);
        Intent intent = new Intent(Animal37.this, Animal38.class);
        startActivity(intent);
    }
    public void onClickup (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton553);
        Intent intent = new Intent(Animal37.this,Animal38.class);
        startActivity(intent);
        finish();
    }
}
