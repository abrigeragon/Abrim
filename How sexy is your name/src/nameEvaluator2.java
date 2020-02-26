import java.util.Scanner;

public class nameEvaluator2 {

public static void main (String[]args) {
	String name;
	String gender;
	int nameLength;
	int points = 3;
	String hotness= "";
	int count =0;
	
	Scanner keyboard = new Scanner(System.in);
	
	System.out.println("Type gender, male or female: ");
	gender = keyboard.nextLine();
	
	System.out.println("Type your first name: ");
	name = keyboard.nextLine();
	
	if (gender.equals ("male") && name.length() > 5) {points--; for (int i=0 ; i<name.length(); i++){
        char ch = name.charAt(i);
        if(ch == 'a'|| ch == 'e'|| ch == 'o'){
           count ++;
           if(count < 2) {points ++;} else if(count > 2) {points --;}
        }
     }} 
	else if (gender.equals ("male") && name.length() < 5) {points++;
	for (int i=0 ; i<name.length(); i++){
        char ch = name.charAt(i);
        if(ch == 'a'|| ch == 'e'|| ch == 'o'){
           count ++;
           if(count < 2) {points ++;} else if(count > 2) {points --;}}}}
	
	else if (gender.equals ("female") && name.length() > 5) {points++; for (int i=0 ; i<name.length(); i++){
        char ch = name.charAt(i);
        if(ch == 'i'|| ch == 'u'){
           count ++;
           if(count > 2 ) {points--;} else if(count < 2 ) {points++;}}}}
	
	else if(gender.equals ("female") && name.length() <5) {points--;
	for (int i=0 ; i<name.length(); i++){
        char ch = name.charAt(i);
        if(ch == 'i'|| ch == 'u'){
           count ++;
           if(count > 2 ) {points--;} else if(count < 2 ) {points++;}}}}
	
	
	switch (points) {
	case 3:
		hotness = "Average";
	break;
	case 2:
		hotness = "Somewhat ugly";
	break;
	case 1:
		hotness = "Extremeply ugly";
	break;
	case 4:
		hotness = "Somewhat hot";
	case 5:
		hotness = "Extremely hot";
	break;
	default:
		System.out.println("You're probably ok");
		
	}

	System.out.println(hotness);
	
}}
