package com.example.apphamburguesascliente;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;


public class DetallesProductoComboActivity extends AppCompatActivity {
    ImageView imageView;
    TextView itemName, itemPrice, itemDescription;

    String name, price, rating, imageUrl, description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalles_producto_combo);

        Intent intent = getIntent();

        name = intent.getStringExtra("name");
        price = intent.getStringExtra("price");
        description = intent.getStringExtra("description");

        // Convertir el precio de String a double
        double priceDouble = Double.parseDouble(price);

        // Resto del código
        itemName = findViewById(R.id.name);
        itemPrice = findViewById(R.id.price);
        itemDescription = findViewById(R.id.description);

        itemName.setText(name);
        itemPrice.setText("$ " + priceDouble); // Mostrar el precio convertido
        itemDescription.setText(description);
    }


    private void showCartDialog() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        AnadirAlCarritoFragment cartDialogFragment = new AnadirAlCarritoFragment();
        cartDialogFragment.show(fragmentManager, "cart_dialog");
    }
}