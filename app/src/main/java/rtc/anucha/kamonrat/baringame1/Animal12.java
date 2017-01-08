package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Animal12 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal12);
    }
    public void onClickqq (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton450);
        Intent intent = new Intent(Animal12.this, Animal13.class);
        startActivity(intent);
    }
    public void onClickqr (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton451);
        Intent intent = new Intent(Animal12.this, Animal13.class);
        startActivity(intent);
    }
    public void onClickqs (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton452);
        Intent intent = new Intent(Animal12.this, Animal13.class);
        startActivity(intent);
    }
    public void onClickqt (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton453);
        Intent intent = new Intent(Animal12.this,Animal13.class);
        startActivity(intent);
    }
}
