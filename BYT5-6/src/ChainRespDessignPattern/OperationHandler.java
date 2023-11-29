package ChainRespDessignPattern;

public interface OperationHandler {
    void setNext(OperationHandler next);
    void handleRequest(Request request);
}
