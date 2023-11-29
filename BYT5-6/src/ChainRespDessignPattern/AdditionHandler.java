package ChainRespDessignPattern;

public  class AdditionHandler implements OperationHandler {
    private OperationHandler next;

    @Override
    public void setNext(OperationHandler next) {
        this.next = next;
    }

    @Override
    public void handleRequest(Request request) {
        if (request.getOperation().equals("+")) {
            int result = request.getNum1() + request.getNum2();
            System.out.println(request.getNum1() + " + " + request.getNum2() + " = " + result);
        } else if (next != null) {
            next.handleRequest(request);
        } else {
            System.out.println("Operation not supported");
        }
    }
}
