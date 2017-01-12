package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Animal1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal1);
    }
    public void onClickq (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton21);
        Intent intent = new Intent(Animal1.this, Animal2.class);
        startActivity(intent);
    }
    public void onClickn (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton22);
        Intent intent = new Intent(Animal1.this, Animal2.class);
        startActivity(intent);
    }
    public void onClickc (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton23);
        Intent intent = new Intent(Animal1.this, Animal2.class);
        startActivity(intent);
    }
    public void onClickd (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton24);
        Intent intent = new Intent(Animal1.this,Animal2.class);
        startActivity(intent);
        finish();
    }
}
