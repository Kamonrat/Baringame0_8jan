package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Animal50 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal50);
    }
    public void onClickwm (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton602);
        Intent intent = new Intent(Animal50.this, Animal50.class);
        startActivity(intent);
    }
    public void onClickwn (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton603);
        Intent intent = new Intent(Animal50.this, Animal50.class);
        startActivity(intent);
    }
    public void onClickwo (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton604);
        Intent intent = new Intent(Animal50.this, Animal50.class);
        startActivity(intent);
    }
    public void onClickwp (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton605);
        Intent intent = new Intent(Animal50.this,Animal50.class);
        startActivity(intent);
        finish();
    }
}
