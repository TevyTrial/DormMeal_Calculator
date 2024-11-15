# Dorm and Meal Plan Calculator

## Description
This project is a simple GUI based Dorm and Meal Plan Calculator built using Java Swing. 
The application allows users to select a dormitory and meal plan in ComboBox, calculate the total charges per semester, and exit the application.

Based on following information:

A university has the following dormitories:
- Allen Hall: $1,500 per semester
- Pike Hall: $1,600 per semester
- Farthing Hall: $1,200 per semester
- University Suite: $1,800 per semester

The university also offers the following meal plans:
- 7 meals per week: $560 per semester
- 14 meals per week: $1,095 per semester
- Unlimited meals: $1,500 per semester

## Features
- **Dorm Selection**: Choose from different dorms with associated charges.
- **Meal Plan Selection**: Choose from different meal plans with associated charges.
- **Calculate Total Charges**: Calculate the total charges based on selected dorm and meal plan.
- **Exit Button**: Close the application.

## Usage
### How to Use the Dorm and Meal Plan Calculator
1. **Launch the Application**: Run the `DormMeal` class.
2. **Select Dorm**: Choose a dorm from the drop-down menu.
3. **Select Meal Plan**: Choose a meal plan from the drop-down menu.
4. **Calculate**: Click the "Calculate Charges" button to see the total charges per semester displayed in a dialog.
5. **Exit**: Click the "Exit" button to close the application.

### Code Explanation

#### DormMeal Class
The `DormMeal` class extends `JFrame` and sets up the GUI components and event handling.

1. **Constructor**:
    ```java
    public DormMeal() {
        setTitle("Dorm and Meal Plan Calculator");
        setSize(400, 300);
        setVisible(true);  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        buildDormPanel();
        add(DormPanel, BorderLayout.NORTH);
        
        buildMealPanel();
        add(MealPanel, BorderLayout.CENTER);
        
        buildCalPanel();
        add(CalPanel, BorderLayout.SOUTH);        
        
        pack();
    }
    ```

2. **buildDormPanel Method**:
    ```java
    public void buildDormPanel() {
        labelDorm = new JLabel("Select a Dorm.");
        DormCombo = new JComboBox(dorms);  
        DormPanel = new JPanel();
        DormPanel.add(labelDorm);
        DormPanel.add(DormCombo);
    }
    ```

3. **buildMealPanel Method**:
    ```java
    private void buildMealPanel() {
        labelMeal = new JLabel("Select a Meal Plan");
        MealCombo = new JComboBox(mealPlans);        
        MealPanel = new JPanel();
        MealPanel.add(labelMeal);
        MealPanel.add(MealCombo);
    }
    ```

4. **buildCalPanel Method**:
    ```java
    private void buildCalPanel() {
        CalPanel = new JPanel();
        CalcBtn = new JButton("Calculate Charges");
        CalcBtn.addActionListener(new CalcButtonListener());
        exit = new JButton("Exit");
        exit.addActionListener(new exitButtonListen());
        CalPanel.add(CalcBtn);
        CalPanel.add(exit);
    }
    ```

5. **CalcButtonListener Inner Class**:
    This inner class handles the button click event to calculate and display the total charges.
    ```java
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
            } else if (selectedDorm.equals("Pike Hall")) {
                dormCharges = 1600;
            } else if (selectedDorm.equals("Farthing Hall")) {
                dormCharges = 1200;                   
            } else if (selectedDorm.equals("University Suite")) {
                dormCharges = 1800;
            } else {
                dormCharges = 0;
            }
            
            selectedMeal = mealPlans[MealCombo.getSelectedIndex()];
            if (selectedMeal.equals("7 meals per week")) {
                mealCharges = 560;
            } else if (selectedMeal.equals("14 meals per week")) {
                mealCharges = 1095;
            } else if (selectedMeal.equals("Unlimited meals")) {
                mealCharges = 1500;
            } else {
                mealCharges = 0;
            }
            
            totalCharges = mealCharges + dormCharges;
            JOptionPane.showMessageDialog(null, "Total Charges per Semester: " + totalCharges);
        }
    }
    ```

6. **exitButtonListen Inner Class**:
    This inner class handles the button click event to exit the application.
    ```java
    private class exitButtonListen implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }
    ```

7. **main Method**:
    ```java
    public static void main(String[] args) {
        new DormMeal();
    }
    ```

### DormMealPlanner Class
The `DormMealPlanner` class is similar to `DormMeal` but includes additional customization options.

1. **Constructor**:
    ```java
    public DormMealPlanner() {
        setTitle("Dorm and Meal Plan Calculator");
        setSize(150, 300);
        
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
    ```

2. **main Method**:
    ```java
    public static void main(String[] args) {
        new DormMealPlanner();
    }
    ```

