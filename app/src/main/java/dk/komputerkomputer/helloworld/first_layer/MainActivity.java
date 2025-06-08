package dk.komputerkomputer.helloworld.first_layer;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

import dk.komputerkomputer.helloworld.R;
import dk.komputerkomputer.helloworld.second_layer.MainActivity2;
import dk.komputerkomputer.helloworld.second_layer.MainActivity3;
import dk.komputerkomputer.helloworld.second_layer.MainActivity4;
import dk.komputerkomputer.helloworld.second_layer.MainActivity5;
import dk.komputerkomputer.helloworld.second_layer.MainActivity6;
import dk.komputerkomputer.helloworld.second_layer.MainActivity7;
import dk.komputerkomputer.helloworld.second_layer.MainActivity8;

public class MainActivity extends AppCompatActivity {

    private final int[] editTextIds = {
            R.id.textView1mTwo,
            R.id.textView2mTwo,
            R.id.textView3mTwo,
            R.id.textView4mTwo,
            R.id.textView5mTwo,
            R.id.textView6mTwo,
            R.id.textView7mTwo
    };

    private final Class<?>[] activityClasses = {
            MainActivity2.class,
            MainActivity3.class,
            MainActivity4.class,
            MainActivity5.class,
            MainActivity6.class,
            MainActivity7.class,
            MainActivity8.class
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (int i = 0; i < editTextIds.length; i++) {
            int index = i;
            EditText editText = findViewById(editTextIds[i]);
            String filename = "MainActivity" + (11 + i);

            load(editText, filename);

            setupEditText(editText, filename, () -> {
                save(editText, filename);
                enterNoteCollectionSpace(activityClasses[index]);
            });
        }

        setupPrivacyPolicyLink();
    }

    private void setupEditText(EditText editText, String filename, Runnable onGestureAction) {
        // Save on text change
        editText.addTextChangedListener(new TextWatcher() {
            @Override public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
            @Override public void afterTextChanged(Editable s) {}
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                save(editText, filename);
            }
        });

        // Gesture detection
        GestureDetector gestureDetector = new GestureDetector(this, new GestureDetector.SimpleOnGestureListener() {
            @Override
            public void onLongPress(@NonNull MotionEvent e) {
                Toast.makeText(getApplicationContext(), "Long Press", Toast.LENGTH_SHORT).show();
                onGestureAction.run();
            }

            @Override
            public boolean onDoubleTap(@NonNull MotionEvent e) {
                Toast.makeText(getApplicationContext(), "Double Tap", Toast.LENGTH_SHORT).show();
                onGestureAction.run();
                return true;
            }
        });

        editText.setOnTouchListener((v, event) -> {
            gestureDetector.onTouchEvent(event);
            return false;
        });
    }

    private void save(EditText editText, String filename) {
        try (FileOutputStream fos = openFileOutput(filename, Context.MODE_PRIVATE)) {
            fos.write(editText.getText().toString().getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void load(EditText editText, String filename) {
        try (FileInputStream fis = openFileInput(filename);
             InputStreamReader isr = new InputStreamReader(fis);
             BufferedReader br = new BufferedReader(isr)) {
            StringBuilder sb = new StringBuilder();
            String text;
            while ((text = br.readLine()) != null) {
                sb.append(text);
            }
            editText.setText(sb.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void enterNoteCollectionSpace(Class<?> activityClass) {
        Intent intent = new Intent(this, activityClass);
        startActivity(intent);
    }

    private void setupPrivacyPolicyLink() {
        TextView privacyLink = findViewById(R.id.privacyPolicyLink);
        final String privacyUrl = "https://devdisplay.online/privacypolicy"; // <-- Put your actual privacy policy URL here

        privacyLink.setOnClickListener(v -> {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(privacyUrl));
            startActivity(browserIntent);
        });
    }
}
