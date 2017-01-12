package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Dara7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dara7);
    }
    public void onClickij (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton250);
        Intent intent = new Intent(Dara7.this, Dara8.class);
        startActivity(intent);
    }
    public void onClickik (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton251);
        Intent intent = new Intent(Dara7.this, Dara8.class);
        startActivity(intent);
    }
    public void onClickil (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton252);
        Intent intent = new Intent(Dara7.this, Dara8.class);
        startActivity(intent);
    }
    public void onClickim (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton253);
        Intent intent = new Intent(Dara7.this, Dara8.class);
        startActivity(intent);
        finish();
    }
}
