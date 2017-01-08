package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Animal6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal6);
    }
    public void onClickps (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton431);
        Intent intent = new Intent(Animal6.this, Animal7.class);
        startActivity(intent);
    }
    public void onClickpt (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton432);
        Intent intent = new Intent(Animal6.this, Animal7.class);
        startActivity(intent);
    }
    public void onClickpu (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton433);
        Intent intent = new Intent(Animal6.this, Animal7.class);
        startActivity(intent);
    }
    public void onClickpv (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton434);
        Intent intent = new Intent(Animal6.this,Animal7.class);
        startActivity(intent);
    }
}
