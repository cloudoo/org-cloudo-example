package org.cloudo.study.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cloudpj on 16/7/10.
 */
public interface Subject {

    public void addObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObserver();

}
