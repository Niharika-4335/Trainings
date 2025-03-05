package com.selenuimexpress.dlo;

public class Student {
    int id;
    MathCheat mathCheat;

    public void setId(int id) {
        this.id = id;
    }

    public void setMathCheat(MathCheat mathCheat) {
        this.mathCheat = mathCheat;
    }

    public void cheating(){
        mathCheat.mathCheat();
    }

}
