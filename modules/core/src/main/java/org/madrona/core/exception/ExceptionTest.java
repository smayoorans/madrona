package org.madrona.core.exception;

public class ExceptionTest {

    public static void main(String[] args) {
        try {
            testException(null);
        } catch (CustomException e) {
            e.printStackTrace();
        }
    }

    public static void testException(String message) throws CustomException{
        if(message == null){
            throw new CustomException("Message value is null");
        }
    }
}

