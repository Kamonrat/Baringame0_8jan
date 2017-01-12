package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Animal43 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal43);
    }
    public void onClickvk (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton574);
        Intent intent = new Intent(Animal43.this, Animal44.class);
        startActivity(intent);
    }
    public void onClickvl (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton575);
        Intent intent = new Intent(Animal43.this, Animal44.class);
        startActivity(intent);
    }
    public void onClickvm (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton576);
        Intent intent = new Intent(Animal43.this, Animal44.class);
        startActivity(intent);
    }
    public void onClickvn (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton577);
        Intent intent = new Intent(Animal43.this,Animal44.class);
        startActivity(intent);
        finish();

    }
}
