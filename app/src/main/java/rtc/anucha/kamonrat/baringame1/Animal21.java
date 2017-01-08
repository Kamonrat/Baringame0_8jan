package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Animal21 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal21);
    }
    public void onClicksa (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton485);
        Intent intent = new Intent(Animal21.this, Animal22.class);
        startActivity(intent);
    }
    public void onClicksb (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton487);
        Intent intent = new Intent(Animal21.this, Animal22.class);
        startActivity(intent);
    }
    public void onClicksc (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton488);
        Intent intent = new Intent(Animal21.this, Animal22.class);
        startActivity(intent);
    }
    public void onClicksd (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton489);
        Intent intent = new Intent(Animal21.this,Animal22.class);
        startActivity(intent);
    }
}
