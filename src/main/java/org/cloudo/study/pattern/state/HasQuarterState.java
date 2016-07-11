package org.cloudo.study.pattern.state;

/**
 * Created by cloudpj on 16/7/11.
 */
public class HasQuarterState implements State {

    private GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }


    @Override
    public void insertQuarter() {
        System.out.println("不能在投球");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("返回 xx球");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("");
        gumballMachine.setState(gumballMachine.getSoldState());
    }

    @Override
    public void dispense() {
        System.out.println("没有球暂时?");
    }
}
