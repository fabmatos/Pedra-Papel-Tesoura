package com.fabriciomatos.pedrapapeltesoura.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.fabriciomatos.pedrapapeltesoura.R;
import com.fabriciomatos.pedrapapeltesoura.controller.ControllerJogada;
import com.fabriciomatos.pedrapapeltesoura.model.Jogada;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ViewHolder mViewHolder = new ViewHolder();
    private ControllerJogada controllerJogada = new ControllerJogada();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.mViewHolder.imageViewResultadoApp = findViewById(R.id.image_view_resultado_app);
        this.mViewHolder.textViewResultado = findViewById(R.id.text_view_resultado);
        this.mViewHolder.buttonPedra = findViewById(R.id.button_pedra);
        this.mViewHolder.buttonPapel = findViewById(R.id.button_papel);
        this.mViewHolder.buttonTesoura = findViewById(R.id.button_tesoura);

        this.mViewHolder.imageViewResultadoApp.setImageResource(R.drawable.padrao);

        this.mViewHolder.buttonPedra.setOnClickListener(this);
        this.mViewHolder.buttonPapel.setOnClickListener(this);
        this.mViewHolder.buttonTesoura.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.button_pedra){
            Jogada resultado = this.controllerJogada.calculaResultado(0);
            this.setImageIconPC(resultado.getNumeroJogadorPc());
            mViewHolder.textViewResultado.setText(resultado.getDescricaoJogada());
        }else if(v.getId() == R.id.button_papel){
            Jogada resultado = this.controllerJogada.calculaResultado(1);
            this.setImageIconPC(resultado.getNumeroJogadorPc());
            mViewHolder.textViewResultado.setText(resultado.getDescricaoJogada());
        }else {
            Jogada resultado = this.controllerJogada.calculaResultado(2);
            this.setImageIconPC(resultado.getNumeroJogadorPc());
            mViewHolder.textViewResultado.setText(resultado.getDescricaoJogada());
        }
    }

    void setImageIconPC(int jogadaPC){
        switch (jogadaPC){
            case 0:
                this.mViewHolder.imageViewResultadoApp.setImageResource(R.drawable.pedra);
                break;
            case 1:
                this.mViewHolder.imageViewResultadoApp.setImageResource(R.drawable.papel);
                break;
            case 2:
                this.mViewHolder.imageViewResultadoApp.setImageResource(R.drawable.tesoura);
                break;

        }
    }

    public String efetuarJogada(){

        return "";
    }

    protected class ViewHolder{

        protected ImageView imageViewResultadoApp;
        protected TextView textViewResultado;
        protected Button buttonPedra;
        protected Button buttonPapel;
        protected Button buttonTesoura;

    }
}
