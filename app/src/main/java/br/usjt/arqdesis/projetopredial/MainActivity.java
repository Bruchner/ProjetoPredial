package br.usjt.arqdesis.projetopredial;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AlertDialogLayout;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void login(View v){

        EditText login1 = (EditText) findViewById(R.id.login);
        EditText senha1 = (EditText) findViewById(R.id.senha);
        Editable login = login1.getText();
        Editable senha = senha1.getText();


        Button btn = (Button)findViewById(R.id.Cadastrar_Empresa);
        Button btn2 = (Button)findViewById(R.id.ArquivoAcesso);
        Button btn3 = (Button) findViewById(R.id.CadastrarUsuario);
        Button btn4 = (Button) findViewById(R.id.ReconfigTemp);
        if(login1.equals("func") && senha1.equals("func")){
            Intent it = new Intent(MainActivity.this, Funcionalidades.class);
            startActivity(it);
            btn.setEnabled(true);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
        }else if(login1.equals("atend") && senha1.equals("atend")){
            Intent it = new Intent(MainActivity.this, Funcionalidades.class);
            startActivity(it);
            btn.setEnabled(true);
            btn2.setEnabled(true);
            btn3.setEnabled(true);
            btn4.setEnabled(true);
        }else if(login1.equals("sind")&& senha1.equals("sind")){
            Intent it = new Intent(MainActivity.this, Funcionalidades.class);
            startActivity(it);
            btn.setEnabled(true);
            btn2.setEnabled(true);
            btn3.setEnabled(true);
            btn4.setEnabled(true);
        }else {
            //INSTANCIA DIALOGO DE ALERTA
            AlertDialog alerta;
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            //Cria titulo & mensagem de erro
            builder.setTitle("Error");
            builder.setMessage("Usuario/Senha inválido");
            //Cria botao para caso positivo/negativo, e seu texto interno(Caso negativo, fecha programa)
            builder.setPositiveButton("Tente Novamente", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Toast.makeText(MainActivity.this, "Tente Novamente", Toast.LENGTH_LONG).show();
                }
            });
            builder.setNegativeButton("Sair", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Toast.makeText(MainActivity.this, "Saiu", Toast.LENGTH_SHORT).show();
                    finish();
                }
            });
            //Cria e mostra dialogo
            alerta = builder.create();
            alerta.show();
        }
    }
}
