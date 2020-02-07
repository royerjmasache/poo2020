package workshop1;

public class RunComputer {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.updateBrand("MSI");
        computer.updateProcessor("Intel");
        computer.updateGraphic("NVIDIA RTX 2080 Ti");
        computer.updateSize(15);
        computer.updateRam(32);
        computer.updateScreen(15);
        computer.updateKeyboard("Mechanical");
        computer.updateWeight(2);
        computer.updateColor("Silver");
        computer.updateMaterial("Aluminium");
        String showComputer = computer.getInformation();
        System.out.println(showComputer);
        System.out.println(computer.runComputer());
        System.out.println(computer.readComputer());

    }
}
