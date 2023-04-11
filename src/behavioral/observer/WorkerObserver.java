package behavioral.observer;

public interface WorkerObserver {
    void accept(WokerStatus status, Object data);
}
