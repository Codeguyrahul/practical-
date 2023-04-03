package THread;

public class IntercommunicationThread {
    public static void main(String[] args) {
        SharedObject sharedObject = new SharedObject();
        ProducerThread producerThread = new ProducerThread(sharedObject);
        ConsumerThread consumerThread = new ConsumerThread(sharedObject);
        producerThread.start();
        consumerThread.start();
    }
}

class SharedObject {
    private int value;
    private boolean available = false;

    synchronized int getValue() {
        while (!available) {
            try {
                wait();
            } catch (InterruptedException e) {}
        }
        available = false;
        notifyAll();
        return value;
    }

    synchronized void setValue(int value) {
        while (available) {
            try {
                wait();
            } catch (InterruptedException e) {}
        }
        this.value = value;
        available = true;
        notifyAll();
    }
}

class ProducerThread extends Thread {
    private SharedObject sharedObject;

    ProducerThread(SharedObject sharedObject) {
        this.sharedObject = sharedObject;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            sharedObject.setValue(i);
            System.out.println("Producer produced: " + i);
            try {
                sleep((int)(Math.random() * 1000));
            } catch (InterruptedException e) {}
        }
    }
}

class ConsumerThread extends Thread {
    private SharedObject sharedObject;

    ConsumerThread(SharedObject sharedObject) {
        this.sharedObject = sharedObject;
    }

    public void run() {
        int value = 0;
        for (int i = 1; i <= 5; i++) {
            value = sharedObject.getValue();
            System.out.println("Consumer consumed: " + value);
        }
    }
}
