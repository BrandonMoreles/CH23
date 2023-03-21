package daysWeek;

import java.util.Scanner;


public class DaysOfWeek {
	static Scanner scan= new Scanner(System.in);
	public static void main(String[] args) {
		eval(day(),hour(),minut());
	}
		
	
	public static int day() {
		int day=5;
		while(day==5) {
		System.out.println("Escriba el dia de la semana (Solo valido lunes a viernes)");
		String dayString=scan.next();
			
			switch (dayString) {
			case "lunes": {day=0;}
			break;
			case "martes": {day=1;}
			break;
			case "miercoles": {day=2;}
			break;
			case "jueves": {day=3;}
			break;
			case "viernes": {day=4;}
			break;
			default:System.out.println("Dato invalido");
			}}
		return day;		
	}
	public static int hour() {
		int hours=0;
		while(hours<1||hours>24){
		System.out.println("Digite la hora del dia (Formato de 24 horas)");
		hours= scan.nextInt();
		if(hours<=0||hours>24){System.out.println("Hora no valida");}}
		return hours;
	}
	public static int minut() {
		int minutes=0;
		while(minutes<=0||minutes>60){
		System.out.println("Digite los minutos");
		minutes= scan.nextInt();
		if(minutes<0||minutes>60){System.out.println("Minutos no validos");}}
		return minutes;
	}
	public static void eval(int day,int hour,int min) {
		int rest=6600-(day*24*60)-hour*60-min;
		if(rest>0) {
		System.out.println("Faltan " +rest+" minutos para el fin de semana");}
		else if(rest<0) {System.out.println("Capo, ya se te paso el finde");}
		else {System.out.println("Acabamos de empezar");}
	}

}
