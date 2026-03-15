import java.awt.*;

class trial extends Frame {

    trial() {
        Button btn = new Button("run");
        Button btn2 = new Button("click me");

        setLayout(new FlowLayout());
        setSize(200, 200);
        setVisible(true);

        add(btn);
        add(btn2);

    }
}

class Main{
    public static void main(String[] args) {
        new trial();
    }

}

