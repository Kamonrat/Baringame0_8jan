package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Animal16 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal16);
    }
    public void onClickrg (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton466);
        Intent intent = new Intent(Animal16.this, Animal17.class);
        startActivity(intent);
    }
    public void onClickrh (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton467);
        Intent intent = new Intent(Animal16.this, Animal17.class);
        startActivity(intent);
    }
    public void onClickri (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton468);
        Intent intent = new Intent(Animal16.this, Animal17.class);
        startActivity(intent);
    }
    public void onClickrj (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton469);
        Intent intent = new Intent(Animal16.this,Animal17.class);
        startActivity(intent);
    }
}
