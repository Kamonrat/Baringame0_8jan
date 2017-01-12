package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Animal10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal10);
    }
    public void onClickqi (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton442);
        Intent intent = new Intent(Animal10.this, Animal11.class);
        startActivity(intent);
    }
    public void onClickqj (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton443);
        Intent intent = new Intent(Animal10.this, Animal11.class);
        startActivity(intent);
    }
    public void onClickqk (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton446);
        Intent intent = new Intent(Animal10.this, Animal11.class);
        startActivity(intent);
    }
    public void onClickql (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton522);
        Intent intent = new Intent(Animal10.this,Animal11.class);
        startActivity(intent);
        finish();
    }
}
