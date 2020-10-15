package stonepaperscissors;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StonePaperScissors extends JFrame {

    private final JTextField robotChoose;
    private final JTextField player;
    private final JTextField robot;
    private final JTextField playerScore;
    private final JTextField robotScore;
    private int playerResult = 0;
    private int robotResult = 0;
    private int countGame = 0;
    private int robotHint;
    private final JTextField countGames;
    private final JTextField tiedScore;
    private int ties = 0;
    ImageIcon stoneIcon = new ImageIcon(new ImageIcon("/home/kraliktimea/IdeaProjects/kpo/src/stone.png").getImage().getScaledInstance(90, 70, Image.SCALE_DEFAULT));
    JButton buttonStone = new JButton(stoneIcon);
    ImageIcon paperIcon = new ImageIcon(new ImageIcon("/home/kraliktimea/IdeaProjects/kpo/src/paper2.png").getImage().getScaledInstance(90, 50, Image.SCALE_DEFAULT));
    JButton buttonPaper = new JButton(paperIcon);
    ImageIcon scissorsIcon = new ImageIcon(new ImageIcon("/home/kraliktimea/IdeaProjects/kpo/src/scissors2.png").getImage().getScaledInstance(80, 50, Image.SCALE_DEFAULT));
    JButton buttonScissors = new JButton(scissorsIcon);

    public StonePaperScissors() {
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 600, 350);
        JPanel contentPane = new JPanel();
        contentPane.setBackground(new Color(90, 200, 120));
        contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        setLocationRelativeTo(null);

        //Game label
        JLabel labelGame = new JLabel("STONE - PAPER - SCISSORS");
        labelGame.setHorizontalAlignment(SwingConstants.CENTER);
        labelGame.setFont(new Font("Serif", Font.BOLD, 16));
        labelGame.setBounds(140, 0, 300, 50);
        contentPane.add(labelGame);

        //Roby choose label
        JLabel labelRobotChoose = new JLabel("Roby choose:");
        labelRobotChoose.setHorizontalAlignment(SwingConstants.CENTER);
        labelRobotChoose.setBounds(240, 40, 110, 20);
        contentPane.add(labelRobotChoose);

        //Roby choose stone, paper or scissors
        robotChoose = new JTextField();
        robotChoose.setBackground(Color.WHITE);
        robotChoose.setFont(new Font("Serif", Font.BOLD, 15));
        robotChoose.setHorizontalAlignment(SwingConstants.CENTER);
        robotChoose.setBounds(245, 60, 100, 43);
        contentPane.add(robotChoose);
        robotChoose.setColumns(10);

        //player label
        player = new JTextField();
        player.setBackground(Color.WHITE);
        player.setHorizontalAlignment(SwingConstants.CENTER);
        player.setText("PLAYER");
        player.setBounds(60, 130, 60, 31);
        contentPane.add(player);
        player.setColumns(10);

        //Roby label
        robot = new JTextField();
        robot.setBackground(Color.WHITE);
        robot.setHorizontalAlignment(SwingConstants.CENTER);
        robot.setText("ROBY");
        robot.setColumns(10);
        robot.setBounds(470, 130, 60, 31);
        contentPane.add(robot);

        //result label
        JLabel labelResult = new JLabel("Scoreboard:");
        labelResult.setHorizontalAlignment(SwingConstants.CENTER);
        labelResult.setBounds(220, 115, 154, 14);
        contentPane.add(labelResult);

        //player score table
        playerScore = new JTextField();
        playerScore.setBackground(Color.WHITE);
        playerScore.setFont(new Font("Serif", Font.BOLD, 15));
        playerScore.setHorizontalAlignment(SwingConstants.CENTER);
        playerScore.setText("0");
        playerScore.setBounds(170, 130, 86, 43);
        contentPane.add(playerScore);
        playerScore.setColumns(10);

        //roby score table
        robotScore = new JTextField();
        robotScore.setBackground(Color.WHITE);
        robotScore.setFont(new Font("Serif", Font.BOLD, 15));
        robotScore.setHorizontalAlignment(SwingConstants.CENTER);
        robotScore.setText("0");
        robotScore.setColumns(10);
        robotScore.setBounds(340, 130, 86, 43);
        contentPane.add(robotScore);

        JLabel playerChoice = new JLabel("Player choice:");
        playerChoice.setBounds(240, 190, 180, 31);
        contentPane.add(playerChoice);

        //Stone button
        buttonStone.setBackground(Color.LIGHT_GRAY);
        buttonStone.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                countGame++;
                countGames.setText(String.valueOf(countGame));
                buttonStone.setBackground(Color.GREEN);
                buttonPaper.setBackground(Color.LIGHT_GRAY);
                buttonScissors.setBackground(Color.LIGHT_GRAY);
                robotHint = (int) (Math.random() * 3);
                robotChoose.setText(String.valueOf(robotHint));

                switch (robotHint) {
                    case 0:
                        // tie game
                        robotChoose.setText("STONE");

                        ties++;
                        robot.setBackground(Color.YELLOW);
                        player.setBackground(Color.YELLOW);
                        tiedScore.setText(String.valueOf(ties));
                        break;
                    case 1:
                        // robot is winner
                        robotChoose.setText("PAPER");

                        robotResult++;
                        robotScore.setText(String.valueOf(robotResult));
                        robot.setBackground(Color.YELLOW);
                        player.setBackground(Color.WHITE);
                        break;
                    case 2:
                        // player is winner
                        robotChoose.setText("SCISSORS");

                        playerResult++;
                        playerScore.setText(String.valueOf(playerResult));
                        player.setBackground(Color.YELLOW);
                        robot.setBackground(Color.WHITE);
                        break;
                    default:
                }
            }
        });
        buttonStone.setFont(new Font("Serif", Font.BOLD, 20));
        buttonStone.setBounds(50, 230, 105, 60);
        contentPane.add(buttonStone);

        //paper button
        buttonPaper.setBackground(Color.LIGHT_GRAY);
        buttonPaper.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                countGame++;
                countGames.setText(String.valueOf(countGame));
                buttonPaper.setBackground(Color.GREEN);
                buttonStone.setBackground(Color.LIGHT_GRAY);
                buttonScissors.setBackground(Color.LIGHT_GRAY);
                robotHint = (int) (Math.random() * 3);
                robotChoose.setText(String.valueOf(robotHint));

                switch (robotHint) {
                    case 0:
                        // player is winner
                        robotChoose.setText("STONE");

                        playerResult++;
                        playerScore.setText(String.valueOf(playerResult));
                        player.setBackground(Color.YELLOW);
                        robot.setBackground(Color.WHITE);
                        break;
                    case 1:
                        // tie game
                        robotChoose.setText("PAPER");

                        ties++;
                        robot.setBackground(Color.YELLOW);
                        player.setBackground(Color.YELLOW);
                        tiedScore.setText(String.valueOf(ties));
                        break;
                    case 2:
                        // robot is winner
                        robotChoose.setText("SCISSORS");

                        robotResult++;
                        robotScore.setText(String.valueOf(robotResult));
                        robot.setBackground(Color.YELLOW);
                        player.setBackground(Color.WHITE);
                        break;
                    default:
                }
            }
        });
        buttonPaper.setFont(new Font("Serif", Font.BOLD, 20));
        buttonPaper.setBounds(240, 230, 105, 60);
        contentPane.add(buttonPaper);

        //scissors button
        buttonScissors.setBackground(Color.LIGHT_GRAY);
        buttonScissors.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                countGame++;
                countGames.setText(String.valueOf(countGame));
                buttonPaper.setBackground(Color.LIGHT_GRAY);
                buttonStone.setBackground(Color.LIGHT_GRAY);
                buttonScissors.setBackground(Color.GREEN);
                robotHint = (int) (Math.random() * 3);
                robotChoose.setText(String.valueOf(robotHint));

                switch (robotHint) {
                    case 0:
                        // robot is winner
                        robotChoose.setText("STONE");

                        robotResult++;
                        robotScore.setText(String.valueOf(robotResult));
                        robot.setBackground(Color.YELLOW);
                        player.setBackground(Color.WHITE);
                        break;
                    case 1:
                        // player is winner
                        robotChoose.setText("PAPER");

                        playerResult++;
                        playerScore.setText(String.valueOf(playerResult));
                        player.setBackground(Color.YELLOW);
                        robot.setBackground(Color.WHITE);
                        break;
                    case 2:
                        // tie game
                        robotChoose.setText("SCISSORS");

                        ties++;
                        robot.setBackground(Color.YELLOW);
                        player.setBackground(Color.YELLOW);
                        tiedScore.setText(String.valueOf(ties));
                        break;
                    default:
                }
            }
        });

        buttonScissors.setFont(new Font("Serif", Font.BOLD, 20));
        buttonScissors.setBounds(420, 230, 105, 60);
        contentPane.add(buttonScissors);

        //separator label
        JLabel label = new JLabel("-");
        label.setFont(new Font("Serif", Font.BOLD, 25));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setBounds(270, 144, 50, 15);
        contentPane.add(label);

        //games counter
        countGames = new JTextField();
        countGames.setBackground(Color.WHITE);
        countGames.setFont(new Font("Serif", Font.BOLD, 15));
        countGames.setHorizontalAlignment(SwingConstants.CENTER);
        countGames.setText("0");
        countGames.setBounds(70, 52, 48, 43);
        contentPane.add(countGames);
        countGames.setColumns(10);

        //played games label
        JLabel playedGames = new JLabel("Games:");
        playedGames.setHorizontalAlignment(SwingConstants.CENTER);
        playedGames.setBounds(40, 27, 115, 14);
        contentPane.add(playedGames);

        //tie counter
        tiedScore = new JTextField();
        tiedScore.setBackground(Color.WHITE);
        tiedScore.setText("0");
        tiedScore.setHorizontalAlignment(SwingConstants.CENTER);
        tiedScore.setFont(new Font("Serif", Font.BOLD, 15));
        tiedScore.setColumns(10);
        tiedScore.setBounds(470, 52, 48, 43);
        contentPane.add(tiedScore);

        //tie counter label
        JLabel tieCounter = new JLabel("Tie games:");
        tieCounter.setHorizontalAlignment(SwingConstants.CENTER);
        tieCounter.setBounds(430, 27, 145, 14);
        contentPane.add(tieCounter);

        //not editable text fields
        robotChoose.setEditable(false);
        player.setEditable(false);
        robot.setEditable(false);
        playerScore.setEditable(false);
        robotScore.setEditable(false);
        countGames.setEditable(false);
        tiedScore.setEditable(false);

        repaint();
        validate();
    }
}
