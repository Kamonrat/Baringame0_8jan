package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Dara39 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dara39);
    }
    public void onClicknk (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton378);
        Intent intent = new Intent(Dara39.this, Dara40.class);
        startActivity(intent);
    }
    public void onClicknl (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton379);
        Intent intent = new Intent(Dara39.this, Dara40.class);
        startActivity(intent);
    }
    public void onClicknm (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton380);
        Intent intent = new Intent(Dara39.this, Dara40.class);
        startActivity(intent);
    }
    public void onClicknn (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton381);
        Intent intent = new Intent(Dara39.this, Dara40.class);
        startActivity(intent);
    }
}
