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
import javax.swing.DropMode;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;
import java.awt.ComponentOrientation;
import java.awt.Component;

public class NotificationPanel extends JPanel{

	///
		private JTextField textFieldTitle;
		private JTextField textFieldDay;

		/**
		 * Create the panel.
		 */
		public NotificationPanel() {
			setSize(new Dimension(640, 485));
			setLayout(new BorderLayout(0, 0));
			
			

			JLabel lblNotification = new JLabel("Notification");
			lblNotification.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblNotification.setHorizontalAlignment(SwingConstants.CENTER);
			this.add(lblNotification, BorderLayout.NORTH);
			this.add(createSplitPane(), BorderLayout.CENTER);

		
	}
		
		private JSplitPane createSplitPane(){
			JSplitPane sp = new JSplitPane();
			
			sp.setLeftComponent(createPreviousNotification());
			
			sp.setRightComponent(createDetailedNotification());
			return sp;
		}
		
		private JPanel createPreviousNotification(){
			//  panel to save previous reminders in a list
			JPanel previousReminderPanel = new JPanel();
			 
			// set it to Min size of 200 width and 200 height 
			previousReminderPanel.setMinimumSize(new Dimension(200, 200));
			
			
			previousReminderPanel.setBorder(BorderFactory.createTitledBorder("Previous Nofications"));
			previousReminderPanel.setAutoscrolls(true);
			GridBagConstraints gbc_previousReminderPanel = new GridBagConstraints();
			gbc_previousReminderPanel.anchor = GridBagConstraints.WEST;
			gbc_previousReminderPanel.fill = GridBagConstraints.BOTH;
			gbc_previousReminderPanel.insets = new Insets(0, 0, 0, 5);
			gbc_previousReminderPanel.gridx = 0;
			gbc_previousReminderPanel.gridy = 0;
			
			
			GridBagLayout gbl_previousReminderPanel = new GridBagLayout();
			gbl_previousReminderPanel.columnWidths = new int[]{159, 0};
			gbl_previousReminderPanel.rowHeights = new int[]{25, 0};
			gbl_previousReminderPanel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
			gbl_previousReminderPanel.rowWeights = new double[]{1.0, Double.MIN_VALUE};
			previousReminderPanel.setLayout(gbl_previousReminderPanel);

			JList list = new JList();
			GridBagConstraints gbc_list = new GridBagConstraints();
			gbc_list.fill = GridBagConstraints.BOTH;
			gbc_list.gridx = 0;
			gbc_list.gridy = 0;
			previousReminderPanel.add(list, gbc_list);

			return previousReminderPanel;
		}

		private JPanel createDetailedNotification(){
			
			JPanel DetailedSettingPanel = new JPanel();
			DetailedSettingPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
			DetailedSettingPanel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Configure New Notification", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			GridBagConstraints gbc_DetailedSettingPanel = new GridBagConstraints();
			gbc_DetailedSettingPanel.insets = new Insets(0, 5, 0, 0);
			gbc_DetailedSettingPanel.fill = GridBagConstraints.BOTH;
			gbc_DetailedSettingPanel.gridx = 1;
			gbc_DetailedSettingPanel.gridy = 0;
		
			GridBagLayout gbl_DetailedSettingPanel = new GridBagLayout();
			gbl_DetailedSettingPanel.columnWidths = new int[]{150, 0, 0};
			gbl_DetailedSettingPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
			gbl_DetailedSettingPanel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
			gbl_DetailedSettingPanel.rowWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
			DetailedSettingPanel.setLayout(gbl_DetailedSettingPanel);

			JLabel lblTitle = new JLabel("Title");
			lblTitle.setFont(new Font("Tahoma", Font.PLAIN, 18));
			GridBagConstraints gbc_lblTitle = new GridBagConstraints();
			gbc_lblTitle.insets = new Insets(0, 12, 5, 12);
			gbc_lblTitle.anchor = GridBagConstraints.WEST;
			gbc_lblTitle.gridx = 0;
			gbc_lblTitle.gridy = 0;
			DetailedSettingPanel.add(lblTitle, gbc_lblTitle);

			textFieldTitle = new JTextField();
			textFieldTitle.setFont(new Font("Tahoma", Font.PLAIN, 18));
			GridBagConstraints gbc_textFieldTitle = new GridBagConstraints();
			gbc_textFieldTitle.fill = GridBagConstraints.HORIZONTAL;
			gbc_textFieldTitle.insets = new Insets(0, 0, 5, 12);
			gbc_textFieldTitle.gridx = 1;
			gbc_textFieldTitle.gridy = 0;
			DetailedSettingPanel.add(textFieldTitle, gbc_textFieldTitle);
			textFieldTitle.setColumns(10);

			JLabel lblDescription = new JLabel("Description");
			lblDescription.setFont(new Font("Tahoma", Font.PLAIN, 18));
			GridBagConstraints gbc_lblDescription = new GridBagConstraints();
			gbc_lblDescription.anchor = GridBagConstraints.NORTHWEST;
			gbc_lblDescription.insets = new Insets(0, 12, 5, 12);
			gbc_lblDescription.gridx = 0;
			gbc_lblDescription.gridy = 1;
			DetailedSettingPanel.add(lblDescription, gbc_lblDescription);

			JScrollPane scrollPaneDesc = new JScrollPane();
			GridBagConstraints gbc_scrollPaneDesc = new GridBagConstraints();
			gbc_scrollPaneDesc.insets = new Insets(0, 0, 5, 12);
			gbc_scrollPaneDesc.fill = GridBagConstraints.BOTH;
			gbc_scrollPaneDesc.gridx = 1;
			gbc_scrollPaneDesc.gridy = 1;
			DetailedSettingPanel.add(scrollPaneDesc, gbc_scrollPaneDesc);

			JTextArea descTextArea = new JTextArea();
			descTextArea.setName("");
			descTextArea.setMaximumSize(new Dimension(50, 50));
			descTextArea.setFont(new Font("Monospaced", Font.PLAIN, 18));
			descTextArea.setDropMode(DropMode.INSERT);
			scrollPaneDesc.setViewportView(descTextArea);

			JLabel lblDay = new JLabel("Day (DD/MM/YYYY)");
			lblDay.setFont(new Font("Tahoma", Font.PLAIN, 18));
			GridBagConstraints gbc_lblDay = new GridBagConstraints();
			gbc_lblDay.anchor = GridBagConstraints.WEST;
			gbc_lblDay.insets = new Insets(0, 12, 5, 12);
			gbc_lblDay.gridx = 0;
			gbc_lblDay.gridy = 2;
			DetailedSettingPanel.add(lblDay, gbc_lblDay);

			textFieldDay = new JTextField();
			GridBagConstraints gbc_textFieldDay = new GridBagConstraints();
			gbc_textFieldDay.insets = new Insets(0, 0, 5, 12);
			gbc_textFieldDay.fill = GridBagConstraints.HORIZONTAL;
			gbc_textFieldDay.gridx = 1;
			gbc_textFieldDay.gridy = 2;
			DetailedSettingPanel.add(textFieldDay, gbc_textFieldDay);
			textFieldDay.setColumns(10);

			JLabel lblTime = new JLabel("Time");
			lblTime.setFont(new Font("Tahoma", Font.PLAIN, 18));
			GridBagConstraints gbc_lblTime = new GridBagConstraints();
			gbc_lblTime.anchor = GridBagConstraints.WEST;
			gbc_lblTime.insets = new Insets(0, 12, 5, 12);
			gbc_lblTime.gridx = 0;
			gbc_lblTime.gridy = 3;
			DetailedSettingPanel.add(lblTime, gbc_lblTime);

			JPanel panelTime = new JPanel();
			FlowLayout fl_panelTime = (FlowLayout) panelTime.getLayout();
			fl_panelTime.setAlignment(FlowLayout.LEFT);
			GridBagConstraints gbc_panelTime = new GridBagConstraints();
			gbc_panelTime.anchor = GridBagConstraints.WEST;
			gbc_panelTime.insets = new Insets(0, 0, 5, 12);
			gbc_panelTime.fill = GridBagConstraints.BOTH;
			gbc_panelTime.gridx = 1;
			gbc_panelTime.gridy = 3;
			DetailedSettingPanel.add(panelTime, gbc_panelTime);

			JLabel lblH = new JLabel("H");
			panelTime.add(lblH);

			JSpinner spinnerHour = new JSpinner();
			panelTime.add(spinnerHour);

			JLabel lblM = new JLabel("M");
			panelTime.add(lblM);

			JSpinner spinnerMin = new JSpinner();
			panelTime.add(spinnerMin);

			JLabel lblSendIntervalsmin = new JLabel("Send Intervals(Min)");
			lblSendIntervalsmin.setFont(new Font("Tahoma", Font.PLAIN, 18));
			GridBagConstraints gbc_lblSendIntervalsmin = new GridBagConstraints();
			gbc_lblSendIntervalsmin.anchor = GridBagConstraints.WEST;
			gbc_lblSendIntervalsmin.insets = new Insets(0, 12, 5, 12);
			gbc_lblSendIntervalsmin.gridx = 0;
			gbc_lblSendIntervalsmin.gridy = 4;
			DetailedSettingPanel.add(lblSendIntervalsmin, gbc_lblSendIntervalsmin);

			JSpinner spinnerInterval = new JSpinner();
			spinnerInterval.setFont(new Font("Tahoma", Font.PLAIN, 18));
			GridBagConstraints gbc_spinnerInterval = new GridBagConstraints();
			gbc_spinnerInterval.insets = new Insets(0, 0, 5, 12);
			gbc_spinnerInterval.anchor = GridBagConstraints.WEST;
			gbc_spinnerInterval.gridx = 1;
			gbc_spinnerInterval.gridy = 4;
			DetailedSettingPanel.add(spinnerInterval, gbc_spinnerInterval);

			JCheckBox checkBoxSmartCabinet = new JCheckBox("Activate Smart Medicine Cabinet");
			checkBoxSmartCabinet.setFont(new Font("Tahoma", Font.PLAIN, 18));
			GridBagConstraints gbc_checkBoxSmartCabinet = new GridBagConstraints();
			gbc_checkBoxSmartCabinet.anchor = GridBagConstraints.WEST;
			gbc_checkBoxSmartCabinet.insets = new Insets(0, 0, 5, 12);
			gbc_checkBoxSmartCabinet.gridx = 1;
			gbc_checkBoxSmartCabinet.gridy = 5;
			DetailedSettingPanel.add(checkBoxSmartCabinet, gbc_checkBoxSmartCabinet);
			
			JPanel panel = new JPanel();
			GridBagConstraints gbc_panel = new GridBagConstraints();
			gbc_panel.anchor = GridBagConstraints.SOUTH;
			gbc_panel.insets = new Insets(0, 0, 0, 5);
			gbc_panel.fill = GridBagConstraints.HORIZONTAL;
			gbc_panel.gridx = 0;
			gbc_panel.gridy = 6;
			DetailedSettingPanel.add(panel, gbc_panel);
			
			JButton button = new JButton("Create");
			button.setDefaultCapable(false);
			panel.add(button);
			
			JButton button_1 = new JButton("Reset");
			panel.add(button_1);
			
			return DetailedSettingPanel;
		}
}
