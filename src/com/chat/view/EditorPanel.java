/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chat.view;

import com.chat.view.renderer.EditorPanelColorRenderer;
import com.chat.view.renderer.EditorPanelRenderer;
import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author Marwa
 */
public class EditorPanel extends javax.swing.JPanel {

    /**
     * Creates new form EditorPanel
     */
    private Font font;
    private Color color;
    private int size;

    private String fontStr;
    private String colorStr;
    private String sizeStr;

    public EditorPanel() {
        initComponents();
        setCbBoxFont(font);
        setColor(color);
        setFontSize(size);
    }

    public EditorPanel(Font panelfont) {
        initComponents();
        font = panelfont;

        setCbBoxFont(font);
    }

    public EditorPanel(Color panelcolor) {
        initComponents();
        color = panelcolor;
        setColor(color);

    }

    public EditorPanel(int panelsize) {
        initComponents();
        size = panelsize;
        setFontSize(size);

    }

    public EditorPanel(Font font, Color color, int size) {
        initComponents();
        this.font = font;
        this.color = color;
        this.size = size;
        setCbBoxFont(font);
        setColor(color);
        setFontSize(size);
    }
    

    public Font getSelectedFont() {
        font = new Font(fontStr, Font.BOLD, size);
        System.out.println(font.getFontName());
        System.out.println(font.getFamily());
        return font;
    }

    public Color getSelectedColor() {
        System.out.println(color);
        return color;
    }

    public int getSelectedSize() {
        size = Integer.parseInt(sizeStr);
        System.out.println(size);
        return size;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmBoxFont = new javax.swing.JComboBox();
        cmBoxSize = new javax.swing.JComboBox();
        cmBoxColor = new javax.swing.JComboBox();

        cmBoxFont.setMaximumSize(new java.awt.Dimension(150, 50));
        cmBoxFont.setMinimumSize(new java.awt.Dimension(150, 50));
        cmBoxFont.setPreferredSize(new java.awt.Dimension(150, 20));
        add(cmBoxFont);

        cmBoxSize.setMaximumSize(new java.awt.Dimension(28, 20));
        cmBoxSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmBoxSizeActionPerformed(evt);
            }
        });
        add(cmBoxSize);

        add(cmBoxColor);
    }// </editor-fold>//GEN-END:initComponents

    private void cmBoxSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmBoxSizeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmBoxSizeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmBoxColor;
    private javax.swing.JComboBox cmBoxFont;
    private javax.swing.JComboBox cmBoxSize;
    // End of variables declaration//GEN-END:variables

    private void setCbBoxFont(Font fonts) {

        String[] fontList;
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        fontList = ge.getAvailableFontFamilyNames();
        for (String font : fontList) {
            cmBoxFont.addItem(font);
        }
        cmBoxFont.setSelectedItem(fonts);
        cmBoxFont.setRenderer(
                new EditorPanelRenderer());

        cmBoxFont.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // throw new UnsupportedOperationException("Not supported yet.");
                fontStr = cmBoxFont.getSelectedItem().toString();
                getSelectedFont();
                

            }
        });

    }

    private void setColor(Color colors) {
        String[] setFontColor = {"BLACK", "RED", "BLUE", "GREEN"};
        for (String setFontColor1 : setFontColor) {
            cmBoxColor.addItem(setFontColor1);
        }

        cmBoxColor.setRenderer(new EditorPanelColorRenderer());

        cmBoxColor.setSelectedItem(colors);

        cmBoxColor.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // throw new UnsupportedOperationException("Not supported yet.");
                colorStr = cmBoxColor.getSelectedItem().toString();
                if ("RED" == colorStr) {
                    color = Color.RED;
                } else if ("GREEN" == colorStr) {
                    color = Color.GREEN;
                } else if ("BLUE" == colorStr) {
                    color = Color.BLUE;
                } else if ("BLACK" == colorStr) {
                    color = Color.BLACK;
                }

                getSelectedColor();
            }
        });
    }

    private void setFontSize(int oldSize) {
        int[] sizeItems = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30};

        for (int i = 0; i < sizeItems.length; i++) {
            cmBoxSize.addItem(sizeItems[i]);
        }

        cmBoxSize.setSelectedItem(oldSize);

        cmBoxSize.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // throw new UnsupportedOperationException("Not supported yet.");
                sizeStr = cmBoxSize.getSelectedItem().toString();
                getSelectedSize();
                

            }
        });
    }

    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.add(new EditorPanel());
        jf.setVisible(true);
    }

}