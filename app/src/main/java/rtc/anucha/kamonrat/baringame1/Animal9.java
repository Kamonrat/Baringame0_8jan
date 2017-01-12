package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Animal9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal9);
    }
    public void onClickqe (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton438);
        Intent intent = new Intent(Animal9.this, Animal10.class);
        startActivity(intent);
    }
    public void onClickqf (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton439);
        Intent intent = new Intent(Animal9.this, Animal10.class);
        startActivity(intent);
    }
    public void onClickqg (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton440);
        Intent intent = new Intent(Animal9.this, Animal10.class);
        startActivity(intent);
    }
    public void onClickqh (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton441);
        Intent intent = new Intent(Animal9.this,Animal10.class);
        startActivity(intent);
        finish();
    }
}
