package com.example.ejerciciospoo;

public class InteresSimple {
    float capital = 0f;
    float tiempo = 0f;
    float tasa = 0f;

    public InteresSimple(float cap, float tie, float tas){
        //La palabra "this" es la que hace referencia a los atributos privados
        this.capital = cap;
        this.tiempo = tie;
        this.tasa = tas;
    }

    //Definos un metodo publico que nos dará como resultado un número real con nombre "Interes"
    //La palabra void se utliza en caso no haya valor de retorno
    public float Interes(){
        return this.capital * (this.tasa / 100) * tiempo;
    }

    public float Acumulado(){
        return this.capital + this.Interes();
    }

}
