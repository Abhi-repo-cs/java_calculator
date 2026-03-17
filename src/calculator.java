import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculator extends Frame implements ActionListener {
    TextField display;
    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, plus, min, mul, div, rst, eq, back, AC;

    calculator() {
        display = new TextField(" ");
        add(display);
        display.setBounds(100, 90, 265, 50);

        btn1 = new Button("1");
        btn1.setBounds(100, 160, 70, 70);
        add(btn1);
        btn1.addActionListener(this);

        btn2 = new Button("2");
        btn2.setBounds(195, 160, 70, 70);
        add(btn2);
        btn2.addActionListener(this);


        btn3 = new Button("3");
        btn3.setBounds(290, 160, 70, 70);
        add(btn3);
        btn3.addActionListener(this);


        btn4 = new Button("4");
        btn4.setBounds(100, 240, 70, 70);
        add(btn4);
        btn4.addActionListener(this);


        btn5 = new Button("5");
        btn5.setBounds(195, 240, 70, 70);
        add(btn5);
        btn5.addActionListener(this);


        btn6 = new Button("6");
        btn6.setBounds(290, 240, 70, 70);
        add(btn6);
        btn6.addActionListener(this);


        btn7 = new Button("7");
        btn7.setBounds(100, 320, 70, 70);
        add(btn7);
        btn7.addActionListener(this);


        btn8 = new Button("8");
        btn8.setBounds(195, 320, 70, 70);
        add(btn8);
        btn8.addActionListener(this);


        btn9 = new Button("9");
        btn9.setBounds(290, 320, 70, 70);
        add(btn9);
        btn9.addActionListener(this);


        plus = new Button("+");
        plus.setBounds(100, 400, 70, 70);
        add(plus);
        plus.addActionListener(this);


        min = new Button("-");
        min.setBounds(195, 400, 70, 70);
        add(min);
        min.addActionListener(this);


        mul = new Button("X");
        mul.setBounds(290, 400, 70, 70);
        add(mul);
        mul.addActionListener(this);


        div = new Button("/");
        div.setBounds(100, 480, 70, 70);
        add(div);
        div.addActionListener(this);


        rst = new Button("RESET");
        rst.setBounds(195, 480, 70, 70);
        add(rst);
        rst.addActionListener(this);


        eq = new Button("=");
        eq.setBounds(290, 480, 70, 70);
        add(eq);
        eq.addActionListener(this);

        btn0 = new Button("0");
        btn0.setBounds(380, 160, 100, 149);
        add(btn0);
        btn0.addActionListener(this);

        AC = new Button("CE");
        AC.setBounds(380, 320, 100, 149);
        add(AC);
        AC.addActionListener(this);

        back = new Button("<-----");
        back.setBounds(380, 480, 100, 70);
        add(back);
        back.addActionListener(this);


        setLayout(null);
        setSize(600, 600);
        setVisible(true);
        setTitle("CALCULATOR");
        Label name = new Label("ABHISHEK GOVINDARAJ");
        name.setBounds(175, 515, 135, 135);
        add(name);


    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn0) {
            String exp = display.getText();
            exp += 0;
            display.setText(exp);


        } else if (e.getSource() == btn1) {
            String exp = display.getText();
            exp += 1;
            display.setText(exp);


        } else if (e.getSource() == btn2) {
            String exp = display.getText();
            exp += 2;
            display.setText(exp);
        } else if (e.getSource() == btn3) {
            String exp = display.getText();
            exp += 3;
            display.setText(exp);
        } else if (e.getSource() == btn4) {
            String exp = display.getText();
            exp += 4;
            display.setText(exp);
        } else if (e.getSource() == btn5) {
            String exp = display.getText();
            exp += 5;
            display.setText(exp);
        } else if (e.getSource() == btn6) {
            String exp = display.getText();
            exp += 6;
            display.setText(exp);
        } else if (e.getSource() == btn7) {
            String exp = display.getText();
            exp += 7;
            display.setText(exp);
        } else if (e.getSource() == btn8) {
            String exp = display.getText();
            exp += 8;
            display.setText(exp);
        } else if (e.getSource() == btn9) {
            String exp = display.getText();
            exp += 9;
            display.setText(exp);
        } else if (e.getSource() == rst) {
            display.setText(" ");
        } else if (e.getSource() == plus) {
            String exp = display.getText();
            exp += '+';
            display.setText(exp);
        } else if (e.getSource() == min) {
            String exp = display.getText();
            exp += "-";
            display.setText(exp);
        } else if (e.getSource() == mul) {
            String exp = display.getText();
            exp += "X";
            display.setText(exp);
        } else if (e.getSource() == div) {
            String exp = display.getText();
            exp += '/';
            display.setText(exp);
        } else if (e.getSource() == AC) {

            display.setText(" ");
        } else if (e.getSource() == eq) {
            int a, b, i, result;
            char operator = ' ';
            String expression = display.getText().trim();
            String tempA = "", tempB = "";
            if (expression.isEmpty()) {
                display.setText("Error");
                return;
            }
            for (i = 0; i < expression.length(); i++) {
                if (Character.isDigit(expression.charAt(i))) {

                    tempA += expression.charAt(i);
                } else {
                    operator = expression.charAt(i);
                    break;
                }
            }

            tempB = expression.substring(i + 1);
            if (tempA.isEmpty() || tempB.isEmpty()) {
                display.setText("Error");
                return;
            }

            a = Integer.parseInt(tempA);
            b = Integer.parseInt(tempB);

            switch (operator) {
                case '+':
                    result = a + b;
                    break;

                case '-':
                    result = a - b;
                    break;

                case 'X':
                    result = a * b;
                    break;

                case '/':
                    if (b == 0) {
                        display.setText("Error");
                        return;
                    }
                    result = a / b;
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + operator);


            }

            display.setText(String.valueOf(result));

        } else if (e.getSource() == back) {
            String text = display.getText();
            if (text.length() > 0) {
                display.setText(text.substring(0, text.length() - 1));
            }
        }
    }


    public static void main(String[] args) {
        new calculator();
    }

}