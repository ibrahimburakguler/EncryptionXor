import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Encryption EncryptionCapsule=new Encryption();
		Decryption DecryptionCapsule=new Decryption();
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("write E for Encryption or D for Decryption" );
		String type=scan.nextLine();
		if(type.equalsIgnoreCase("E")){
			
			System.out.println("Enter your message");
			EncryptionCapsule.setMessage(scan.nextLine());
			System.out.println("Enter your key");
			EncryptionCapsule.setKey(scan.nextLine());
			System.out.println(EncryptionCapsule.toString());
			
		}else if(type.equalsIgnoreCase("D")){
			
			System.out.println("Enter your message");
			DecryptionCapsule.setMessage(scan.nextLine());
			System.out.println("Enter your key");
			DecryptionCapsule.setKey(scan.nextLine());
			System.out.println(DecryptionCapsule.toString());
			
		}else{
			
			System.out.println("error");
		}
		
	
		
		
        
	}

}
