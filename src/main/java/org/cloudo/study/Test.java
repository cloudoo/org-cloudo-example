package org.cloudo.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by cloudpj on 16/7/7.
 */
public class Test {


    public void printNumber(){
        for(int i=0;i<100;i++){
            System.out.println(100-i);
        }
    }

    public static void main(String[] args){
        Test tst = new Test();
//        tst.printNumber();
// 1.使用bufferreader方式
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        while(true){
//            try {
//                System.out.print("请输入:");
//                String aLine = bufferedReader.readLine();
//                System.out.println("你输入的是:"+aLine);
//
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }

//        2.使用scan方式
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String aline = scanner.next();
            System.out.println("{}:"+aline);
        }

    }
}
