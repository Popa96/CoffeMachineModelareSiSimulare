package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CoffeMachine extends StateMachine {

    private HashMap<String, HashMap<String, String>> dictionar;

    CoffeMachine()
    {
        this.stareCurenta="0";
        this.dictionarTranzitie=populareDictionar();

    }

    @Override
    public void Message(String actiune) {
        System.out.println("Creditul initial "+stareCurenta);



            if(actiune.equals("C10")||actiune.equals("C15"))
            {
                System.out.println("Cafeaua dvs se prepara "+actiune);
            }
            System.out.println("Creditul dvs este "+stareCurenta);
            System.out.println("Mai introduceti bancnote");


    }

    public HashMap<String,HashMap<String,String>> populareDictionar()
    {
        HashMap<String,HashMap<String,String>> dictionar=new HashMap<String,HashMap<String, String>>();

        HashMap<String,String> hashTemp=new HashMap<String,String>();
        hashTemp.put("5","5");
        hashTemp.put("10","10");
        dictionar.put("0",hashTemp);

        HashMap<String,String> hashTemp1=new HashMap<String,String>();
        hashTemp1.put("5","10");
        hashTemp1.put("10","15");
        dictionar.put("5",hashTemp1);

        HashMap<String,String> hashTemp2=new HashMap<String,String>();
        hashTemp2.put("C10","0");
        hashTemp2.put("5","15");
        dictionar.put("10",hashTemp2);

        HashMap<String,String> hashTemp3=new HashMap<String,String>();
        hashTemp3.put("C15","0");
        hashTemp3.put("C10","5");
        dictionar.put("15",hashTemp3);

        return dictionar;
    }
}
