package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Animal8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal8);
    }
    public void onClickqa (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton430);
        Intent intent = new Intent(Animal8.this, Animal9.class);
        startActivity(intent);
    }
    public void onClickqb (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton435);
        Intent intent = new Intent(Animal8.this, Animal9.class);
        startActivity(intent);
    }
    public void onClickqc (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton436);
        Intent intent = new Intent(Animal8.this, Animal9.class);
        startActivity(intent);
    }
    public void onClickqd (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton437);
        Intent intent = new Intent(Animal8.this,Animal9.class);
        startActivity(intent);
    }
}
