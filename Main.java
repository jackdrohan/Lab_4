package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scnr =  new Scanner(System.in);
        int a =3;
        int b=4;
        int c = scnr.nextInt();
        if(a <4)
        {
            a=b;
        }
        while(b == c)
        {
            b++;
        }
        a = a+c;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }