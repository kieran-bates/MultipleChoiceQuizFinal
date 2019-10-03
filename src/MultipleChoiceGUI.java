/*
 * Kieran Bates
 * October 2, 2019
 * This program is a multiple choice quiz on capital cities that shows a user their final number of correct answers, their final
 * number of incorrect answers and their final percentage score.  
 */

/**
 *
 * @author kibat6204
 */

public class MultipleChoiceGUI extends javax.swing.JFrame {

    /**
     * Creates new form MultipleChoiceGUI
     */
    public MultipleChoiceGUI() {
        initComponents();
        questionField.setText("What is \nthe capital of Canada?"); //Ask first question as form is opened
        scoreField.setText("0"); //Set score to 0 as form is opened
        nextButton.setEnabled(false); //disable the next button as form is opened
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        answerField = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();
        questionLabel = new javax.swing.JLabel();
        answerLabel = new javax.swing.JLabel();
        scoreField = new javax.swing.JTextField();
        scoreLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        questionField = new javax.swing.JTextArea();
        nextButton = new javax.swing.JButton();
        instantOutput = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLabel.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        titleLabel.setText("CAPITAL CITIES QUIZ");

        answerField.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        answerField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        answerField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answerFieldActionPerformed(evt);
            }
        });

        submitButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        questionLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        questionLabel.setText("Question -->");

        answerLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        answerLabel.setText("Answer -->");

        scoreField.setEditable(false);
        scoreField.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        scoreField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        scoreLabel.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        scoreLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scoreLabel.setText("Score");

        questionField.setEditable(false);
        questionField.setColumns(20);
        questionField.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        questionField.setRows(5);
        jScrollPane1.setViewportView(questionField);

        nextButton.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        nextButton.setText("Next -->");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        instantOutput.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        instantOutput.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(answerLabel)
                    .addComponent(questionLabel))
                .addGap(72, 72, 72)
                .addComponent(answerField, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 265, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(232, 232, 232)
                            .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(instantOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(353, 353, 353))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(titleLabel)
                            .addGap(253, 253, 253)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scoreField, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(scoreLabel))
                        .addGap(63, 63, 63))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(scoreLabel)
                        .addGap(18, 18, 18)
                        .addComponent(scoreField, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(titleLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGap(180, 180, 180)
                            .addComponent(questionLabel)
                            .addGap(74, 74, 74))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(instantOutput, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(answerField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(answerLabel)
                        .addGap(14, 14, 14)))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nextButton, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                    .addComponent(submitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        //The following code runs every time the next button is clicked
        if (counter2 == 1) //If the first question has been answered
        {
            questionField.setText("What is the \ncapital of Ontario?"); //Print the next question
            counter = counter + 1; //Advance the question counter
            answerField.setText(""); //Clear the answer field
            instantOutput.setText(""); //clear the label that displays "correct" or "incorrect
            nextButton.setEnabled(false); //disable the next button
            submitButton.setEnabled(true); //enable the submit button
        }
        else if (counter2 == 2) //If the second question has been answered
        {
            questionField.setText("What is the \ncapital of the US?");
            counter = counter + 1; //Advance the question counter
            answerField.setText(""); //Clear the answer field
            instantOutput.setText(""); //clear the label that displays "correct" or "incorrect
            nextButton.setEnabled(false); //disable the next button
            submitButton.setEnabled(true); //enable the submit button
        }
        else if (counter2 == 3) //If the third question has been answered
        {
            questionField.setText("What is the \ncapital of China?");
            counter = counter + 1; //Advance the question counter
            answerField.setText(""); //Clear the answer field
            instantOutput.setText(""); //clear the label that displays "correct" or "incorrect
            nextButton.setEnabled(false); //disable the next button
            submitButton.setEnabled(true); //enable the submit button
        }
        else if (counter2 == 4) //If the fourth question has been answered
        {
            questionField.setText("What is the \ncapital of Japan?");
            counter = counter + 1; //Advance the question counter
            answerField.setText(""); //Clear the answer field
            instantOutput.setText(""); //clear the label that displays "correct" or "incorrect
            nextButton.setEnabled(false); //disable the next button
            submitButton.setEnabled(true); //enable the submit button
        }
        else if (counter2 == 5) //If the fifth question has been answered
        {
            questionsIncorrect = 5 - score; //calculate the number of incorrect questions
            percentCorrect = score; //transfer the final number of correct questions to a double variable
            percentCorrect = (percentCorrect / 5); //divide number of correct answers by five
            percentCorrect = percentCorrect * 10000; //multiply the quotient by 10000
            percentCorrectRounded = Math.round(percentCorrect); //round the product
            percentCorrectRounded = percentCorrectRounded / 100; //divide the product by 100 to give a final percent of correct answers
            questionField.setText("You got " +score+ " questions correct. \nYou got " +questionsIncorrect+ " questions incorrect."); //Print the number of correct ans number of incorrect questions to the question field
            instantOutput.setText(+percentCorrectRounded+ "% Correct"); //Display percent correct
            nextButton.setEnabled(false); //Disable the next button
        }
    }//GEN-LAST:event_nextButtonActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        if (counter == 0) //If the first question has been asked
        {
            input = answerField.getText(); //store the user input in a String variable
            scoreField.setText(String.valueOf(score)); //print the score in the scorefield
            if (input.equals("Ottawa") || input.equals("ottawa") || input.equals("OTTAWA")) //If the answer is correct
            {
                score = (score + 1); //Increase the score by one
                scoreField.setText(String.valueOf(score)); //Print the score to the scorefield
                instantOutput.setText("Correct!"); //Display "Correct!" on the screen
                nextButton.setEnabled(true); //Enable the the next button
                submitButton.setEnabled(false); //Disable the submit button
                counter2 = counter2 + 1; //Increase the question counter by one
            }
            else //If the answer is incorrect
            {
                instantOutput.setText("Incorrect!"); //Display "Incorrect" on the screen
                nextButton.setEnabled(true); //Enable the next button
                submitButton.setEnabled(false); //disable the submit button
                counter2 = counter2 + 1; //Increase the question counter by one
            }
        }

        else if (counter == 1) //If the second question has been asked
        {
            input = answerField.getText(); //store the user input in a String variable
            scoreField.setText(String.valueOf(score)); //print the score in the scorefield
            if (input.equals("Toronto") || input.equals("toronto") || input.equals("TORONTO")) //If the answer is correct
            {
                score = (score + 1); //Increase the score by one
                scoreField.setText(String.valueOf(score)); //Print the score to the scorefield
                instantOutput.setText("Correct!"); //Display "Correct!" on the screen
                nextButton.setEnabled(true); //Enable the the next button
                submitButton.setEnabled(false); //Disable the submit button
                counter2 = counter2 + 1; //Increase the question counter by one
            }
            else //if the anser is incorrect
            {
                instantOutput.setText("Incorrect!"); //Display "Incorrect" on the screen
                nextButton.setEnabled(true); //Enable the next button
                submitButton.setEnabled(false); //Disable the submit button
                counter2 = counter2 + 1; //Increase the question counter by one
            }
        }
        else if (counter == 2) //If the third question has been asked
        {
            input = answerField.getText(); //store the user input in a String variable
            scoreField.setText(String.valueOf(score)); //print the score in the scorefield
            if (input.equals("Washington DC") || input.equals("washington dc") || input.equals("WASHINGTON DC") || input.equals("washington DC")) //If the answer is correct
            {
                score = (score + 1); //Increase the score by one
                scoreField.setText(String.valueOf(score)); //Print the score to the scorefield
                instantOutput.setText("Correct!"); //Display "Correct!" on the screen
                nextButton.setEnabled(true); //Enable the the next button
                submitButton.setEnabled(false); //Disable the submit button
                counter2 = counter2 + 1; //Increase the question counter by one
            }
            else //If the anser is incorrect
            {
                instantOutput.setText("Incorrect!"); //Display "Incorrect" on the screen
                nextButton.setEnabled(true); //Enable the next button
                submitButton.setEnabled(false); //Disable the submit button
                counter2 = counter2 + 1; //Increase the question counter by one
            }
        }
        else if (counter == 3) //If the fourth question has been asked
        {
            input = answerField.getText(); //store the user input in a String variable
            scoreField.setText(String.valueOf(score)); //print the score in the scorefield
            if (input.equals("Beijing") || input.equals("beijing") || input.equals("BEIJING")) //If the answer is correct
            {
                score = (score + 1); //Increase the score by one
                scoreField.setText(String.valueOf(score)); //Print the score to the scorefield
                instantOutput.setText("Correct!"); //Display "Correct!" on the screen
                nextButton.setEnabled(true); //Enable the the next button
                submitButton.setEnabled(false); //Disable the submit button
                counter2 = counter2 + 1; //Increase the question counter by one
            }
            else //If the answer is incorrect
            {
                instantOutput.setText("Incorrect!"); //Display "Incorrect" on the screen
                nextButton.setEnabled(true); //Enable the next button
                submitButton.setEnabled(false); //Disable the submit button
                counter2 = counter2 + 1; //Increase the question counter by one
            }
        }
        else if (counter == 4) //If the fifth question has been asked
        {
            input = answerField.getText(); //store the user input in a String variable
            scoreField.setText(String.valueOf(score)); //Print the score to the scorefield
            if (input.equals("Tokyo") || input.equals("tokyo") || input.equals("TOKYO")) //If the answer is correct
            {
                score = (score + 1); //Increase the score by one
                scoreField.setText(String.valueOf(score)); //Print the score to the scorefield
                instantOutput.setText("Correct!"); //Display "Correct!" on the screen
                nextButton.setEnabled(true); //Enable the the next button
                submitButton.setEnabled(false); //Disable the submit button
                counter2 = counter2 + 1; //Increase the question counter by one
            }
            else //If the answer is incorrect
            {
                instantOutput.setText("Incorrect!"); //Display "Incorrect" on the screen
                nextButton.setEnabled(true); //Enable the next button
                submitButton.setEnabled(false); //Disable the submit button
                counter2 = counter2 + 1; //Increase the question counter by one
            }
        }
    }//GEN-LAST:event_submitButtonActionPerformed

    private void answerFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_answerFieldActionPerformed
    String input; //Declare a String variable for user input
    int counter = 0; //Declare a question counter variable for the next button code
    int counter2 = 0; //Declare a question counter variable for the submit button code
    int score = 0; //Declare a variable for the score
    int questionsIncorrect; //Declare a variable for the number of incorrect questions
    double percentCorrect; //Declare a double variable for the raw percent of correct answers
    double percentCorrectRounded; //Declare a double variable for the rounded percent of correct answers

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MultipleChoiceGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MultipleChoiceGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MultipleChoiceGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MultipleChoiceGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MultipleChoiceGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField answerField;
    private javax.swing.JLabel answerLabel;
    private javax.swing.JLabel instantOutput;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton nextButton;
    private javax.swing.JTextArea questionField;
    private javax.swing.JLabel questionLabel;
    private javax.swing.JTextField scoreField;
    private javax.swing.JLabel scoreLabel;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
