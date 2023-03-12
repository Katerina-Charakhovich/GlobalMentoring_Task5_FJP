package com.epam.producer.consumer.blockingqueue;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
    private BlockingQueue<Integer> queue;
    private String name;

    public Consumer(BlockingQueue<Integer> queue, int i) {
        this.queue = queue;
        this.name = "Consumer" + i;
    }

    @Override
    public void run() {
        while (true) {
            try {
                int element = queue.take();
                System.out.println(name + " consumed " + element);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

