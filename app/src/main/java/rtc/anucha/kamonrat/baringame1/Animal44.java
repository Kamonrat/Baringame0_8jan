package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Animal44 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal44);
    }
    public void onClickvo (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton578);
        Intent intent = new Intent(Animal44.this, Animal45.class);
        startActivity(intent);
    }
    public void onClickvp (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton579);
        Intent intent = new Intent(Animal44.this, Animal45.class);
        startActivity(intent);
    }
    public void onClickvq (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton580);
        Intent intent = new Intent(Animal44.this, Animal45.class);
        startActivity(intent);
    }
    public void onClickvr (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton581);
        Intent intent = new Intent(Animal44.this,Animal45.class);
        startActivity(intent);
    }
}
