package com.epam.producer.consumer;

import org.junit.Test;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import com.epam.producer.consumer.blockingqueue.Consumer;
import com.epam.producer.consumer.blockingqueue.Producer;

public class ProducerConsumerBlockingQueueTest {
    @Test
    public void sumOfSquaresTest() throws InterruptedException {
        int numProducers = 4;
        int numConsumers = 3;

        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>(20);

        for (int i = 0; i < numProducers; i++) {
            new Thread(new Producer(queue,i)).start();
        }

        for (int i = 0; i < numConsumers; i++) {
            new Thread(new Consumer(queue,i)).start();
        }

        Thread.sleep(10 );

        System.exit(0);
    }
}

