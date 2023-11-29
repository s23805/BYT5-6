package ChainRespDessignPattern;

public class Main {
    public static void main(String[] args) {

        OperationHandler additionHandler = new AdditionHandler();
        OperationHandler subtractionHandler = new SubtractionHandler();
        OperationHandler multiplicationHandler = new MultiplicationHandler();
        OperationHandler divisionHandler = new DivisionHandler();

        additionHandler.setNext(subtractionHandler);
        subtractionHandler.setNext(multiplicationHandler);
        multiplicationHandler.setNext(divisionHandler);

        Request request = new Request(10, 5, "/");

        additionHandler.handleRequest(request);
    }
}