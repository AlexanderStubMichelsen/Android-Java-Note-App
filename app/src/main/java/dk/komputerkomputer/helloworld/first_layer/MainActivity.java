package dk.komputerkomputer.helloworld.first_layer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import dk.komputerkomputer.helloworld.Note;
import dk.komputerkomputer.helloworld.R;
import dk.komputerkomputer.helloworld.second_layer.MainActivity2;
import dk.komputerkomputer.helloworld.second_layer.MainActivity3;
import dk.komputerkomputer.helloworld.second_layer.MainActivity4;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //TODO:: complete this


        try {
            save("NoteSpace: ");
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            save2("NoteSpace: ");
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            save3("NoteSpace: ");
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            load();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            load2();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            load3();
        } catch (Exception e) {
            e.printStackTrace();
        }

        EditText editText = findViewById(R.id.textViewVmTwo);

        editText.setOnTouchListener(new View.OnTouchListener() {
            GestureDetector gestureDetector = new GestureDetector(getApplicationContext(), new GestureDetector.SimpleOnGestureListener() {

                @Override
                public void onLongPress(@NonNull MotionEvent e) {
                    Toast.makeText(getApplicationContext(), "Long Press", Toast.LENGTH_SHORT).show();
                    super.onLongPress(e);
                }

                @Override
                public boolean onDoubleTap(@NonNull MotionEvent e) {
                    Toast.makeText(getApplicationContext(), "Double Tap", Toast.LENGTH_SHORT).show();
                    return super.onDoubleTap(e);
                }
            });

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                gestureDetector.onTouchEvent(event);
                return false;
            }
        });
    }


    public void onBtnClick(View view) {
        EditText edtViewTxt = findViewById(R.id.textViewDmTwo);

        save(edtViewTxt.getText().toString());

    }

    public void onBtnClick2(View view) {
        EditText edtViewTxt = findViewById(R.id.textViewVmTwo);

        save2(edtViewTxt.toString());

    }

    public void onBtnClick3(View view) {
        EditText edtViewTxt = findViewById(R.id.textViewWmTwo);

        save3(edtViewTxt.toString());

    }

    //TODO Make Interface

    //TODO WRITE METHOD REFRESH

    public void enterNoteCollectionSpace(View view) {
        Intent secondActivityIntent = new Intent(this, MainActivity2.class);
        startActivity(secondActivityIntent);
    }

    public void enterNoteCollectionSpaceTwo(View view) {
        Intent secondActivityIntent = new Intent(this, MainActivity3.class);
        startActivity(secondActivityIntent);
    }

    public void enterNoteCollectionSpaceThree(View view) {
        Intent secondActivityIntent = new Intent(this, MainActivity4.class);
        startActivity(secondActivityIntent);
    }

    public void save(String s) {
           try {
            FileOutputStream fos = openFileOutput("MainActivityOneOne", Context.MODE_PRIVATE);
            fos.write(s.getBytes());
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
           load();
    }

    public void save2(String s) {
        try {
            FileOutputStream fos = openFileOutput("MainActivityOneTwo", Context.MODE_PRIVATE);
            fos.write(s.getBytes());
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        load2();
    }

    public void save3(String s) {
        try {
            FileOutputStream fos = openFileOutput("MainActivityOneThree", Context.MODE_PRIVATE);
            fos.write(s.getBytes());
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        load3();
    }

    public void load() {
        EditText edtEmTwo = findViewById(R.id.textViewDmTwo);
        StringBuffer stringBuffer = null;
        try {
            BufferedReader inputReader = new BufferedReader(new InputStreamReader(
                    openFileInput("MainActivityOneOne")));
            String inputString;
            stringBuffer = new StringBuffer();
            while ((inputString = inputReader.readLine()) != null) {
                stringBuffer.append(inputString);
            }
            edtEmTwo.setText(stringBuffer.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void load2() {
        EditText edtEmTwo = findViewById(R.id.textViewVmTwo);
        StringBuffer stringBuffer = null;
        try {
            BufferedReader inputReader = new BufferedReader(new InputStreamReader(
                    openFileInput("MainActivityOneTwo")));
            String inputString;
            stringBuffer = new StringBuffer();
            while ((inputString = inputReader.readLine()) != null) {
                stringBuffer.append(inputString);
            }
            edtEmTwo.setText(stringBuffer.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void load3() {
        EditText edtEmTwo = findViewById(R.id.textViewWmTwo);
        StringBuffer stringBuffer = null;
        try {
            BufferedReader inputReader = new BufferedReader(new InputStreamReader(
                    openFileInput("MainActivityOneThree")));
            String inputString;
            stringBuffer = new StringBuffer();
            while ((inputString = inputReader.readLine()) != null) {
                stringBuffer.append(inputString);
            }
            edtEmTwo.setText(stringBuffer.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

