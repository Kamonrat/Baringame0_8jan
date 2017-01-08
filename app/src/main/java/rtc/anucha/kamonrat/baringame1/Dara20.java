package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Dara20 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dara20);
    }
    public void onClickkl (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton302);
        Intent intent = new Intent(Dara20.this, Dara21.class);
        startActivity(intent);
    }
    public void onClickkm (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton303);
        Intent intent = new Intent(Dara20.this, Dara21.class);
        startActivity(intent);
    }
    public void onClickkn (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton304);
        Intent intent = new Intent(Dara20.this, Dara21.class);
        startActivity(intent);
    }
    public void onClickko (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton305);
        Intent intent = new Intent(Dara20.this, Dara21.class);
        startActivity(intent);
    }
}
