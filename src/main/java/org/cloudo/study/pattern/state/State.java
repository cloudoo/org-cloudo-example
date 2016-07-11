package org.cloudo.study.pattern.state;

/**
 * Created by cloudpj on 16/7/11.
 */
public interface State {
    void insertQuarter();

    void ejectQuarter();

    void turnCrank();

    void dispense();
}
