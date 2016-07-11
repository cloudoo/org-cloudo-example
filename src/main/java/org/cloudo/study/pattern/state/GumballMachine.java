package org.cloudo.study.pattern.state;

/**
 * Created by cloudpj on 16/7/11.
 */
public class GumballMachine {
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;

    State currentState = soldState;
    int count = 0;

    public GumballMachine(int numbersGumballs) {
        soldState = new SoldState(this);

        this.count = numbersGumballs;
        if (numbersGumballs > 0) {
            currentState = noQuarterState;
        }
    }

    public void insertQuarter() {
        currentState.insertQuarter();
    }

    public void ejectQuarter() {
        currentState.ejectQuarter();
        ;
    }

    public void turnCrank() {
        currentState.turnCrank();
        currentState.dispense();
    }

    public void setState(State state) {
        this.currentState = state;
    }

    public void releaseBall() {
        System.out.println("减少一个球");
        if (count != 0) {
            count = count - 1;
        }
    }


    public State getSoldOutState() {
        return soldOutState;
    }

    public void setSoldOutState(State soldOutState) {
        this.soldOutState = soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public void setNoQuarterState(State noQuarterState) {
        this.noQuarterState = noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public void setHasQuarterState(State hasQuarterState) {
        this.hasQuarterState = hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public void setSoldState(State soldState) {
        this.soldState = soldState;
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }
}
