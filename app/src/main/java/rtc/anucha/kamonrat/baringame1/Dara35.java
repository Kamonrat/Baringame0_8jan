package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Dara35 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dara35);
    }
    public void onClickmu (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton362);
        Intent intent = new Intent(Dara35.this, Dara36.class);
        startActivity(intent);
    }
    public void onClickmv (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton363);
        Intent intent = new Intent(Dara35.this, Dara36.class);
        startActivity(intent);
    }
    public void onClickmw (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton364);
        Intent intent = new Intent(Dara35.this, Dara36.class);
        startActivity(intent);
    }
    public void onClickmx (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton365);
        Intent intent = new Intent(Dara35.this, Dara36.class);
        startActivity(intent);
    }
}
