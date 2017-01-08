package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Animal23 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal23);
    }
    public void onClicksi (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton494);
        Intent intent = new Intent(Animal23.this, Animal24.class);
        startActivity(intent);
    }
    public void onClicksj (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton495);
        Intent intent = new Intent(Animal23.this, Animal24.class);
        startActivity(intent);
    }
    public void onClicksk (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton496);
        Intent intent = new Intent(Animal23.this, Animal24.class);
        startActivity(intent);
    }
    public void onClicksl (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton497);
        Intent intent = new Intent(Animal23.this,Animal24.class);
        startActivity(intent);
    }
}
