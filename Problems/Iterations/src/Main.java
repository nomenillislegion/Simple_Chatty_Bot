// Don't change the code below
interface LoopCallback {

    void onNewIteration(int iteration);
}

class IteratorExecutor {

    static void performIterationsWithCallback(int numberOfIterations, LoopCallback callback) {
        for (int i = 0; i < numberOfIterations; i++) {
            callback.onNewIteration(i);
        }
    }

    static void startIterations(int numberOfIterations) {
        LoopCallback instance = new LoopCallback() {
            @Override
            public void onNewIteration(int iteration) {
                System.out.println("Iteration: " + iteration);
            }
        };
        performIterationsWithCallback(numberOfIterations, instance);
        // invoke the method performIterationsWithCallback here
    }
}