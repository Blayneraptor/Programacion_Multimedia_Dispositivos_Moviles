package com.example.cubiletedados;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView dice1, dice2;
    private ImageButton cupButton;
    private int[] diceImages = {
            R.drawable.dice_1,
            R.drawable.dice_2,
            R.drawable.dice_3,
            R.drawable.dice_4,
            R.drawable.dice_5,
            R.drawable.dice_6
    };
    private Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Referencias a las vistas
        dice1 = findViewById(R.id.dice1);
        dice2 = findViewById(R.id.dice2);
        cupButton = findViewById(R.id.cupButton);

        // Acción al pulsar el cubilete
        cupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollDice();
            }
        });
    }

    private void rollDice() {
        // Generar números aleatorios para los dos dados
        int dice1Value = random.nextInt(6);
        int dice2Value = random.nextInt(6);

        // Cambiar las imágenes de los dados
        dice1.setImageResource(diceImages[dice1Value]);
        dice2.setImageResource(diceImages[dice2Value]);

        // Mostrar un mensaje si los dados coinciden
        if (dice1Value == dice2Value) {
            Toast.makeText(this, "¡Los dados coinciden!", Toast.LENGTH_SHORT).show();
        } else {

        }
    }
}
