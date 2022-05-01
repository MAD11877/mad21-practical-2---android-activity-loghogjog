package sg.edu.np.mad.tristantanmadpractical2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        User u = new User();
        TextView name = findViewById(R.id.username);
        name.setText(u.name);

        TextView desc = findViewById(R.id.description);
        desc.setText(u.description);

        TextView f = findViewById(R.id.follow);
        if(!u.followed){
            f.setText("Follow");
            u.followed = true;
        }
        else{
            f.setText("Followed");
            u.followed = false;
        }

        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!u.followed){
                    f.setText("Follow");
                    u.followed = true;
                }
                else{
                    f.setText("Followed");
                    u.followed = false;
                }

            }
        });
    }


}