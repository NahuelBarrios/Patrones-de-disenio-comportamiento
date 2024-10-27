package org.patronescomportamiento.behavioral.iterator;

public class IteratorImpl implements Iterator{
    private CardIterator[] cardIterators;
    private int position;

    public IteratorImpl(CardIterator[] cardIterators){
        this.cardIterators = cardIterators;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < cardIterators.length;
    }

    @Override
    public Object next() {
        return cardIterators[position++];
    }

    @Override
    public Object currentItem() {
        return cardIterators[position];
    }
}
