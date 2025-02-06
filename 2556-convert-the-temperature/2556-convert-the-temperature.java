class Solution {
    public double[] convertTemperature(double celsius) {
        double kelvin=celsius+273.15;
        double fahrenheit=celsius*1.80+32.00;
        double[] arr = new double[2];
        if(kelvin>Math.pow(10,-5) && fahrenheit>Math.pow(10,-5)){
            arr[0]=kelvin;
            arr[1]=fahrenheit;
        }
        return arr;
    }
}