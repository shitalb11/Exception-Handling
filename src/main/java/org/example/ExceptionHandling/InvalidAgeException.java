package org.example.ExceptionHandling;

public class InvalidAgeException extends Exception{
    public InvalidAgeException(){

}

public InvalidAgeException(String s){
    super(s);
    }
}
