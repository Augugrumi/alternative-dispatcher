import dispatcher.Dispatcher;

public class ChainDispatcher extends Dispatcher {
    public ChainDispatcher(int port) {
        super(port);
    }

    public static void main(String[] args) {
        System.out.println("port " + args[0]);
        new ChainDispatcher(Integer.parseInt(args[0])).execute();
    }
}
