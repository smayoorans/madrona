package org.madrona.disruptor;

import com.lmax.disruptor.RingBuffer;

import java.nio.ByteBuffer;

public class LongEventProducer {

    private final RingBuffer<LongEvent> ringBuffer;

    public LongEventProducer(RingBuffer<LongEvent> ringBuffer) {
        this.ringBuffer = ringBuffer;
    }

    public void onData(ByteBuffer byteBuffer){
        long sequence = ringBuffer.next();
        try{
            LongEvent longEvent = ringBuffer.get(sequence);
            longEvent.setValue(byteBuffer.getLong(0));  // Fill with the data
        }finally {
            ringBuffer.publish(sequence);
        }
    }
}
