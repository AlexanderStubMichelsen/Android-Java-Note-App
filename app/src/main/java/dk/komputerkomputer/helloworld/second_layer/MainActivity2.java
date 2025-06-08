package dk.komputerkomputer.helloworld.second_layer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import dk.komputerkomputer.helloworld.R;
import dk.komputerkomputer.helloworld.first_layer.MainActivity;

public class MainActivity2 extends AppCompatActivity {

    private EditText edtEmTwo;
    private static final String FILENAME = "MainActivity2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        edtEmTwo = findViewById(R.id.edtEmTwo);
        load();

        // Save on text change
        edtEmTwo.addTextChangedListener(new TextWatcher() {
            @Override public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
            @Override public void afterTextChanged(Editable s) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                save();
                Toast.makeText(getApplicationContext(), "Saved", Toast.LENGTH_SHORT).show();
            }
        });

        // Set gesture detection
        GestureDetector gestureDetector = new GestureDetector(this, new GestureDetector.SimpleOnGestureListener() {
            @Override
            public void onLongPress(@NonNull MotionEvent e) {
                Toast.makeText(getApplicationContext(), "Long Press", Toast.LENGTH_SHORT).show();
                save(); // Ensure save before transition
                enterNoteFrontPage();
            }

            @Override
            public boolean onDoubleTap(@NonNull MotionEvent e) {
                Toast.makeText(getApplicationContext(), "Double Tap", Toast.LENGTH_SHORT).show();
                save(); // Ensure save before transition
                enterNoteFrontPage();
                return true;
            }
        });

        edtEmTwo.setOnTouchListener((v, event) -> {
            gestureDetector.onTouchEvent(event);
            return false;
        });

        // TODO: Add a button to go back to MainActivity manually (in layout and here).
    }

    private void enterNoteFrontPage() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    private void save() {
        String text = edtEmTwo.getText().toString();
        try (FileOutputStream fos = openFileOutput(FILENAME, Context.MODE_PRIVATE)) {
            fos.write(text.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void load() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(openFileInput(FILENAME)))) {
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line).append('\n');
            }
            edtEmTwo.setText(sb.toString().trim());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
