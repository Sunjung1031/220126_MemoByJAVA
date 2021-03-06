package 메모장구현;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/*
 * 윈도우 프로그램(GUI)
 * 고객관리 시스템 어플리케이션 개발시 메뉴 만들기
 */

public class MenuMain extends JFrame{
	//준비단계
	JFrame main_fr = new JFrame("고객관리 시스템 메뉴 만들기");
	JMenuBar mb;
	JMenu file, sort, help;
	JMenuItem fopen, fsave, fexit, proinfo;
	JCheckBoxMenuItem sno, sname, schul, sjob;
	
	//생성자 구현 
	public MenuMain() {
		mb = new JMenuBar();
		
		file = new JMenu("파일");
		sort = new JMenu("정렬");
		help = new JMenu("도움말");
		
		fopen = new JMenuItem("열기");
		fsave = new JMenuItem("저장");
		fexit = new JMenuItem("닫기");
		
		//논리적 그룹화 => 어느 하나만 체크할 수 있다.
		ButtonGroup bg = new ButtonGroup();
		sno = new JCheckBoxMenuItem("번호");
		sname = new JCheckBoxMenuItem("이름");
		schul = new JCheckBoxMenuItem("출신지역");
		sjob = new JCheckBoxMenuItem("직업");
		
		bg.add(sno);
		bg.add(sname);
		bg.add(schul);
		bg.add(sjob);
		
		proinfo = new JCheckBoxMenuItem("프로그램 정보");
		
		//객체 붙이기 
		file.add(fopen);
		file.add(fsave);
		file.addSeparator(); //구분선 넣기
		file.add(fexit);
		
		sort.add(sno);
		sort.add(sname);
		sort.add(schul);
		sort.add(sjob);
		
		help.add(proinfo);
		
		mb.add(file);
		mb.add(sort);
		mb.add(help);
		
		
		main_fr.setJMenuBar(mb);
		main_fr.setBounds(200, 200, 500, 300);
		main_fr.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		//객체생성 
		MenuMain menuMain = new MenuMain();
	}

}
