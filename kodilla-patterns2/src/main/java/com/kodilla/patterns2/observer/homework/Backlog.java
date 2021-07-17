package com.kodilla.patterns2.observer.homework;

public interface Backlog {
    void notifyWatchers();
    void assignWatcher(Watcher watcher);
    void removeWatcher(Watcher watcher);
}
