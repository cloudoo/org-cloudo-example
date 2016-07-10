package org.cloudo.study.compter;

/**
 * Created by cloudpj on 16/7/10.
 */
public class Computor {

    public float add(float a,float b){
          return a+b;
    }
    public String add(String a,String b){
         float af = Float.parseFloat(a);
        float bf = Float.parseFloat(b);
        return String.valueOf(add(af,bf));
    }

}
