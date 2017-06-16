import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;

import javax.swing.AbstractListModel;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.DropMode;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import javax.swing.SpinnerDateModel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListDataListener;
import javax.swing.text.html.ListView;

import javafx.scene.control.DatePicker;

import java.awt.ComponentOrientation;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;
import java.awt.event.ActionEvent;

public class NotificationPanel extends JPanel implements ActionListener{ 

	
		private JTextField textFieldTitle;
		private JTextArea textAreaDesc;
		private JTextField textFieldDay;
		private JSpinner spinnerTime;
		private JSpinner spinnerIntervals;
		private JCheckBox checkBoxSmartCabinet;
		private JButton btnCreate;
		private JButton btnRemove;
		private JButton btnReset;
		private JList previousNotifications;

		/**
		 * Create the panel.
		 */
		public NotificationPanel() {
			setSize(new Dimension(640, 485));
			setLayout(new BorderLayout());
			
			

			JLabel lblNotification = new JLabel("Notification");
			lblNotification.setFont(MedicationManagement.HEADER_FONT);
			lblNotification.setHorizontalAlignment(SwingConstants.CENTER);
			this.add(lblNotification, BorderLayout.NORTH);
			this.add(createSplitPane(), BorderLayout.CENTER);	
	}
		
		/**
		 * Creates and returns splitpane with previous notifications on left pane and
		 * detailed notification settings on right pane 
		 * @return sp - split pane
		 */
		private JSplitPane createSplitPane(){
			JSplitPane sp = new JSplitPane();
			
			sp.setLeftComponent(createPreviousNotification());
			sp.setRightComponent(createDetailedNotification());
			return sp;
		}
		
		
		/**
		 * Creates and returns panel to be used as Left components in the split pane
		 * @return previousReminderPanel - JPanel
		 */
		private JPanel createPreviousNotification(){
			//  panel to store previous reminders in a list
			JPanel previousReminderPanel = new JPanel();
			previousReminderPanel.setLayout(new BorderLayout());
			 
			// set it to Min size of 200 width and 200 height 
			previousReminderPanel.setMinimumSize(new Dimension(200, 200));
			previousReminderPanel.setPreferredSize(new Dimension(200,200));
			
			// create titled border
			previousReminderPanel.setBorder(BorderFactory.createTitledBorder("Previous Nofications"));
			
			// Jlist to store reminders in a list
			previousNotifications = new JList();
			previousNotifications.setVisibleRowCount(10);
			previousNotifications.setFont(MedicationManagement.BODY_FONT);
			
			// add this list to the panel
			previousReminderPanel.add(previousNotifications, BorderLayout.CENTER);
			return previousReminderPanel;
		}
		
		
		/**
		 * Creates and returns panel to be used as right components in the split pane
		 * @return DetailedSettingPanel - JPanel
		 */
		private JPanel createDetailedNotification(){
			
			// panel to store detailed reminders settings 
			JPanel DetailedSettingPanel = new JPanel();
			
			// Create title Border
			DetailedSettingPanel.setBorder(BorderFactory.createTitledBorder("Configure New Notification"));
			
			
			// Create GridBagConstraints to manage items in the GridBagLayout
			GridBagConstraints gbc_DetailedSettingPanel = new GridBagConstraints();
			gbc_DetailedSettingPanel.insets = new Insets(0, 5, 0, 0);
			gbc_DetailedSettingPanel.fill = GridBagConstraints.BOTH;
			gbc_DetailedSettingPanel.gridx = 1;
			gbc_DetailedSettingPanel.gridy = 0;
		
			GridBagLayout gbl_DetailedSettingPanel = new GridBagLayout();
			gbl_DetailedSettingPanel.columnWeights = new double[]{0.0, 1.0};
			gbl_DetailedSettingPanel.rowWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0};
			DetailedSettingPanel.setLayout(gbl_DetailedSettingPanel);

			//////////////////////////////// ROW 1//////////////////////////////////////
			// ADD title and text field in row 1 
			JLabel lblTitle = new JLabel("Title");
			lblTitle.setFont(MedicationManagement.BODY_FONT);
			GridBagConstraints gbc_lblTitle = new GridBagConstraints();
			gbc_lblTitle.insets = new Insets(0, 12, 5, 12);
			gbc_lblTitle.anchor = GridBagConstraints.WEST;
			gbc_lblTitle.gridx = 0;
			gbc_lblTitle.gridy = 0;
			DetailedSettingPanel.add(lblTitle, gbc_lblTitle);

			textFieldTitle = new JTextField();
			textFieldTitle.setFont(MedicationManagement.BODY_FONT);
			textFieldTitle.setColumns(20);
			GridBagConstraints gbc_textFieldTitle = new GridBagConstraints();
			gbc_textFieldTitle.insets = new Insets(0, 0, 5, 12);
			gbc_textFieldTitle.anchor=GridBagConstraints.WEST;
			gbc_textFieldTitle.gridx = 1;
			gbc_textFieldTitle.gridy = 0;
			DetailedSettingPanel.add(textFieldTitle, gbc_textFieldTitle);

			////////////////////////////// ROW 2 ///////////////////////////////////////
			// Add Desc and scroll pan with textArea embeded into it at row 2
			JLabel lblDescription = new JLabel("Description");
			lblDescription.setFont(MedicationManagement.BODY_FONT);
			GridBagConstraints gbc_lblDescription = new GridBagConstraints();
			gbc_lblDescription.anchor = GridBagConstraints.NORTHWEST;
			gbc_lblDescription.insets = new Insets(0, 12, 5, 12);
			gbc_lblDescription.gridx = 0;
			gbc_lblDescription.gridy = 1;
			DetailedSettingPanel.add(lblDescription, gbc_lblDescription);

			// Create a scroll pane to hold text area
			JScrollPane scrollPaneDesc = new JScrollPane();
			GridBagConstraints gbc_scrollPaneDesc = new GridBagConstraints();
			gbc_scrollPaneDesc.insets = new Insets(0, 0, 5, 12);
			gbc_scrollPaneDesc.fill = GridBagConstraints.BOTH;
			gbc_scrollPaneDesc.gridx = 1;
			gbc_scrollPaneDesc.gridy = 1;
			DetailedSettingPanel.add(scrollPaneDesc, gbc_scrollPaneDesc);

			// TextArea to accept texts from user
			textAreaDesc = new JTextArea();
			textAreaDesc.setName("");
			textAreaDesc.setMaximumSize(new Dimension(50, 50));
			textAreaDesc.setFont(MedicationManagement.BODY_FONT);
			textAreaDesc.setDropMode(DropMode.INSERT);
			scrollPaneDesc.setViewportView(textAreaDesc);

			///////////////////////////////// ROW 3 /////////////////////////////////////////
			// Add Day label and textfield at row 3
			JLabel lblDay = new JLabel("Day (DD/MM/YYYY)");
			lblDay.setFont(MedicationManagement.BODY_FONT);
			GridBagConstraints gbc_lblDay = new GridBagConstraints();
			gbc_lblDay.anchor = GridBagConstraints.WEST;
			gbc_lblDay.insets = new Insets(0, 12, 5, 12);
			gbc_lblDay.gridx = 0;
			gbc_lblDay.gridy = 2;
			DetailedSettingPanel.add(lblDay, gbc_lblDay);

			textFieldDay = new JTextField();
			textFieldDay.setFont(MedicationManagement.BODY_FONT);
			GridBagConstraints gcb_datePicker = new GridBagConstraints();
			gcb_datePicker.insets = new Insets(0, 0, 5, 0);
			
			gcb_datePicker.anchor= GridBagConstraints.WEST;
			gcb_datePicker.gridx=1;
			gcb_datePicker.gridy=2;
			textFieldDay.setColumns(10);			
			DetailedSettingPanel.add(textFieldDay,gcb_datePicker);
			

			/////////////////////////////// ROW 4 ///////////////////////////////////////////
			// Add Time label and panel at row 4
			JLabel lblTime = new JLabel("Time");
			lblTime.setFont(MedicationManagement.BODY_FONT);
			GridBagConstraints gbc_lblTime = new GridBagConstraints();
			gbc_lblTime.anchor = GridBagConstraints.WEST;
			gbc_lblTime.insets = new Insets(0, 12, 5, 12);
			gbc_lblTime.gridx = 0;
			gbc_lblTime.gridy = 3;
			DetailedSettingPanel.add(lblTime, gbc_lblTime);


			spinnerTime = new JSpinner(new SpinnerDateModel() );
			JSpinner.DateEditor timeEditor = new JSpinner.DateEditor(spinnerTime, "HH:mm:ss");
			spinnerTime.setEditor(timeEditor);
			GridBagConstraints gbc_timeSpinner = new GridBagConstraints();
			gbc_timeSpinner.insets = new Insets(0, 0, 5, 12);
			gbc_timeSpinner.anchor= GridBagConstraints.LINE_START;
			gbc_timeSpinner.gridx = 1;
			gbc_timeSpinner.gridy = 3;
			DetailedSettingPanel.add(spinnerTime, gbc_timeSpinner);
			

			

			////////////////////////////////// ROW 5 //////////////////////////////
			// Add Intervals label and spinner for it at row 5
			JLabel lblSendIntervalsmin = new JLabel("Set Intervals(Min)");
			lblSendIntervalsmin.setFont(MedicationManagement.BODY_FONT);
			GridBagConstraints gbc_lblSendIntervalsmin = new GridBagConstraints();
			gbc_lblSendIntervalsmin.anchor = GridBagConstraints.WEST;
			gbc_lblSendIntervalsmin.insets = new Insets(0, 12, 5, 12);
			gbc_lblSendIntervalsmin.gridx = 0;
			gbc_lblSendIntervalsmin.gridy = 4;
			DetailedSettingPanel.add(lblSendIntervalsmin, gbc_lblSendIntervalsmin);

			spinnerIntervals = new JSpinner();
			spinnerIntervals.setPreferredSize(new Dimension(50, 22));
			spinnerIntervals.setMinimumSize(new Dimension(50, 22));
			GridBagConstraints gbc_spinnerInterval = new GridBagConstraints();
			gbc_spinnerInterval.anchor = GridBagConstraints.WEST;
			gbc_spinnerInterval.insets = new Insets(0, 0, 5, 12);
			gbc_spinnerInterval.gridx = 1;
			gbc_spinnerInterval.gridy = 4;
			DetailedSettingPanel.add(spinnerIntervals, gbc_spinnerInterval);

			
			/////////////////////////////// ROW 6 ////////////////////////////////////
			// Add checklist and texts for it at row 6 column 2
			checkBoxSmartCabinet = new JCheckBox("Activate Smart Medicine Cabinet");
			checkBoxSmartCabinet.setFont(MedicationManagement.BODY_FONT);
			GridBagConstraints gbc_checkBoxSmartCabinet = new GridBagConstraints();
			gbc_checkBoxSmartCabinet.anchor = GridBagConstraints.WEST;
			gbc_checkBoxSmartCabinet.insets = new Insets(0, 0, 5, 12);
			gbc_checkBoxSmartCabinet.gridx = 1;
			gbc_checkBoxSmartCabinet.gridy = 5;
			DetailedSettingPanel.add(checkBoxSmartCabinet, gbc_checkBoxSmartCabinet);
			
			
			
			//////////////////////////////// ROW 7 ///////////////////////////////////
			btnReset = new JButton("Reset");
			btnReset.setFont(MedicationManagement.BODY_FONT);
			btnReset.addActionListener(this);
			
			
			GridBagConstraints gbc_btnReset = new GridBagConstraints();
			gbc_btnReset.anchor = GridBagConstraints.SOUTHWEST;
			gbc_btnReset.insets = new Insets(0, 12, 5, 0);
			gbc_btnReset.gridx = 0;
			gbc_btnReset.gridy = 6;
			DetailedSettingPanel.add(btnReset, gbc_btnReset);
		
			
			// Add panel having two buttons in it at row 7
			JPanel btnPanel = new JPanel();
			GridBagConstraints gbc_btnPanel = new GridBagConstraints();
			gbc_btnPanel.anchor = GridBagConstraints.SOUTHEAST;
			gbc_btnPanel.gridx = 1;
			gbc_btnPanel.gridy = 6;
			DetailedSettingPanel.add(btnPanel, gbc_btnPanel);
			
			// Create panel with create and Reset button
			btnCreate = new JButton("Create");
			btnCreate.setFont(MedicationManagement.BODY_FONT);
			btnCreate.addActionListener(this);
			btnPanel.add(btnCreate);
			
			
			 btnRemove = new JButton("Remove");
			 btnRemove.setEnabled(false);
			btnRemove.setFont(MedicationManagement.BODY_FONT);
			btnRemove.addActionListener(this);
			btnPanel.add(btnRemove);
			
			return DetailedSettingPanel;
		}

		@Override
		public void actionPerformed(ActionEvent e) {

			
			if((JButton)e.getSource() == btnCreate){
				// if the values are not empty
				if(!textFieldTitle.getText().isEmpty() && !textFieldDay.getText().isEmpty()){
					String str = textFieldTitle.getText()+" - "+textFieldDay.getText();
					// Call to the addElemnt method to append items to the list
					addElement(str);
					// Resets values
					resetDetails();
					//Enable remove button
					btnRemove.setEnabled(true);
				}
				else{
					JOptionPane.showMessageDialog(this, ":( Everything has name but I don't.\n Please Enter Title AND Day ","Selection Error",JOptionPane.ERROR_MESSAGE);

				}
				
				
				
			}
			else if((JButton)e.getSource()==btnRemove){
				int selectedIndex =previousNotifications.getSelectedIndex();
				
				// if there is an item selected
				if(selectedIndex!=-1){
					removeElement(selectedIndex);
				}
				else{
					JOptionPane.showMessageDialog(this, "Umm, Looks like there is no Reminder selected","Selection Error",JOptionPane.ERROR_MESSAGE);
				}
				
				if(previousNotifications.getModel().getSize()==0){
					btnRemove.setEnabled(false);
				}
			}
			else{
				// When reset is selected reset values
				resetDetails();
				
			}
		}
		
		/**
		 * method to Add item to the previousMedication list
		 * @param item - String An item to add
		 */
		private void addElement(String item){
			ArrayList<String> items = new ArrayList<String>();
			
			// copy available all items from the list and add it to the arrayList
			for(int i=0;i<previousNotifications.getModel().getSize();i++){				
				items.add((String) previousNotifications.getModel().getElementAt(i));
			}
			// Append item from argument to the  arrayList
			items.add(item);
			
			// Re-set the model of previous notifications
			previousNotifications.setModel(new DefaultComboBoxModel(items.toArray()));	
		}
		
		/**
		 * method to Remove item to the previousMedication list
		 * @param item - String An item to add
		 */
		private void removeElement(int index){
			ArrayList<String> items = new ArrayList<String>();
			
			// copy available all items from the list and add it to the arrayList
			for(int i=0;i<previousNotifications.getModel().getSize();i++){				
				items.add((String) previousNotifications.getModel().getElementAt(i));
			}
			// delete item from the arrayList at index
			items.remove(index);
			
			// Re-set the model of previous notifications
			previousNotifications.setModel(new DefaultComboBoxModel(items.toArray()));	
		}

		/**
		 * Resets all the values to the defalults 
		 */
		private void resetDetails(){
			this.textFieldTitle.setText("");
			this.textAreaDesc.setText("");
			this.textFieldDay.setText("");
			this.spinnerIntervals.setValue(0);
			this.checkBoxSmartCabinet.setSelected(false);
			
		}
}
