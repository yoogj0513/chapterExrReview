package kr.or.yi.chapterExReview.ch04;

import java.util.Scanner;

public class MonthSchedule {
	private int nDays; // 해당 월의 총 일수
	private Day[] days;
	private Scanner sc;
	
	public MonthSchedule(int nDays) {
		this.nDays = nDays;
		this.days = new Day[nDays]; // 일수만큼의 Day객체를 가지는 배열 생성
		this.sc = new Scanner(System.in);
	}
	
	public void input() {
		System.out.print("날짜(1~30)? ");
		int day = sc.nextInt(); // 1
		// 입력되는 날짜 검사
		if(day < 0 || day > nDays) {
			System.out.println("날짜를 잘못입력하였습니다.");
			System.out.printf("1 ~ %d사이의 값을 입력하세요.", nDays);
			return;
		}
		System.out.print("할일(빈칸없이입력)? ");
		String work = sc.next();
		
		Day d = new Day();
		d.setWork(work);
		days[day-1] = d;
	}
	
	public void view() {
		System.out.print("날짜(1~30)? ");
		int day = sc.nextInt(); // 1
		
		// 입력되는 날짜 검사
		if(day < 0 || day > nDays) {
			System.out.println("날짜를 잘못입력하였습니다.");
			System.out.printf("1 ~ %d사이의 값을 입력하세요.", nDays);
			return;
		}
		
		System.out.println(day + "일의 할일은 ");
		if(days[day-1] == null) {
			System.out.println("해당 일에는 할일이 없습니다.");
			return;
		}
		days[day-1].show();
	}
	
	public void finish() {
		sc.close();
		System.out.println("프로그램을 종료합니다.");
	}
	
	public void run() {
		System.out.println("이번달 스케줄 관리 프로그램.");
		int menu;
		do {
			System.out.print("할일(입력:1, 보기:2, 끝내기: 3) >>");
			menu = sc.nextInt();
			switch(menu) {
			case 1: 
				input();
				break;
			case 2:
				view();
				break;
			}
		}while(menu < 3);
		finish();
	}
	

}
