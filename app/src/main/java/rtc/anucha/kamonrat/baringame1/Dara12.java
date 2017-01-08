package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Dara12 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dara12);
    }
    public void onClickje (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton266);
        Intent intent = new Intent(Dara12.this, Dara13.class);
        startActivity(intent);
    }
    public void onClickjf (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton271);
        Intent intent = new Intent(Dara12.this, Dara13.class);
        startActivity(intent);
    }
    public void onClickjg (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton272);
        Intent intent = new Intent(Dara12.this, Dara13.class);
        startActivity(intent);
    }
    public void onClickjh (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton273);
        Intent intent = new Intent(Dara12.this, Dara13.class);
        startActivity(intent);
    }
}
