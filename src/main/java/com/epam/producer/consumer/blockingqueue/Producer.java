package com.epam.producer.consumer.blockingqueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class Producer implements Runnable {
    private BlockingQueue<Integer> queue;
    private static final AtomicInteger counter = new AtomicInteger(0);
    private String name;

    public Producer(BlockingQueue<Integer> queue, int i) {
        this.queue = queue;
        this.name = "Producer" + i;
    }

    @Override
    public void run() {
        while (true) {
            try {
                int value = counter.incrementAndGet();
                queue.put(value);
                System.out.println(name + " produced :" + value);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

