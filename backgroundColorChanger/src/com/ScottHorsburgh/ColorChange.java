package com.ScottHorsburgh;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class ColorChange extends JFrame{
    private JPanel rootPanel;
    private JPanel mainpanel;
    ImageIcon javaIcon = new ImageIcon("javaIcon.png");
    private JButton btnRed;
    private JButton btnGreen;
    private JButton btnBlue;
    private JPanel centerPanel;

    //Default variable colors set for each button
    Color red = new java.awt.Color(240, 40 , 60);
    Color green = new java.awt.Color(79, 121, 66);
    Color blue = new java.awt.Color(50, 80, 255);

    /**
     * Default constructor
     */
    public ColorChange() {
        createGui();
        //When buttons are clicked it changes center panel color
        btnRed.addActionListener(e -> { setRedBackground(); });
        btnGreen.addActionListener(e -> { setGreenBackground(); });
        btnBlue.addActionListener(e -> { setBlueBackground(); });
    }
    /**
     * Method creates GUI.
     */
    private void createGui() {
        add(mainpanel);
        setTitle("Week4 Assignment");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setSize(600,400);
        setVisible(true);
        setBtnRed();
        setBtnGreen();
        setBtnBlue();
        styles();
    }
    /**
     * sets center panel background to red
     */
    private void setRedBackground(){
        centerPanel.setBackground(red);
    }
    /**
     * sets center panel background to green
     */
    private void setGreenBackground(){
        centerPanel.setBackground(green);
    }
    /**
     * sets center panel background to blue
     */
    private void setBlueBackground(){
        centerPanel.setBackground(blue);
    }
    /**
     * sets red button text, tooltip and text position
     */
    private void setBtnRed(){
        btnRed.setText("Red");
        btnRed.setToolTipText("Change to red");
        btnRed.setVerticalTextPosition(AbstractButton.CENTER);
        btnRed.setHorizontalTextPosition(AbstractButton.RIGHT);
    }
    /**
     * sets green button text, tooltip and text position
     */
    private void setBtnGreen(){
        btnGreen.setText("Green");
        btnGreen.setToolTipText("Change to green");
        btnGreen.setVerticalTextPosition(AbstractButton.CENTER);
        btnGreen.setHorizontalTextPosition(AbstractButton.RIGHT);
    }
    /**
     * sets blue button text, tooltip and text position
     */
    private void setBtnBlue(){
        btnBlue.setText("Blue");
        btnBlue.setToolTipText("Change to blue");
        btnBlue.setVerticalTextPosition(AbstractButton.CENTER);
        btnBlue.setHorizontalTextPosition(AbstractButton.RIGHT);
    }
    /**
     * styles for panel background, buttons etc. settings here
     */
    private void styles(){
        /*=============  Background colors for frame, panel, buttons, text fields and text area ================*/
        Color panelColor = new java.awt.Color(220, 220, 220);
        Color btnColorText = new java.awt.Color(185,185,185);
        /*=============== Background for main panel =================*/
        mainpanel.setBackground(panelColor);
        /*============== Style settings for text in buttons ==================*/
        //Adds underline to initial letter on each button
        btnRed.setMnemonic(KeyEvent.VK_C);
        btnGreen.setMnemonic(KeyEvent.VK_C);
        btnBlue.setMnemonic(KeyEvent.VK_C);
        /*============ Style settings for button background ============*/
        btnRed.setBackground(red);
        btnGreen.setBackground(green);
        btnBlue.setBackground(blue);
        /*============ Style settings for button foreground ============*/
        btnRed.setForeground(btnColorText);
        btnGreen.setForeground(btnColorText);
        btnBlue.setForeground(btnColorText);
    }
}
