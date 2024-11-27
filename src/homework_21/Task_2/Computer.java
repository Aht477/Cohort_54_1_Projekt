package homework_21.Task_2;

public class Computer {
    private Processor processor; // жесткая связь - композиция
    private Memory memory; // жесткая связь - композиция
    private Storage storage; // мягкая связь - агрегация

    public Computer(Storage storage, String procBrand, String procModel) {
        this.storage = storage;
        this.processor = new Processor(procBrand, procModel);
        this.memory = new Memory("Crutial", "DDR-5400");
    }

    public Processor getProcessor() {
        return processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public Storage getStorage() {
        return storage;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }
}