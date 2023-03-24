package dk.komputerkomputer.helloworld.second_layer;

import android.content.Context;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;


public class Note_Func {

    public void save(Context context, String text, String file) {
        try {
            FileOutputStream fos = context.openFileOutput(file, Context.MODE_PRIVATE);
            fos.write(text.getBytes());
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String load(Context context, String file) {
        StringBuilder stringBuilder;
        String inputString = null;
        try {
            BufferedReader inputReader = new BufferedReader(new InputStreamReader(
                    context.openFileInput(file)));
            stringBuilder = new StringBuilder();
            while ((inputString = inputReader.readLine()) != null) {
                stringBuilder.append(inputString);
                return inputString;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}


