package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Barin1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barin1);
    }
    public void onClicku (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton5);
        Intent intent = new Intent(Barin1.this,Barin2.class);
        startActivity(intent);
    }
    public void onClicki (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton6);
        Intent intent = new Intent(Barin1.this,Barin2.class);
        startActivity(intent);
    }
    public void onClicky (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton7);
        Intent intent = new Intent(Barin1.this,Barin2.class);
        startActivity(intent);
    }
    public void onClickt (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton8);
        Intent intent = new Intent(Barin1.this,Barin2.class);
        startActivity(intent);
        finish();
    }
}
