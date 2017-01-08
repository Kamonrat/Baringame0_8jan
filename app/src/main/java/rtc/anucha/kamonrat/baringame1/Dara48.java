package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Dara48 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dara48);
    }
    public void onClickoy (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton414);
        Intent intent = new Intent(Dara48.this, Dara49.class);
        startActivity(intent);
    }
    public void onClickoz (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton415);
        Intent intent = new Intent(Dara48.this, Dara49.class);
        startActivity(intent);
    }
    public void onClickpa (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton416);
        Intent intent = new Intent(Dara48.this, Dara49.class);
        startActivity(intent);
    }
    public void onClickpb (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton417);
        Intent intent = new Intent(Dara48.this, Dara49.class);
        startActivity(intent);
    }
}
