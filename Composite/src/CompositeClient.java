public class CompositeClient {
    public static void main(String[] args) {

        Composite computer = new Composite("PC");
        Equipment processor = new Equipment("processor",100);
        Equipment hdd = new Equipment("hdd",100);
        Composite memory = new Composite("memory");
        Equipment rom = new Equipment("rom",100);
        Equipment ram = new Equipment("ram",100);
        memory.add(rom).add(ram);
        computer.add(memory).add(processor).add(hdd);
        System.out.println("PC price : "+ computer.getPrice());

    }
}