package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Animal34 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal34);
    }
    public void onClickua (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton538);
        Intent intent = new Intent(Animal34.this, Animal35.class);
        startActivity(intent);
    }
    public void onClickub (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton539);
        Intent intent = new Intent(Animal34.this, Animal35.class);
        startActivity(intent);
    }
    public void onClickuc (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton540);
        Intent intent = new Intent(Animal34.this, Animal35.class);
        startActivity(intent);
    }
    public void onClickud (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton541);
        Intent intent = new Intent(Animal34.this,Animal35.class);
        startActivity(intent);
        finish();
    }
}
