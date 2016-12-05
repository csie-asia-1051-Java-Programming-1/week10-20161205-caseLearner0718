package ex;
/*
 * Topic: 輸入所使用的度數，換算夏月及非夏月之電費金額。
 * Date: 2016/12/05
 * Author: 1050210XX 周永振老師
 */
import java.util.Scanner;
public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int val = scn.nextInt();
		if(val<=120){
			System.out.println(val*2.10);
			System.out.println(val*2.10);
		}else if(val>120 && val<=330){
			System.out.println((120*2.10+(val-120)*3.02));
			System.out.println((120*2.10+(val-120)*2.68));
		}else if(val>331 && val<=500){
			System.out.println((120*2.10+210*3.02+(val-330)*4.39));
			System.out.println((120*2.10+210*2.68+(val-330)*3.61));
		}
		else if(val>501 && val<=700){
			System.out.println((120*2.10+210*3.02+170*4.39+(val-500)*4.97));
			System.out.println((120*2.10+210*2.68+170*3.61+(val-500)*4.01));
		}else if(val>701){
			System.out.println((120*2.10+210*3.02+170*4.39+200*4.97+(val-700)*5.63));
			System.out.println((120*2.10+210*2.68+170*3.61+200*4.01+(val-700)*4.50));
		}
	}

}
