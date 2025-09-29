//Solved the leetcode problem to convert the Temperature C to K,F
class Solution {
    public double[] convertTemperature(double celsius) {
        return new double[] {celsius+273.15,(celsius*1.8)+32};
    }
}
