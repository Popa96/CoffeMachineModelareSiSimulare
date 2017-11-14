package com.company;

import java.util.HashMap;
import java.util.List;

public abstract class StateMachine {

    protected  String stareCurenta;
    protected  HashMap<String,HashMap<String,String>> dictionarTranzitie;

    public abstract void executeTransition(String actiune);

}
