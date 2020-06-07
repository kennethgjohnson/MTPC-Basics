package dev.kennethgjohnson.mtpc.basics.concurrency;

public class SequentialProcessingApp {
    public static void main(final String[] args) {
        Runner runner1 = new Runner("1");
        Runner runner2 = new Runner("2");
        runner1.run();
        runner2.run();
    }
}

class Runner {
    private String instanceName;

    private String getInstanceName() {
        return instanceName;
    }

    private void setInstanceName(final String instanceName) {
        this.instanceName = instanceName;
    }

    public Runner(final String instanceName) {
        this.setInstanceName(instanceName);
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(String.format("Runner%s is running: %d", this.getInstanceName(), i));
        }
    }
}