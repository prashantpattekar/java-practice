package codingClass.day2;

import java.util.Scanner;

public class Alphabets {
	
	
	static void a(int n) {
		for(int i=0; i<n ; i++ ) {
			for (int j=0; j<n; j++) {
				if(j==0 || j==n/2 
						|| i==0 && j<=n/2
						|| i==n/2 && j<=n/2) {
					System.out.print("* ");
				}else
				System.out.print("  ");
			}
			System.out.println();
		}
	}
	
	
	static void b(int n) {
		for(int i=0; i<n ; i++ ) {
			for (int j=0; j<n; j++) {
				if(j==0
						|| i==0 && j<=n/2 && j!=0 && j!= n/2
						|| i==n/2 && j<=n/2 &&  j!=n/2
						|| i==n-1 && j<=n/2 &&  j!=n/2
						|| j==n/2 && i!=0 && i!=n/2 && i!= n-1) {
					
					System.out.print("* ");
				}else
				System.out.print("  ");
			}
			System.out.println();
		}
	}
	
	
	static void c(int n) {
		for(int i=0; i<n ; i++ ) {
			for (int j=0; j<n; j++) {
				if(j==0 && i!=0 && i!=n-1
						|| i==0 && j<=n/2 && j!=0 && j!=n/2
						|| i==n-1 && j<=n/2 && j!=0 && j!=n/2) {
					
					System.out.print("* ");
				}else
				System.out.print("  ");
			}
			System.out.println();
		}
	}
	
	
	static void d(int n) {
		for(int i=0; i<n ; i++ ) {
			for (int j=0; j<n; j++) {
				if(j==0
						|| i==0 && j<n/2
						|| i==n-1 && j<n/2
						|| j==n/2 && i!=0 && i!=n-1) {
					
					System.out.print("* ");
				}else
				System.out.print("  ");
			}
			System.out.println();
		}
	}
	
	
	static void e(int n) {
		for(int i=0; i<n ; i++ ) {
			for (int j=0; j<n; j++) {
				if(j==0
					|| i==0 && j<=n/2
					|| i==n/2 && j<=n/2
					|| i==n-1 && j<=n/2) {
					
					System.out.print("* ");
				}else
				System.out.print("  ");
			}
			System.out.println();
		}
	}
	
	
	static void f(int n) {
		for(int i=0; i<=n ; i++ ) {
			for (int j=0; j<=n; j++) {
				if(j==0
					|| i==0 && j<=n/2
					|| i==n/2 && j<=n/2) {
					
					System.out.print("* ");
				}else
				System.out.print("  ");
			}
			System.out.println();
		}
	}
	
	
	static void h(int n) {
		for(int i=0; i<=n ; i++ ) {
			for (int j=0; j<=n; j++) {
				if(j==0
					|| j==n/2 ||
					i==n/2 && j<=n/2) {
					
					System.out.print("* ");
				}else
				System.out.print("  ");
			}
			System.out.println();
		}
	}
	
	
	static void i(int n) {
		for(int i=0; i<=n; i++ ) {
			for (int j=0; j<=n; j++) {
				if(i==0 && j<=n/2
					|| i==n-1 && j<=n/2
					|| j==n/4) {
					
					System.out.print("* ");
				}else
				System.out.print("  ");
			}
			System.out.println();
		}
	}
	
	
	static void j(int n) {
		for(int i=0; i<n; i++ ) {
			for (int j=0; j<=n/2; j++) {
				if(i==0 &&j<=n/2
				   || j==n/4 && i!=n-1
				   || i==n-1 && j<=n/4 
				   ||j==0 && i>3*n/4 && i!=n-1) {
					
					System.out.print("* ");
				}else
				System.out.print("  ");
			}
			System.out.println();
		}
	}
	
	
	static void k(int n) {
		for(int i=0; i<n; i++ ) {
			for (int j=0; j<=n/2; j++) {
				if(j==0  ||
						i+j==n/2
						|| i-j==n/2) {
					
					System.out.print("* ");
				}else
				System.out.print("  ");
			}
			System.out.println();
		}
	}
	
	
	static void l(int n) {
		for(int i=0; i<n; i++ ) {
			for (int j=0; j<=n/2; j++) {
				if(j==0  ||
				    i==n-1 && j<=n/2) {
					
					System.out.print("* ");
				}else
				System.out.print("  ");
			}
			System.out.println();
		}
	}
	
	
	static void m(int n) {
		for(int i=0; i<n; i++ ) {
			for (int j=0; j<=n; j++) {
				if(j==0  ||
				    j==n-1 || i==j && j<=n/2
				    || i+j==n-1 && j>=n/2) {
					
					System.out.print("* ");
				}else
				System.out.print("  ");
			}
			System.out.println();
		}
	}
	
	static void n(int n) {
		for(int i=0; i<n; i++ ) {
			for (int j=0; j<=n; j++) {
				if(j==0  ||
				    j==n-1 || i==j) {
					
					System.out.print("* ");
				}else
				System.out.print("  ");
			}
			System.out.println();
		}
	}
	
	
	static void o(int n) {
		for(int i=0; i<n; i++ ) {
			for (int j=0; j<n/2; j++) {
				if(i==0 && j!=0 && j<n/2
				    || j==0 && i!=0 && i!=n-1
				    || i==n-1 && j!=0 && j<n/2
				    || j==n/2 && i!=0 && i!=n-1) {
					
					System.out.print("* ");
				}else
				System.out.print("  ");
			}
			System.out.println();
		}
	}
	
	
	static void p(int n) {
		for(int i=0; i<n; i++ ) {
			for (int j=0; j<=n/2; j++) {
				if(j==0
					|| i==0 && j<n/2
					|| i==n/2 && j<n/2
					|| j==n/2 &&i<n/2 && i!=0) {
					
					System.out.print("* ");
				}else
				System.out.print("  ");
			}
			System.out.println();
		}
	}
	
	
	static void q(int n) {
		for(int i=0; i<n; i++ ) {
			for (int j=0; j<n; j++) {
				if(i==0 && j<n/2 && j!=0 
					|| j==0 && i<n/2 && i!=0 
					|| i==n/2 &&j<n/2 && j!=0
					|| j==n/2 && i<n/2 && i!=0
					||i==j &&j>n/4 && j<3*n/4) {
					
					System.out.print("* ");
				}else
				System.out.print("  ");
			}
			System.out.println();
		}
	}
	
	
	static void r(int n) {
		for(int i=0; i<n; i++ ) {
			for (int j=0; j<n; j++) {
				if(j==0 || i==0 && j<n/2 
						|| i==n/2 && j<n/2
						|| j==n/2 && i<n/2 && i!=0 
						|| i-j==n/2 && j<=n/2) {
					
					System.out.print("* ");
				}else
				System.out.print("  ");
			}
			System.out.println();
		}
	}
	
	
	static void s(int n) {
		for(int i=0; i<n; i++ ) {
			for (int j=0; j<n; j++) {
				if(i==0 && j<=n/2 && j!=0 
				   || i==n/2 && j<n/2 && j!=0 
				   || i==n-1 && j<n/2 
				   || j==0 && i<n/2 && i!=0
				   || j==n/2 && i>n/2 && i!=n-1) {
					
					System.out.print("* ");
				}else
				System.out.print("  ");
			}
			System.out.println();
		}
	}
	
	
	static void t(int n) {
		for(int i=0; i<n; i++ ) {
			for (int j=0; j<n; j++) {
				if(i==0 || j==n/2) {
					
					System.out.print("* ");
				}else
				System.out.print("  ");
			}
			System.out.println();
		}
	}
	
	
	
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the value of n ");
		int n = scan.nextInt();
		t(n);
		
		
	
	}

}
