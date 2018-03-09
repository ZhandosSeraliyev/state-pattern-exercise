package com.example.examplestatemachine;

public class RejectState extends State {

    public RejectState(StateContext sc) {
        this.sc = sc;
        this.accept = true;
    }


    @Override
    public void actionA() {
        super.actionA();

        if (sc.getAction()) {
            sc.setState(sc.getAcceptState());
        }
    }

    @Override
    public void actionB() {
        super.actionB();

        if (!sc.getAction()) {
            sc.setState(sc.getAcceptState());
        }
    }
}