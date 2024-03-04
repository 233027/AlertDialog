package com.esma.alertdialog;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Context
        //Activity Context: Aktiviteyi ilgilendiren durumlarda this kulllanıyoruz
        //App Context:genel app i ilgilendiren durumlarda
        //getApplicationContext() kullanıyoruz

        //bir context, ne mesajı yazıcağımızı yazıyoruz,uzun mesaj
        //uygulama açılış aşamasında alta gelen mesaj
        Toast.makeText(this, "Toast Message", Toast.LENGTH_LONG).show();
    }

    public void save(View view){
        //alert diolag oluşturucaz.
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Save");
        alert.setMessage("Are you sure?");
        alert.setPositiveButton("Yes", (dialogInterface, i) -> Toast.makeText(MainActivity.this,"Saved",Toast.LENGTH_LONG).show());

//kaydetme işlemi
        // yes butonunu oluşturmak için setPositiveButton metodunu kullanıyoruz. içine text ve listenar
        //oluşturmamızı istiyor.text e yes diyoruz.
        //Listner: Bir şeye tıklandığında ya da bir olay olduğunda ne olucağını ya da ne yazıcağını yazdığımız bir metot olartak düşünebiliriz.
        //Yes butonuna tıkladığımızda ne olacağını  DialogInterface.OnClickListener() içine yazıyoruz

        alert.setNegativeButton("No", (dialogInterface, i) -> Toast.makeText(getApplicationContext(),"Not Saved",Toast.LENGTH_LONG).show());

        alert.show();

    }
}