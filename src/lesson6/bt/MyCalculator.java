/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson6.bt;

/**
 *
 * @author Lrandom
 */
public class MyCalculator 
        implements ICalculator
        , ICalculator2{

    @Override
    public float add(float a, float b) {
       return a+b;
    }

    @Override
    public float minus(float a, float b) {
        return a-b;
    }

    @Override
    public float multiple(float a, float b) {
        return a*b;
    }

    @Override
    public float devide(float a, float b) {
        return a/b;
    }

    @Override
    public float square(int a) {
        return a*a;
    }  
}
