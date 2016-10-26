class dabaojian3{
	public static void main(String args []){
		for(int i=0;i<4;i++){
			for(int j=0;j<10-i;j++){
				System.out.print(" ");
			}
			for(int h=0;h<i;h++){
				System.out.print("* ");
			}
			System.out.println("*");
		}
		for(int k=0;k<10;k++){
			for(int w=0;w<7;w++){
				System.out.print(" ");
			}
			for(int q=0;q<3;q++){
				System.out.print("* ");
			}
			System.out.println("*");
		}
		for(int y=4;y<8;y++){
			for(int x=9;y>=11-x;x--){
				System.out.print(" ");
			}
			for(int q=10;q>=y;q--){
				System.out.print("* ");
			}
			System.out.println("*");
		}
		for(int b=0;b<8;b++){
			for(int m=0;m<9;m++){
				System.out.print(" ");
			}
			for(int z=0;z<1;z++){
				System.out.print("* ");
			}
			System.out.println("*");
		}
	}
}