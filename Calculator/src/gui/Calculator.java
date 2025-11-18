/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

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

/**
 *
 * @author sahan
 */
class close extends WindowAdapter {

    @Override
    public void windowClosing(WindowEvent we) {
        System.exit(0);
    }

}

class Cal implements ActionListener {

    TextField tf;

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10,
            b11, b12, b13, b14, b15, b16, b17, b18, b19, b20,
            b21, b22, b23, b24, b25, b26, b27, b28, b29, b30;

    String fv, sv, op, sq, psv;

    Double value, fdv, sdv, tot;

    Boolean isPositive = true;

    Boolean isValid, isValid2, clickEqual;

    int p = 0;
    int e = 0;

    Cal() {

        Frame f = new Frame();
        f.addWindowListener(new close());
        f.setBackground(Color.LIGHT_GRAY);
        f.setTitle("Calculator");
        f.setResizable(false);
        f.setSize(380, 340);
        f.setLocationRelativeTo(null);

        Font f1 = new Font("Quicksand", Font.PLAIN, 40);
        Font f2 = new Font("Segoe UI", Font.PLAIN, 20);

        MenuBar mb = new MenuBar();

        Menu m1 = new Menu("View");
        MenuItem mi1 = new MenuItem("Standard");
        m1.add(mi1);

        Menu m2 = new Menu("Edit");
        MenuItem mi2 = new MenuItem("Copy");
        MenuItem mi3 = new MenuItem("Cut");
        m2.add(mi2);
        m2.add(mi3);

        Menu m3 = new Menu("Help");
        MenuItem mi4 = new MenuItem("View Help F1");
        MenuItem mi5 = new MenuItem("About Calculator");
        m3.add(mi4);
        m3.add(mi5);

        mb.add(m1);
        mb.add(m2);
        mb.add(m3);

        f.setMenuBar(mb);

        Panel p1 = new Panel();

        tf = new TextField(11);
        tf.setFont(f1);
        tf.setEnabled(true);
        tf.setForeground(Color.BLACK);
        tf.setBackground(Color.white);
        tf.setText("0");

        p1.add(tf);

        Panel p2 = new Panel();
        GridLayout g1 = new GridLayout(6, 5, 5, 5);
        p2.setLayout(g1);

        b1 = new Button("MC");
        b2 = new Button("MS");
        b3 = new Button("MR");
        b4 = new Button("M+");
        b5 = new Button("M-");
        b6 = new Button("<--");
        b7 = new Button("CE");
        b8 = new Button("C");
        b9 = new Button("+/-");
        b10 = new Button("SQRT");
        b11 = new Button("7");
        b12 = new Button("8");
        b13 = new Button("9");
        b14 = new Button("/");
        b15 = new Button("%");
        b16 = new Button("4");
        b17 = new Button("5");
        b18 = new Button("6");
        b19 = new Button("*");
        b20 = new Button("1/X");
        b21 = new Button("1");
        b22 = new Button("2");
        b23 = new Button("3");
        b24 = new Button("-");
        b25 = new Button("=");
        b26 = new Button("0");
        b27 = new Button("");
        b28 = new Button(".");
        b29 = new Button("+");
        b30 = new Button("");

        b1.setFont(f2);
        b2.setFont(f2);
        b3.setFont(f2);
        b4.setFont(f2);
        b5.setFont(f2);
        b6.setFont(f2);
        b7.setFont(f2);
        b8.setFont(f2);
        b7.setFont(f2);
        b9.setFont(f2);
        b10.setFont(f2);
        b11.setFont(f2);
        b12.setFont(f2);
        b13.setFont(f2);
        b14.setFont(f2);
        b15.setFont(f2);
        b16.setFont(f2);
        b17.setFont(f2);
        b18.setFont(f2);
        b19.setFont(f2);
        b20.setFont(f2);
        b21.setFont(f2);
        b22.setFont(f2);
        b23.setFont(f2);
        b24.setFont(f2);
        b25.setFont(f2);
        b26.setFont(f2);
        b27.setFont(f2);
        b28.setFont(f2);
        b29.setFont(f2);
        b30.setFont(f2);

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
        p2.add(b21);
        p2.add(b22);
        p2.add(b23);
        p2.add(b24);
        p2.add(b25);
        p2.add(b26);
        p2.add(b27);
        p2.add(b28);
        p2.add(b29);
        p2.add(b30);

        b1.setEnabled(false);
        b2.setEnabled(false);
        b3.setEnabled(false);
        b4.setEnabled(false);
        b5.setEnabled(false);
        b6.setEnabled(false);
        b27.setEnabled(false);
        b30.setEnabled(false);

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
        b21.addActionListener(this);
        b22.addActionListener(this);
        b23.addActionListener(this);
        b24.addActionListener(this);
        b25.addActionListener(this);
        b26.addActionListener(this);
        b27.addActionListener(this);
        b28.addActionListener(this);
        b29.addActionListener(this);
        b30.addActionListener(this);

        f.add(p1, BorderLayout.NORTH);
        f.add(p2, BorderLayout.SOUTH);
        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent d) {

        Object o = d.getSource();

        if (tf.getText().equals("Cannot divide")) {
            tf.setText("0");
            p = 0;
            clickEqual = false;
            e = 0;
        }

        if (tf.getText().equals("Invalid input")) {
            tf.setText("0");
            p = 0;
            clickEqual = false;
            e = 0;
        }

        isValid = tf.getText().matches("^[-+]?[0-9]*\\.?[0-9]+$");

        isValid2 = tf.getText().matches("^[-+]?[0-9]*\\.?");

        if (o.equals(b8)) {      // CLEAR

            fv = null;
            sv = null;
            op = null;

            value = null;
            fdv = null;
            sdv = null;
            tot = null;

            isPositive = true;
            clickEqual = false;

            e = 0;
            p = 0;

            tf.setText("0");

        } else if (o.equals(b7)) {          // Entry Clear

            tf.setText("0");
            isPositive = true;
            p = 0;
            clickEqual = false;
            e = 0;

        } else if (isValid || isValid2) {

            if (tf.getText().equals("0")) {

                if (o.equals(b28)) {
                    p = 0;
                    e = 0;
                    tf.setText(tf.getText() + b28.getLabel());   // 0.
                } else {

                    tf.setText("");

                    if (o.equals(b21)) {                              // 1
                        p = 0;
                        e = 0;
                        tf.setText(tf.getText() + b21.getLabel());
                    } else if (o.equals(b22)) {                       // 2
                        p = 0;
                        e = 0;
                        tf.setText(tf.getText() + b22.getLabel());
                    } else if (o.equals(b23)) {                       // 3
                        p = 0;
                        e = 0;
                        tf.setText(tf.getText() + b23.getLabel());
                    } else if (o.equals(b16)) {                       // 4
                        p = 0;
                        e = 0;
                        tf.setText(tf.getText() + b16.getLabel());
                    } else if (o.equals(b17)) {                       // 5
                        p = 0;
                        e = 0;
                        tf.setText(tf.getText() + b17.getLabel());
                    } else if (o.equals(b18)) {                       // 6
                        p = 0;
                        e = 0;
                        tf.setText(tf.getText() + b18.getLabel());
                    } else if (o.equals(b11)) {                       // 7
                        p = 0;
                        e = 0;
                        tf.setText(tf.getText() + b11.getLabel());
                    } else if (o.equals(b12)) {                       // 8
                        p = 0;
                        e = 0;
                        tf.setText(tf.getText() + b12.getLabel());
                    } else if (o.equals(b13)) {                       // 9
                        p = 0;
                        e = 0;
                        tf.setText(tf.getText() + b13.getLabel());
                    } else if (o.equals(b26)) {                       // 0
                        p = 0;
                        e = 0;
                        tf.setText(tf.getText() + b26.getLabel());
                    } else if (o.equals(b9)) {                        // +/-
                        p = 0;
                        e = 0;
                        tf.setText(tf.getText() + b26.getLabel());
                    } else if (o.equals(b10)) {      // SQRT

                        p = 0;
                        e = 0;
                        sv = "0";
                        clickEqual = false;
                        fv = null;

                        if (sv == null) {
                            tf.setText("0");
                        } else {

                            sdv = Double.parseDouble(sv);
                            tf.setText("");

                            tot = Math.sqrt(sdv);

                            sq = String.valueOf(tot);

                            if (sq == "NaN") {
                                tf.setText("Invalid input");
                            } else {
                                tf.setText(tot + "");
                            }

                            isPositive = true;

                        }

                    } else if (o.equals(b20)) {         // 1/X

                        p = 0;
                        e = 0;
                        sv = "0";
                        clickEqual = false;
                        fv = null;

                        if (sv == null) {
                            tf.setText("0");
                        } else if (sv == "0") {

                            tf.setText("");
                            tf.setText("Cannot divide");

                        }

                        isPositive = true;

                    } else if (o.equals(b29)) {    // +

                        e = 0;

                        if (p == 1) {
                            p = 0;
                            fv = "0";
                            op = b29.getLabel();
                            tf.setText("");
                            isPositive = true;
                            clickEqual = false;

                        } else if (p == 0) {

                            if (fv == null) {

                                fv = "0";
                                op = b29.getLabel();
                                tf.setText("");
                                isPositive = true;
                                clickEqual = false;

                            } else {

                                if (clickEqual) {

                                    fv = "0";
                                    op = b29.getLabel();
                                    tf.setText("");
                                    isPositive = true;
                                    clickEqual = false;

                                } else {

                                    sv = "0";

                                    fdv = Double.parseDouble(fv);
                                    sdv = Double.parseDouble(sv);

                                    if (op.equals("+")) {
                                        tot = fdv + sdv;
                                    } else if (op.equals("-")) {
                                        tot = fdv - sdv;
                                    } else if (op.equals("*")) {
                                        tot = fdv * sdv;
                                    } else if (op.equals("/")) {
                                        tot = fdv / sdv;
                                    }

                                    fv = String.valueOf(tot);
                                    op = b29.getLabel();
                                    tf.setText("");
                                    isPositive = true;

                                }
                            }

                        }

                    } else if (o.equals(b24)) {    // -

                        e = 0;

                        if (p == 1) {
                            p = 0;
                            fv = "0";
                            op = b24.getLabel();
                            tf.setText("");
                            isPositive = true;
                            clickEqual = false;

                        } else if (p == 0) {

                            if (fv == null) {

                                fv = "0";
                                op = b24.getLabel();
                                tf.setText("");
                                isPositive = true;
                                clickEqual = false;

                            } else {

                                if (clickEqual) {

                                    fv = "0";
                                    op = b24.getLabel();
                                    tf.setText("");
                                    isPositive = true;
                                    clickEqual = false;

                                } else {

                                    sv = "0";

                                    fdv = Double.parseDouble(fv);
                                    sdv = Double.parseDouble(sv);

                                    if (op.equals("+")) {
                                        tot = fdv + sdv;
                                    } else if (op.equals("-")) {
                                        tot = fdv - sdv;
                                    } else if (op.equals("*")) {
                                        tot = fdv * sdv;
                                    } else if (op.equals("/")) {
                                        tot = fdv / sdv;
                                    }

                                    fv = String.valueOf(tot);
                                    op = b24.getLabel();
                                    tf.setText("");
                                    isPositive = true;

                                }
                            }
                        }

                    } else if (o.equals(b19)) {    // *

                        e = 0;

                        if (p == 1) {
                            p = 0;
                            fv = "0";
                            op = b19.getLabel();
                            tf.setText("");
                            isPositive = true;
                            clickEqual = false;

                        } else if (p == 0) {

                            if (fv == null) {

                                fv = "0";
                                op = b19.getLabel();
                                tf.setText("");
                                isPositive = true;
                                clickEqual = false;

                            } else {

                                if (clickEqual) {

                                    fv = "0";
                                    op = b19.getLabel();
                                    tf.setText("");
                                    isPositive = true;
                                    clickEqual = false;

                                } else {

                                    sv = "0";

                                    fdv = Double.parseDouble(fv);
                                    sdv = Double.parseDouble(sv);

                                    if (op.equals("+")) {
                                        tot = fdv + sdv;
                                    } else if (op.equals("-")) {
                                        tot = fdv - sdv;
                                    } else if (op.equals("*")) {
                                        tot = fdv * sdv;
                                    } else if (op.equals("/")) {
                                        tot = fdv / sdv;
                                    }

                                    fv = String.valueOf(tot);
                                    op = b19.getLabel();
                                    tf.setText("");
                                    isPositive = true;

                                }

                            }

                        }

                    } else if (o.equals(b14)) {    // /

                        e = 0;

                        if (p == 1) {
                            p = 0;
                            fv = "0";
                            op = b14.getLabel();
                            tf.setText("");
                            isPositive = true;
                            clickEqual = false;

                        } else if (p == 0) {

                            if (fv == null) {

                                fv = "0";
                                op = b14.getLabel();
                                tf.setText("");
                                isPositive = true;
                                clickEqual = false;

                            } else {

                                if (clickEqual) {

                                    fv = "0";
                                    op = b14.getLabel();
                                    tf.setText("");
                                    isPositive = true;
                                    clickEqual = false;

                                } else {

                                    sv = "0";

                                    fdv = Double.parseDouble(fv);
                                    sdv = Double.parseDouble(sv);

                                    if (op.equals("+")) {
                                        tot = fdv + sdv;
                                    } else if (op.equals("-")) {
                                        tot = fdv - sdv;
                                    } else if (op.equals("*")) {
                                        tot = fdv * sdv;
                                    } else if (op.equals("/")) {
                                        tot = fdv / sdv;
                                    }

                                    fv = String.valueOf(tot);
                                    op = b14.getLabel();
                                    tf.setText("");
                                    isPositive = true;

                                }
                            }

                        }

                    } else if (o.equals(b25)) {    // =

                        clickEqual = true;

                        p = 0;

                        if (e == 0) {

                            sv = "0";

                            if (fv == null) {
                                tf.setText(sv);
                            } else if (op == null) {
                                tf.setText(sv);
                            } else if (sv == null) {
                                tf.setText(fv);
                            } else {

                                fdv = Double.parseDouble(fv);
                                sdv = Double.parseDouble(sv);
                                tf.setText("");

                                if (op.equals("+")) {
                                    tot = fdv + sdv;
                                } else if (op.equals("-")) {
                                    tot = fdv - sdv;
                                } else if (op.equals("*")) {
                                    tot = fdv * sdv;
                                } else if (op.equals("/")) {
                                    tot = fdv / sdv;
                                }

                                tf.setText(tot + "");

                                if (tot >= 0) {
                                    isPositive = true;
                                } else {
                                    isPositive = false;
                                }

                                e = 1;

                                if (op.equals("-")) {
                                    fv = String.valueOf(tot);
                                } else if (op.equals("/")) {
                                    fv = String.valueOf(tot);
                                } else {
                                    fv = sv;
                                }

                            }

                        } else if (e == 1) {

                            if (op == "+") {
                                sv = tf.getText();
                            } else if (op == "*") {
                                sv = tf.getText();
                            }

                            if (fv == null) {
                                tf.setText(sv);
                            } else if (op == null) {
                                tf.setText(sv);
                            } else if (sv == null) {
                                tf.setText(fv);
                            } else {

                                fdv = Double.parseDouble(fv);
                                sdv = Double.parseDouble(sv);
                                tf.setText("");

                                if (op.equals("+")) {
                                    tot = fdv + sdv;
                                } else if (op.equals("-")) {
                                    tot = fdv - sdv;
                                } else if (op.equals("*")) {
                                    tot = fdv * sdv;
                                } else if (op.equals("/")) {
                                    tot = fdv / sdv;
                                }

                                tf.setText(tot + "");

                                if (op == "-") {
                                    fv = String.valueOf(tot);
                                } else if (op == "/") {
                                    fv = String.valueOf(tot);
                                }

                                if (tot >= 0) {
                                    isPositive = true;
                                } else {
                                    isPositive = false;
                                }

                            }

                        }

                    } else if (o.equals(b15)) {     // %

                        e = 0;

                        if (clickEqual) {
                            op = null;
                            fv = null;
                            clickEqual = false;
                        }

                        sv = "0";

                        if (fv == null) {
                            tf.setText("0");
                        } else if (op == null) {
                            tf.setText("0");
                        } else if (op != "*") {
                            tf.setText("0");
                        } else if (sv == null) {
                            tf.setText("0");
                        } else {

                            fdv = Double.parseDouble(fv);
                            sdv = Double.parseDouble(sv);
                            tf.setText("");

                            tot = fdv * sdv / 100;
                            tf.setText(tot + "");

                            if (tot >= 0) {
                                isPositive = true;
                            } else {
                                isPositive = false;
                            }

                        }

                        isPositive = true;

                    }

                }

            } else {

                if (o.equals(b21)) {                              // 1
                    p = 0;
                    e = 0;
                    tf.setText(tf.getText() + b21.getLabel());
                } else if (o.equals(b22)) {                       // 2
                    p = 0;
                    e = 0;
                    tf.setText(tf.getText() + b22.getLabel());
                } else if (o.equals(b23)) {                       // 3
                    p = 0;
                    e = 0;
                    tf.setText(tf.getText() + b23.getLabel());
                } else if (o.equals(b16)) {                       // 4
                    p = 0;
                    e = 0;
                    tf.setText(tf.getText() + b16.getLabel());
                } else if (o.equals(b17)) {                       // 5
                    p = 0;
                    e = 0;
                    tf.setText(tf.getText() + b17.getLabel());
                } else if (o.equals(b18)) {                       // 6
                    p = 0;
                    e = 0;
                    tf.setText(tf.getText() + b18.getLabel());
                } else if (o.equals(b11)) {                       // 7
                    p = 0;
                    e = 0;
                    tf.setText(tf.getText() + b11.getLabel());
                } else if (o.equals(b12)) {                       // 8
                    p = 0;
                    e = 0;
                    tf.setText(tf.getText() + b12.getLabel());
                } else if (o.equals(b13)) {                       // 9
                    p = 0;
                    e = 0;
                    tf.setText(tf.getText() + b13.getLabel());
                } else if (o.equals(b26)) {                       // 0 
                    p = 0;
                    e = 0;
                    tf.setText(tf.getText() + b26.getLabel());
                } else if (o.equals(b28)) {                       // 1.,2.,3.
                    p = 0;
                    e = 0;
                    if (!tf.getText().contains(".")) {
                        tf.setText(tf.getText() + b28.getLabel());
                    }

                } else if (o.equals(b9)) {                        // +/-

                    p = 0;
                    e = 0;

                    if (!tf.getText().isBlank()) {

                        value = Double.valueOf(tf.getText());

                        if (isPositive) {
                            value = -value;
                            tf.setText(String.valueOf(value));
                            isPositive = false;
                        } else {
                            value = Math.abs(value);
                            tf.setText(String.valueOf(value));
                            isPositive = true;
                        }

                    }

                } else if (o.equals(b10)) {      // SQRT

                    e = 0;
                    clickEqual = false;

                    if (p == 1) {
                        p = 0;
                        fv = null;

                        if (tf.getText().isBlank()) {
                            tf.setText("0");
                        } else {

                            sv = tf.getText();

                            if (sv == null) {
                                tf.setText("0");
                            } else {

                                sdv = Double.parseDouble(sv);
                                tf.setText("");

                                tot = Math.sqrt(sdv);

                                sq = String.valueOf(tot);

                                if (sq == "NaN") {
                                    tf.setText("Invalid input");
                                } else {
                                    tf.setText(tot + "");
                                }

                                isPositive = true;

                            }

                        }

                    } else if (p == 0) {

                        e = 0;
                        fv = null;

                        if (tf.getText().isBlank()) {
                            tf.setText("0");
                        } else {

                            sv = tf.getText();

                            if (sv == null) {
                                tf.setText("0");
                            } else {

                                sdv = Double.parseDouble(sv);
                                tf.setText("");

                                tot = Math.sqrt(sdv);

                                sq = String.valueOf(tot);

                                if (sq == "NaN") {
                                    tf.setText("Invalid input");
                                } else {
                                    tf.setText(tot + "");
                                }

                                isPositive = true;

                            }

                        }
                    }

                } else if (o.equals(b20)) {         // 1/X

                    e = 0;
                    clickEqual = false;
                    fv = null;

                    if (p == 1) {
                        p = 0;

                        if (tf.getText().isBlank()) {
                            tf.setText("0");
                        } else {

                            sv = tf.getText();

                            if (sv == null) {
                                tf.setText("0");
                            } else {

                                sdv = Double.parseDouble(sv);
                                tf.setText("");

                                tot = 1 / sdv;
                                tf.setText(tot + "");

                            }

                            isPositive = true;

                        }

                    } else if (p == 0) {

                        if (tf.getText().isBlank()) {
                            tf.setText("0");
                        } else {

                            sv = tf.getText();

                            if (sv == null) {
                                tf.setText("0");
                            } else {

                                sdv = Double.parseDouble(sv);
                                tf.setText("");

                                tot = 1 / sdv;
                                tf.setText(tot + "");

                            }

                            isPositive = true;

                        }
                    }

                } else if (o.equals(b29)) {    // +

                    e = 0;

                    if (p == 1) {
                        p = 0;
                        fv = null;
                        clickEqual = false;

                        if (!tf.getText().isBlank()) {

                            if (fv == null) {

                                fv = tf.getText();
                                op = b29.getLabel();
                                tf.setText("");
                                isPositive = true;

                            }
                        }

                    } else if (p == 0) {

                        if (!tf.getText().isBlank()) {

                            if (fv == null) {

                                fv = tf.getText();
                                op = b29.getLabel();
                                tf.setText("");
                                isPositive = true;
                                clickEqual = false;

                            } else {

                                if (clickEqual) {

                                    fv = tf.getText();
                                    op = b29.getLabel();
                                    tf.setText("");
                                    isPositive = true;
                                    clickEqual = false;

                                } else {

                                    sv = tf.getText();

                                    fdv = Double.parseDouble(fv);
                                    sdv = Double.parseDouble(sv);

                                    if (op.equals("+")) {
                                        tot = fdv + sdv;
                                    } else if (op.equals("-")) {
                                        tot = fdv - sdv;
                                    } else if (op.equals("*")) {
                                        tot = fdv * sdv;
                                    } else if (op.equals("/")) {
                                        tot = fdv / sdv;
                                    }

                                    fv = String.valueOf(tot);
                                    op = b29.getLabel();
                                    tf.setText("");
                                    isPositive = true;

                                }
                            }

                        } else {
                            op = b29.getLabel();
                        }

                    }

                } else if (o.equals(b24)) {    // -

                    e = 0;

                    if (p == 1) {
                        p = 0;
                        fv = null;
                        clickEqual = false;

                        if (!tf.getText().isBlank()) {

                            if (fv == null) {

                                fv = tf.getText();
                                op = b24.getLabel();
                                tf.setText("");
                                isPositive = true;

                            }
                        }

                    } else if (p == 0) {

                        if (!tf.getText().isBlank()) {

                            if (fv == null) {

                                fv = tf.getText();
                                op = b24.getLabel();
                                tf.setText("");
                                isPositive = true;
                                clickEqual = false;

                            } else {

                                if (clickEqual) {

                                    fv = tf.getText();
                                    op = b24.getLabel();
                                    tf.setText("");
                                    isPositive = true;
                                    clickEqual = false;

                                } else {

                                    sv = tf.getText();

                                    fdv = Double.parseDouble(fv);
                                    sdv = Double.parseDouble(sv);

                                    if (op.equals("+")) {
                                        tot = fdv + sdv;
                                    } else if (op.equals("-")) {
                                        tot = fdv - sdv;
                                    } else if (op.equals("*")) {
                                        tot = fdv * sdv;
                                    } else if (op.equals("/")) {
                                        tot = fdv / sdv;
                                    }

                                    fv = String.valueOf(tot);
                                    op = b24.getLabel();
                                    tf.setText("");
                                    isPositive = true;

                                }
                            }

                        } else {
                            op = b24.getLabel();
                        }

                    }

                } else if (o.equals(b19)) {    // *

                    e = 0;

                    if (p == 1) {
                        p = 0;
                        fv = null;
                        clickEqual = false;

                        if (!tf.getText().isBlank()) {

                            if (fv == null) {

                                fv = tf.getText();
                                op = b19.getLabel();
                                tf.setText("");
                                isPositive = true;

                            }
                        }

                    } else if (p == 0) {

                        if (!tf.getText().isBlank()) {

                            if (fv == null) {

                                fv = tf.getText();
                                op = b19.getLabel();
                                tf.setText("");
                                isPositive = true;
                                clickEqual = false;

                            } else {

                                if (clickEqual) {

                                    fv = tf.getText();
                                    op = b19.getLabel();
                                    tf.setText("");
                                    isPositive = true;
                                    clickEqual = false;

                                } else {

                                    sv = tf.getText();

                                    fdv = Double.parseDouble(fv);
                                    sdv = Double.parseDouble(sv);

                                    if (op.equals("+")) {
                                        tot = fdv + sdv;
                                    } else if (op.equals("-")) {
                                        tot = fdv - sdv;
                                    } else if (op.equals("*")) {
                                        tot = fdv * sdv;
                                    } else if (op.equals("/")) {
                                        tot = fdv / sdv;
                                    }

                                    fv = String.valueOf(tot);
                                    op = b19.getLabel();
                                    tf.setText("");
                                    isPositive = true;

                                }

                            }

                        } else {
                            op = b19.getLabel();
                        }

                    }

                } else if (o.equals(b14)) {    // /

                    e = 0;

                    if (p == 1) {
                        p = 0;
                        fv = null;
                        clickEqual = false;

                        if (!tf.getText().isBlank()) {

                            if (fv == null) {

                                fv = tf.getText();
                                op = b14.getLabel();
                                tf.setText("");
                                isPositive = true;

                            }

                        }

                    } else if (p == 0) {

                        if (!tf.getText().isBlank()) {

                            if (fv == null) {

                                fv = tf.getText();
                                op = b14.getLabel();
                                tf.setText("");
                                isPositive = true;
                                clickEqual = false;

                            } else {

                                if (clickEqual) {

                                    fv = tf.getText();
                                    op = b14.getLabel();
                                    tf.setText("");
                                    isPositive = true;
                                    clickEqual = false;

                                } else {

                                    sv = tf.getText();

                                    fdv = Double.parseDouble(fv);
                                    sdv = Double.parseDouble(sv);

                                    if (op.equals("+")) {
                                        tot = fdv + sdv;
                                    } else if (op.equals("-")) {
                                        tot = fdv - sdv;
                                    } else if (op.equals("*")) {
                                        tot = fdv * sdv;
                                    } else if (op.equals("/")) {
                                        tot = fdv / sdv;
                                    }

                                    fv = String.valueOf(tot);
                                    op = b14.getLabel();
                                    tf.setText("");
                                    isPositive = true;

                                }
                            }

                        } else {
                            op = b14.getLabel();
                        }

                    }

                } else if (o.equals(b25)) {    // =

                    p = 0;

                    clickEqual = true;

                    if (tf.getText().isBlank()) {
                        tf.setText("0");
                    } else {

                        if (e == 0) {

                            sv = tf.getText();

                            if (fv == null) {
                                tf.setText(sv);
                            } else if (op == null) {
                                tf.setText(sv);
                            } else if (sv == null) {
                                tf.setText(fv);
                            } else {

                                fdv = Double.parseDouble(fv);
                                sdv = Double.parseDouble(sv);
                                tf.setText("");

                                if (op.equals("+")) {
                                    tot = fdv + sdv;
                                } else if (op.equals("-")) {
                                    tot = fdv - sdv;
                                } else if (op.equals("*")) {
                                    tot = fdv * sdv;
                                } else if (op.equals("/")) {
                                    tot = fdv / sdv;
                                }

                                tf.setText(tot + "");

                                if (tot >= 0) {
                                    isPositive = true;
                                } else {
                                    isPositive = false;
                                }

                                if (op.equals("-")) {
                                    fv = String.valueOf(tot);
                                } else if (op.equals("/")) {
                                    fv = String.valueOf(tot);
                                } else {
                                    fv = sv;
                                }

                                e = 1;

                            }

                        } else if (e == 1) {

                            if (op == "+") {
                                sv = tf.getText();
                            } else if (op == "*") {
                                sv = tf.getText();
                            }

                            if (fv == null) {
                                tf.setText(sv);
                            } else if (op == null) {
                                tf.setText(sv);
                            } else if (sv == null) {
                                tf.setText(fv);
                            } else {

                                fdv = Double.parseDouble(fv);
                                sdv = Double.parseDouble(sv);
                                tf.setText("");

                                if (op.equals("+")) {
                                    tot = fdv + sdv;
                                } else if (op.equals("-")) {
                                    tot = fdv - sdv;
                                } else if (op.equals("*")) {
                                    tot = fdv * sdv;
                                } else if (op.equals("/")) {
                                    tot = fdv / sdv;
                                }

                                tf.setText(tot + "");

                                if (op == "-") {
                                    fv = String.valueOf(tot);
                                } else if (op == "/") {
                                    fv = String.valueOf(tot);
                                }

                                if (tot >= 0) {
                                    isPositive = true;
                                } else {
                                    isPositive = false;
                                }

                            }

                        }

                    }

                } else if (o.equals(b15)) {          // %

                    e = 0;

                    if (clickEqual) {
                        op = null;
                        fv = null;
                        clickEqual = false;
                    }

                    if (tf.getText().isBlank()) {
                        tf.setText("0");
                    } else {

                        if (p == 0) {
                            sv = tf.getText();
                            psv = sv;

                            if (fv == null) {
                                tf.setText("0");
                            } else if (op == null) {
                                tf.setText("0");
                            } else if (op != "*") {
                                tf.setText("0");
                            } else if (sv == null) {
                                tf.setText("0");
                            } else {

                                fdv = Double.parseDouble(fv);
                                sdv = Double.parseDouble(sv);
                                tf.setText("");

                                tot = fdv * sdv / 100;
                                tf.setText(tot + "");

                                fv = String.valueOf(tot);
                                op = null;

                                if (tot >= 0) {
                                    isPositive = true;
                                } else {
                                    isPositive = false;
                                }

                                p = 1;
                            }

                            isPositive = true;

                        } else if (p == 1) {

                            sv = psv;
                            op = "*";

                            if (fv == null) {
                                tf.setText("0");
                            } else if (op == null) {
                                tf.setText("0");
                            } else if (op != "*") {
                                tf.setText("0");
                            } else if (sv == null) {
                                tf.setText("0");
                            } else {

                                fdv = Double.parseDouble(fv);
                                sdv = Double.parseDouble(sv);
                                tf.setText("");

                                tot = fdv * sdv / 100;
                                tf.setText(tot + "");

                                fv = String.valueOf(tot);

                                if (tot >= 0) {
                                    isPositive = true;
                                } else {
                                    isPositive = false;
                                }

                            }

                            isPositive = true;

                        }

                    }

                }

            }

        } else {
            tf.setText("Invalid input");
        }
    }

}

public class Calculator {

    public static void main(String args[]) {
        new Cal();
    }

}
