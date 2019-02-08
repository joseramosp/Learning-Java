/* LAB Week 3
-- OBJECTIVE --
To be able to create objects using variables and
methods. Using the attached .java file follow the instructions to creating and
using objects.

  Name: Jose Ramos
  Date: January 31, 2019
*/

// Here I am declaring my class called MyFormulas_JoseRamos
class MyFormulas_JoseRamos
{
    // In the next line I am declaring 3 variables of data type float
    // This variables are going to store the value of the temperature in different measures.
    float tempInCelsius, tempInFahrenheit, tempInKelvin;

    /*

    //*** Here I was trying to create a method to do the conversion ***

    void covertTemp()
    {
        tempInFahrenheit = ((tempInCelsius * 9) /5) + 32;
        tempInKelvin = tempInCelsius + 273;
        tempInCelsius = tempInKelvin - 273;
    }

    */

    // The next method is going to give the value of celsius value to tempInCelsius
    // and calculate the value in others measures.
    void setTempInCelsius(float celsius)
    {
        tempInCelsius = celsius;
        tempInFahrenheit = ((celsius * 9) /5) + 32;
        tempInKelvin = celsius + 273;
    }

    // The next method is going to give the value of fahrenheit to tempInFahrenheit
    // and calculate the value in others measures.
    void setTempInFahrenheit(float fahrenheit)
    {
        tempInFahrenheit = fahrenheit;
        tempInCelsius = ((fahrenheit - 32) * 5) / 9;
        tempInKelvin = tempInCelsius + 273;
    }

    // The next method is going to give the value of fahrenheit to tempInFahrenheit
    // and calculate the value in others measures.
    void setTempInKelvin(float kelvin)
    {
        tempInKelvin = kelvin;
        tempInCelsius = kelvin - 273;
        tempInFahrenheit = ((tempInCelsius * 9) /5) + 32;
    }

    // The next method is used to print out the temperature in different measures
    void printTemp()
    {
        // Next 3 lines are going to print the temperature in the different measures
        System.out.println("The temperature in Fahrenheit is " + tempInFahrenheit + "F");
        System.out.println("The temperature in Celsius is " + tempInCelsius + "C");
        System.out.println("The temperature in Kelvin is " + tempInKelvin + "K");
        // This line is going to print out a line to devide
        System.out.println("----------------------------------------");
    }

    // Here I am declaring the main
    public static void main(String args[])
    {
        // In this part of the code I am creating an object of type MyFormulas_JoseRamos
        MyFormulas_JoseRamos testObject = new MyFormulas_JoseRamos();

        // Here I am calling using the method setTempInFahrenheit() to make
        // tempInFahrenheit be equal 10
        testObject.setTempInFahrenheit(10);
        // This line is calling the method printTemp() to print the temperature in all measures
        testObject.printTemp();

        // The next line is giving the value of 0 to tempInCelsius for the object testObject
        testObject.setTempInCelsius(0);
        testObject.printTemp();

        // The next line is giving the value of 0 to tempInKelvin for the object testObject
        testObject.setTempInKelvin(0);
        testObject.printTemp();
    }
}
