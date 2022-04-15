package ir.samiantec.basicbuilderdesignpatternexample;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final User user = new User.UserBuilder("Sina", "Moradi")
                .setAge(26)
                .build();

        Log.v("test", user.toString());
    }
}