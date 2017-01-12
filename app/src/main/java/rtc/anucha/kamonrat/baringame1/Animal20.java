package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Animal20 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal20);
    }
    public void onClickrw (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton482);
        Intent intent = new Intent(Animal20.this, Animal21.class);
        startActivity(intent);
    }
    public void onClickrx (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton483);
        Intent intent = new Intent(Animal20.this, Animal21.class);
        startActivity(intent);
    }
    public void onClickry (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton484);
        Intent intent = new Intent(Animal20.this, Animal21.class);
        startActivity(intent);
    }
    public void onClickrz (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton486);
        Intent intent = new Intent(Animal20.this,Animal21.class);
        startActivity(intent);
        finish();
    }
}
