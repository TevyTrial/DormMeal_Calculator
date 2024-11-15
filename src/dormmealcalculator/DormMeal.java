package dormmealcalculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author tevy0
 */
public final class DormMeal extends JFrame{
    //Label for telling instructions
    private JLabel labelDorm;
    private JLabel labelMeal;
    
    //JcomboBox for choosing the items
    private JComboBox DormCombo;
    private JComboBox MealCombo;
    
    //button to calculate and exit
    private JButton CalcBtn;
    private JButton exit;
    
    private JPanel DormPanel;
    private JPanel MealPanel;
    private JPanel CalPanel;
    
    private String[] dorms = {"Allen Hall",
                              "Pike Hall",
                              "Farthing Hall",
                              "University Suite"};
    
    private String[] mealPlans = {"7 meals per week",
                                  "14 meals per week",
                                  "Unlimited meals"};
   
    public DormMeal() {
        setTitle("Dorm and Meal Plan Caluculator");
        setSize(400,300);
        setVisible(true);  

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        buildDormPanel();
        add(DormPanel, BorderLayout.NORTH);
        
        buildMealPanel();
        add(MealPanel,BorderLayout.CENTER);
        
        buildCalPanel();
        add(CalPanel, BorderLayout.SOUTH);        
        
        pack();
              
        
        
    }
    public void buildDormPanel(){
        //create a label
        labelDorm = new JLabel("Select a Dorm.");
        
        //create the dorm combo box
        DormCombo = new JComboBox(dorms);  
        
        //put the components in a panel
        DormPanel = new JPanel();
        DormPanel.add(labelDorm);
        DormPanel.add(DormCombo);
    }
    
    private void buildMealPanel() {
        labelMeal = new JLabel("Select a Meal Plan");
        
        MealCombo = new JComboBox(mealPlans);        
        
        MealPanel = new JPanel();
        MealPanel.add(labelMeal);
        MealPanel.add(MealCombo);
    }

    private void buildCalPanel() {
        CalPanel = new JPanel();
        
        CalcBtn = new JButton(" Calculate Charges ");
        CalcBtn.addActionListener(new CalcButtonListener());
        
        exit = new JButton(" Exit ");
        exit.addActionListener(new exitButtonListen());
        
        CalPanel.add(CalcBtn);
        CalPanel.add(exit);
    }
    
        private class CalcButtonListener implements ActionListener {            
            public void actionPerformed(ActionEvent e) {
                String selectedDorm;
                int dormCharges;
                String selectedMeal;
                int mealCharges;
                int totalCharges;
                
                selectedDorm = dorms[DormCombo.getSelectedIndex()];
                if (selectedDorm.equals("Allen Hall")) {
                    dormCharges = 1500;
                }
                else if(selectedDorm.equals("Pike Hall")) {
                    dormCharges = 1600;
                }
                else if(selectedDorm.equals("Farthing Hall")) {
                    dormCharges = 1200;                   
                }
                else if(selectedDorm.equals("University Suite")) {
                    dormCharges = 1800;
                }
                else
                    dormCharges = 0;
                
                selectedMeal = mealPlans[MealCombo.getSelectedIndex()];
                if(selectedMeal.equals("7 meals per week")) {
                    mealCharges = 560;
                }
                else if(selectedMeal.equals("14 meals per week")) {
                    mealCharges = 1095;
                }
                else if(selectedMeal.equals("Unlimited meals")) {
                    mealCharges = 1500;
                }
                else
                    mealCharges = 0;
                
                totalCharges = mealCharges + dormCharges;
                
                JOptionPane.showMessageDialog(null, "Total Charges per Semester: "+totalCharges);
            }
    }

    private class exitButtonListen implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }
    
    public static void main(String[] args) {
        new DormMeal();
    }




}
