public class Pessoa {
    public float altura;
    public float peso;

    public  Pessoa(float altura, float peso) {
        this.altura = altura;
        this.peso = peso;
    }

    public float calcImc(Pessoa pessoa, float altura , float peso){
        return peso / (altura * altura);
    }

    public float calcImcCorrecao(Pessoa pessoa){
        float altura = pessoa.altura;
        float peso = pessoa.peso;

        return peso / (altura * altura);
    }
}