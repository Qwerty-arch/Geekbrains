package com.oshovskii.geekbrains.java_2.lesson_01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MainCircles extends JFrame {

    private int startCount = 10;
    private static final int WINDOW_WIDTH = 800;
    private static final int WINDOW_HEIGHT = 600;

    Sprite[] sprites = new Sprite[1000];

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainCircles();
            }
        });
    }

    private MainCircles() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        setBounds(dimension.width/2 - 400, dimension.height/2 - 300, WINDOW_WIDTH, WINDOW_HEIGHT);


        initApplication();


        GameCanvas canvas = new GameCanvas(this);
        add(canvas, BorderLayout.CENTER);

        int delay = 1500;
        ActionListener taskPerformer = new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                BackGround backGround = new BackGround();
                canvas.setBackground(backGround.ColorTime());
            }
        };

        new Timer(delay, taskPerformer).start();

        JButton jButton = new JButton("New Ball");
        JButton jButton2 = new JButton("Delete Ball");

        canvas.add(jButton);
        canvas.add(jButton2);

        add(jButton, BorderLayout.NORTH);
        add(jButton2, BorderLayout.SOUTH);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sprites[Sprite.Count] = new Ball();
                Sprite.Count++;


            }
        });
        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sprites[Sprite.Count] = new Ball();
                Sprite.Count--;
                if (Sprite.Count == 0) {
                    JOptionPane.showMessageDialog(canvas, "We're out of Balls, what a pity", "Dangerous !!!", JOptionPane.ERROR_MESSAGE);
                }
                if (Sprite.Count < 0) {
                    JOptionPane.showMessageDialog(canvas, "Good Bye", "Noooooooooooooo", JOptionPane.OK_OPTION);
                }
            }
        });


        setTitle("Circles");
        setVisible(true);
    }

    private void initApplication() {
        for (int i = 0; i < startCount; i++) {
            sprites[i] = new Ball();
            Sprite.Count++;
        }
    }

    public void onDrawFrame(GameCanvas canvas, Graphics g, float deltaTime) {
        update(canvas, deltaTime);
        render(canvas, g);
    }

    private void update(GameCanvas canvas, float deltaTime) {
        for (int i = 0; i < Sprite.Count; i++) {
            sprites[i].update(canvas, deltaTime);
        }
    }

    private void render(GameCanvas canvas, Graphics g) {
        for (int i = 0; i < Sprite.Count; i++) {
            sprites[i].render(canvas, g);
        }
    }

}
