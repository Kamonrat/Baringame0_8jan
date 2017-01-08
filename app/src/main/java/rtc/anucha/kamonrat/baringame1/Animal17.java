package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Animal17 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal17);
    }
    public void onClickrk (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton470);
        Intent intent = new Intent(Animal17.this, Animal18.class);
        startActivity(intent);
    }
    public void onClickrl (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton471);
        Intent intent = new Intent(Animal17.this, Animal18.class);
        startActivity(intent);
    }
    public void onClickrm (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton472);
        Intent intent = new Intent(Animal17.this, Animal18.class);
        startActivity(intent);
    }
    public void onClickrn (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton473);
        Intent intent = new Intent(Animal17.this,Animal18.class);
        startActivity(intent);
    }
}
