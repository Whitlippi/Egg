import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Egg {
	
	public String getDay (){
		String month = "";
		String day = "";
		String num = getInput("Please the three digit code on your egg carton: ");
		int op = Integer.parseInt(num);
		op += 45;
		if (op > 365){
			op = op- 365;
		}
		
		if (op <= 31){
			month = "January";
			day += op;
		}else if (op <= 59){
			month = "February";
			day += op-31;
		}else if (op <= 90){
			month = "March";
			day += op-59;
		}else if (op <= 120){
			month = "April";
			day += op-90;
		}else if (op <= 151){
			month = "May";
			day += op-120;
		}else if (op <= 181){
			month = "June";
			day += op-151;
		}else if (op <= 212){
			month = "July";
			day += op-181;
		}else if (op <= 243){
			month = "August";
			day += op-212;
		}else if (op <= 273){
			month = "September";
			day += op-243;
		}else if (op <= 304){
			month = "October";
			day += op-273;
		}else if (op <= 334){
			month = "November";
			day += op-304;
		}else if (op <= 365){
			month = "December";
			day += op-334;
		}
	
		return "it expires on " + month +" "+ day;
	}

	private String getInput(String prompt) {
		BufferedReader stdin = new BufferedReader(
		new InputStreamReader(System.in));
		System.out.print(prompt);
		System.out.flush();
		try {
		return stdin.readLine();
		} catch (Exception e) {
		return "Error: " + e.getMessage();
		}
	}
	public static void main(String[] args) {
		Egg e = new Egg();
		System.out.println(e.getDay());
		}
}
