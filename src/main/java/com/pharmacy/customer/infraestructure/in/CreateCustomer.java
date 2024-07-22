package com.pharmacy.customer.infraestructure.in;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateCustomer extends JPanel implements ActionListener {
    protected String idTextLabel = "Ingrese la identificacion: ";
    protected String firstNameTextLabel = "Ingresa el nombre: ";
    protected String lastNameTextLabel = "Ingresa el appelido: ";

    protected JLabel actionLabel;

    public CreateCustomer() {
        setLayout(new BorderLayout());

        JTextField idInput = new JTextField(10);
        idInput.setActionCommand(idTextLabel);
        idInput.addActionListener(this);

        JTextField firstNameInput = new JTextField(10);
        firstNameInput.setActionCommand(firstNameTextLabel);
        firstNameInput.addActionListener(this);

        JTextField lastNameInput = new JTextField(10);
        lastNameInput.setActionCommand(lastNameTextLabel);
        lastNameInput.addActionListener(this);

        JLabel idLabel = new JLabel(idTextLabel);
        idLabel.setLabelFor(idInput);

        JLabel firstNameLabel = new JLabel(firstNameTextLabel);
        firstNameLabel.setLabelFor(firstNameInput);

        JLabel lastNameLabel = new JLabel(lastNameTextLabel);
        lastNameLabel.setLabelFor(lastNameInput);

        actionLabel = new JLabel("Escribe y presiona ENTER.");
        actionLabel.setBorder(BorderFactory.createEmptyBorder(10, 0, 0 ,0));

        JPanel textControlPane = new JPanel();
        GridBagLayout gridBag = new GridBagLayout();
        GridBagConstraints bagConstraints = new GridBagConstraints();
        textControlPane.setLayout(gridBag);

        JLabel[] labels = {idLabel, firstNameLabel, lastNameLabel};
        JTextField[] fields = {idInput, firstNameInput, lastNameInput};
        addLabelTextRows(labels, fields, gridBag, textControlPane);

        bagConstraints.gridwidth = GridBagConstraints.REMAINDER;
        bagConstraints.anchor = GridBagConstraints.CENTER;
        bagConstraints.weightx = 1.0;

        add(textControlPane, BorderLayout.LINE_START);
    }

    private void addLabelTextRows(JLabel[] labels,
                                  JTextField[] textFields,
                                  GridBagLayout gridbag,
                                  Container container) {
        GridBagConstraints c = new GridBagConstraints();
        c.anchor = GridBagConstraints.EAST;
        int numLabels = labels.length;

        for (int i = 0; i < numLabels; i++) {
            c.gridwidth = GridBagConstraints.RELATIVE; //next-to-last
            c.fill = GridBagConstraints.NONE;      //reset to default
            c.weightx = 0.0;                       //reset to default
            container.add(labels[i], c);

            c.gridwidth = GridBagConstraints.REMAINDER;     //end row
            c.fill = GridBagConstraints.HORIZONTAL;
            c.weightx = 1.0;
            container.add(textFields[i], c);
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String prefix = "You typed \"";
        if (idTextLabel.equals(e.getActionCommand())) {
            JTextField source = (JTextField)e.getSource();
            actionLabel.setText(prefix + source.getText() + "\"");
        } else if (firstNameTextLabel.equals(e.getActionCommand())) {
            JTextField source = (JTextField)e.getSource();
            actionLabel.setText(prefix + source.getText() + "\"");
        } else if (lastNameTextLabel.equals(e.getActionCommand())) {
            Toolkit.getDefaultToolkit().beep();
        }
    }

    public void execute() {
        JFrame frame = new JFrame("Crear usuario");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new CreateCustomer());
        frame.pack();
        frame.setVisible(true);
    }
}
