package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Animal30 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal30);
    }
    public void onClicktk (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton444);
        Intent intent = new Intent(Animal30.this, Animal31.class);
        startActivity(intent);
    }
    public void onClicktl (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton523);
        Intent intent = new Intent(Animal30.this, Animal31.class);
        startActivity(intent);
    }
    public void onClicktm (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton524);
        Intent intent = new Intent(Animal30.this, Animal31.class);
        startActivity(intent);
    }
    public void onClicktn (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton525);
        Intent intent = new Intent(Animal30.this,Animal31.class);
        startActivity(intent);
        finish();
    }
}
