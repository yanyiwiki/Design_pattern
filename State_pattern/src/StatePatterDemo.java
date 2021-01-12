public class StatePatterDemo {
    public static void main(String[] args) {
        //context对象是不变的
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

//        System.out.println(context.getState().toString());
    }
}
