package com.demo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.seguridad.Usuario;

public class DemoLogin extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        //llama al archivo res/layout/main.xml
        setContentView(R.layout.main);
        
        //TelephonyManager phone = (TelephonyManager)getSystemService(TELEPHONY_SERVICE);
        
        
        
        /*cajas de texto*/
        final EditText txtUsuario 	= (EditText) findViewById(R.id.editText);
        final EditText txtPass 		= (EditText) findViewById(R.id.editPass);
        //botones 
        final Button btnIngresar 	= (Button)  findViewById(R.id.btnIngresar);
        
        
        //logo
        ImageView logo1 = (ImageView) findViewById(R.id.ImageLogo1);
        // Animacion del logo
        Animation fade1 = AnimationUtils.loadAnimation(this, R.anim.fade_in); 
        logo1.setAnimation(fade1);
        
        
        //limpiamos las cajas de Texto
        txtUsuario.setText("");
        txtPass.setText("");
        
        //accion al boton
        btnIngresar.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
            	
            	
            	
            	
            	
            	
            	
            	if(Usuario.validarUsuario(txtUsuario.getText().toString(), txtPass.getText().toString())){
      
            		startActivity(new Intent(DemoLogin.this, Principal.class));
            		//Toast.makeText(DemoLogin.this, "usuario válido", Toast.LENGTH_SHORT).show();
            	}else{
            		//showDialog(1);
            		Toast.makeText(DemoLogin.this, "Usuario inválido", Toast.LENGTH_LONG).show();
            	}

            }
        });
    }
    
    
    
}