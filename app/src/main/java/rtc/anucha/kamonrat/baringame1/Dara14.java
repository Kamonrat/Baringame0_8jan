package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Dara14 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dara14);
    }
    public void onClickjm (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton274);
        Intent intent = new Intent(Dara14.this, Dara15.class);
        startActivity(intent);
    }
    public void onClickjn (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton279);
        Intent intent = new Intent(Dara14.this, Dara15.class);
        startActivity(intent);
    }
    public void onClickjo (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton280);
        Intent intent = new Intent(Dara14.this, Dara15.class);
        startActivity(intent);
    }
    public void onClickjp (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton281);
        Intent intent = new Intent(Dara14.this, Dara15.class);
        startActivity(intent);
    }
}
