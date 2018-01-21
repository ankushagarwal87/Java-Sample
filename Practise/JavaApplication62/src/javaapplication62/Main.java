/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication62;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author ankush
 */



 class RPI {


	public void doMain() throws Exception{
		Scanner sc = new Scanner(new FileReader("input.in"));
		PrintWriter pw = new PrintWriter(new FileWriter("output.txt"));

		int T = Integer.parseInt(sc.nextLine());
		double RPI = 0.0;
		for (int t=0; t<T; t++){
			int N = Integer.parseInt(sc.nextLine());

			double towp [][] = new double[N][N];

			double wp[] = new double[N];
			double owp[] = new double[N];
			double oowp[] = new double[N];
			double rpi[] = new double[N];
			int a[][] = new int [N][N];
			for(int i=0;i<N;i++){
				String input = sc.nextLine();
				double tempWp = 0.0;
				int count = 0;
				for(int j=0;j<input.length();j++){
					char temp = input.charAt(j);
					//System.out.println(temp);
					if(temp=='.'){
						a[i][j]=-1;
					}else{
						count++;
						if(temp==49){
							a[i][j]=1;
						}
						else if(temp==48){
							a[i][j]=0;
						}
						tempWp+=a[i][j];
					}
				}
				wp[i]=tempWp/count;
			//	System.out.println(wp[i]);
//				for(int j=0;j<N;j++){
//					int cnt = 0;
//					double tval = 0.0;
//					if(a[i][j]==-1)
//					{
//						towp[i][j]=-1;
//					}
//					else{
//						for(int k=0;k<N;k++){
//							if((j!=k)&&a[i][j]!=-1){
//								tval+=a[i][j];
//								cnt++;
//							}
//						}
//						towp[i][j]=tval/cnt;
//					}
//				}
			}
			for(int i=0;i<N;i++){
				double tempOwp = 0.0;
				int count=0;
				for(int j=0;j<N;j++){
					double tmp = 0.0;
					int cnt = 0;
					if(a[i][j]!=-1){
						for(int k=0;k<N;k++){
							if(a[j][k]!=-1&&k!=i){
								tmp+=a[j][k];
								cnt++;
							}
						}
					}
					//System.out.println(tmp+" cnt "+cnt);
					if(cnt!=0){
					tempOwp+=(tmp/cnt);
					count++;
					}
				}
				owp[i]=tempOwp/count;

			}
			for(int i=0;i<N;i++){
				double tempOowp = 0.0;
				int count = 0;
				for(int j=0;j<N;j++){
					if(a[i][j]!=-1){
						tempOowp+=owp[j];
						count++;
					}
				}

				oowp[i]=tempOowp/count;
			}
			pw.println("Case #"+(t+1)+":");
			for(int i=0;i<N;i++){
				rpi[i]= 0.25 * wp[i] + 0.50 * owp[i] + 0.25 * oowp[i];
				pw.println(rpi[i]);
			}


		}





		pw.flush();
		pw.close();
		sc.close();
	}
}
	public class Main {

	public static void main(String[] args) throws Exception {
		new RPI().doMain();

	}

}



