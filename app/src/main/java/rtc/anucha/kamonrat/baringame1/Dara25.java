package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Dara25 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dara25);
    }
    public void onClicklg (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton322);
        Intent intent = new Intent(Dara25.this, Dara26.class);
        startActivity(intent);
    }
    public void onClicklh (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton323);
        Intent intent = new Intent(Dara25.this, Dara26.class);
        startActivity(intent);
    }
    public void onClickli (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton324);
        Intent intent = new Intent(Dara25.this, Dara26.class);
        startActivity(intent);
    }
    public void onClicklj (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton325);
        Intent intent = new Intent(Dara25.this, Dara26.class);
        startActivity(intent);
    }
}
