package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Animal39 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal39);
    }
    public void onClickuu (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton558);
        Intent intent = new Intent(Animal39.this, Animal40.class);
        startActivity(intent);
    }
    public void onClickuv (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton559);
        Intent intent = new Intent(Animal39.this, Animal40.class);
        startActivity(intent);
    }
    public void onClickuw (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton560);
        Intent intent = new Intent(Animal39.this, Animal40.class);
        startActivity(intent);
    }
    public void onClickux (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton561);
        Intent intent = new Intent(Animal39.this,Animal40.class);
        startActivity(intent);
    }
}
