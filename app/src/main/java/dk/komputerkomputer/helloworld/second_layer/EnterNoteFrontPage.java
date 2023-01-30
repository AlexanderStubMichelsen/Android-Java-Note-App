package dk.komputerkomputer.helloworld.second_layer;

import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

import dk.komputerkomputer.helloworld.first_layer.MainActivity;

public class EnterNoteFrontPage extends AppCompatActivity {

    public void enterNoteFrontPage() {
        Intent firstActivityIntent = new Intent(this, MainActivity.class);
        startActivity(firstActivityIntent);
    }
}
