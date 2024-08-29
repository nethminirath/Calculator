/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator_awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class close extends WindowAdapter {

    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

}

class cal implements ActionListener {

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10,
            b11, b12, b13, b14, b15, b16, b17, b18, b19, b20,
            b21, b22, b23, b24, b25;

    TextField tf;

    String fv, sv, op;

    double fdv, sdv, tot;

    MenuItem mi1, mi2, mi3, mi4, mi5, mi6, mi7;

    Panel p1, p2;

    cal() {

        Frame f1 = new Frame();

        f1.setBackground(Color.WHITE);
        f1.addWindowListener(new close());
        f1.setBounds(500, 200, 350, 500);
        f1.setTitle("Calculator");

        MenuBar mbar = new MenuBar();

        mi1 = new MenuItem("Standerd");
        mi2 = new MenuItem("Scientific");
        mi3 = new MenuItem("Dark Theme");
        mi4 = new MenuItem("Light Theme");
        mi5 = new MenuItem("Date Calculation");
        mi6 = new MenuItem("Currency");
        mi7 = new MenuItem("Copy");

        Menu m1 = new Menu("View");
        m1.add(mi1);
        m1.add(mi2);

        Menu m2 = new Menu("Themes");
        m2.add(mi3);
        m2.add(mi4);

        Menu m3 = new Menu("Help");
        m3.add(mi5);
        m3.add(mi6);
        m3.add(mi7);

        mbar.add(m1);
        mbar.add(m2);
        mbar.add(m3);
        f1.setMenuBar(mbar);

        b1 = new Button("AC");
        b2 = new Button("%");
        b3 = new Button("√");
        b4 = new Button("/");
        b5 = new Button("7");
        b6 = new Button("8");
        b7 = new Button("9");
        b8 = new Button("*");
        b9 = new Button("4");
        b10 = new Button("5");
        b11 = new Button("6");
        b12 = new Button("-");
        b13 = new Button("1");
        b14 = new Button("2");
        b15 = new Button("3");
        b16 = new Button("+");
        b17 = new Button("+/-");
        b18 = new Button("0");
        b19 = new Button(".");
        b20 = new Button("=");

        Font font1 = new Font("Arial Black", Font.BOLD, 30);
        Font font2 = new Font("Courier New", Font.BOLD, 30);

        Button Button = new Button("YELLLOW");
        b4.setBackground(Color.yellow);
        b8.setBackground(Color.yellow);
        b12.setBackground(Color.yellow);
        b16.setBackground(Color.yellow);
        b20.setBackground(Color.yellow);
        b1.setBackground(Color.gray);
        b2.setBackground(Color.gray);
        b3.setBackground(Color.gray);
        b5.setBackground(Color.gray);
        b6.setBackground(Color.gray);
        b7.setBackground(Color.gray);
        b9.setBackground(Color.gray);
        b10.setBackground(Color.gray);
        b11.setBackground(Color.gray);
        b13.setBackground(Color.gray);
        b14.setBackground(Color.gray);
        b15.setBackground(Color.gray);
        b17.setBackground(Color.gray);
        b18.setBackground(Color.gray);
        b19.setBackground(Color.gray);

        b1.setFont(font1);
        b2.setFont(font1);
        b3.setFont(font1);
        b4.setFont(font1);
        b5.setFont(font1);
        b6.setFont(font1);
        b7.setFont(font1);
        b8.setFont(font1);
        b9.setFont(font1);
        b10.setFont(font1);
        b11.setFont(font2);
        b12.setFont(font2);
        b13.setFont(font2);
        b14.setFont(font2);
        b15.setFont(font2);
        b16.setFont(font2);
        b17.setFont(font2);
        b18.setFont(font2);
        b19.setFont(font2);
        b20.setFont(font2);

        tf = new TextField(15);
        Font font3 = new Font("Courier New", Font.BOLD, 35);
        tf.setFont(font3);
        tf.setEditable(false);
        tf.setForeground(Color.BLACK);
        tf.setBackground(Color.WHITE);

        p1 = new Panel();
        p2 = new Panel();

        GridLayout gl = new GridLayout(6, 5, 4, 4);

        p1.add(tf);

        p2.setLayout(gl);
        p2.setBackground(Color.BLACK);

        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(b4);
        p2.add(b5);
        p2.add(b6);
        p2.add(b7);
        p2.add(b8);
        p2.add(b9);
        p2.add(b10);
        p2.add(b11);
        p2.add(b12);
        p2.add(b13);
        p2.add(b14);
        p2.add(b15);
        p2.add(b16);
        p2.add(b17);
        p2.add(b18);
        p2.add(b19);
        p2.add(b20);

        f1.add(p1, BorderLayout.NORTH);
        f1.add(p2, BorderLayout.CENTER);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
        b17.addActionListener(this);
        b18.addActionListener(this);
        b19.addActionListener(this);
        b20.addActionListener(this);

        mi3.addActionListener(this);
        mi4.addActionListener(this);

        f1.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Object o = e.getSource();

        if (o.equals(b13)) {
            tf.setText(tf.getText() + b13.getLabel());
        } else if (o.equals(b14)) {
            tf.setText(tf.getText() + b14.getLabel());
        } else if (o.equals(b3)) {
//            tf.setText(tf.getText()+b3.getLabel());
            String val = tf.getText();
            double number = Double.parseDouble(val);

            double sqrt = Math.sqrt(number);
            tf.setText(String.valueOf(sqrt));
        } else if (o.equals(b15)) {
            tf.setText(tf.getText() + b15.getLabel());
        } else if (o.equals(b9)) {
            tf.setText(tf.getText() + b9.getLabel());
        } else if (o.equals(b10)) {
            tf.setText(tf.getText() + b10.getLabel());
        } else if (o.equals(b11)) {
            tf.setText(tf.getText() + b11.getLabel());
        } else if (o.equals(b5)) {
            tf.setText(tf.getText() + b5.getLabel());
        } else if (o.equals(b6)) {
            tf.setText(tf.getText() + b6.getLabel());
        } else if (o.equals(b7)) {
            tf.setText(tf.getText() + b7.getLabel());
        } else if (o.equals(b18)) {
            tf.setText(tf.getText() + b18.getLabel());
        } else if (o.equals(b19)) {
            tf.setText(tf.getText() + b19.getLabel());
        } else if (o.equals(b2)) {
            sv = tf.getText();

            fdv = Double.parseDouble(fv);
            sdv = Double.parseDouble(sv);

            tot = fdv * sdv / 100;

            tf.setText(tot + " ");

        } else if (o.equals(b16)) {

            fv = tf.getText();
            tf.setText("");

            op = b16.getLabel();

        } else if (o.equals(b12)) {

            fv = tf.getText();
            tf.setText("");

            op = b12.getLabel();

        } else if (o.equals(b8)) {

            fv = tf.getText();
            tf.setText("");

            op = b8.getLabel();

        } else if (o.equals(b4)) {

            fv = tf.getText();
            tf.setText("");

            op = b4.getLabel();

        } else if (o.equals(b20)) {

            sv = tf.getText();

            fdv = Double.parseDouble(fv);
            sdv = Double.parseDouble(sv);

            if (op.equals("-")) {

                tot = fdv - sdv;
                tf.setText(tot + "");

            } else if (op.equals("+")) {

                tot = fdv + sdv;
                tf.setText(tot + "");

            } else if (op.equals("*")) {

                tot = fdv * sdv;
                tf.setText(tot + "");

            } else if (op.equals("/")) {

                tot = fdv / sdv;
                tf.setText(tot + "");

            }
            
        } else if (o.equals(b1)) {
            tf.setText("");
            fv = "";
            sv = "";
            fdv = 0;
            sdv = 0;
        } else if (o.equals(mi3)) {          // Dark Theme
            b1.setBackground(Color.gray);
            b2.setBackground(Color.gray);
            b3.setBackground(Color.gray);
            b5.setBackground(Color.gray);
            b6.setBackground(Color.gray);
            b7.setBackground(Color.gray);
            b9.setBackground(Color.gray);
            b10.setBackground(Color.gray);
            b11.setBackground(Color.gray);
            b13.setBackground(Color.gray);
            b14.setBackground(Color.gray);
            b15.setBackground(Color.gray);
            b17.setBackground(Color.gray);
            b18.setBackground(Color.gray);
            b19.setBackground(Color.gray);

            tf.setForeground(Color.WHITE);
            tf.setBackground(Color.BLACK);

            p2.setBackground(Color.BLACK);
            p1.setBackground(Color.BLACK);
        } else if (o.equals(mi4)) {                 // Light Theme
            b1.setBackground(Color.GRAY);
            b2.setBackground(Color.GRAY);
            b3.setBackground(Color.GRAY);
            b5.setBackground(Color.WHITE);
            b6.setBackground(Color.WHITE);
            b7.setBackground(Color.WHITE);
            b9.setBackground(Color.WHITE);
            b10.setBackground(Color.WHITE);
            b11.setBackground(Color.WHITE);
            b13.setBackground(Color.WHITE);
            b14.setBackground(Color.WHITE);
            b15.setBackground(Color.WHITE);
            b17.setBackground(Color.WHITE);
            b18.setBackground(Color.WHITE);
            b19.setBackground(Color.WHITE);
            b4.setBackground(Color.YELLOW);
            b8.setBackground(Color.YELLOW);
            b12.setBackground(Color.YELLOW);
            b16.setBackground(Color.YELLOW);
            b20.setBackground(Color.YELLOW);

            tf.setForeground(Color.BLACK);
            tf.setBackground(Color.WHITE);

            p2.setBackground(Color.WHITE);
            p1.setBackground(Color.WHITE);
        }

    }

    private static class p2 {

        private static void setBackground(Color WHITE) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public p2() {
        }
    }

    private static class f1 {

        private static void setBackground(Color WHITE) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public f1() {
        }
    }
}

public class Calculator_AWT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new cal();
    }

}
