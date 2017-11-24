package com.company;

import java.util.HashMap;
import java.util.List;

public abstract class StateMachine {

    protected  String stareCurenta;
    protected  HashMap<String,HashMap<String,String>> dictionarTranzitie;

    public  void executeTransition(String actiune){
        if(dictionarTranzitie.get(stareCurenta).get(actiune)!=null)
            stareCurenta=dictionarTranzitie.get(stareCurenta).get(actiune);
            Message(actiune);
    }
    public abstract void Message(String actiune);

}
