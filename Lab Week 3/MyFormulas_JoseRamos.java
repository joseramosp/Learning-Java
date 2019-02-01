/* LAB Week 3
-- OBJECTIVE --
To be able to create objects using variables and
methods. Using the attached .java file follow the instructions to creating and
using objects.

  Name: Jose Ramos
  Date: January 31, 2019
*/

class MyFormulas_JoseRamos
{
    float tempInCelsius;
    float tempInFahrenheit;
    float tempInKelvin;

    void setTempInCelsius(float celsius)
    {
        tempInCelsius = celsius;
        tempInFahrenheit = ((celsius * 9) /5) + 32;
        tempInKelvin = celsius + 273;
    }

    void setTempInFahrenheit(float fahrenheit)
    {
        tempInFahrenheit = fahrenheit;
        tempInCelsius = ((fahrenheit - 32) * 5) / 9;
        tempInKelvin = tempInCelsius + 273;
    }

    void setTempInKelvin(float kelvin)
    {
        tempInKelvin = kelvin;
        tempInCelsius = kelvin - 273;
        tempInFahrenheit = ((tempInCelsius * 9) /5) + 32;
    }

    void printTemp()
    {
        System.out.println("The temperature in Fahrenheit is " + tempInFahrenheit + "F");
        System.out.println("The temperature in Celsius is " + tempInCelsius + "C");
        System.out.println("The temperature in Kelvin is " + tempInKelvin + "K");
        System.out.println("----------------------------------------");
    }

    public static void main(String args[])
    {
        MyFormulas_JoseRamos testObject = new MyFormulas_JoseRamos();

        testObject.setTempInFahrenheit(10);
        testObject.printTemp();
        testObject.setTempInCelsius(0);
        testObject.printTemp();
        testObject.setTempInKelvin(0);
        testObject.printTemp();
    }
}
