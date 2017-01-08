package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Dara38 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dara38);
    }
    public void onClickng (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton374);
        Intent intent = new Intent(Dara38.this, Dara39.class);
        startActivity(intent);
    }
    public void onClicknh (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton375);
        Intent intent = new Intent(Dara38.this, Dara39.class);
        startActivity(intent);
    }
    public void onClickni (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton376);
        Intent intent = new Intent(Dara38.this, Dara39.class);
        startActivity(intent);
    }
    public void onClicknj (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton377);
        Intent intent = new Intent(Dara38.this, Dara39.class);
        startActivity(intent);
    }
}
