package com.example.examplestatemachine;

public class AcceptState extends State {

    public AcceptState(StateContext sc) {
        this.sc = sc;
        this.accept = false;
    }


    @Override
    public void actionA() {
        super.actionA();

        if (!sc.getAction()) {
            sc.setState(sc.getRejectState());
        }
    }

    @Override
    public void actionB() {
        super.actionB();
        if (sc.getAction()) {
            sc.setState(sc.getRejectState());
        }
    }
}

