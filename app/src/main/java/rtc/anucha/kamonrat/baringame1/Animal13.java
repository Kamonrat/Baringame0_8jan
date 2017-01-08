package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Animal13 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal13);
    }
    public void onClickqu (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton454);
        Intent intent = new Intent(Animal13.this, Animal14.class);
        startActivity(intent);
    }
    public void onClickqv (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton455);
        Intent intent = new Intent(Animal13.this, Animal14.class);
        startActivity(intent);
    }
    public void onClickqw (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton456);
        Intent intent = new Intent(Animal13.this, Animal14.class);
        startActivity(intent);
    }
    public void onClickqx (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton457);
        Intent intent = new Intent(Animal13.this,Animal14.class);
        startActivity(intent);
    }
}
