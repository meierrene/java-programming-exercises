package de.renemeier.udemy.timbuchalka.exercises.exercise49.searchtree;

public interface NodeList {
    ListItem getRoot();

    boolean addItem(ListItem item);

    boolean removeItem(ListItem item);

    void traverse(ListItem root);


}
