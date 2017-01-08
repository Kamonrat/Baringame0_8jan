package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Animal22 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal22);
    }
    public void onClickse (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton490);
        Intent intent = new Intent(Animal22.this, Animal23.class);
        startActivity(intent);
    }
    public void onClicksf (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton491);
        Intent intent = new Intent(Animal22.this, Animal23.class);
        startActivity(intent);
    }
    public void onClicksg (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton492);
        Intent intent = new Intent(Animal22.this, Animal23.class);
        startActivity(intent);
    }
    public void onClicksh (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton493);
        Intent intent = new Intent(Animal22.this,Animal23.class);
        startActivity(intent);
    }
}
