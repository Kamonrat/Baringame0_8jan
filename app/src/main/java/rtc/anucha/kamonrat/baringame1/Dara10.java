package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Dara10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dara10);
    }
    public void onClickv (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton262);
        Intent intent = new Intent(Dara10.this, Dara11.class);
        startActivity(intent);
    }
    public void onClickiw (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton263);
        Intent intent = new Intent(Dara10.this, Dara11.class);
        startActivity(intent);
    }
    public void onClickix (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton264);
        Intent intent = new Intent(Dara10.this, Dara11.class);
        startActivity(intent);
    }
    public void onClickiy (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton265);
        Intent intent = new Intent(Dara10.this, Dara11.class);
        startActivity(intent);
    }
}
