package com.example.myapplication10;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ImageView profileImage;
    private EditText matriculeInput, nomInput, prenomInput;
    private Button ajouterButton, chercherButton, supprimerButton, modifierButton, afficherButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Replace with the actual name of your layout file if it's different.

        // Initialize views
        profileImage = findViewById(R.id.profile_image);
        matriculeInput = findViewById(R.id.matricule_input);
        nomInput = findViewById(R.id.nom_input);
        prenomInput = findViewById(R.id.prenom_input);
        ajouterButton = findViewById(R.id.ajouter_button);
        chercherButton = findViewById(R.id.charcher_button);
        supprimerButton = findViewById(R.id.supprimer_button);
        modifierButton = findViewById(R.id.modifier_button);
        afficherButton = findViewById(R.id.afficher_button);

        // Set listeners for buttons
        ajouterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String matricule = matriculeInput.getText().toString();
                String nom = nomInput.getText().toString();
                String prenom = prenomInput.getText().toString();
                Toast.makeText(MainActivity.this, "Added: " + matricule + ", " + nom + ", " + prenom, Toast.LENGTH_SHORT).show();
            }
        });

        chercherButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String matricule = matriculeInput.getText().toString();
                Toast.makeText(MainActivity.this, "Searching for matricule: " + matricule, Toast.LENGTH_SHORT).show();
            }
        });

        supprimerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String matricule = matriculeInput.getText().toString();
                Toast.makeText(MainActivity.this, "Deleted: " + matricule, Toast.LENGTH_SHORT).show();
            }
        });

        modifierButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String matricule = matriculeInput.getText().toString();
                String nom = nomInput.getText().toString();
                String prenom = prenomInput.getText().toString();
                Toast.makeText(MainActivity.this, "Modified: " + matricule + ", " + nom + ", " + prenom, Toast.LENGTH_SHORT).show();
            }
        });

        afficherButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Displaying all records", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
