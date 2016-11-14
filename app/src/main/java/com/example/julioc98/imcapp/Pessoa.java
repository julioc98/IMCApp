package com.example.julioc98.imcapp;

/**
 * Created by julioc98 on 13/11/16.
 */

public class Pessoa {

    // atributos da classe

    // 1 para homem e 2 para mulher
    private int sexo;
    private float peso;
    private float altura;

    //construtores
    public Pessoa(int sexo, float peso, float altura){
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    // métodos da classe
    public float calcularIMC() {
        //return (float) this.peso/( this.altura * this.altura);
        return (float) (this.peso/Math.pow(this.altura, 2));
    }

    public String classificarIMC() {
        float imc;
        String classe;
        imc = calcularIMC();

        switch (this.sexo) {
            case 2:
                if (imc <= 20.7)
                    classe = "Homem Abaixo do Peso: IMC = " + imc;
                else if (imc <= 26.4)
                    classe = "Homem Peso ideal: IMC = " + imc;
                else if (imc <= 27.8)
                    classe = "Homem Acima do Peso: IMC = " + imc;
                else if (imc <= 31.1)
                    classe = "Homem com Obesidade Leve: IMC = " + imc;
                else
                    classe = "Homem com Obesidade: IMC = " + imc;
                break;
            case 1:
                if (imc <=  19.1)
                    classe = "Mulher Abaixo do Peso: IMC = " + imc;
                else if (imc <= 25.8)
                    classe = "Mulher Peso ideal: IMC = " + imc;
                else if (imc <= 27.3)
                    classe = "Mulher Acima do Peso: IMC = " + imc;
                else if (imc <= 32.3)
                    classe = "Mulher com Obesidade Leve: IMC = " + imc;
                else
                    classe = "Mulher com Obesidade: IMC = " + imc;
                break;
            default:
                classe = "Preencha os dados corretamente (sexo)";

        }
        return classe;
    }

}
