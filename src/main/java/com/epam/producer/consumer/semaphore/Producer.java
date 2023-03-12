//package com.epam.producer.consumer.semaphore;
//
//import java.util.concurrent.BlockingQueue;
//import java.util.concurrent.Semaphore;
//import java.util.concurrent.atomic.AtomicInteger;
//
//public class Producer implements Runnable {
//    private Semaphore semaphore;
//    private static final AtomicInteger counter = new AtomicInteger(0);
//    private String name;
//
//    public Producer(Semaphore semaphore, int i) {
//        this.queue = queue;
//        this.name = "Producer" + i;
//    }
//
//    @Override
//    public void run() {
//        while (true) {
//            try {
//                int value = counter.incrementAndGet();
//                queue.put(value);
//                System.out.println(name + " produced :" + value);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}
//
