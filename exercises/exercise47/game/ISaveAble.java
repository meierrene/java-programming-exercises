package de.renemeier.udemy.timbuchalka.exercises.exercise47.game;

import java.util.List;

public interface ISaveAble {
    List<String> write();
    void read(List<String> savedValues);
}
