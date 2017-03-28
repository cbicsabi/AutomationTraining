package exceptions;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try{
            doSomeMoreWork();
        } catch (Exception e){
            System.out.println("Exception caught");
            System.out.println(e);
        }

        try {
            throwCheckedException();
        } catch (IOException e) {
            System.out.println(e);
        }

        try {
            assign();
        } catch (NotAvailableException e) {
            System.out.println("Not available now");
        } catch (Exception e){
            System.out.println("General Exception caught");
        } finally {
            System.out.println("Finally block - exit stream");
        }

        System.out.println("A line of code");
    }

    private static void doSomeWork(){
        String x = null;

        System.out.println(x.length());
    }

    private static void doSomeMoreWork(){
        throw new RuntimeException();
    }

    private static void throwCheckedException() throws IOException{
            throw new IOException();
    }

    private static void assign() throws NotAvailableException {
        throw new NotAvailableException("This is not available");
    }
}
