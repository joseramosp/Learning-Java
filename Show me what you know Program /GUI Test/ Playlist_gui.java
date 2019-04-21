import java.awt.BorderLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.FlowLayout;
/*
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
*/
class Playlist_gui
{
    public void setUpGui() throws IOException
    {
        JFrame window = new JFrame("Playlist");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel_1 = new JPanel();
        window.add(BorderLayout.NORTH, panel_1);

        String playerOnOff = "Play";
        //Buttons of the player
        JButton play = new JButton(playerOnOff);
        JButton next = new JButton("Next ->");
        JButton previous = new JButton("<- Previous");

        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        buttonsPanel.add(previous);
        buttonsPanel.add(play);
        buttonsPanel.add(next);
        window.add(buttonsPanel, BorderLayout.SOUTH);

        //Info of the song
        JLabel songLabel = new JLabel("La Romana");
        JLabel artistLabel = new JLabel("El Alfa");
        JLabel genraLabel = new JLabel("Dembow");

        //Setting image
        ImageIcon p = new ImageIcon();
        BufferedImage img = ImageIO.read(new File("music_logo_black.png"));
        JLabel lbl = new JLabel();
        p.setImage(img);
        lbl.setIcon(p);
        panel_1.add(lbl);

        // myFrame.addWindowListener(this);
        // previous.addActionListener(new WhatShouldTheButtonDo());
        // play.addActionListener(new WhatShouldTheButtonDo());
        // next.addActionListener(new WhatShouldTheButtonDo());

        window.setSize(500, 500);
        window.setVisible(true);
        window.setLocationRelativeTo(null);
    }

    public static void main(String args[]) throws IOException
    {
        Playlist_gui playlist = new Playlist_gui();
        playlist.setUpGui();
    }
}
