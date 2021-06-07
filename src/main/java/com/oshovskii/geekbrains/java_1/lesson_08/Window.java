package com.oshovskii.geekbrains.java_1.lesson_08;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Window extends JFrame {
    private String operation = "";
    private double first;
    private double second;
    private double result;
    private final JPanel display = new JPanel();
    private final JTextField display_field = new JTextField(10);


    public Window() {
        setTitle("Calculator v. 0.1");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        int width = 350;
        int height = 350;
        GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
        int screenWidth = gd.getDisplayMode().getWidth();
        int screenHeight = gd.getDisplayMode().getHeight();
        setBounds(screenWidth / 2 - width / 2, screenHeight / 2 - height / 2, width, height);

        setResizable(false);
        setLocationRelativeTo(null);
        
        display.add(display_field);
        add(display, BorderLayout.NORTH);

        JPanel buttons = new JPanel();
        buttons.setLayout(new GridLayout(4, 3));
        buttonsForNumberOrSymbol(buttons);
        add(buttons);

        JPanel control_buttons = new JPanel();
        controlButtons(control_buttons);
        add(control_buttons, BorderLayout.EAST);

        display_field.setFont(display_field.getFont().deriveFont(38f));
        setVisible(true);
    }

    private void buttonsForNumberOrSymbol(JPanel buttons){

        createButtonForNumberOrSymbol("1",buttons);
        createButtonForNumberOrSymbol("2",buttons);
        createButtonForNumberOrSymbol("3",buttons);
        createButtonForNumberOrSymbol("4",buttons);
        createButtonForNumberOrSymbol("5",buttons);
        createButtonForNumberOrSymbol("6",buttons);
        createButtonForNumberOrSymbol("7",buttons);
        createButtonForNumberOrSymbol("8",buttons);
        createButtonForNumberOrSymbol("9",buttons);

        JButton buttonEqual  = new JButton("=");
        buttons.add(buttonEqual);
        buttonEqual.setFont(buttonEqual.getFont().deriveFont(30f));
        buttonEqual.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if ("+".equals(operation)) {
                    second = Double.parseDouble(display_field.getText());
                    result = first + second;
                    display_field.setText(String.valueOf(result));
                }

                if ("-".equals(operation)) {
                    second = Double.parseDouble(display_field.getText());
                    result = first - second;
                    display_field.setText(String.valueOf(result));
                }

                if ("*".equals(operation)) {
                    second = Double.parseDouble(display_field.getText());
                    result = first * second;
                    display_field.setText(String.valueOf(result));
                }

                if ("/".equals(operation)) {
                    second = Double.parseDouble(display_field.getText());
                    result = first / second;
                    display_field.setText(String.valueOf(result));
                }
            }
        });

        createButtonForNumberOrSymbol(".",buttons);
        createButtonForNumberOrSymbol("0",buttons);
    }


    private void controlButtons(JPanel control_buttons){
        control_buttons.setLayout(new GridLayout(5, 1));
        createButtonForControl("C", control_buttons);
        createButtonForControl("/", control_buttons);
        createButtonForControl("*", control_buttons);
        createButtonForControl("-", control_buttons);
        createButtonForControl("+", control_buttons);
    }

    private void createButtonForControl(String label, JPanel control_buttons){
        JButton button8 = new JButton(label);
        control_buttons.add(button8);
        button8.setFont(button8.getFont().deriveFont(30f));
        button8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (display_field.getText().equals("")){
                    return;
                }
                first = Double.parseDouble(display_field.getText());
                operation = label;
                display_field.setText("");
            }
        });
    }

    private void createButtonForNumberOrSymbol(String label, JPanel buttons){
        JButton button = new JButton(label);
        buttons.add(button);
        button.setFont(button.getFont().deriveFont(20f));
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (display_field.getText().contains(".") && label.equals(".")) {
                    return;
                }
                display_field.setText(display_field.getText() + label);
                if ((".").equals(display_field.getText())){
                    display_field.setText("");
                }
            }
        });
    }
}



