package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Dara44 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dara44);
    }
    public void onClickoe (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton398);
        Intent intent = new Intent(Dara44.this, Dara45.class);
        startActivity(intent);
    }
    public void onClickof (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton399);
        Intent intent = new Intent(Dara44.this, Dara45.class);
        startActivity(intent);
    }
    public void onClickog (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton400);
        Intent intent = new Intent(Dara44.this, Dara45.class);
        startActivity(intent);
    }
    public void onClickoh (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton401);
        Intent intent = new Intent(Dara44.this, Dara45.class);
        startActivity(intent);
        finish();
    }
}
