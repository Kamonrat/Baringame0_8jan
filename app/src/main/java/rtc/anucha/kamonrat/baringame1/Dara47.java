package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Dara47 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dara47);
    }
    public void onClickou (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton410);
        Intent intent = new Intent(Dara47.this, Dara48.class);
        startActivity(intent);
    }
    public void onClickov (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton411);
        Intent intent = new Intent(Dara47.this, Dara48.class);
        startActivity(intent);
    }
    public void onClickow (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton412);
        Intent intent = new Intent(Dara47.this, Dara48.class);
        startActivity(intent);
    }
    public void onClickox (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton413);
        Intent intent = new Intent(Dara47.this, Dara48.class);
        startActivity(intent);

    }
}
