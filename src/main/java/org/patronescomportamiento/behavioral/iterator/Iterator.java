package org.patronescomportamiento.behavioral.iterator;

public interface Iterator {
    boolean hasNext();
    Object next();
    Object currentItem();
}
