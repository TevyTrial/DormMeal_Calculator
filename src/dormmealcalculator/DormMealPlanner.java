package dormmealcalculator;

import java.awt.*;
import javax.swing.*;

public class DormMealPlanner extends JFrame {
    private JLabel DormLabel, MealLabel;
    private JComboBox DormBox, MealBox;
    private JButton calcButton, exitButton;
    private JPanel DormPanel, MealPanel, BtnPanel;
    
    private String[] dorms = {"Allen Hall",
                              "Pike Hall",
                              "Farthing Hall",
                              "University Suite"};
    
    private String[] mealPlans = {"7 meals per week",
                                  "14 meals per week",
                                  "Unlimited meals"};
    
    public DormMealPlanner() {
        setTitle("Dorm and Meal Plan Calculator");
        setSize(150,300);
        
        buildDormPanel();
        add(DormPanel, BorderLayout.NORTH);
                
        buildMealPanel();
        add(MealPanel, BorderLayout.CENTER);
        
        buildBtnPanel();
        add(BtnPanel, BorderLayout.SOUTH);
                
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
    }

    private void buildDormPanel() {
        DormBox = new JComboBox(dorms);
        DormPanel = new JPanel();
        DormLabel = new JLabel("Select a Dorm.");
        
        DormPanel.add(DormLabel);
        DormPanel.add(DormBox);
    }

    private void buildMealPanel() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void buildBtnPanel() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public static void main(String[] args) {
        new DormMealPlanner();
    }
}