package dk.komputerkomputer.helloworld.NoteFuncs;

import android.content.Context;
import android.content.Intent;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import dk.komputerkomputer.helloworld.first_layer.MainActivity;
import dk.komputerkomputer.helloworld.second_layer.MainActivity1;
import dk.komputerkomputer.helloworld.second_layer.MainActivity10;
import dk.komputerkomputer.helloworld.second_layer.MainActivity11;
import dk.komputerkomputer.helloworld.second_layer.MainActivity12;
import dk.komputerkomputer.helloworld.second_layer.MainActivity13;
import dk.komputerkomputer.helloworld.second_layer.MainActivity14;
import dk.komputerkomputer.helloworld.second_layer.MainActivity15;
import dk.komputerkomputer.helloworld.second_layer.MainActivity16;
import dk.komputerkomputer.helloworld.second_layer.MainActivity17;
import dk.komputerkomputer.helloworld.second_layer.MainActivity18;
import dk.komputerkomputer.helloworld.second_layer.MainActivity2;
import dk.komputerkomputer.helloworld.second_layer.MainActivity3;
import dk.komputerkomputer.helloworld.second_layer.MainActivity4;
import dk.komputerkomputer.helloworld.second_layer.MainActivity5;
import dk.komputerkomputer.helloworld.second_layer.MainActivity6;
import dk.komputerkomputer.helloworld.second_layer.MainActivity7;
import dk.komputerkomputer.helloworld.second_layer.MainActivity8;
import dk.komputerkomputer.helloworld.second_layer.MainActivity9;

public class Note_Func_First_Layer extends MainActivity {

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

    //:: TODO Make enterNote dynamic with passed classes

    public void enterNote1(Context context) {
        Intent secondActivityIntent = new Intent(context, MainActivity1.class);
        secondActivityIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(secondActivityIntent);
    }

    public void enterNote2(Context context) {
        Intent secondActivityIntent = new Intent(context, MainActivity2.class);
        secondActivityIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(secondActivityIntent);
    }

    public void enterNote3(Context context) {
        Intent secondActivityIntent = new Intent(context, MainActivity3.class);
        secondActivityIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(secondActivityIntent);
    }

    public void enterNote4(Context context) {
        Intent secondActivityIntent = new Intent(context, MainActivity4.class);
        secondActivityIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(secondActivityIntent);
    }

    public void enterNote5(Context context) {
        Intent secondActivityIntent = new Intent(context, MainActivity5.class);
        secondActivityIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(secondActivityIntent);
    }

    public void enterNote6(Context context) {
        Intent secondActivityIntent = new Intent(context, MainActivity6.class);
        secondActivityIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(secondActivityIntent);
    }

    public void enterNote7(Context context) {
        Intent secondActivityIntent = new Intent(context, MainActivity7.class);
        secondActivityIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(secondActivityIntent);
    }

    public void enterNote8(Context context) {
        Intent secondActivityIntent = new Intent(context, MainActivity8.class);
        secondActivityIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(secondActivityIntent);
    }

    public void enterNote9(Context context) {
        Intent secondActivityIntent = new Intent(context, MainActivity9.class);
        secondActivityIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(secondActivityIntent);
    }

    public void enterNote10(Context context) {
        Intent secondActivityIntent = new Intent(context, MainActivity10.class);
        secondActivityIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(secondActivityIntent);
    }

    public void enterNote11(Context context) {
        Intent secondActivityIntent = new Intent(context, MainActivity11.class);
        secondActivityIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(secondActivityIntent);
    }

    public void enterNote12(Context context) {
        Intent secondActivityIntent = new Intent(context, MainActivity12.class);
        secondActivityIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(secondActivityIntent);
    }

    public void enterNote13(Context context) {
        Intent secondActivityIntent = new Intent(context, MainActivity13.class);
        secondActivityIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(secondActivityIntent);
    }

    public void enterNote14(Context context) {
        Intent secondActivityIntent = new Intent(context, MainActivity14.class);
        secondActivityIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(secondActivityIntent);
    }
    public void enterNote15(Context context) {
        Intent secondActivityIntent = new Intent(context, MainActivity15.class);
        secondActivityIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(secondActivityIntent);
    }

    public void enterNote16(Context context) {
        Intent secondActivityIntent = new Intent(context, MainActivity16.class);
        secondActivityIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(secondActivityIntent);
    }

    public void enterNote17(Context context) {
        Intent secondActivityIntent = new Intent(context, MainActivity17.class);
        secondActivityIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(secondActivityIntent);
    }

    public void enterNote18(Context context) {
        Intent secondActivityIntent = new Intent(context, MainActivity18.class);
        secondActivityIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(secondActivityIntent);
    }
}