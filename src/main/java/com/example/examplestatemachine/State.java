package com.example.examplestatemachine;

public abstract class State {
    protected StateContext sc;
    protected boolean accept = true;
    
    public void actionA() {}
    
    public void actionB() {}
    
    public boolean isAccept() {
        return this.accept;
    }
}
