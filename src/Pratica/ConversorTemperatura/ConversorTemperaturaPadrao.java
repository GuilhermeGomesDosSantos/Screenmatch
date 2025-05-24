package Pratica.ConversorTemperatura;
/*
Crie uma interface ConversorTemperatura com os métodos celsiusParaFahrenheit() e fahrenheitParaCelsius().
Implemente uma classe ConversorTemperaturaPadrao que implementa essa interface com as fórmulas de conversão e exibe os resultados.
 */
public class ConversorTemperaturaPadrao implements ConversorTemperatura{
    private double temperatura;
    public double getTemperatura(){
        return temperatura;
    }

    public void setTemperatura(double temperatura){
        this.temperatura = temperatura;
    }

    @Override
    public double celsiusParaFahrenheit() {
        return (getTemperatura() * 1.8) + 32;
    }

    @Override
    public double fahrenheitParaCelsius() {
        return (getTemperatura() - 32) * (5.0/9.0);
    }
}
