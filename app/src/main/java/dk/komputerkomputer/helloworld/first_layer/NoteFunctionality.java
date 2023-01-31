package dk.komputerkomputer.helloworld.first_layer;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import dk.komputerkomputer.helloworld.second_layer.MainActivity2;

public class NoteFunctionality extends AppCompatActivity {

    public void enterNoteFrontPage() {
        Intent firstActivityIntent = new Intent(this, MainActivity.class);
        startActivity(firstActivityIntent);
    }

    public void enterNote(Activity activity,Context context) {
        //Class mainActivity = Class.forName("MainActivity" + i);
        try {
            Intent secondActivityIntent = new Intent(context, MainActivity2.class);
            startActivity(secondActivityIntent);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

   /* public void enterNote(int i) {
        Intent secondActivityIntent = new Intent(this, Class.forName(MainActivity + i));
        startActivity(secondActivityIntent);
    }*//*

    public String activityCaller(int i) {
        return "MainActivity" + i;
    }*/

    public void save(String file, String note) {
        try {
            FileOutputStream fos = openFileOutput(file, Context.MODE_PRIVATE);
            fos.write(note.getBytes());
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // TODO make em return from the LoadText class

    /*public void load(String file) {
        StringBuilder stringBuilder;
        String note = null;
        Load loadText = new Load(note);
        try {
            BufferedReader inputReader = new BufferedReader(new InputStreamReader(
                    openFileInput(file)));
            String inputString;
            stringBuilder = new StringBuilder();
            while ((inputString = inputReader.readLine()) != null) {
                stringBuilder.append(inputString);
            }
            loadText.setNote(stringBuilder.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/
}
