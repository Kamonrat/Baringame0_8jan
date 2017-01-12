package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Dara3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dara3);
    }
    public void onClickhs (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton234);
        Intent intent = new Intent(Dara3.this, Dara4.class);
        startActivity(intent);
    }
    public void onClickht (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton235);
        Intent intent = new Intent(Dara3.this, Dara4.class);
        startActivity(intent);
    }
    public void onClickhu (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton236);
        Intent intent = new Intent(Dara3.this, Dara4.class);
        startActivity(intent);
    }
    public void onClickhv (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton237);
        Intent intent = new Intent(Dara3.this, Dara4.class);
        startActivity(intent);
        finish();

    }
}
