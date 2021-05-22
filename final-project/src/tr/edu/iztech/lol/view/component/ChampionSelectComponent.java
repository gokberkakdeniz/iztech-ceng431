package tr.edu.iztech.lol.view.component;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import tr.edu.iztech.lol.model.AvailableChampionsModel;
import tr.edu.iztech.lol.model.User;

public class ChampionSelectComponent extends JPanel {
	private static final long serialVersionUID = 5232858854896059657L;
	private JButton originButton1;
	private JButton originButton2;
	private JButton originButton3;
	private JButton originButton4;
	private JButton heroButton1;
	private JButton heroButton2;
	private JButton heroButton3;
	private JButton heroButton4;
	private JLabel originDescriptionLabel;
	private JLabel heroDescriptionLabel;
	private AvailableChampionsModel model;
	
	public ChampionSelectComponent(User user, AvailableChampionsModel model) {
		this.model = model;
		List<String> heroNames = model.getHeroNames();
		List<String> originNames = model.getOriginNames();
		
		setLayout(null);
		setBounds(0,0, 480, 550);
		
        JLabel usernameLabel = new JLabel(user.getUsername());
		usernameLabel.setBorder(new LineBorder(new Color(64, 64, 64), 2));
		usernameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		usernameLabel.setBounds(160, 2, 160, 30);
		add(usernameLabel);	
		
		JLabel lblChooseAnOrigin = new JLabel("Choose an Origin");
		lblChooseAnOrigin.setHorizontalAlignment(SwingConstants.CENTER);
		lblChooseAnOrigin.setFont(new Font("Noto Sans CJK SC Light", Font.BOLD, 20));
		lblChooseAnOrigin.setBounds(0, 45, 480, 30);
		add(lblChooseAnOrigin);
		
		originButton1 = new JButton(originNames.get(0));
		originButton1.addActionListener(originButton1Listener);
		originButton1.setBackground(Color.RED);
		originButton1.setBounds(30, 95, 130, 25);
		add(originButton1);
		
		originButton2 = new JButton(originNames.get(1));
		originButton2.setBounds(30, 140, 130, 25);
		originButton2.addActionListener(originButton2Listener);
		add(originButton2);
		
		originButton3 = new JButton(originNames.get(2));
		originButton3.setBounds(30, 185, 130, 25);
		originButton3.addActionListener(originButton3Listener);
		add(originButton3);
		
		originButton4 = new JButton(originNames.get(3));
		originButton4.setBounds(30, 230, 130, 25);
		originButton4.addActionListener(originButton4Listener);
		add(originButton4);
		
		JLabel lblChooseAHero = new JLabel("Choose a Hero");
		lblChooseAHero.setHorizontalAlignment(SwingConstants.CENTER);
		lblChooseAHero.setFont(new Font("Noto Sans CJK SC Light", Font.BOLD, 20));
		lblChooseAHero.setBounds(0, 280, 480, 30);
		add(lblChooseAHero);
		
		heroButton1 = new JButton(heroNames.get(0));
		heroButton1.setBounds(30, 380, 130, 25);
		heroButton1.addActionListener(heroButton1Listener);
		add(heroButton1);
		
		heroButton2 = new JButton(heroNames.get(1));
		heroButton2.setBackground(Color.RED);
		heroButton2.setBounds(30, 425, 130, 25);
		heroButton2.addActionListener(heroButton2Listener);
		add(heroButton2);
		
		heroButton3 = new JButton(heroNames.get(2));
		heroButton3.setBounds(30, 470, 130, 25);
		heroButton3.addActionListener(heroButton3Listener);
		add(heroButton3);
		
		heroButton4 = new JButton(heroNames.get(3));
		heroButton4.setBounds(30, 335, 130, 25);
		heroButton4.addActionListener(heroButton4Listener);
		add(heroButton4);
		
		
		originDescriptionLabel = new JLabel(makeHTML(model.getOriginDescription(model.getOriginNames().get(0))));
		originDescriptionLabel.setHorizontalAlignment(SwingConstants.LEFT);
		originDescriptionLabel.setVerticalAlignment(SwingConstants.TOP);
		originDescriptionLabel.setBounds(200, 95, 240, 160);
		add(originDescriptionLabel);
		
		heroDescriptionLabel = new JLabel(makeHTML(model.getHeroDescription(model.getHeroNames().get(0))));
		heroDescriptionLabel.setVerticalAlignment(SwingConstants.TOP);
		heroDescriptionLabel.setHorizontalAlignment(SwingConstants.LEFT);
		heroDescriptionLabel.setBounds(200, 335, 240, 160);
		add(heroDescriptionLabel);
		
	}
	
	private String makeHTML(String text) {
		return String.format("<html>%s</html>", text);
	}
	
	private ActionListener originButton1Listener = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			resetOriginButtons();
			originButton1.setBackground(Color.RED);
			originDescriptionLabel.setText(makeHTML(model.getOriginDescription(model.getOriginNames().get(0))));
		}
	};
	
	private ActionListener originButton2Listener = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			resetOriginButtons();
			originButton2.setBackground(Color.RED);
			originDescriptionLabel.setText(makeHTML(model.getOriginDescription(model.getOriginNames().get(1))));
		}
	};
	
	private ActionListener originButton3Listener = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			resetOriginButtons();
			originButton3.setBackground(Color.RED);
			originDescriptionLabel.setText(makeHTML(model.getOriginDescription(model.getOriginNames().get(2))));
		}
	};
	
	private ActionListener originButton4Listener = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			resetOriginButtons();
			originButton4.setBackground(Color.RED);
			originDescriptionLabel.setText(makeHTML(model.getOriginDescription(model.getOriginNames().get(3))));
		}
	};
	
	private ActionListener heroButton1Listener = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			resetHeroButtons();
			heroButton1.setBackground(Color.RED);
			heroDescriptionLabel.setText(makeHTML(model.getHeroDescription(model.getHeroNames().get(0))));
		}
	};
	
	private ActionListener heroButton2Listener = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			resetHeroButtons();
			heroButton2.setBackground(Color.RED);
			heroDescriptionLabel.setText(makeHTML(model.getHeroDescription(model.getHeroNames().get(1))));
		}
	};
	
	private ActionListener heroButton3Listener = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			resetHeroButtons();
			heroButton3.setBackground(Color.RED);
			heroDescriptionLabel.setText(makeHTML(model.getHeroDescription(model.getHeroNames().get(2))));
		}
	};
	
	private ActionListener heroButton4Listener = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			resetHeroButtons();
			heroButton4.setBackground(Color.RED);
			heroDescriptionLabel.setText(makeHTML(model.getHeroDescription(model.getHeroNames().get(3))));
		}
	};
	
	private void resetOriginButtons() {
		originButton1.setBackground(null);
		originButton2.setBackground(null);
		originButton3.setBackground(null);
		originButton4.setBackground(null);
	}
	
	private void resetHeroButtons() {
		heroButton1.setBackground(null);
		heroButton2.setBackground(null);
		heroButton3.setBackground(null);
		heroButton4.setBackground(null);
	}
}
