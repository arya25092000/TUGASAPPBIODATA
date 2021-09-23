package com.sefrianarya.biodatasederhana;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import java.net.URI;

public class MainActivity extends AppCompatActivity {
    public void kirimEmail (View view) {
        Uri tabEmail = Uri.parse("mailto:arya25200@gmail.com");
        Intent Email = new Intent(Intent.ACTION_SENDTO, tabEmail);
        startActivity(Email);
    }

    public void kirimTelpon(View view) {
        Uri tabTelpon = Uri.parse("tel:081231535925");
        Intent Telpon = new Intent(Intent.ACTION_DIAL, tabTelpon);
        startActivity(Telpon);
    }

    public void tampilMaps(View view) {
        Uri tabMaps = Uri.parse("geo:-7.1299444,110.4038043?q=Jl.+Gurita+Raya+No.18,+Dliwang,+Ungaran,+Kec.+Ungaran+Bar.,+Semarang,+Jawa+Tengah+50511");
        Intent Maps = new Intent(Intent.ACTION_VIEW, tabMaps);
        startActivity(Maps);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}