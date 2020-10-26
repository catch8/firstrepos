package HW3;

public class Phone {
    String number;
    String model;
    double weight;
    String name;

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
        new Phone(number, model);
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    void setNumber() {
        this.number = number;
    }
    String getNumber() {
        return this.number;
    }

    void setModel() {
        this.model = model;
    }
    String getModel() {
        return this.model;
    }

    void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    void  receiveCall(String name, String number) {
        this.name+= name+number;
    }

    void sendMessage() {

    }

}

class Main {
    public static void main(String args[]) {
        Phone ph = new Phone("+9875677880", "Mi 9 Pro", 341.7);

        System.out.println(ph.number);
        System.out.println(ph.model);
        System.out.println(ph.weight);

        ph.receiveCall(ph.name);
        ph.receiveCall(ph.name, ph.number);
    }
}