package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Animal3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal3);
    }
    public void onClickpg (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton29);
        Intent intent = new Intent(Animal3.this, Animal4.class);
        startActivity(intent);
    }
    public void onClickph (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton30);
        Intent intent = new Intent(Animal3.this, Animal4.class);
        startActivity(intent);
    }
    public void onClickpi (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton31);
        Intent intent = new Intent(Animal3.this, Animal4.class);
        startActivity(intent);
    }
    public void onClickpj (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton32);
        Intent intent = new Intent(Animal3.this,Animal4.class);
        startActivity(intent);
    }
}

