package dk.komputerkomputer.helloworld.NoteFuncs;

import android.content.Context;
import android.content.Intent;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import dk.komputerkomputer.helloworld.first_layer.MainActivity;

public class Note_Func_Second_Layer {

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

    //TODO Button Back, Save, Load.
    public void enterNoteFrontPage(Context context) {
        Intent firstActivityIntent = new Intent(context, MainActivity.class);
        firstActivityIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(firstActivityIntent);
    }
}


