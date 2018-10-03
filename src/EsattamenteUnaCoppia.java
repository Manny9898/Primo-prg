import java.util.Scanner;
public class EsattamenteUnaCoppia {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int [] vett = {1, 2, 3, 3, 5, 5};
		int [] vett1 = new int[6];
		verifica(vett, vett1);
	}
	
	public static void verifica(int vett[], int vett1[]) {
		int i, j, contaC=0;
		boolean b;
		for(i=0; i<vett.length; i++){
			b=false;
			for(j=0; j<vett1.length && j<i; j++){
				if(vett[i]==vett1[j]){
					contaC++;
					b=true;
				}//if
			}//for
			if(!b){
				vett1[i]=vett[i];
			}else {
				vett1[i]=-1;
			}
		}//for
			System.out.println("Trovate "+contaC+" coppie");
	}//verifica

}
