package org.patronescomportamiento.behavioral.iterator;

public class CardListImpl implements CardList{

    private final CardIterator[] cardIterators;

    public CardListImpl(CardIterator[] cardIterators){
        this.cardIterators = cardIterators;
    }
    @Override
    public Iterator iterator() {
        return new IteratorImpl(cardIterators);
    }
}
