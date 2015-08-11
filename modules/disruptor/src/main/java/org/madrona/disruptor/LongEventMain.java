package org.madrona.disruptor;

import com.lmax.disruptor.RingBuffer;
import com.lmax.disruptor.dsl.Disruptor;

import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class LongEventMain {

    public static void main(String[] args) throws InterruptedException {

        //Executor that will be used to construct new threads for consumers
        Executor executor = Executors.newCachedThreadPool();

        //The factory for the event
        LongEventFactory factory = new LongEventFactory();

        //Specify the size of the ring buffer , it must be power of 2.
        int bufferSize = 1024;

        //Construct the Disruptor
        Disruptor<LongEvent> disruptor = new Disruptor<LongEvent>(factory, bufferSize, executor);

        //Connect the Handler
        disruptor.handleEventsWith(new LongEventHandler());

        //Start the disruptor, start all the threads running
        disruptor.start();

        //Get the ring buffer from the Disruptor to be used for publishing
        RingBuffer<LongEvent> ringBuffer = disruptor.getRingBuffer();

        LongEventProducer producer = new LongEventProducer(ringBuffer);

        ByteBuffer bb = ByteBuffer.allocate(8);
        for (long i = 0; true; i++) {
            bb.putLong(0, i);
            producer.onData(bb);
            Thread.sleep(1000);
        }


    }
}
