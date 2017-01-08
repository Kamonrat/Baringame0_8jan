package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Dara13 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dara13);
    }
    public void onClickji (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton275);
        Intent intent = new Intent(Dara13.this, Dara14.class);
        startActivity(intent);
    }
    public void onClickjj (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton276);
        Intent intent = new Intent(Dara13.this, Dara14.class);
        startActivity(intent);
    }
    public void onClickjk (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton277);
        Intent intent = new Intent(Dara13.this, Dara14.class);
        startActivity(intent);
    }
    public void onClickjl (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton278);
        Intent intent = new Intent(Dara13.this, Dara14.class);
        startActivity(intent);
    }
}
