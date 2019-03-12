package ca.prog1400.ui;

import ca.prog1400.classes.*;
import ca.prog1400.common.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectPanel extends JPanel{
    private JLabel labelSelCharTitle;
    private JLabel labelSelCharName;
    private JLabel labelSelCharType;
    private JLabel labelSelCharstats;
    private JLabel labelSelCharstats1;
    private JLabel labelSelCharstats2;
    private JLabel labelSelCharstats3;
    private JLabel labelSelWeapon;
    private JLabel labelWeaponStats;
    private JLabel labelWeaponStats1;
    private JLabel labelWeaponStats2;
    private static JLabel labelCharImage;
    private static JLabel labelWeaponImage;

    private JButton btnReroll;
    private JButton btnStartBattle;

    private static ButtonGroup characterGroup;
    private static ButtonGroup weaponGroup;

    private JRadioButton rbtnSelCharType1;
    private JRadioButton rbtnSelCharType2;
    private JRadioButton rbtnSelCharType3;
    private JRadioButton rbtnSelWeapon1;
    private JRadioButton rbtnSelWeapon2;
    private JRadioButton rbtnSelWeapon3;

    private static JTextField textFieldCharName;

    private static JTextArea textAreaSelCharstats1;
    private static JTextArea textAreaSelCharstats2;
    private static JTextArea textAreaSelCharstats3;
    private static JTextArea textAreaSelCharstats4;
    private static JTextArea textAreaCharType;
    private static JTextArea textAreaWeaponStats1;
    private static JTextArea textAreaWeaponStats2;
    private static JTextArea textAreaWeaponType;

    private static BattlePanel panelBattle;

    public SelectPanel() {
        super();

        // character select panel title
        labelSelCharTitle = new JLabel("Character Generator", SwingConstants.LEFT);
        labelSelCharTitle.setFont(new Font("Old English Text MT", Font.BOLD, 25));
        labelSelCharTitle.setBounds(0, 10, 450, 30);
        add(labelSelCharTitle);

        // enter character name label
        labelSelCharName = new JLabel("Enter Name", SwingConstants.LEFT);
        labelSelCharName.setFont(new Font("Old English Text MT", Font.BOLD, 20));
        labelSelCharName.setBounds(0, 50, 120, 25);
        add(labelSelCharName);

        // Add a textfield for character name input
        textFieldCharName = new JTextField();
        textFieldCharName.setBounds(120, 50, 150, 25);
        add(textFieldCharName);

        // select character type label
        labelSelCharType = new JLabel("Character Type", SwingConstants.LEFT);
        labelSelCharType.setFont(new Font("Old English Text MT", Font.BOLD, 20));
        labelSelCharType.setBounds(0, 85, 140, 25);
        add(labelSelCharType);

        // Add character type buttons
        // Warrior
        rbtnSelCharType1 = new JRadioButton("Warrior");
        rbtnSelCharType1.setFont(new Font("Arial", Font.PLAIN, 15));
        rbtnSelCharType1.setBounds(0, 120, 100, 20);
        rbtnSelCharType1.setActionCommand(rbtnSelCharType1.getText());
        rbtnSelCharType1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SelPlayerClass.SelPlayerClass(rbtnSelCharType1.getText());
                FillTextArea.FillTextArea("Character");
            }
        });
        add(rbtnSelCharType1);

        // Wizard
        rbtnSelCharType2 = new JRadioButton("Wizard");
        rbtnSelCharType2.setFont(new Font("Arial", Font.PLAIN, 15));
        rbtnSelCharType2.setBounds(0, 155, 100, 20);
        rbtnSelCharType2.setActionCommand(rbtnSelCharType2.getText());
        rbtnSelCharType2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SelPlayerClass.SelPlayerClass(rbtnSelCharType2.getText());
                FillTextArea.FillTextArea("Character");
            }
        });
        add(rbtnSelCharType2);

        // Cleric
        rbtnSelCharType3 = new JRadioButton("Cleric");
        rbtnSelCharType3.setFont(new Font("Arial", Font.PLAIN, 15));
        rbtnSelCharType3.setBounds(0, 190, 100, 20);
        rbtnSelCharType3.setActionCommand(rbtnSelCharType3.getText());
        rbtnSelCharType3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SelPlayerClass.SelPlayerClass(rbtnSelCharType3.getText());
                FillTextArea.FillTextArea("Character");
            }
        });
        add(rbtnSelCharType3);

        // Make a button group for character type
        characterGroup = new ButtonGroup();
        characterGroup.add(rbtnSelCharType1);
        characterGroup.add(rbtnSelCharType2);
        characterGroup.add(rbtnSelCharType3);

        // character image
        labelCharImage = new JLabel("Select a Class");
        labelCharImage.setBounds(150, 120, 100, 90);
        add(labelCharImage);

        // Add a text Area for character type
        textAreaCharType = new JTextArea();
        textAreaCharType.setLineWrap(true);
        textAreaCharType.setBounds(0, 220, 270, 70);
        textAreaCharType.setEditable(false);
        add(textAreaCharType);

        // character stats label
        labelSelCharstats = new JLabel("Character Stats", SwingConstants.LEFT);
        labelSelCharstats.setFont(new Font("Old English Text MT", Font.BOLD, 20));
        labelSelCharstats.setBounds(280, 85, 140, 25);
        add(labelSelCharstats);

        // Hit Points
        labelSelCharstats1 = new JLabel("Hit Points", SwingConstants.LEFT);
        labelSelCharstats1.setFont(new Font("Arial", Font.PLAIN, 15));
        labelSelCharstats1.setBounds(280, 120, 110, 20);
        add(labelSelCharstats1);

        // Defense
        labelSelCharstats2 = new JLabel("Defense", SwingConstants.LEFT);
        labelSelCharstats2.setFont(new Font("Arial", Font.PLAIN, 15));
        labelSelCharstats2.setBounds(280, 145, 110, 20);
        add(labelSelCharstats2);

        // Agility
        labelSelCharstats3 = new JLabel("Agility", SwingConstants.LEFT);
        labelSelCharstats3.setFont(new Font("Arial", Font.PLAIN, 15));
        labelSelCharstats3.setBounds(280, 170, 110, 20);
        add(labelSelCharstats3);

        // Base Attack
        labelSelCharstats3 = new JLabel("Base Attack", SwingConstants.LEFT);
        labelSelCharstats3.setFont(new Font("Arial", Font.PLAIN, 15));
        labelSelCharstats3.setBounds(280, 195, 110, 20);
        add(labelSelCharstats3);

        // Add a textfield for character stats
        // Hit Points
        textAreaSelCharstats1 = new JTextArea();
        textAreaSelCharstats1.setBounds(390, 120, 30, 20);
        textAreaSelCharstats1.setEditable(false);
        add(textAreaSelCharstats1);

        // Defense
        textAreaSelCharstats2 = new JTextArea();
        textAreaSelCharstats2.setBounds(390, 145, 30, 20);
        textAreaSelCharstats2.setEditable(false);
        add(textAreaSelCharstats2);

        // Agility
        textAreaSelCharstats3 = new JTextArea();
        textAreaSelCharstats3.setBounds(390, 170, 30, 20);
        textAreaSelCharstats3.setEditable(false);
        add(textAreaSelCharstats3);

        // Base Attack
        textAreaSelCharstats4 = new JTextArea();
        textAreaSelCharstats4.setBounds(390, 195, 30, 20);
        textAreaSelCharstats4.setEditable(false);
        add(textAreaSelCharstats4);

        // Reroll
        btnReroll = new JButton("Reroll");
        btnReroll.setFont(new Font("Old English Text MT", Font.BOLD, 15));
        btnReroll.setBounds(300, 230, 100, 25);
        btnReroll.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (characterGroup.getSelection() != null) {
                    RerollCharStats.RerollCharStats();
                    FillTextArea.FillTextArea("Character");
                }
            }
        });
        add(btnReroll);

        // select your weapon label
        labelSelWeapon = new JLabel("Select Your Weapon", SwingConstants.LEFT);
        labelSelWeapon.setFont(new Font("Old English Text MT", Font.BOLD, 20));
        labelSelWeapon.setBounds(0, 310, 200, 25);
        add(labelSelWeapon);

        // Add weapon type buttons
        // Dagger
        rbtnSelWeapon1 = new JRadioButton("Dagger");
        rbtnSelWeapon1.setFont(new Font("Arial", Font.PLAIN, 15));
        rbtnSelWeapon1.setBounds(0, 345, 100, 20);
        rbtnSelWeapon1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SelWeaponClass.SelWeaponClass(rbtnSelWeapon1.getText());
                FillTextArea.FillTextArea("Weapon");
            }
        });
        add(rbtnSelWeapon1);

        // Sword
        rbtnSelWeapon2 = new JRadioButton("Sword");
        rbtnSelWeapon2.setFont(new Font("Arial", Font.PLAIN, 15));
        rbtnSelWeapon2.setBounds(0, 380, 100, 20);
        rbtnSelWeapon2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SelWeaponClass.SelWeaponClass(rbtnSelWeapon2.getText());
                FillTextArea.FillTextArea("Weapon");
            }
        });
        add(rbtnSelWeapon2);

        // Hammer
        rbtnSelWeapon3 = new JRadioButton("Hammer");
        rbtnSelWeapon3.setFont(new Font("Arial", Font.PLAIN, 15));
        rbtnSelWeapon3.setBounds(0, 415, 100, 20);
        rbtnSelWeapon3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SelWeaponClass.SelWeaponClass(rbtnSelWeapon3.getText());
                FillTextArea.FillTextArea("Weapon");
            }
        });
        add(rbtnSelWeapon3);

        // Make a button group for weapon type
        weaponGroup = new ButtonGroup();
        weaponGroup.add(rbtnSelWeapon1);
        weaponGroup.add(rbtnSelWeapon2);
        weaponGroup.add(rbtnSelWeapon3);

        // weapon image
        labelWeaponImage = new JLabel("Select a Weapon");
        labelWeaponImage.setBounds(150, 345, 100, 90);
        add(labelWeaponImage);

        // Add a text Area for weapon type
        textAreaWeaponType = new JTextArea();
        textAreaWeaponType.setLineWrap(true);
        textAreaWeaponType.setBounds(0, 445, 270, 70);
        textAreaWeaponType.setEditable(false);
        add(textAreaWeaponType);

        // weapon stats label
        labelWeaponStats = new JLabel("Weapon Stats", SwingConstants.LEFT);
        labelWeaponStats.setFont(new Font("Old English Text MT", Font.BOLD, 20));
        labelWeaponStats.setBounds(280, 310, 140, 25);
        add(labelWeaponStats);

        // Attack Modifier
        labelWeaponStats1 = new JLabel("Attack Modifier", SwingConstants.LEFT);
        labelWeaponStats1.setFont(new Font("Arial", Font.PLAIN, 15));
        labelWeaponStats1.setBounds(280, 345, 110, 20);
        add(labelWeaponStats1);

        // Weight
        labelWeaponStats2 = new JLabel("Weight", SwingConstants.LEFT);
        labelWeaponStats2.setFont(new Font("Arial", Font.PLAIN, 15));
        labelWeaponStats2.setBounds(280, 370, 110, 20);
        add(labelWeaponStats2);

        // Add a textfield for weapon stats
        // Attack Modifier
        textAreaWeaponStats1 = new JTextArea();
        textAreaWeaponStats1.setBounds(390, 345, 30, 20);
        textAreaWeaponStats1.setEditable(false);
        add(textAreaWeaponStats1);

        // Weight
        textAreaWeaponStats2 = new JTextArea();
        textAreaWeaponStats2.setBounds(390, 370, 30, 20);
        textAreaWeaponStats2.setEditable(false);
        add(textAreaWeaponStats2);

        // Start Battle
        btnStartBattle = new JButton("Start Battle");
        btnStartBattle.setFont(new Font("Old English Text MT", Font.BOLD, 15));
        btnStartBattle.setBounds(290, 460, 120, 25);
        btnStartBattle.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (textFieldCharName.getText().length() != 0 && characterGroup.getSelection() != null && weaponGroup.getSelection() != null) {
                    Player.setPlayerName(getTextFieldCharName().getText());

                    // battle select panel
                    panelBattle = new BattlePanel();
                    GameFrame.getContentPanel().add(panelBattle);
                    panelBattle.setLayout(null);

                    GameFrame.getPanelMain().setVisible(false);
                    GameFrame.getPanelSelChar().setVisible(false);
                    panelBattle.setVisible(true);
                }
            }
        });
        add(btnStartBattle);
    }

    public static JTextField getTextFieldCharName() {
        return textFieldCharName;
    }

    public static JTextArea getTextAreaSelCharstats1() {
        return textAreaSelCharstats1;
    }

    public static JTextArea getTextAreaSelCharstats2() {
        return textAreaSelCharstats2;
    }

    public static JTextArea getTextAreaSelCharstats3() {
        return textAreaSelCharstats3;
    }

    public static JTextArea getTextAreaSelCharstats4() {
        return textAreaSelCharstats4;
    }

    public static JTextArea getTextAreaCharType() {
        return textAreaCharType;
    }

    public static JLabel getLabelCharImage() { return labelCharImage; }

    public static JTextArea getTextAreaWeaponStats1() {
        return textAreaWeaponStats1;
    }

    public static JTextArea getTextAreaWeaponStats2() {
        return textAreaWeaponStats2;
    }

    public static JTextArea getTextAreaWeaponType() {
        return textAreaWeaponType;
    }

    public static JLabel getLabelWeaponImage() {
        return labelWeaponImage;
    }

    public static ButtonGroup getCharacterGroup() {
        return characterGroup;
    }

    public static BattlePanel getPanelBattle() {
        return panelBattle;
    }

    public static ButtonGroup getWeaponGroup() {
        return weaponGroup;
    }
}
